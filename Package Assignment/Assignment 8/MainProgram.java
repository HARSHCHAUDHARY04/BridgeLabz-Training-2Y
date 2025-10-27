import com.bank.util.InterestCalculator;

import static java.lang.Math.*;

public class MainProgram {
    public static void main(String[] args) {
        InterestCalculator calc = new InterestCalculator();
        
        double principal = 100000;
        double rate = 5.0;
        int time = 3;
        
        double si = calc.calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + si);
        
        double ci = calc.calculateCompoundInterest(principal, rate, time);
        System.out.println("Compound Interest: " + ci);
    }
}

