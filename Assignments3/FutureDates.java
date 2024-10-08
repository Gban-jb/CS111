// Jeeban Bashyal

import java.util.Scanner;

public class FutureDates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter today's date: ");
		
		int today = sc.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsed = sc.nextInt();
		
		// Calculating the number from 0 to 6.
		
		int future = (today + elapsed) % 7;
		
		
	// Present days
	// only print here to print the next statement in the same line as well.
		
	if (today == 0) {
		System.out.print(" Today is Sunday ");
	}
	else if (today == 1) {
		System.out.print(" Today is Monday");
	}
	else if (today == 2) {
		System.out.print(" Today is Tuesday");
	}
	else if (today == 3) {
		System.out.print(" Today is Wednesday");
	}
	else if (today == 4) {
		System.out.print(" Today is Thursday");
	}
	else if (today == 5) {
		System.out.print(" Today is Friday");
	}
	else if (today == 6) {
		System.out.print(" Today is Saturday");
	}
		
	
	// Future days
	
	if (future == 0) {
		System.out.println(" and the future day is Sunday ");
	}
	else if (future == 1) {
		System.out.println(" and the future day is Monday");
	}
	else if (future == 2) {
		System.out.println(" and the future day is Tuesday");
	}
	else if (future == 3) {
		System.out.println(" and the future day is Wednesday");
	}
	else if (future == 4) {
		System.out.println(" and the future day is Thursday");
	}
	else if (future == 5) {
		System.out.println("and the future day is Friday");
	}
	else if (future == 6) {
		System.out.println(" and the future day is Saturday");
	}

	
	}

}
