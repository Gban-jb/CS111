// Jeeban Bashyal

import java.util.Scanner;

public class InsideRectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Entering the points
		
		
		System.out.println("Enter a point with two coordinates: ");
		double p1 = sc.nextDouble();
		double p2 = sc.nextDouble();
			
		// And operators to check the both points
		
		if ((p1 <= 10.0 / 2 ) && (p2 <= 5.0 / 2)) {   // Comparisions
			
			System.out.println("Points (" + p1 + " , " + p2 + ") is in the rectangele" );
		}
		
		// Points beyond our ranges.
		
			else {
				System.out.println("Points (" + p1 + " , " + p2 + ") is not in the rectangele" );

			}
			
		}
		
	}


