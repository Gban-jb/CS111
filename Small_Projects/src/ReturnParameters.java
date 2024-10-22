import java.util.Scanner;

public class ReturnParameters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		System.out.println("Enter second number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("The sum is: " + Sum(a, b));
		
		System.out.println("The diff is: " + Diff(a, b));
		
		System.out.println("The mul is : " + Mul(a, b));
		
		System.out.println("The div is : " + Div(a, b));
				
	}
	
	public static int Sum( int a, int b) {
		return a + b;	
	}
	
	public static int Diff(int a, int b) {
		return a - b;
	}
	
	public static int Mul(int a, int b) {
		return a * b;
		}

	public static int Div(int a, int b) {
		return a / b;
	}
	
}
