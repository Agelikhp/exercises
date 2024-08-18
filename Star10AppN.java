import java.util.Scanner;

public class Star10AppN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int n = 0;

        System.out.println("Please insert number of iterations");
        n = scanner.nextInt();

        while(i <= n) {
            System.out.print("*");
            i++;
        }
    }
}
