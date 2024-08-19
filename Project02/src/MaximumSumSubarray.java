public class MaximumSumSubarray {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = findMaximumSumSubarray(arr);
        System.out.println("Το μέγιστο άθροισμα του υποπίνακα είναι: " + maxSum);
    }

    public static int findMaximumSumSubarray(int[] arr) {
        // Αρχικοποίηση
        int localMax = arr[0];
        int globalMax = arr[0];

        // Διατρέχουμε τον πίνακα
        for (int i = 1; i < arr.length; i++) {
            localMax = Math.max(arr[i], localMax + arr[i]);
            globalMax = Math.max(globalMax, localMax);
        }

        return globalMax;
    }
}