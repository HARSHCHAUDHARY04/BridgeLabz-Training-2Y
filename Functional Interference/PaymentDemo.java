interface PaymentMethod {
    void pay(double amount);
}

class UPI implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI.");
    }
}

class CreditCard implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentMethod upiPayment = new UPI();
        PaymentMethod ccPayment = new CreditCard();
        
        upiPayment.pay(100.0);
        ccPayment.pay(450.50);
    }
}