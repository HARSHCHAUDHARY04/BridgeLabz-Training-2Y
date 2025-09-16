public class Circle {
    private double radius;

    public Circle() {
        this(1.0); 
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

   
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle - Radius: " + defaultCircle.radius + ", Area: " + defaultCircle.area() + ", Circumference: " + defaultCircle.circumference());

        Circle customCircle = new Circle(5.0);
        System.out.println("Custom Circle - Radius: " + customCircle.radius + ", Area: " + customCircle.area() + ", Circumference: " + customCircle.circumference());
    }
}