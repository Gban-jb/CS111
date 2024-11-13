import java.util.Scanner;
public class CountOccurance {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100: ");

		int [] count = new int[100];
		int n;
		
		do {
			n = input.nextInt();
			count[n]++;
			
		} while(n!=0);
		
		for(int i = 1; i <count.length; i++) {
			if(count[i]> 0) {
				System.out.printf("%d occurs %d time%s.\n", i, count[i], (count[i] > 1) ? "s" : "" );
			}
		}
		
		
		input.close();
	}
}
