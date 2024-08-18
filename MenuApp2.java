import java.util.Scanner;


public class MenuApp2 {

    public static void printMenu() {
        System.out.println("Choose one of the above");
        System.out.println("1.Intro");
        System.out.println("2.Deletion");
        System.out.println("3.Search");
        System.out.println("4.Update");
        System.out.println("5.Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Successful intro");
                    break;
                case 2:
                    System.out.println("Successful deletion");
                    break;
                case 3:
                    System.out.println("Successful update");
                    break;
                case 4:
                    System.out.println("Successful exit");
                    break;
                case 5:
                    System.out.println("Error");
                    break;
            }
        }
        while (choice != 5) ;


    }

}

