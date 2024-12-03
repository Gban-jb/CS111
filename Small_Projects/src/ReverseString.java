//Jeeban Bashyal
import java.util.Scanner;
public class ReverseString {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String value = input.next();
		rReverseDisplay(value);

		System.out.printf("The reverse of a %s in a recursive is %s", value, reverseDisplay(value, ""));
		input.close();
	}

	//abcd = dcba
	
	 public static void rReverseDisplay(String value) {
		 String name = value;
		 String message = "";
		 
		 for(int i = value.length() -1; i >= 0; i--) {
			 message = message + value.charAt(i);
			 value = value.substring(0, i);
		 		}
		 	System.out.printf("The reverse of %s is %s.\n", name, message);
	 		}


// Recursive
public static String reverseDisplay(String value, String message) {
	 if( value.length() == 1) {
		 message = message + value.charAt(value.length() -1);
		 return message;		 
	 }
	 
	 else {
		 message = message + value.charAt(value.length()-1);
		 value = value.substring(0, value.length()-1);
		 return reverseDisplay(value, message);
	 
	 } 
}
}




















