public class Check_Palindrome_String{
    
public static void main(String[] args) {
    Palindrome p1=new Palindrome();
    p1.str="aba";
    p1.reverse();

}

}

class Palindrome{
    String str;

    void reverse(){
        String revstr="";
        for(int i=str.length()-1; i>=0;i--){
            revstr+=str.charAt(i);
        }
        if(str.equals(revstr)){
            System.out.println("the given string "+str+" is palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }

    }
}
