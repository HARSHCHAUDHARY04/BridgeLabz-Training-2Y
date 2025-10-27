import java.io.Serializable;

class UserSettings implements Serializable {
    private static final long serialVersionUID = 1L;
    String theme;
    int fontSize;

    public UserSettings(String theme, int fontSize) {
        this.theme = theme;
        this.fontSize = fontSize;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        UserSettings settings = new UserSettings("Dark Mode", 14);
        
        if (settings instanceof Serializable) {
            System.out.println("UserSettings object is marked as Serializable and can be backed up.");
        }
    }
}