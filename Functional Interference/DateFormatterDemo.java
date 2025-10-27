import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String formatAsStandard(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }
    
    static String formatAsISO(LocalDate date) {
        return date.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}

public class DateFormatterDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        
        System.out.println("Today's Date (Standard): " + DateUtils.formatAsStandard(today));
        System.out.println("Today's Date (ISO): " + DateUtils.formatAsISO(today));
    }
}