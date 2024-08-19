import java.util.Arrays;

public class ArrayCopyExample {

    // Μέθοδος για shallow copy
    public static int[][] shallowCopy(int[][] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // Μέθοδος για deep copy
    public static int[][] deepCopy(int[][] arr) {
        int[][] newArr = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Arrays.copyOf(arr[i], arr[i].length);
        }
        return newArr;
    }

    public static void main(String[] args) {
        // Δημιουργία ενός αρχικού δυσδιάστατου πίνακα
        int[][] originalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Δοκιμή του shallow copy
        int[][] shallowCopiedArray = shallowCopy(originalArray);

        // Αλλαγή ενός στοιχείου στον shallow copy
        shallowCopiedArray[0][0] = 99;

        // Εμφάνιση των στοιχείων και των δύο πινάκων
        System.out.println("Original Array after shallow copy modification:");
        for (int[] row : originalArray) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Shallow Copied Array:");
        for (int[] row : shallowCopiedArray) {
            System.out.println(Arrays.toString(row));
        }

        // Δοκιμή του deep copy
        int[][] deepCopiedArray = deepCopy(originalArray);

        // Αλλαγή ενός στοιχείου στον deep copy
        deepCopiedArray[0][0] = 42;

        // Εμφάνιση των στοιχείων και των δύο πινάκων
        System.out.println("Original Array after deep copy modification:");
        for (int[] row : originalArray) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Deep Copied Array:");
        for (int[] row : deepCopiedArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}