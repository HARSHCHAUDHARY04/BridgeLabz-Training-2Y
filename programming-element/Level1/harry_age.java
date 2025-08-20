import java.time.*;
public class harry_age{
    public static void main(String[] args) {
        int age=2000;
        int currdate=LocalDate.now().getYear();
        int diff=currdate-age;
        System.out.println("Age "+diff);
    }
}