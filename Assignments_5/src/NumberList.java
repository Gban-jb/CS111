import java.util.Scanner;
public class NumberList {

	public static void main(String[] args) {
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		// UserInput - Ask for the n positive integer number
		System.out.println(" Enter a positive number: ");
		// Store the data
		int num = sc.nextInt();
		
		// Count initialization
		int count = 1;
		
		// For while loop to print the number
		while(count <= num) {
			System.out.print(count);
			count++;
			
			// to print the comma for number less than userInput.
			if(count <= num)
				System.out.print(",");
			}
		}	
	}

