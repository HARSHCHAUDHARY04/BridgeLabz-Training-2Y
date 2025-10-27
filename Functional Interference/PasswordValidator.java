interface SecurityUtils {
    static boolean isPasswordStrong(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*");
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        String pass1 = "weak";
        String pass2 = "StrongPassword123";

        System.out.println("Is '" + pass1 + "' strong? " + SecurityUtils.isPasswordStrong(pass1));
        System.out.println("Is '" + pass2 + "' strong? " + SecurityUtils.isPasswordStrong(pass2));
    }
}