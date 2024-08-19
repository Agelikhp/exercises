import java.util.Scanner;

public class TheaterManagement {
    private static final int ROWS = 30; // Number of rows in the theater
    private static final int COLUMNS = 12; // Number of columns in the theater
    private boolean[][] seats; // 2D array to represent the seating arrangement

    public TheaterManagement() {
        // Initialize the seating arrangement with all seats unbooked
        seats = new boolean[ROWS][COLUMNS];
    }

    // Method to book a seat
    public void book(char column, int row) {
        int colIndex = column - 'A'; // Convert column character to index (A=0, B=1, ...)
        if (row < 1 || row > ROWS || colIndex < 0 || colIndex >= COLUMNS) {
            System.out.println("Invalid seat position.");
            return;
        }

        if (!seats[row - 1][colIndex]) { // Check if the seat is not booked
            seats[row - 1][colIndex] = true; // Book the seat
            System.out.println("Seat " + column + row + " has been booked.");
        } else {
            System.out.println("Seat " + column + row + " is already booked.");
        }
    }

    // Method to cancel a booking
    public void cancel(char column, int row) {
        int colIndex = column - 'A'; // Convert column character to index
        if (row < 1 || row > ROWS || colIndex < 0 || colIndex >= COLUMNS) {
            System.out.println("Invalid seat position.");
            return;
        }

        if (seats[row - 1][colIndex]) { // Check if the seat is booked
            seats[row - 1][colIndex] = false; // Cancel the booking
            System.out.println("Seat " + column + row + " has been canceled.");
        } else {
            System.out.println("Seat " + column + row + " is not booked.");
        }
    }

    // Method to display the seating arrangement
    public void displaySeats() {
        System.out.println("Theater Seating Arrangement:");
        System.out.print("   ");
        for (char c = 'A'; c < 'A' + COLUMNS; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (int i = 0; i < ROWS; i++) {
            System.out.print((i + 1) + " "); // Print row number
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print((seats[i][j] ? "X" : "O") + " "); // X for booked, O for available
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TheaterManagement theater = new TheaterManagement();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter command (book, cancel, display, exit): ");
            command = scanner.nextLine().toLowerCase();

            if (command.equals("exit")) {
                break;
            } else if (command.equals("display")) {
                theater.displaySeats();
            } else {
                System.out.println("Enter seat position (e.g., A1): ");
                String position = scanner.nextLine();
                char column = position.charAt(0);
                int row = Integer.parseInt(position.substring(1));

                if (command.equals("book")) {
                    theater.book(column, row);
                } else if (command.equals("cancel")) {
                    theater.cancel(column, row);
                } else {
                    System.out.println("Invalid command.");
                }
            }
        }

        scanner.close();
    }
}