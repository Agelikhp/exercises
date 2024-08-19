import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password. Password must contain:");
            System.out.println("- At least 8 characters");
            System.out.println("- At least 1 lowercase letter");
            System.out.println("- At least 1 uppercase letter");
            System.out.println("- At least 1 digit");
            System.out.println("- At least 1 special character: #?!@$%^&*-");
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        // Check if the password has at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Check each character in the password
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            // Check if the character is a lowercase letter
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }
            // Check if the character is an uppercase letter
            else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            // Check if the character is a digit
            else if (Character.isDigit(c)) {
                hasDigit = true;
            }
            // Check if the character is a special character
            else if ("#?!@$%^&*-".indexOf(c) != -1) {
                hasSpecialChar = true;
            }
        }

        // Check if all requirements are met
        return hasLowercase && hasUppercase && hasDigit && hasSpecialChar;
    }
}