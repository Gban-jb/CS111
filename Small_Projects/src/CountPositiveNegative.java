// Jeeban Bashyal
import java.util.Scanner;
public class CountPositiveNegative {

	public static void main(String[] args) {
		
		int positives = 0;
		int negatives = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many number you want to check: ");    // UserInput how many numbers to be entered.
		int n = input.nextInt();
		
		for(int i = 1; i <=n; i++) {
			System.out.println("Enter a number: ");  // Userinput number
			double user = input.nextDouble();
			
			if (user> 0) {							// For positives number
				positives += 1;
			}
			
			else if (user < 0){						// For negative number
				negatives += 1;
			}
			
		}
		System.out.println(" There are "+ positives + " positives numbers and " + negatives + " negatives numbers.");  			// Print Statements

		input.close();  				// Scanner closed.
	}

}
