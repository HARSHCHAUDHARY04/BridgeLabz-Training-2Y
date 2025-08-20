import java.util.*;
public class uni_discount_by_input {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int fees=sc.nextInt();
    int discount=sc.nextInt();
    sc.close();
    double discountamount=(double)((fees*discount)/100);
    double dicountedfees=(double)fees-discountamount;
    System.out.println("The discount amount is INR "+discountamount+" and final discounted fee is INR "+dicountedfees);

    }
}
