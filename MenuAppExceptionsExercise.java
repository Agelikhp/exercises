import java.util.Scanner;

/** 1.Display Menu 2.Get User Choice with Validation
 * 3.Print User Choice 4.Handle Exceptions**/

public class MenuAppExceptionsExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;


        while (choice != 5) {
            displayMenu();
            try {
                choice = getChoice(scanner);
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Exiting the program. Bye!!");
    }
    public static void displayMenu() {
        System.out.println("Main Menu");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Option 4");
        System.out.println("5. Exit ");
        System.out.println("Insert your choice");

    }

    public static int getChoice (Scanner scanner) {
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= 5) {
                return choice;
            } else {
                throw new IllegalArgumentException("Invalid choice. Please insert a number between 1 and 5");
            }
            } else {
                scanner.next();
                throw new IllegalArgumentException("Invalid input. Please insert a valid integer");

            }
        }
        public static void printChoice(int choice) {
            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1.");
                    break;
                case 2:
                    System.out.println("You selected Option 2.");
                    break;
                case 3:
                    System.out.println("You selected Option 3.");
                    break;
                case 4:
                    System.out.println("You selected Option 4.");
                    break;
                case 5:
                    System.out.println("Exiting the program");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid choice. Please enter a number betweem 1 and 5");
        }
    }

}
