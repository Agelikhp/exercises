public class PrintArrayMethod {
    public  static void printArray(int [] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        int [] ages = {20, 45, 33, 55, 66, 63};

        printArray(ages);
    }
}

