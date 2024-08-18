public class AddApp2 {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = AddApp.add(a, b);

        System.out.println("Sum = " + sum);

    }
    public static int add(int a, int b) {
        return a + b;
    }
}
