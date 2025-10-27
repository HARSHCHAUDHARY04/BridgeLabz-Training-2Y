interface PaymentProcessor {
    void processPayment(double amount);
    
    default void refund(double amount) {
        System.out.println("Default refund logic: Refunding $" + amount);
    }
}

class OldPaymentProvider implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Old Provider: Processing payment of $" + amount);
    }
}

class NewPaymentProvider implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("New Provider: Processing payment of $" + amount);
    }
    
    @Override
    public void refund(double amount) {
        System.out.println("New Provider: Custom high-speed refund of $" + amount);
    }
}

public class GatewayDemo {
    public static void main(String[] args) {
        PaymentProcessor oldGateway = new OldPaymentProvider();
        PaymentProcessor newGateway = new NewPaymentProvider();
        
        System.out.println("--- Old Gateway ---");
        oldGateway.processPayment(100);
        oldGateway.refund(100); // Uses the default method
        
        System.out.println("\n--- New Gateway ---");
        newGateway.processPayment(200);
        newGateway.refund(200); // Uses the overridden method
    }
}