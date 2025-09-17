abstract class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;

    public abstract int getLoanDuration();

    public void displayDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author + ", Loan Duration: " + getLoanDuration() + " days");
    }

    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}

class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getLoanDuration() {
        return 3;
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class ReservableItem implements Reservable {
    private boolean isReserved;

    public ReservableItem() {
        this.isReserved = false;
    }

    public void reserveItem() {
        isReserved = true;
    }

    public boolean checkAvailability() {
        return !isReserved;
    }

    public boolean getIsReserved() { return isReserved; }
    public void setIsReserved(boolean isReserved) { this.isReserved = isReserved; }
}

class LibraryManager {
    public static void manageItems(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.displayDetails();
        }
    }
}
