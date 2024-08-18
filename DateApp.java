import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Please insert 3 integer numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.printf("The date is %02d/%02d/%04d ", num1, num2, num3);

    }
}
