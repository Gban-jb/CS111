import java.util.Scanner;
public class WordValue {

	public static void main(String[] args) {
		// Creating the scanner
		Scanner sc = new Scanner(System.in);
		
		// User Input words
		System.out.print("Enter a word: ");
		String word = sc.next();
		
		//Convert word into all the uppercase character and take the total length of it.
		
		String words = word.toUpperCase();
		System.out.println(words);
		
		int lengthofword = words.length();
		int sum = 0;
		
		for (int i = 0; i < lengthofword; i++) {
			if(words.charAt(i) >= 'A' && words.charAt(i)<= 'Z') {
			int value = words.charAt(i) - 'A' + 1;
			sum += value;
		}
				
	}
		System.out.println("The " + word + " has the total value of " + sum +".");
		sc.close();

}
}
