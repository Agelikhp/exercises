import java.util.Scanner;

public class CalculatorApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        do {
            MenuApp2.printMenu();
            choice = getUserChoice();

            if(choice <1 || choice > 6) {
                System.out.println("Wrong choice");
                continue;
            }

            System.out.println("Please insert two ints");
            num1 = getOneNumber();
            num2 = getOneNumber();
            result = getResult(choice, num1, num2);
            System.out.println("Result: " + result);

        } while (choice != 6);
        System.out.println("Thanks for using our app");
    }

   public static int getUserChoice() {
        return in.nextInt();
   }

   public static int add(int a, int b) {
        return a + b;
   }

   public static int sub(int a, int b) {
        return a - b;
   }

   public static int mul(int a, int b) {
        return a * b;
   }

   public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid number: 0");
            return 0;
        }
        return a/b;
   }

   public static int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid number: 0");
            return 0;
        }
        return a % b;
   }

   public static int getResult(int choice, int num1, int num2) {
        int result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
                System.out.println("You chose exit");
                break;
            default:
                System.out.println("Wrong Choice");
        }
        return result;
   }

   public static int getOneNumber(){
        return in.nextInt();
   }

}
