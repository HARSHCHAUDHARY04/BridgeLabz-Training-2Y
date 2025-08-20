import java.util.*;
public class volume_of_earth {
    
    public static void main(String[] args) {
        int radius=6378;
        double volume=(4.0/3)*Math.PI*(Math.pow(radius, 3));
        System.out.println("The volume of earth in cubic kilometers is "+radius+" and cubic miles is "+volume);
    }
}
