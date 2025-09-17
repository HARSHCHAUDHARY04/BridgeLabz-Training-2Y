abstract class Vehicle {
    protected String vehicleNumber;
    protected String type;
    protected double rentalRate;

    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }
}

class Car extends Vehicle {
    public Car(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.2;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}

class Truck extends Vehicle {
    public Truck(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.5;
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class InsuredVehicle implements Insurable {
    private String policyNumber;
    private double insuranceRate;

    public InsuredVehicle(String policyNumber, double insuranceRate) {
        this.policyNumber = policyNumber;
        this.insuranceRate = insuranceRate;
    }

    public double calculateInsurance() {
        return rentalRate * insuranceRate;
    }

    public String getInsuranceDetails() {
        return "Policy: " + policyNumber + ", Rate: " + insuranceRate;
    }

    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
    public double getInsuranceRate() { return insuranceRate; }
    public void setInsuranceRate(double insuranceRate) { this.insuranceRate = insuranceRate; }
}

class VehicleRentalSystem {
    public static void processVehicles(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + ", Rental Cost: " + v.calculateRentalCost(5));
        }
    }
}
