/*
 * Tracing Code
 * 
 * For each group of statements below, fill out the table at the end of the file with
 * the values of x and y AFTER the statements execute and a short description of what
 * the statements do. 
 * 
 * Try to fill out the table without running the program. After that, add output 
 * statements to check your work. You can just copy and paste the output line after #1.
 * 
 * Statement #1 is done for you.
 */

public class TracingCode {

	public static void main(String[] args) {
		// #1
		int x = 42;  
		int y = 10;
		System.out.println("#1 x = " + x + "\t y = " + y);
		
		// #2
		x = x + 1;  
		y = y + 2;
		System.out.println("#2 x = " + x + "\t y = " + y);
		
		// #3
		x++; 
		y--;
		System.out.println("#3 x = " + x + "\t y = " + y);
		
		// #4
		++x;
		--y;
		System.out.println("#4 x = " + x + "\t y = " + y);
		
		// #5
		y = x / y;
		System.out.println("#5 x = " + x + "\t y = " + y);
		
		// #6
		y += 1;
		x += y + 2;  
		System.out.println("#6 x = " + x + "\t y = " + y);
		
		// #7
		x *= 2; 
		System.out.println("#7 x = " + x + "\t y = " + y);
		
		// #8
		x = x % y;
		y = y % 3;
		System.out.println("#8 x = " + x + "\t y = " + y);
		
		// #9
		x = y++;   // Be careful with this kind of thing. See note below.
		System.out.println("#9 x = " + x + "\t y = " + y);
		
		// #10
		x = ++y;   // Be careful with this kind of thing. See note below.
		System.out.println("#10 x = " + x + "\t y = " + y);
		
		// #11
		x = Integer.MAX_VALUE;
		System.out.println("#11 x = " + x + "\t y = " + y);
		
		// #12
		x = x + 1;
		System.out.println("#12 x = " + x + "\t y = " + y);
		
		/*
		 * Fill out the table below with your answers.
		 * Statement		x			y		Description
		 * #1				42			10		x is initialized to 42
		 * #2				43			12		x is initialized to 43
		 * #3				44			11		x is initialized to 44
		 * #4				45			10		x is initialized to 45
		 * #5				45			4		x is initialized to 45
		 * #6				52			5		x is initialized to 52
		 * #7				104			5		x is initialized to 104
		 * #8				4			2		x is initialized to 4
		 * #9				2 			3		x is initialized to 2
		 * #10				4 			4		x is initialized to 4
		 * #11				2147483647  4		x is initialized to 2147483647
		 * #12              -2147483648 4 		x is initialized to -2147483648
		 */
		

		//NOTICE: prefix and postfix operators
		//prefix ++ operator: increments x and evaluates to the new value of x
		//postfix ++ operator: increments x but evaluates to the old value of x
		//do NOT put a ++ or -- operator in a place where the order matters
		
	}

}
