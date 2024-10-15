import java.util.Scanner;

public class HexDigit2Dec {
	public static void main(String[] args) {
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		//Reading the User Input character
		System.out.print("Enter a hexadecimal number: ");
		String s1 = sc.nextLine();
		
		// Enter only one character
		if (s1.length() != 1) {
			System.out.println("Enter a number with only one.");
		System.exit(1);	 // Programs ends here.
		} // End of if statements.
		
		// Get the character and Convert the character into UpperCase character.
		char ch = Character.toUpperCase(s1.charAt(0));
		
		// Check if the character is between A and F and assign the value for the respective character
		
		if( ch >= 'A' && ch <= 'F') {
			int value = ch - 'A' + 10;
			// Print the output number
			System.out.println("The decimal value for hex digit " + ch + " is " + value + ".");			
		}
		
		// For the number between 0 to 9. 
		else if (Character.isDigit(ch)) {
			System.out.println("The decimal value for hex digit " + ch + " is " + ch + "."  );
		}
		
		
		// Incase of the invalid input 
		else {
			System.out.println(ch + " is not the valid input.");
		}

}
}
