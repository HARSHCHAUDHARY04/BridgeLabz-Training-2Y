package college.department;

public class Department {
    private String name;
    private String code;
    
    public Department(String name, String code) {
        this.name = name;
        this.code = code;
    }
    
    public void displayDepartment() {
        System.out.println("Department: " + name + " [" + code + "]");
    }
}

