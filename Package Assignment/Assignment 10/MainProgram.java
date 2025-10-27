import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class MainProgram {
    public static void main(String[] args) {
        SalesReport sales = new SalesReport("North", 150000);
        sales.printSalesData();
        
        System.out.println();
        
        EmployeeReport hr = new EmployeeReport("Raj", 8.5);
        hr.printPerformanceData();
        
        System.out.println();
        System.out.println("Combined Company Report Generated");
    }
}

