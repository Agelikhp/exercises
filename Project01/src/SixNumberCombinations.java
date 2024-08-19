import java.io.*;
import java.util.*;

public class SixNumberCombinations {
    // Ensure this method is public if you want to call it from Main
    public static int[] readNumbersFromFile(String filename) {
        List<Integer> numberList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                for (String part : parts) {
                    int num = Integer.parseInt(part);
                    if (num >= 1 && num <= 49) {
                        numberList.add(num);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert the list to an array
        return numberList.stream().mapToInt(i -> i).toArray();
    }

    // Change this to public if you want to call it from Main
    public static void generateCombinations(int[] numbers, List<int[]> validCombinations) {
        int n = numbers.length;
        for (int i = 0; i < n - 5; i++) {
            for (int j = i + 1; j < n - 4; j++) {
                for (int k = j + 1; k < n - 3; k++) {
                    for (int l = k + 1; l < n - 2; l++) {
                        for (int m = l + 1; m < n - 1; m++) {
                            for (int p = m + 1; p < n; p++) {
                                int[] combination = {numbers[i], numbers[j], numbers[k], numbers[l], numbers[m], numbers[p]};
                                if (isValidCombination(combination)) {
                                    validCombinations.add(combination);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean isValidCombination(int[] combination) {
        // Implement your filtering logic here
        return true; // Placeholder for actual filtering logic
    }

    public static void writeCombinationsToFile(List<int[]> combinations, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (int[] combination : combinations) {
                bw.write(Arrays.toString(combination));
                bw.newLine(); // Write a new line after each combination
            }
            System.out.println("Valid combinations written to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}