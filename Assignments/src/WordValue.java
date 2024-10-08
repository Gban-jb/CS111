//Jeeban Bashyal
import java.util.*;
public class WordValue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a word: ");
		String word = input.next();
		
		//converting letters to upperCase
		String upperCaseWord = word.toUpperCase();
		int sum = 0; // Initializing sum to 0 and store sum of letter positions
		
		int lengthOfWord = word.length();  // Length of the word to run the loop		
		
		//Using loop through each character
		for(int i = 0; i < lengthOfWord; i++) {
			
			// Checking if the character is a letter (either uppercase or lowercase)
			if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z' || word.charAt(i) >= 'A' && word.charAt(i) <= 'Z' ) {
				//Now comparing all the Upper Case letters A to get the value of position
				int value = upperCaseWord.charAt(i) - 'A' + 1;  
				sum += value; // Adding the final sum
			}
			
		}
		System.out.println(word + " has the value " + sum);
		input.close();

	}

}
