import java.util.Scanner;

public class ExerciseStringDecrypt {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string to decrypt: ");
            String input = scanner.nextLine();
            String decrypted = decrypt(input);
            System.out.println("Decrypted string: " + decrypted);
        }

        public static String decrypt(String input) {
            StringBuilder decrypted = new StringBuilder();
            for (char c : input.toCharArray()) {
                decrypted.append((char)(c - 1));
            }
            return decrypted.toString();
        }
    }

