import java.util.Scanner;
public class stringPalindrone {
	public static String rev = "";
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String word = input.next();	
		recWord(word);
		
		if(word.equals(rev)) {
			System.out.println("It is palindrone.");
			}
		else {
			System.out.println("It is not Palindrone.");
			}
		input.close();
	}
	
	public static void recWord(String word) {
		if(word.length() == 0) {
			return ;
			}
		
		else {
			rev = rev + word.charAt(word.length()-1);
			recWord(word.substring(0, word.length()-1));		
			 }	
		}
	}
