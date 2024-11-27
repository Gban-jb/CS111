import java.util.Scanner;

public class gban {
    public static final char LIGHT_OFF = '.';
    public static final char LIGHT_ON = '@';
    public static final int SIZE = 4;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Turn off all of the lights. (. = off, @ = on).");

        boolean[][] board = new boolean[SIZE][SIZE];
        initBoard(board);
        printBoard(board);

        int moves = 0;

        while (!isSolution(board)) {
            int row, col;

            // Get valid row and column inputs
            do {
                System.out.print("Enter row (1-4): ");
                row = readInt(input) - 1;
            } while (row < 0 || row >= SIZE);

            do {
                System.out.print("Enter column (1-4): ");
                col = readInt(input) - 1;
            } while (col < 0 || col >= SIZE);

            // Toggle lights and print the board
            toggleLights(board, row, col);
            moves++;
            printBoard(board);
        }

        // Print result with proper move count wording
        String moveText = moves == 1 ? "move" : "moves";
        System.out.println("You solved the puzzle in " + moves + " " + moveText + "!");
        input.close();
    }

    public static void initBoard(boolean[][] board) {
        int lightsOn = 0;
        while (lightsOn < 5) {  // Ensure exactly 5 lights are on
            int row = (int) (Math.random() * SIZE);
            int col = (int) (Math.random() * SIZE);
            if (!board[row][col]) {  // Turn on light if it is off
                toggleOneLight(board, row, col);
                lightsOn++;
            }
        }
    }

    public static void printBoard(boolean[][] board) {
        System.out.printf("%4s%4d%4d%4d%4d\n", " ", 1, 2, 3, 4);
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%4d", i + 1);
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%4c", board[i][j] ? LIGHT_ON : LIGHT_OFF);
            }
            System.out.println();
        }
    }

    public static void toggleLights(boolean[][] board, int row, int col) {
        // Toggle the selected light and adjacent lights
        toggleOneLight(board, row, col);          // Center
        toggleOneLight(board, row - 1, col);      // Above
        toggleOneLight(board, row + 1, col);      // Below
        toggleOneLight(board, row, col - 1);      // Left
        toggleOneLight(board, row, col + 1);      // Right
    }

    public static void toggleOneLight(boolean[][] board, int row, int col) {
        if (row >= 0 && row < SIZE && col >= 0 && col < SIZE) {
            board[row][col] = !board[row][col];  // Toggle state
        }
    }

    public static boolean isSolution(boolean[][] board) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j]) {  // If any light is still on
                    return false;
                }
            }
        }
        return true;
    }

    public static int readInt(Scanner in) {
        while (!in.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            in.next();
        }
        return in.nextInt();
    }
}
