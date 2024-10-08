//Jeeban Bashyal
import java.util.Scanner;
public class PolygonArea {

	public static void main(String[] args) {
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		//User-Input total sides
		System.out.print("Enter the number of sides: ");
		int sides = sc.nextInt();
		
		// side length in double data types
		System.out.print("Enter the side: ");
		double lengthSide = sc.nextDouble();
		
		// Using formula
		double area = (sides * Math.pow(lengthSide, 2)) / (4 * Math.tan(Math.PI / sides));
		
		// Printing		
		System.out.printf("The area of the polygon is %.14f ", area);
		
		
	}

}
