package com.bank.util;

import static java.lang.Math.*;

public class InterestCalculator {
    public double calculateSimpleInterest(double p, double r, int t) {
        return (p * r * t) / 100.0;
    }
    
    public double calculateCompoundInterest(double p, double r, int t) {
        return p * (pow((1 + r/100.0), t)) - p;
    }
}

