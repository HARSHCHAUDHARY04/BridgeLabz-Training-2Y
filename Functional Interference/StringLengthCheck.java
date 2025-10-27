import java.util.function.Function;

public class StringLengthCheck {
    public static void main(String[] args) {
        Function<String, Integer> getLength = (message) -> message.length();
        
        String msg = "This is a test message.";
        int len = getLength.apply(msg);
        
        System.out.println("Message: '" + msg + "'");
        System.out.println("Length: " + len);
        
        if (len > 20) {
            System.out.println("Message exceeds 20 character limit.");
        }
    }
}