// Jeeban Bashyal
import java.util.Scanner;

public class Quardratic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// Input from the Users
		
		System.out.println(" Enter a, b, c: ");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		// b^2 - 4ac = discriminant 
		
		double discriminant = Math.pow(b,2) - 4 *a*c;
		
		
		// Checking conditions
		// D>0 = has 2 roots
		
		
		if (discriminant > 0) {
			double r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
			double r2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;
			
			System.out.printf("The equation has two roots %.5f and %.5f", r1, r2);
		}
			
		// D= 0. Then the equation has only one root.

			else if (discriminant == 0) {
				double r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
				System.out.println("The equation has only one root: " +r1);
			}
				
		
		// If D<0. Then no roots.

				else if (discriminant < 0) {
					System.out.println("The equation has no real roots: ");		
			}
	}
}





