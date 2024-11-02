import java.util.Scanner;
public class ArrayFill {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many number will you entered: ");
		int total = input.nextInt();		
		int [] numbers = new int[total];
		Array(numbers, input); //this method should tale input and print output
	
	}
	
	public static void Array(int[] numbers, Scanner input) {
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Enter a number: ");
			numbers[i] = input.nextInt();  // Stores the inputed input
			
			while(!(numbers[i]>=0 && numbers[i] <=20)) {
				System.out.printf("%d is not between 0 and 20!\n Enter another number: ", numbers[i]);
				
			numbers[i] = input.nextInt();   // Loop -
			}
			
		}
	
		for(int i = 0; i < numbers.length; i++) {   // output
			System.out.print(numbers[i] + " ");
		}
		
	}
}
