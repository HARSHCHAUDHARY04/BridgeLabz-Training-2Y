import java.util.*;
public class FactorsProgram{
    public static int[] findFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        int arr[]=new int[count];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[index]=i;
                index++;
            }
        }
        return arr;
    }
    public static int greatestFactor(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int sumFactors(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int productFactors(int[] arr){
        int product=1;
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
        }
        return product;
    }
    public static double productCubeFactors(int[] arr){
        double product=1;
        for(int i=0;i<arr.length;i++){
            product=product*Math.pow(arr[i],3);
        }
        return product;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int factors[]=findFactors(n);
        System.out.println("Greatest Factor:"+greatestFactor(factors));
        System.out.println("Sum of Factors:"+sumFactors(factors));
        System.out.println("Product of Factors:"+productFactors(factors));
        System.out.println("Product of Cubes of Factors:"+productCubeFactors(factors));
    }
}
