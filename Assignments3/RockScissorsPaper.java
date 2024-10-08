//Jeeban Bashyal
import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
// Scanner 
		Scanner sc = new Scanner(System.in);
		
		// User Input
		System.out.print("scissor(0), rock(1), paper(2) : ");
		int userInput = sc.nextInt();
		
		// Computer generate
		int computerNumber = (int) (Math.random()* 3);
	//	System.out.println(computerNumber);
		
		// Checking the logics. Case Ist when userInput is 0.
		if (userInput == 0) {
			if (computerNumber == 0) {
				System.out.println("The computer is scissor. You are scissor too. It is a draw");
				}
			else if (computerNumber == 1) {
				System.out.println("The computer is rock. You are scissor. Computer won");
			}
			else if(computerNumber == 2) {
				System.out.println("The computer is paper. You are scissor. You won");
			}
			
		}
		
		// Checking the logics. Case 2nd when userInput is 1.
		else if (userInput == 1) {
			
			if (computerNumber == 0) {
				System.out.println("The computer is scissor. You are rock. You won");
			}
			else if (computerNumber == 1) {
				System.out.println("The computer is rock. You are rock too. It is a draw");
			}
			else if(computerNumber == 2) {
				System.out.println("The computer is paper. You are rock. Computer won");
			}
				
		}
		
		// Checking the logics. Case 3rd when userInput is 2.
		else if(userInput == 2) {
			if (computerNumber == 0) {
				System.out.println("The computer is scissor. You are paper. Computer won");
			}
			else if (computerNumber == 1) {
				System.out.println("The computer is rock. You are paper. You won");
			}
			else if(computerNumber == 2) {
				System.out.println("The computer is paper. You are paper too. It is a draw");
			}	
		}
		// Finished	
	}
}
