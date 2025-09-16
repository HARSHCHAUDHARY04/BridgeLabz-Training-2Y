public class Simulate_Student_Report {
    
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Rahul";
        s1.rollno=21;
        s1.marks[0]=70;
        s1.marks[1]=80;
        s1.marks[2]=90;
        s1.print_details();
    }
}

class Student{
    String name;
    int rollno;
    int marks[]=new int[3];

    float calculatemarks(int marks[]){
        int total=0;
        for (int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        return (float)total/marks.length;
    }

    void print_details(){
        System.out.println("STudent name = "+name+", rollno = "+rollno);
        System.out.print("marks=");
        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+",");
        }
        System.out.println("\nAverge of marks is "+calculatemarks(marks));
    }
}
