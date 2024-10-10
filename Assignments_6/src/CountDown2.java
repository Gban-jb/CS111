//Jeeban Bashyal
import java.util.Scanner;
public class CountDown2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		
		// Nested Loop
		// First make sure it will run horizontally for the user input size times.
		// Then printing it for the vertically for the user input size times.
		for(int row = 1; row <= size; row++) {
			for(int col = size; col >= row; col--) {
				
				//Printing the col and running until col >=row.
				System.out.print(col);
				
				
				// For eradicating the last space
				if (col > 1) {
					System.out.print(" ");
				}
			}
			// For breaking the line and moving into the 2nd row. It is inside the row loop.
			System.out.println();
			
		}
		sc.close();
	}
}
