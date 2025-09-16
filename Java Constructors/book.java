public class book {
    private String title;
    private String author;
    private double price;

    public book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

 
    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
  
        book defaultBook = new book();
        System.out.println("Default Book Details:");
        defaultBook.displayBookDetails();

        book paramBook = new book("1984", "George Orwell", 15.99);
        System.out.println("\nParameterized Book Details:");
        paramBook.displayBookDetails();
    }
}
