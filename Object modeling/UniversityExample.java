
import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void showFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Faculty> facultyList; 

    Department(String deptName) {
        this.deptName = deptName;
        this.facultyList = new ArrayList<>();
    }

    void addFaculty(Faculty f) {
        facultyList.add(f); 
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Faculty f : facultyList) {
            System.out.println("  " + f.name);
        }
    }
}


class University {
    String uniName;
    ArrayList<Department> departments; 

    University(String uniName) {
        this.uniName = uniName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showUniversity() {
        System.out.println("University: " + uniName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}

public class UniversityExample {
    public static void main(String[] args) {
  
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");

   
        Department cs = new Department("Computer Science");
        Department math = new Department("Mathematics");

        cs.addFaculty(f1);  
        math.addFaculty(f2);

  
        University uni = new University("Greenwood University");
        uni.addDepartment(cs);
        uni.addDepartment(math);


        uni.showUniversity();

  
        System.out.println("\nIndependent Faculty:");
        f1.showFaculty();
        f2.showFaculty();

     
        uni = null;  
        System.out.println("\nUniversity deleted! Departments are gone, but Faculties still exist.");
    }
}
