import java.util.*;
public class NumberChecker3{
    public static int countDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int[] digitsArray(int n){
        int count=countDigits(n);
        int digits[]=new int[count];
        for(int i=count-1;i>=0;i--){
            digits[i]=n%10;
            n=n/10;
        }
        return digits;
    }
    public static int[] reverseArray(int arr[]){
        int rev[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rev[i]=arr[arr.length-1-i];
        }
        return rev;
    }
    public static boolean arraysEqual(int arr1[],int arr2[]){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int n){
        int digits[]=digitsArray(n);
        int rev[]=reverseArray(digits);
        return arraysEqual(digits,rev);
    }
    public static boolean isDuck(int digits[]){
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int digits[]=digitsArray(n);
        System.out.println("Count of digits:"+countDigits(n));
        System.out.print("Digits array: ");
        for(int i=0;i<digits.length;i++){
            System.out.print(digits[i]+" ");
        }
        System.out.println();
        int rev[]=reverseArray(digits);
        System.out.print("Reversed array: ");
        for(int i=0;i<rev.length;i++){
            System.out.print(rev[i]+" ");
        }
        System.out.println();
        System.out.println("Palindrome:"+isPalindrome(n));
        System.out.println("Duck number:"+isDuck(digits));
    }
}
