//package jdk.internal.util;
import java.util.Scanner;
public class PosNegNum {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int number1 = -1;
		
		while(number!=0) {
			if (number <= number1) {
				System.out.println(" The entered number is Negative and it is " + number + ".");
			}
			else if (number > number1) {
				System.out.println("The entered number is Positive and it is " + number + ".");	
			}
			System.out.println("Enter the number: ");
			number = sc.nextInt();
	
		}

	}
}
