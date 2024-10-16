import java.util.Scanner;

public class wordCount {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);
		int wordCount = 0; // to count the wordcount
		String word = ""; // To store the string as a word.
		
		
		while(!word.equals(".")) {
			System.out.print("Enter a word: ");
			word = sc.next();
			//wordCount++;
			
			if (!word.equals(".")) 
				wordCount++;
				//sc.close();
		}
		System.out.println("The total number of words are " + wordCount);
		sc.close();

			
		}
		
		
	}

