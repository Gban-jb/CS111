// Jeeban Bashyal
public class PentagonalNumbers {

	public static void main(String[] args) {
		
		//getPentagonalNumber(n);
		
		for (int i = 1; i <=100; i++) {
			System.out.printf("%6d", getPentagonalNumber(i) );
			//if (i!=100) {
			//	System.out.printf(",");
			

			if (i!=100) {
				
				if(i % 10 != 0) {
				System.out.printf(",");}
				
				if(i % 10 == 0) {
					System.out.println();
				}
			}
			}
		}
		
	public static int getPentagonalNumber(int n) {
			return (n*( 3 * n - 1)) / 2;
			}
	}