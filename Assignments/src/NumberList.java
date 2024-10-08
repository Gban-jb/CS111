//Jeeban Bashyal
import java.util.*;
public class NumberList {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Enter user input Positive integer 
		System.out.println("Enter a positive integer: ");
		int n = input.nextInt();
		
		//Condition using for +ve or not.
		while(n <= 0) {
			System.out.println("Please enter a positive integer: "); // Asking for entering the positive integer again.
			n = input.nextInt(); // Read the integer.
		}
		
		//Now initializing count and continuning it yntil the count =< to n
		
		int count = 1;
		
		// Print the values from 1 to n(inclusive)
		while(count <= n) {
			System.out.print(count);
			count++; // For the next value
			
			//Check if the next count is >= n,  and make sure to print comma before printing the next count:
			//If the next count is more than n, it won't print the comma
			if(count <= n) {
				System.out.print(",");
			}
		}
		input.close();

	}

}

