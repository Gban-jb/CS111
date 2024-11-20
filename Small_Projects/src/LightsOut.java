import java.util.Scanner;
public class LightsOut {
	
	public static final char LIGHT_OFF = '.';
	public static final char LIGHT_ON= '@';

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		boolean [][] board = new boolean[4][4];
		
		for(int i = 1; i <= 5; i++) {
			int row = randomNumber();
			int col = randomNumber();	
		}
		
		printBoard(board);
		
	input.close();	
	}
	
	
	//1
	public static void initBoard (boolean[][] board) {
		
	}
	
	//2
	public static void printBoard(boolean[][] board) {
		System.out.printf("%4s%4d%4d%4d%4d\n", " ", 1, 2, 3, 4);
		for(int i = 0; i < board.length; i++) {
			System.out.printf("%4d", i + 1);
			
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j] = true) {
					System.out.printf("%4c", LIGHT_ON);
				}
				else {
					System.out.printf("%4c", LIGHT_OFF);
				}
				
			}
			System.out.println();
		}
	}
	
	
	
	//3
	public static int randomNumber() {
		int randInt = (int) (Math.random()* 4);
		return randInt;
	}
	
	
	//4 
	public static void toggleOneLight(boolean[][] board,int row, int col) {
		row = randomNumber();
		col = randomNumber();
		
		for(int i = row; i <= row +1; i++) {
			for(int j = col -1; j <= col + 1; j++) {
				
				if(i <= 0 && i > board.length && j <= 0 && j > board[i].length) {
					board[i][j] = !board[i][j];
				}
			}
		}
		System.out.println();
	}

	

}
