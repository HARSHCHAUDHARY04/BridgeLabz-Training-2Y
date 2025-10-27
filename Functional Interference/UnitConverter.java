interface Converter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }
    
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}

public class UnitConverter {
    public static void main(String[] args) {
        double distanceKm = 100;
        double weightKg = 75;
        
        System.out.println(distanceKm + " km is " + Converter.kmToMiles(distanceKm) + " miles.");
        System.out.println(weightKg + " kg is " + Converter.kgToLbs(weightKg) + " lbs.");
    }
}