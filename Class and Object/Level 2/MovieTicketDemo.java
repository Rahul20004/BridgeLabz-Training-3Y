class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket(String seat, double price) {
        this.seatNumber = seat;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class MovieTicketDemo {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers", "A1", 300);
        ticket.displayDetails();
        ticket.bookTicket("B5", 350);
        ticket.displayDetails();
    }
}
