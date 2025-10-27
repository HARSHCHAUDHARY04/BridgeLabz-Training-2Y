import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Invoice {
    private String transactionId;

    public Invoice(String transactionId) {
        this.transactionId = transactionId;
        System.out.println("Created invoice for ID: " + transactionId);
    }

    @Override
    public String toString() {
        return "Invoice[" + transactionId + "]";
    }
}

public class InvoiceCreator {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("T1001", "T1002", "T1003");

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());
        
        System.out.println(invoices);
    }
}