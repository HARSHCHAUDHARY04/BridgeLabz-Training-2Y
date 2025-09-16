// Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.

public class library_booking_system {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public library_booking_system(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; 
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book: " + title + " is currently not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("You have successfully returned the book: " + title);
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        library_booking_system book1 = new library_booking_system("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        
        book1.displayBookDetails(); 
        
        book1.borrowBook(); 
        book1.displayBookDetails(); 
        
        book1.borrowBook(); 
        
        book1.returnBook(); 
        book1.displayBookDetails(); 
    }
}
