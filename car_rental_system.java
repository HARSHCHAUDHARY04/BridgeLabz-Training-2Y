// Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.
public class car_rental_system {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public car_rental_system(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        car_rental_system rental1 = new car_rental_system("John Doe", "Toyota Camry", 5, 40.0);
        rental1.displayRentalDetails();

        System.out.println();

        car_rental_system rental2 = new car_rental_system("Jane Smith", "Honda Accord", 3, 50.0);
        rental2.displayRentalDetails();
    }
}
