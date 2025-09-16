
public class persion {
    String name;
    int age;

    public persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public persion(persion other) {
        this.name = other.name;
        this.age = other.age;
    }

   
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        persion original = new persion("Alice", 30);
        persion clone = new persion(original);

        System.out.println("Original Person:");
        original.display();

        System.out.println("Cloned Person:");
        clone.display();
    }
}
