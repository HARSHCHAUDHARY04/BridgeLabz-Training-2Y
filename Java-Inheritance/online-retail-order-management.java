class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Pending";
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered";
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order("O001", "2024-04-01");
        ShippedOrder shipped = new ShippedOrder("O002", "2024-04-02", "TRK123");
        DeliveredOrder delivered = new DeliveredOrder("O003", "2024-04-03", "TRK456", "2024-04-05");

        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Shipped Status: " + shipped.getOrderStatus());
        System.out.println("Delivered Status: " + delivered.getOrderStatus());
    }
}
