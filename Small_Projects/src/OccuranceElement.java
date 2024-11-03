import java.util.Scanner;
public class OccuranceElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 9, 1, 2, 5, 6, 9};
		count(arr, input);
		
	}
	
	public static void count(int[] arr, Scanner input) {
		int count = 0;
		System.out.println("Enter the number which you want to check the occurance of: ");
		int number = input.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == number ) {   // while runs until it became true; -if runs for only once.
				count = count +1;
			}	
		}
		System.out.printf("The occurance of %d is %d.", number, count);
	}
	
	

}
