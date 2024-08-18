import java.sql.SQLOutput;
import java.util.Scanner;

public class SecondsDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int DAY = 24 * 3600;
        final int HOUR = 3600;
        final int MINUTE = 60;
        int inputSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int remainingSeconds = 0;

        System.out.println("Please insert the count of Seconds");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY;
        remainingSeconds = remainingSeconds % DAY;

        hours = remainingSeconds / HOUR;
        remainingSeconds = remainingSeconds % HOUR;

        minutes = remainingSeconds / MINUTE;
        remainingSeconds = remainingSeconds % MINUTE;

        System.out.printf("Input Seconds: %d = %d Days, %d Hours, %d Minutes, %d Seconds",
                inputSeconds, days, hours, minutes, remainingSeconds);

    }
}
