/* Write a Java program named ArrayMethods that performs the following tasks:
 Prompt the User for Input:
 Ask the user how many words they will type (for example, 5 words).
 Accept this number and use it to create an array that will store these words.
 **Read Words from the User */


import java.util.Scanner;

public class ArrayMethods {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create an array for storing user-inputted words
		String[] readWords = words(input);
		
		// Print the words in the array
		outputPrint(readWords);
		
		input.close(); // Close the scanner to prevent resource leaks
	}
	
	// Method to output the contents of the array
	public static void outputPrint(String[] readWords) {
		for (int i = 0; i < readWords.length; i++) {
			System.out.printf("%-10d %-10s\n", i, readWords[i]);
		}
	}

	// Method to read words from the user
	public static String[] words(Scanner in) {
		System.out.print("Enter the number of words you will enter: ");
		int wordsLength = in.nextInt();   

		// Create an array to store the words
		String[] results = new String[wordsLength];
		System.out.printf("Please enter %d words:\n", wordsLength);
		
		// Loop to get words from user input
		for (int i = 0; i < wordsLength; i++) {
			System.out.print("Enter word: ");
			results[i] = in.next();
		}
		
		return results; // Return the array with the input words
	}
}
