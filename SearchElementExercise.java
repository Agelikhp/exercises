//Αναπτύξτε ένα πρόγραμμα που βρίσκει το
//2o μικρότερο στοιχείο ενός πίνακα, το
//στοιχείο δηλαδή που είναι αμέσως
//μεγαλύτερο από το ελάχιστο στοιχείο

public class SearchElementExercise {

    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 3, 12};

        int minValue = Integer.MAX_VALUE;
        int secondMinValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                secondMinValue = minValue;
                minValue = arr[i];
            } else if (arr[i] < secondMinValue && arr[i] != minValue) {
                secondMinValue = arr[i];
            }
        }
        if (secondMinValue == Integer.MAX_VALUE) {
            System.out.println("No second minimum value found");
        } else {
            System.out.printf("Min Value: %d, Second Min Value: %d\n ",
                    minValue, secondMinValue);
        }
    }
}
