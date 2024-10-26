// Jeeban Bashyal
import java.util.Scanner;
public class SentinelLetterCount {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int countLine = 0;
		String userInput;
		
		
		do {
			System.out.println("Enter a word: ");
			userInput = input.next();
			int length = userInput.length();
			countLine++;
			System.out.println("Line "+ countLine + " has "+ length + " characters.");
			
		
		} while(!(userInput.equalsIgnoreCase("quit")));
		
		input.close();

	}

	}
