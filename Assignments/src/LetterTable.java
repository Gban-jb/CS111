//Jeeban Bashyal
public class LetterTable {

	public static void main(String[] args) {
		
		//print the first row of the table -Headings
		System.out.printf("%10s%10s%10s%10s\n","Letter","Value","Letter","Value");
		
		//Initializing the ASCII value of 'a' and 'A' for using in the loops.
		int lowerCaseAlphabet = 'a';
		int upperCaseAlphabet = 'A';
		
		//Using ASCII value for 'z' as the stopping condition  
		int lowerCaseLastAlphabet = 'z';
				
		//Using do while for the table
		
		do {
			// Printing both current lowercase and uppercase letters with their ASCII values
			System.out.printf("%10s%10d%10s%10d\n", (char)lowerCaseAlphabet,lowerCaseAlphabet, (char)upperCaseAlphabet, upperCaseAlphabet);
			lowerCaseAlphabet++;  //increase to another lower case alphabet
			upperCaseAlphabet++;  //increase to another lower case alphabet
			
		} while (lowerCaseAlphabet <= lowerCaseLastAlphabet ); // Stopping once when printed 'z'
		
		
	}

}
