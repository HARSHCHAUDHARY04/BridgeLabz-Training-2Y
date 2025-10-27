package library.transactions;

public class Transaction {
    private String transactionId;
    private String bookId;
    private String memberId;
    private String type;
    
    public Transaction(String transactionId, String bookId, String memberId, String type) {
        this.transactionId = transactionId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.type = type;
    }
    
    public void displayTransactionDetails() {
        System.out.println("Transaction: " + type + " [TID: " + transactionId + ", Book: " + bookId + ", Member: " + memberId + "]");
    }
}

