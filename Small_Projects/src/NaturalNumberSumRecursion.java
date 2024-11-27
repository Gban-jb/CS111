import java.util.Scanner;
public class NaturalNumberSumRecursion {
	

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.println("Enter a string: ");
		String userInput = input.next();
		recursive(userInput);
		System.out.println("The recursive function output is " + realrecursive(userInput, ""));
		input.close();
	}
	
	public static void recursive(String userInput) {
		String namee = "";
		for(int i = userInput.length()-1; i >= 0; i--) {
			namee =  (namee + userInput.charAt(i));
		}
		System.out.println(namee);
	}



public static String realrecursive(String message, String rev) {
	//base case
	if(message.length() == 1) {
		rev = rev + message;
		return rev;
	}
	// recursive form
	rev+= message.charAt(message.length() -1);
	message = message.substring(0, message.length()-1);
	return realrecursive(message, rev);	
}
}

