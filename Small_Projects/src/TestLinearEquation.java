// Jeeban Bashyal

import java.util.Scanner;
public class TestLinearEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a, b, c, d, e, and f respectively.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		LinearEquation equation1 = new LinearEquation(a, b, c, d, e, f);
		int x = equation1.getX();
		int y = equation1.getY();
		
		if(x == -1 || y == -1) {
				System.out.println("The equation has no solution.");
			}
		else {
				System.out.println("The x is: " + x);
				System.out.println("The y is: " + y);
			}
		
		input.close();
		}	
}