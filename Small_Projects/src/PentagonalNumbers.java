// Jeeban Bashyal
public class PentagonalNumbers {

	public static void main(String[] args) {
				
		final int MAX_NUMBER = 100;
		for (int i = 1; i <= MAX_NUMBER; i++) { 							// Running the loop 100 times for the 100 numbers. 
			
			System.out.printf("%7d", getPentagonalNumber(i)); 				// Print Pentagonal number by calling getPentagonalNumber method.
			if (i != MAX_NUMBER) { 								   			// Before i == 100 - while in the loops	

				if (i % 10 == 0) {											// Breaking the rows after the 10 numbers
					System.out.println();
				}	
			}
			
		}
	}

	public static int getPentagonalNumber(int n) {    						//PentagonalNumber Methods. 
		return (n * (3 * n - 1)) / 2;
	}
}