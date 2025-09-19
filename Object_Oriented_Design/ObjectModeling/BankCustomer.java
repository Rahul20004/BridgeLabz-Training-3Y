import java.util.*;

class Customer {
    String name;
    double balance;

    Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    void viewBalance() {
        System.out.println(name + " balance: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
    }
}

class Bank {
    String bankName;
    List<Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    void openAccount(Customer c) {
        customers.add(c); // association
        System.out.println("Account opened for " + c.name + " in " + bankName);
    }
}

public class BankCustomer {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Amit");

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.deposit(5000);
        c2.deposit(2000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
