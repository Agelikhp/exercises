import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Reader!");

        String filePath = "/Users/user/Desktop/CFexcercises/Project01/src/input.txt";
        int[] numbers = SixNumberCombinations.readNumbersFromFile(filePath);
        Arrays.sort(numbers);

        System.out.println("Sorted numbers:");

        System.out.println(Arrays.toString(numbers));

        List<int[]> validCombinations = new ArrayList<>();

        SixNumberCombinations.generateCombinations(numbers, validCombinations);


        SixNumberCombinations.writeCombinationsToFile(validCombinations, "valid_combinations.txt");
    }
}