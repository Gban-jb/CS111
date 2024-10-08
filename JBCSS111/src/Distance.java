//Jeeban Bashyal
import java.util.Scanner;
public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 and y1 : ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("Enter x2 and y2: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double distance = (double) Math.pow((x2 - x1) * 2 + (y2 - y1) * 2, 0.5);
		System.out.println("The distance between the two points is " + distance);
		
		
	}

}

