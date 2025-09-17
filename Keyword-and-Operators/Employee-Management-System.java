public class Employee {
    private static String companyName = "TechCorp Inc.";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid object type");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Alice", "Developer");
        Employee emp2 = new Employee(102, "Bob", "Manager");
        emp1.displayDetails(emp1);
        displayTotalEmployees();
    }
}
