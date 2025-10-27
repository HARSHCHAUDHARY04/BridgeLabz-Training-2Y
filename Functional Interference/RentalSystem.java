interface Rentable {
    void rent();
    void returnVehicle();
}

class Car implements Rentable {
    public void rent() {
        System.out.println("Car has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }
}

class Bike implements Rentable {
    public void rent() {
        System.out.println("Bike has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}

public class RentalSystem {
    public static void main(String[] args) {
        Rentable v1 = new Car();
        Rentable v2 = new Bike();
        
        v1.rent();
        v2.rent();
        v1.returnVehicle();
    }
}