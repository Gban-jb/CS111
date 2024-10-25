// Jeeban Bashyal
import java.util.Scanner;
public class GeneratePasswords {             	// class

	public static void main(String[] args) {    // main class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of password you want to generate: ");
		int number = sc.nextInt();
		
		// Main program
		for(int i = 0; i < number; i++) {  						//Generating the userInput times passwords
			String character = "";		   						// Initialized
			for(int j= 5; j>=1; j--) {	   						// Getting the 5 times character
				character = character + getLowerCaseChar();		
			}													// End of character loop
			System.out.print(character);						// characters print outside the loop complication
			System.out.print(getIntFromRange(1000, 9999));		// Getting the number only
			System.out.println();								// Break for it
		}
		sc.close();
	}
	
	// Integer functions
	public static int getIntFromRange(int min, int max) {
	int randomNumber = (int) (Math.random() * (max - min + 1) + min); 	//Random formula
	return randomNumber;												// Returns the randomNumber whenever it is called
	}
	
	// Character functions
	public static char getLowerCaseChar() {								
		int randomNumber = (int) (Math.random()* ('z' - 'a' + 1) + 'a');	// Random character from a to z.
		char randomChar = (char)(randomNumber);								// typeCasting from int to char
		return randomChar;													// Value returns
	}
} 																			// End of main function
