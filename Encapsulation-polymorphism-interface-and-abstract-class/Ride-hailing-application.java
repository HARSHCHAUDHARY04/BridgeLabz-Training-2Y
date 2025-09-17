abstract class Vehicle {
    protected String vehicleId;
    protected String driverName;
    protected double ratePerKm;

    public abstract double calculateFare(double distance);

    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Fare: " + calculateFare(10));
    }

    public String getVehicleId() { return vehicleId; }
    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }
    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public void setRatePerKm(double ratePerKm) { this.ratePerKm = ratePerKm; }
}

class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm * 1.5;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm * 1.2;
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class VehicleGPS implements GPS {
    private String currentLocation;

    public VehicleGPS() {
        this.currentLocation = "Unknown";
    }

    public String getCurrentLocation() {
        return currentLocation;
    }
