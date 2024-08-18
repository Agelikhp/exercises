public class SearchArrayWithMethod {

    public static void main(String[] args) {
        int [] quantities = {100, 200, 300};
        int position = 0;
        int value = 300;

        position = getElementPosition(quantities, value);

        System.out.printf("Position: %d, Value: %d", position, quantities[position]);
    }

    public static int getElementPosition(int [] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        //If not found
        return -1;
    }
}
