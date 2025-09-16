import java.util.*;
public class AreaofaCircle {
    
    public static void main(String[] args) {
        Circle c1=new Circle(12);
        c1.display();
    }
}

class Circle{
    int radius;

    Circle(int radius){
        this.radius=radius;

    }

    double area(int radius){
        return Math.PI*Math.pow(this.radius, 2);
    }
    double circumference(int radius){
        return 2*Math.PI*radius;
    }
    void display(){
        System.out.printf("Area of circle is %.2f",area(radius));
        System.out.println();
        System.out.printf("Circumference of circle is %.2f",circumference(radius));
    }
}