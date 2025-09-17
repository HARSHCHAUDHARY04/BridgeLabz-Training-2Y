
import java.util.*;
class company_and_department {
    String name;

    company_and_department(String name) {
        this.name = name;
    }

    void showcompany_and_department() {
        System.out.println("Empolyee: " + name);
    }
}

class Department {
    String deptName;
    List<company_and_department> company_and_departments;

    Department(String deptName) {
        this.deptName = deptName;
        this.company_and_departments = new ArrayList<>();
    }

    void addcompany_and_department(company_and_department e) {
        company_and_departments.add(e);
    }

    void showDept() {
        System.out.println(" Department: " + deptName);
        for (company_and_department e : company_and_departments) {
            e.showcompany_and_department();
        }
    }
}

class Company {
    String companyName;
    List<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDept();
        }
    }
}


public class CompositionExample {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department it = new Department("IT");
        it.addcompany_and_department(new company_and_department("Alice"));
        it.addcompany_and_department(new company_and_department("Bob"));

        Department hr = new Department("HR");
        hr.addcompany_and_department(new company_and_department("Charlie"));

        company.addDepartment(it);
        company.addDepartment(hr);

        company.showCompany();

        company = null; 
        System.out.println("\nCompany deleted! Departments and company_and_departments are gone too.");
    }
}

