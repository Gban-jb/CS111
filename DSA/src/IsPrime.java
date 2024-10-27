import java.util.Scanner;
public class IsPrime {

	public static void main(String[] args) {

Scanner input = new Scanner (System.in);
System.out.println("Enter a number: ");
int number = input.nextInt();
boolean result = isPrime(number);
if(result == false && number == 1) {
	System.out.println("Neither");
}
else  {
System.out.println(result);
}
input.close();

	}
	
	public static boolean isPrime(int num) {
		int count = 0;
		
		if( num % 2 == 0 && num!=2) {
			return false;
		}
		else if (num == 1) {
			return false;
		}
		
		else {
		for (int i = 3; i<= num/2; i+=2) {
			if(num % i == 0) {
				count += 1;
			}			
		}
		if (count <= 0) {
			return true;
		}
		
		else {
			return false;
	}
	}
}
}
