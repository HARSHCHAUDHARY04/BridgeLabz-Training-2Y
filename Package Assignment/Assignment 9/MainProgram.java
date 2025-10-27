import com.access.one.Base;
import com.access.two.Derived;

public class MainProgram {
    public static void main(String[] args) {
        Base base = new Base();
        base.showAccess();
        System.out.println();
        
        Derived derived = new Derived();
        derived.testAccess();
        System.out.println();
        
        System.out.println("--- Summary ---");
        System.out.println("Public: Accessible in subclass - YES");
        System.out.println("Protected: Accessible in subclass - YES");
        System.out.println("Default: Accessible in subclass - NO (different package)");
        System.out.println("Private: Accessible in subclass - NO");
    }
}

