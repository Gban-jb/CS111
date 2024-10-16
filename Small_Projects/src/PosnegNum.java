import java.util.Scanner;
public class PosnegNum {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
		System.out.println(" How many numbers do you like to enter: ");
		int number = sc.nextInt();
		int number1 = -1;
		
		for(int i = 1; i <= number; i++) {
			System.out.println("Enter the number: ");
			int number11 = sc.nextInt();
			
			if (number11 <= number1) {
				System.out.println(" The entered number is Negative and it is " + number11 + ".");
			}
			else if (number11 > number1) {
				System.out.println("The entered number is Positive and it is " + number11 + ".");	
			}
			
			}
		
		
		/*while(number!=0) {
			if (number <= number1) {
				System.out.println(" The entered number is Negative and it is " + number + ".");
			}
			else if (number > number1) {
				System.out.println("The entered number is Positive and it is " + number + ".");	
			}
			System.out.println("Enter the number: ");
			number = sc.nextInt();
			
			*/
		}
	}
