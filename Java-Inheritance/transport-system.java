abstract class Vehicle {
    protected double maxSpeed;
    protected String fuelType;

    public Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public abstract void displayInfo();
    public final boolean canDrive() {
        return maxSpeed > 0;
    }
}

class Car extends Vehicle {
    private int seatCapacity;

    public Car(double maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("Can Drive: " + canDrive());
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(double maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck - Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Can Drive: " + canDrive());
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(double maxSpeed, String fuelType, boolean hasSideCar) {
        super(maxSpeed, fuelType);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle - Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Has Sidecar: " + hasSideCar);
        System.out.println("Can Drive: " + canDrive());
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10);
        Vehicle motorcycle = new Motorcycle(140, "Petrol", false);

        for (Vehicle vehicle : new Vehicle[]{car, truck, motorcycle}) {
            vehicle.displayInfo();
            System.out.println("---");
        }
    }
}
