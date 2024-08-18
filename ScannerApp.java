import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int sum;

        System.out.println("Please insert two integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
}
