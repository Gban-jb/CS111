
public class LetterTable {

	public static void main(String[] args) {
		
		System.out.printf("%10s %10s %10s %10s\n", "Letter", "Value", "Letter", "Value");
		
		
		// Initializing the ASCII value of 'a' and 'A' to use in the loop.
		
		int lowerCaseLetter = 'a';
		int upperCaseLetter = 'A';
		
		// using ASCII value 'z' for stopping it.
		
		int lowerCaseLastLetter ='z';
		
		// Using do while for the tables
		
		do {
			System.out.printf("%10s%10d%10s%10d\n", (char)lowerCaseLetter, lowerCaseLetter, (char)upperCaseLetter, upperCaseLetter);
			lowerCaseLetter ++; //increament lowercase number
			upperCaseLetter ++; //decreament uppercase number
		}
		
		while (lowerCaseLetter <= lowerCaseLastLetter); // last stopping initialization
			

	}

}
