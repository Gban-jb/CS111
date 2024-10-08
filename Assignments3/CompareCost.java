//Jeeban Bashyal

import java.util.Scanner;

public class CompareCost {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// User input for the package 1
		
		System.out.println("Enter weight and price for package 1: ");
		double w1 = sc.nextDouble();
		double p1 = sc.nextDouble();
		
		
		// User input for the package 2
		
		System.out.println("Enter weight and price for package 2: ");
		double w2 = sc.nextDouble();
		double p2 = sc.nextDouble();
		
		
		// Calculating the price per weight
		double priceperweight1 = p1 / w1;
		double priceperweight2 = p2 / w2;
		
		
		// Comparing the prices and printing.
		
		if (priceperweight1 > priceperweight2) {
			
			System.out.println("Package 2 has a better price. ");
		}
		
		
		else if (priceperweight1 < priceperweight2) {
			
			System.out.println("Package 1 has a better price. ");
		}
		
		
		else {
				
				System.out.println("Two packages have the same price.");
			}
		
		
	}

}
