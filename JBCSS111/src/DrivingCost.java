// Jeeban Bashyal
import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a driving distance: ");
		double distance = sc.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double miles = sc.nextDouble();
		System.out.println("Enter price per gallons" );
		double price = sc.nextDouble();
		
		// Formulating formula
		double gallons = distance / miles;
		
		double totalCost = gallons * price;
		
		// Printing
		System.out.printf("The cost of driving is : $ %.2f ", totalCost);
		
		
	}
}
