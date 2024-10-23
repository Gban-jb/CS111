// Jeeban Bashyal

import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");	
		int num = sc.nextInt();
		int result = reverse(num);
		if(result == 1)
			System.out.println("palindrome");
		else
			System.out.println("no");

	}
	
public static int reverse (int number) {
	String stringNum = Integer.toString(number);
	String count = "";
	int length = stringNum.length();
	
	for(int i = stringNum.length()-1; i>=0; i--) {
		count += stringNum.charAt(i);		
	}
	
	if ( stringNum.equals(count)) {
		return 1;
	}
	else 
		return 0;	
	}
}


