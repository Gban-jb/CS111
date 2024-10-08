// Jeeban Bashyal
import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a Number: ");
		
		int number = sc.nextInt();
		
		for(int i = 0; i < number; i++) {
			System.out.print("*");
		}
		
		}
}
