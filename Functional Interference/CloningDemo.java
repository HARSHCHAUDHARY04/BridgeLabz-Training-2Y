class PrototypeModel implements Cloneable {
    String data;

    public PrototypeModel(String data) {
        this.data = data;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public String toString() {
        return "PrototypeModel [data=" + data + ", hash=" + this.hashCode() + "]";
    }
}

public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeModel original = new PrototypeModel("Original Data");
        PrototypeModel copy = (PrototypeModel) original.clone();
        
        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);
        System.out.println("Are they the same object? " + (original == copy));
    }
}