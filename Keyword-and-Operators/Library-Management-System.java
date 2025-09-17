public class Book {
    private static String libraryName = "City Central Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid object type");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("978-0123456789", "Java Programming", "John Doe");
        book.displayDetails(book);
        displayLibraryName();
    }
}
