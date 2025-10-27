import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainProgram {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe", "B-101");
        book.displayBookDetails();
        
        Member member = new Member("Alice", "M-501", "Student");
        member.displayMemberDetails();
        
        Transaction trans = new Transaction("T-1001", "B-101", "M-501", "Issue");
        trans.displayTransactionDetails();
    }
}

