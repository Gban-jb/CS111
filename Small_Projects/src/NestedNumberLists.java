//Jeeban Bashyal
import java.util.Scanner;

public class NestedNumberLists {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");  // UserInput number
		int n = input.nextInt();
		
for(int i = n; i >=1; i--) {  // Number of rows
	for(int j = 1; j <=i; j++) {   // Main printing conditions
		System.out.print(j);
	}
	

	System.out.println();   // Line break
}
	}
}
