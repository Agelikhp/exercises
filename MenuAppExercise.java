import java.util.Scanner;

public class MenuAppExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        while(true) {
            System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.println("Επιλέξτε!");

            choice = scanner.nextInt();

            if(choice <= 0 || choice >=6) {
                System.out.println("Λάθος Επιλογή");
                continue;
            }
            if (choice == 5) {
                System.out.println("Έξοδος");
                break;
            }
            if(choice == 1) {
                System.out.println("Εισαγωγή");
            }else if (choice == 2) {
                System.out.println("Διαγραφή");
            }else if (choice == 3) {
                System.out.println("Ενημέρωση");
            }else { // choice == 4
                System.out.println("Αναζήτηση");
            }

        }

    }
}
