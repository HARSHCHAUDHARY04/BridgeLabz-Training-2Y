public class Vehicle {
    private static double registrationFee = 500.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println("Registration Fee: " + registrationFee);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
        } else {
            System.out.println("Invalid object type");
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("ABC123", "John Doe", "Car");
        car.displayDetails(car);
        updateRegistrationFee(750.0);
        System.out.println("Updated Registration Fee: " + registrationFee);
    }
}
