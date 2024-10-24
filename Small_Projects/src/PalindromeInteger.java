// Jeeban Bashyal
import java.util.Scanner;
public class PalindromeInteger {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");	  		// User defined number
		int numb = sc.nextInt();						// Storing the number in a int
		reverse(numb);
		System.out.printf("%d is the reverse of %d\n", reverse(numb), numb);
		System.out.print(isPalindrome(numb));
		sc.close();
	}
	
	public static int reverse(int number) {
		String num = "";
		while(number!=0) {
		int number1 = number % 10;
		number = number / 10;
		num = num + number1;
		}
		int reverseNumber = Integer.parseInt(num);
		return reverseNumber;
		
	}
	public static boolean isPalindrome(int number) {
		int number1 = reverse(number);
		return (number1 == number);      // returning in the single sentence.
		//boolean result = (number1 == number)? true: false;	
		}	
}
