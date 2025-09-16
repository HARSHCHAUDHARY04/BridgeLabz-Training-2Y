public class movie_ticket {
    private String movieName;
    private String seatNumber;
    private double price;

   
    public movie_ticket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null; 
        this.price = 0.0; 
    }

    
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for " + movieName + " at seat " + seatNumber + " for $" + price);
    }

    
    public void displayTicketDetails() {
        if (seatNumber != null) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("No ticket booked for " + movieName);
        }
    }

   
    public static void main(String[] args) {
        movie_ticket ticket = new movie_ticket("Inception");
        ticket.displayTicketDetails(); 
        ticket.bookTicket("A10", 12.5); 
        ticket.displayTicketDetails(); 
} 
}  
