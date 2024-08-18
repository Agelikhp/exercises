import java.util.Scanner;

public class ArrayPopulatedKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] ages = new int[5];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Give a number for a place: " + (i + 1));
            //We give i+1 so to be more familiar for the user counting from 1 for them not from 0

            ages[i] = scanner.nextInt();

        }
        for (int i = 0; i < ages.length; i++){
            System.out.print(ages[i] + " ");
        }
    }
}
