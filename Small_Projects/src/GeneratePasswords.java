// Jeeban Bashyal
import java.util.Scanner;
public class GeneratePasswords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of password you want to create: ");
		int number = sc.nextInt();
		
		for(int i = number; number <=0; number--) {
			String character = "";
			for(int j= 5; j<=1; j--) {
				character = character + getLowerCaseChar();
			}
			System.out.print(character);
			
			
		}

		
		sc.close();
	}
	
	public static int getIntFromRange(int min, int max) {
		
	int randomNumber = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
	return randomNumber;	
	}
	
	public static char getLowerCaseChar() {
		
		int randomNumber = (int) (Math.random()* ('z' - 'a' +1) + 'a');
		char randomChar = (char)(randomNumber);
		return randomChar;
		
	}

}
