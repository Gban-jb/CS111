//Jeeban Bashyal

import java.util.Scanner;
public class NumberOfYears {
	public static void main(String[] args) {
		
		//Making Scanner Object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		
		// Stop the execution for a while
		int M = sc.nextInt();
		
		int y = (M / (60 * 24* 365 ));
		int d = (M / (60 * 24));
		
		// Correcting the grammatical error with the singular and plural.
		
		if (y == 1) {
		System.out.println(M + " minutes is approximately " + y + " year and " + d + " days.");
		}
		
		else if (d == 1) {
			System.out.println(M + " minutes is approximately " + y + " year and " + d + " day.");
			}
		 
		else {
			System.out.println(M + " minutes is approximately " + y + " years and " + d +" days.");
			}
		
	//  System.out.println(M + " minutes is approximately " + y + " years and " + d +" days.");
		
	}

}
