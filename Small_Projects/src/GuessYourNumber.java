//Jeeban Bashyal

import java.util.Scanner;

public class GuessYourNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		System.out.println("Pick a  number between 1 and 1000, and I will try to guess it.\r\n"
				+ "...don't tell me what it is.");		

		int count = 0;

		int low = 1;

		int high = 1000;
		
		char userOption;

		while(low <= high) {

			int guess = (low + high) / 2;

			count++;

			System.out.printf("I think the number is between %d and %d.\n\n", low, high);

			System.out.printf("I am going to guess %d.\n", guess);

			printMenu();

			userOption = getUserOption(input);

			if(userOption == 'a') {

				if(count == 1) {

					System.out.println("Go me! It took me only 1 guess.");					
				}

				else {
					System.out.printf("Go me! It took me only %d guesses.", count);					

				}
				return;

			}

			else if(userOption == 'b') {

				low = guess + 1;
			}

			else if(userOption == 'c') {
				high = guess - 1;

			}

			else if(userOption == 'q') {

				return;

			}
			
		}
		
		System.out.println("You changed your number! I quit");
	}
	
	
	public static void printMenu() {
		System.out.println("(A) My guess is correct.");
		System.out.println("(B) My guess is too low.");
		System.out.println("(C) My guess is too high.");
		System.out.println("(Q) Quit.");
	}
	
	public static char getUserOption(Scanner input) {
		
	    System.out.print("Enter A, B, C or Q: ");
		String userOption = input.next();		

		while(!isValidMenuItem(userOption)) {
			
			System.out.printf("%s is not an option.\n", userOption);
			System.out.print("Enter A, B, C or Q: ");
			userOption = input.next();
			
		}	
		
		    return userOption.toLowerCase().charAt(0);    

	}
	
	public static boolean isValidMenuItem(String word) {
		
		boolean isValidMenuItem = (word.length() == 1) && (word.equalsIgnoreCase("A") || word.equalsIgnoreCase("B") || word.equalsIgnoreCase("C") || word.equalsIgnoreCase("Q"));
		return isValidMenuItem;
	}
}
