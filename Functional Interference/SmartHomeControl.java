interface Device {
    void turnOn();
    void turnOff();
}

class Light implements Device {
    public void turnOn() {
        System.out.println("Light is ON");
    }
    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

class AC implements Device {
    public void turnOn() {
        System.out.println("AC is ON (cooling)");
    }
    public void turnOff() {
        System.out.println("AC is OFF");
    }
}

public class SmartHomeControl {
    public static void main(String[] args) {
        Device myLight = new Light();
        Device myAC = new AC();
        
        myLight.turnOn();
        myAC.turnOn();
        myLight.turnOff();
    }
}