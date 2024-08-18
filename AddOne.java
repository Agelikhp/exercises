public class AddOne {

    public static void main(String[] args) {
      int arr[] = {9, 9, 9};
      int [] arrOut;
      arrOut = addOne(arr);

      for (int item : arrOut) {
          System.out.print(item + " ");
      }
    }
    public static int[] addOne(int[] arr) {
        int [] arrOut;
        int currentSum;
        int carry = 1;

        if (arr == null) throw new IllegalArgumentException();

        arrOut = new int[arr.length + 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            currentSum = arr[i] + carry;

            arrOut[i + 1] = currentSum % 10;
            carry = currentSum / 10;
        }
        arrOut[0] = (carry == 1) ? 1 : 0;
        return arrOut;
    }
}
