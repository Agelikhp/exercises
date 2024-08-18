import java.util.Scanner;
public class ExerciseStringEncrypt {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string to encrypt: ");
            String input = scanner.nextLine();
            String encrypted = encrypt(input);
            System.out.println("Encrypted string: " + encrypted);
        }

        public static String encrypt(String input) {
            StringBuilder encrypted = new StringBuilder();
            for (char c : input.toCharArray()) {
                encrypted.append((char) (c + 1));
            }
            return encrypted.toString();
        }
    }


