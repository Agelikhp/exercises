public class AddApp {
    public AddApp(int a, int b) {
    }
//Προσθέτει 2 ακεραίους και εμφανίζει το αποτέλεσμα
// στη κονσόλα(standard output)

    public static void main(String[] args) {

        //δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 12;
        int num2 = 5;
        int sum = 0;

        //εντολές
        sum = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Το άθροισμα των: " + num1 + " + " + num2  + " = " + sum);
        System.out.printf("Το άθροισμα των: %d + %d = %d ", num1, num2, sum );

    }

    public static int add(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }
}
