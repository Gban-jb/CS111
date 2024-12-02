//Jeeban Bashyal

import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int m = input.nextInt();
		System.out.println("Enter second number");
		int n = input.nextInt();
		int result = recursive(m, n);
		System.out.println("The recursive GCD of " + m + " and "+ n + " is "+ result);
		input.close();
		}
	
	public static int recursive(int m, int n) {
		if (n == 0){
			return m;
		}
		else {
		return recursive(n, m % n);
			}
		}
	}
