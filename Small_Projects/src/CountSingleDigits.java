// Jeeban Bashyal
import java.util.Arrays;
import java.util.Scanner;
public class CountSingleDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	//int max = 9;
	//int min = 0;
	
	RandomNumber(9, 0);
 countsSingle( 0);
	input.close();	
	}
	public static void RandomNumber( int max, int min) {

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int nine = 0;
		int ten = 0;
		
		for (int i = 0; i <=99; i++) {	
		int randInt = (int) (Math.random()*(max - min + 1)  + min);
		System.out.print(randInt);
		
		if( randInt == 0 ) {
			a = a +1;
		}
		else if ( randInt == 1) {
			b = b +1;
		}
		else if ( randInt == 2) {
			c = c +1;
		}
		else if ( randInt == 3) {
			d = d +1;
		}
		else if ( randInt == 4) {
			e = e +1;
		}
		else if ( randInt == 5) {
			f = f +1;
		}
		else if ( randInt == 6) {
			g = g +1;
		}
		else if ( randInt == 7) {
			h = h +1;
		}
		else if ( randInt == 8) {
			nine = nine +1;
		}
		else if ( randInt == 9) {
			ten = ten +1;
		}
		
		
		
		}
		System.out.println();
	}
	
	public static void countsSingle (int j){
		int array[] = new int[10];
		
		for(int i = 0; i <=9; i++) {
			array[i] = i;
			
			
			System.out.println(" The count of " + array[i] + " is ");
	}
	}
}
	