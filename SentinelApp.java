import java.util.Scanner;

public class SentinelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please give a num (-1 for Quit)");
        num = scanner.nextInt();
        while (num != -1) {
            iterations++;
            System.out.println("Please give a num");
            num = scanner.nextInt();
        }
        System.out.printf("%d iterations", iterations);
    }
}
