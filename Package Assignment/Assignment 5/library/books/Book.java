package library.books;

public class Book {
    private String title;
    private String author;
    private String isbn;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public void displayBookDetails() {
        System.out.println("Book Added: " + title + " by " + author + " [ISBN: " + isbn + "]");
    }
}

