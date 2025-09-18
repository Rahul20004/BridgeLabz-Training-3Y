
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " cooks " + specialty + " dishes.");
    }
}

class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " serves " + tablesAssigned + " tables.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Worker w1 = new Chef("Rakesh", 201, "Italian");
        Worker w2 = new Waiter("Sohan", 202, 5);

        w1.performDuties();
        w2.performDuties();
    }
}
