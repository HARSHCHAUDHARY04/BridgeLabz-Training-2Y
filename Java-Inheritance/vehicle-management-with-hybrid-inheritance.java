interface Refuelable {
    void refuel();
}

abstract class Vehicle {
    protected double maxSpeed;
    protected String model;

    public Vehicle(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public abstract void displayInfo();
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(double maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void displayInfo() {
        System.out.println("Electric Vehicle - Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }

    public void charge() {
        System.out.println(model + " is charging...");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(double maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void displayInfo() {
        System.out.println("Petrol Vehicle - Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled with petrol.");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model S");
        PetrolVehicle pv = new PetrolVehicle(200, "BMW X5");

        ev.displayInfo();
        ev.charge();

        pv.displayInfo();
        pv.refuel();
    }
}
