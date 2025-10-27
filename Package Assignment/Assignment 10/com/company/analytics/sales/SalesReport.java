package com.company.analytics.sales;

public class SalesReport {
    private String region;
    private double sales;
    
    public SalesReport(String region, double sales) {
        this.region = region;
        this.sales = sales;
    }
    
    public void printSalesData() {
        System.out.println("Sales Report:");
        System.out.println("Region: " + region);
        System.out.println("Sales: $" + sales);
    }
}

