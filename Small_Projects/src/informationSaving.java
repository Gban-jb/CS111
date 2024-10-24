
 // Jeeban Bashyal

import java.util.Scanner;

public class informationSaving {
	
	public static void main(String[] args) {
		
		/*int randomNumber = (int) (Math.random()* ('z' - 'a' +1) + 'a');
		char randomChar = (char)(randomNumber);
		System.out.println(randomChar);
		
		int randomNumberr = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
		System.out.println(randomNumberr); */
		
		
		for(int i = 4; 4 <=0; i--) {
			String character = "";
			for(int j= 5; j<=1; j--) {
				character = character + getLowerCaseChar();
			}
			System.out.print(character);
		
	
	}
	
		public static char getLowerCaseChar() {
			
			int randomNumber = (int) (Math.random()* ('z' - 'a' +1) + 'a');
			char randomChar = (char)(randomNumber);
			return randomChar;
			
		}
}
}


/*

Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");	  		// User defined number
int num = sc.nextInt();							// Storing the number in a int
int result = reverse(num);						// Calling the reverse method to check the number
if(result == 1)									// if the methods returns 1, print Palindrome
	System.out.println( num + " is a Palindrome number");
else											// Else the methods does not return 1, then it is not Palindrome.
	System.out.println(num + " is not a Palindrome number.");

}

public static int reverse (int number) {   							// Methods
String stringNum = Integer.toString(number);					// Convert interger into string using Integer.toString(number)
String count = "";								y				// Variable to store the first null string and then other strings
int length = stringNum.length();				// Calculating the length of the string to run the loops as much as the length of the Strings.

for(int i = stringNum.length()-1; i>=0; i--) {  // Using logics : strings length index start from 0. So, for the last term it is length()-1
count += stringNum.charAt(i);				// Stores the last character of the string in the first of the count string variable.
}												// Loop finished

if ( stringNum.equals(count)) {					// Comparing the two strings using string1.equals(string2)
return 1;									// if equal it is a palindrome number and returns 1
}
else 											// Else it is not a palindrome number and returns 0.
return 0;	

*/