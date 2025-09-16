public class DisplayEmployeeDetails {
    
    public static void main(String[] args) {
        Employee e1=new Employee(12,"yoyo",20000);


    }
}

class Employee{
    int id;
    String name;
    int salary;

    Employee(int id,String name ,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        System.out.println("id of employee is "+this.id+" name is "+this.name+" and salary is "+this.salary);
    }
}
