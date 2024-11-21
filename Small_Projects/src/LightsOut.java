import java.util.Scanner;
public class LightsOut {
	
	public static final char LIGHT_OFF = '.';
	public static final char LIGHT_ON= '@';
	public static final int 	SIZE = 4;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean [][] board = new boolean[4][4];
		for(int i = 1; i <=5; i++) {
			int row, col;
			do {
				row = randomNumber();
				col = randomNumber();
			} while(board[row][col]);
			board[row][col] = true;
		}
		printBoard(board);
		
		// User Read 
		System.out.println("Enter the row: ");
		int rows = readInt(in);
		System.out.println("Enterr the col: ");
		int col = readInt(in);
		
		toggleLights(board, 1, 2);
		printBoard(board);
	in.close();	
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
				if(board[i][j] == true) {
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
		int randInt = (int) (Math.random()* SIZE);
		return randInt;
		}
	
	
	//4 
	public static void toggleOneLight(boolean[][] board,int row, int col) {
		if ((row >= 0 && row < SIZE)&&(col >= 0 && col < SIZE)) {	
		if( board[row][col] == true)
			board[row][col] = false;
		else
			board[row][col] = true;
			}
		}

	
	public static void toggleLights(boolean [][] board, int row, int col) {
		for(int i = row -1; i <= row+1; i++) {
			for(int j = col -1; j <= col + 1; j++) {
				if((i == row-1 && j == col)||(i == row+1 && j == col)||(i == row && j == col-1)||(i == row && j == col+1)) {
					toggleOneLight(board, i, col);
					}
				}
			}
		}
	
	public static boolean isSolution(boolean[][] board) {
		for(int i = 0; i < SIZE; i++ ) {
			for (int j = 0; j < SIZE; j++) {
				if(board[i][j] == true);	
				return false;
			}
		}
		return true;
	}
	
	
	public static int readInt(Scanner in) {
		int num = in.nextInt();
		while(num <0 || num >= 4) {
			System.out.println("The number is out of bounds, please enter next number: ");
			num = in.nextInt();
		}
			return num;
		}
	}




	


