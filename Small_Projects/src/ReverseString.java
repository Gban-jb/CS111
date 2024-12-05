//Jeeban Bashyal
import java.util.Scanner;
public class ReverseString {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String value = input.next();
		reverseDisplay(value);
		input.close();
	}


// Recursive
public static void reverseDisplay(String value) {
	 if( value.length() == 0) {
		 return;
	 } 
	 else {	 
		 char s = value.charAt(value.length()-1);
		 System.out.print(s);
		 String updatedValue = (value.substring(0, value.length()-1));
		 reverseDisplay(updatedValue);
	 		}	 
		}
	}


















