import java.util.Scanner;

public class TicTacToe {
    private static final char EMPTY = ' ';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private static char[][] board;
    private static char currentPlayer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        board = new char[3][3];
        initializeBoard();
        currentPlayer = PLAYER_X;

        while (true) {
            printBoard();
            System.out.println("Παίκτης " + currentPlayer + ", εισάγετε τη θέση (1-9): ");
            int position = scanner.nextInt();

            if (position < 1 || position > 9) {
                System.out.println("Μη έγκυρη θέση! Επιλέξτε από 1 έως 9.");
                continue;
            }

            if (!makeMove(position)) {
                System.out.println("Η θέση είναι ήδη κατειλημμένη! Προσπαθήστε ξανά.");
                continue;
            }

            if (checkWinner()) {
                printBoard();
                System.out.println("Παίκτης " + currentPlayer + " κέρδισε!");
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("Ισοπαλία!");
                break;
            }

            // Εναλλαγή παίκτη
            currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
        }

        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        System.out.println(" Τρίλιζα ");
        System.out.println("  1 | 2 | 3 ");
        System.out.println(" ----------- ");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) {
                System.out.println(" ----------- ");
            }
        }
    }

    private static boolean makeMove(int position) {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;

        if (board[row][col] == EMPTY) {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    private static boolean checkWinner() {
        // Έλεγχος γραμμών και στηλών
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        // Έλεγχος διαγωνίων
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}