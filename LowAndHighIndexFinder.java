public class LowAndHighIndexFinder {

        public static int[] getLowAndHighIndexOf(int[] arr, int key) {
            int low = -1;
            int high = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    low = i;
                    break;
                }
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == key) {
                    high = i;
                    break;
                }
            }
            return new int[]{low, high};
        }
        public static void main(String[] args) {
            int[] array = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
            int key = 8;
            int[] result = getLowAndHighIndexOf(array, key);
            System.out.println("Low index: " + result[0]);
            System.out.println("High index: " + result[1]);
        }
    }


