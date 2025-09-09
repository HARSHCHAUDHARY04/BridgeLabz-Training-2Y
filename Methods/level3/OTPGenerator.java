package level3;
public class OTPGenerator{
    public static int generateOTP(){
        return 100000+(int)(Math.random()*900000);
    }
    public static boolean checkUnique(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        int otps[]=new int[10];
        for(int i=0;i<10;i++){
            otps[i]=generateOTP();
        }
        System.out.println("Generated OTPs:");
        for(int i=0;i<10;i++){
            System.out.println(otps[i]);
        }
        boolean unique=checkUnique(otps);
        if(unique){
            System.out.println("All OTPs are unique");
        }else{
            System.out.println("Duplicate OTPs found");
        }
    }
}
