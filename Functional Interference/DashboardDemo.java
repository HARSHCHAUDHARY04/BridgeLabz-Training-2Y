interface Vehicle {
    void displaySpeed(int speed);
    
    default void displayBattery() {
        System.out.println("Battery display not available for this model.");
    }
}

class PetrolCar implements Vehicle {
    public void displaySpeed(int speed) {
        System.out.println("Petrol Car Speed: " + speed + " km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed(int speed) {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }
    
    @Override
    public void displayBattery() {
        System.out.println("Electric Car Battery: 85%");
    }
}

public class DashboardDemo {
    public static void main(String[] args) {
        Vehicle myCar = new PetrolCar();
        Vehicle myTesla = new ElectricCar();
        
        myCar.displaySpeed(80);
        myCar.displayBattery();
        
        System.out.println();
        
        myTesla.displaySpeed(90);
        myTesla.displayBattery();
    }
}