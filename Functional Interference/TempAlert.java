import java.util.function.Predicate;

public class TempAlert {
    public static void main(String[] args) {
        Predicate<Double> isTooHot = (temperature) -> temperature > 100.0;
        
        double currentTemp = 102.5;
        if (isTooHot.test(currentTemp)) {
            System.out.println("Alert! Temperature is " + currentTemp + "C. Threshold exceeded.");
        }
        
        currentTemp = 98.0;
        if (!isTooHot.test(currentTemp)) {
            System.out.println("Temperature is " + currentTemp + "C. All normal.");
        }
    }
}