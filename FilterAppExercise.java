//Ζητήστε από τον χρήστη να εισάγει έξι ακεραίους από
//1 έως 49 και ελέγξτε αν αυτή η εξάδα περνάει από τα
//παρακάτω φίλτρα (predicates)
//1. Δεν έχει πάνω από 3 άρτιους
//2. Δεν έχει πάνω από 3 περιττούς
//3. Δεν έχει πάνω από 3 συνεχόμενους
//4. Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα
//5. Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα

import java.util.Scanner;

public class FilterAppExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Please insert 6 integers from 1 to 49:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            // Validate the input
            if (arr[i] < 1 || arr[i] > 49) {
                System.out.println("All numbers must be between 1 and 49.");
                return;
            }
        }

        boolean passesAllFilters = notMoreThanThreeEvens(arr) &&
                notMoreThanThreeOdds(arr) &&
                notMoreThanThreeConsecutive(arr) &&
                notMoreThanThreeSameEnding(arr) &&
                notMoreThanThreeInSameTens(arr);

        if (passesAllFilters) {
            System.out.println("The numbers pass all the predicates.");
        } else {
            System.out.println("The numbers do not pass all the predicates.");
        }
    }

    public static boolean notMoreThanThreeEvens(int[] arr) {
        int evens = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens <= 3;
    }

    public static boolean notMoreThanThreeOdds(int[] arr) {
        int odds = 0;
        for (int item : arr) {
            if (item % 2 != 0) {
                odds++;
            }
        }
        return odds <= 3;
    }

    public static boolean notMoreThanThreeConsecutive(int[] arr) {
        int consecutiveCount = 1; // at least one number is always "consecutive" to itself
        int maxConsecutive = 1;   // track the maximum length of consecutive sequence

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                consecutiveCount++;
                if (consecutiveCount > maxConsecutive) {
                    maxConsecutive = consecutiveCount;
                }
            } else {
                consecutiveCount = 1;
            }
        }
        return maxConsecutive <= 3;
    }

    public static boolean notMoreThanThreeSameEnding(int[] arr) {
        int[] endingCounts = new int[10]; // digits 0-9

        for (int item : arr) {
            int ending = item % 10;
            endingCounts[ending]++;
            if (endingCounts[ending] > 3) {
                return false;
            }
        }
        return true;
    }

    public static boolean notMoreThanThreeInSameTens(int[] arr) {
        int[] tensCounts = new int[5]; // tens 0-4 (for numbers 1-49)

        for (int item : arr) {
            int tens = item / 10;
            tensCounts[tens]++;
            if (tensCounts[tens] > 3) {
                return false;
            }
        }
        return true;
    }
}
