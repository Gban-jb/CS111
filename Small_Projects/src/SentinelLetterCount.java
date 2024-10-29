// Jeeban Bashyal
import java.util.Scanner;
public class SentinelLetterCount {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int countLine = 0;  // Initialized 
		String userInput;
		
		do {
			System.out.println("Enter a word: ");  // UserInput String
			userInput = input.next();
			countLine++;
			System.out.println("Line "+ countLine + " has "+ userInput.length() + " characters.");   // Print statements
			
		
		} while(!(userInput.equalsIgnoreCase("quit")));												// Conditions running till.
		
		input.close();																				// Scanner closed

	}

	}
