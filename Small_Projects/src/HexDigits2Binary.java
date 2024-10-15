import java.util.Scanner;
public class HexDigits2Binary {
	public static void main(String[] args) {
		
		// Create a scanner
		Scanner sc = new Scanner(System.in);
		
		// Enter the character
		System.out.print("Enter a hexadecimal character: ");
		// Read the number
		 char ch = sc.nextLine().charAt(0);
		 
		String results = "";
		
		switch(ch){
		
			case '0': results = "0"; break;
			case '1': results = "1"; break;
			case '2': results = "10"; break;
			case '3': results = "11"; break;
			case '4': results = "100"; break;
			case '5': results = "101"; break;
			case '6': results = "110"; break;
			case '7': results = "111"; break;
			case '8': results = "1000"; break;
			case '9': results = "1001"; break;
			case 'A': results = "1010"; break;
			case 'B': results = "1011"; break;
			case 'C': results = "1100"; break;
			case 'D': results = "1101"; break;
			case 'E': results = "1110"; break;
			case 'F': results = "1111"; break;
			default: 
				System.out.println(ch + " is not a valid number");
			
		}
		
		System.out.println("The binary number of the " + ch + " is " + results);
	}
}
