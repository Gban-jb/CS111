import java.util.Scanner;

public class PigRollSequences {
    public static final char TOAD = 'T', FROG = 'F', EMPTY = '-';

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Board position (using TF-)? ");
        String board = in.nextLine().trim().toUpperCase();
        System.out.print("Current player (T/F)? ");
        char currentPlayer = in.nextLine().trim().toUpperCase().charAt(0);
        System.out.println("Winner: " + getWinner(board.toCharArray(), currentPlayer));
        in.close();
    }

    public static char getWinner(char[] board, char currentPlayer) {
        char winner;
        
        for (int i = 0; i < board.length; i++) {
            if (currentPlayer == TOAD && board[i] == TOAD) {
                int position = i;
                //moving right
                if (position + 1 < board.length && board[position + 1] == EMPTY) {
                    board[position + 1] = TOAD;
                    board[position] = EMPTY;
                    winner = getWinner(board, FROG);
                    board[position + 1] = EMPTY;
                    board[position] = TOAD;
                    if (winner == currentPlayer) {
                    	return currentPlayer;
                    }
                 
                }
                //hopping right
                if ((position + 2 < board.length && board[position + 1] == FROG) && board[position + 2] == EMPTY) {
                    board[position + 2] = TOAD;
                    board[position] = EMPTY;
                    winner = getWinner(board, FROG);
                    board[position + 2] = EMPTY;
                    board[position] = TOAD;
                    if (winner == currentPlayer) {
                    	return currentPlayer;
                    }
                }
            }
            
            if (currentPlayer == FROG && board[i] == FROG) {
                int position = i;
                
                if (position - 1 >= 0 && board[position - 1] == EMPTY) {
                    board[position - 1] = FROG;
                    board[position] = EMPTY;
                    winner = getWinner(board, TOAD);
                    board[position - 1] = EMPTY;
                    board[position] = FROG;
                    if (winner == currentPlayer) {
                    	return currentPlayer;
                    }
                }
                
                if (position - 2 >= 0 && board[position - 1] == TOAD && board[position - 2] == EMPTY) {
                    board[position - 2] = FROG;
                    board[position] = EMPTY;
                    winner = getWinner(board, TOAD);
                    board[position - 2] = EMPTY;
                    board[position] = FROG;
                    if (winner == currentPlayer) {
                    	return currentPlayer;
                    }
                }
            }
        }
        
        return currentPlayer == TOAD ? FROG : TOAD;
    }
}