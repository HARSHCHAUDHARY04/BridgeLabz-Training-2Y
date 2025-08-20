public class uni_fees {
    
    public static void main(String[] args) {
        int fees=125000;
        int discoutPercentage=10;
        double discount=(double)((fees*discoutPercentage)/100);
        double dicountedfees=(double)fees-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+dicountedfees);

    }
}
