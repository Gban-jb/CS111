
public class MethodClasswork {

	public static void main(String[] args) {
		
		/*
		 * Problem 1
		 ****************************************************************************************
		 Precision can cause problems when testing equality with double values. 
		 Small round-offs in calculations can produce differences in values. 
		 Typically you should not use == to compare double values.
		 
		 Example 1:
		 */

		double root2 = Math.sqrt(2);
		double root2Sqrd = root2*root2;
		
		
		//if(root2Sqrd == 2.0) 
			//System.out.printf("%f equals %f\n", root2Sqrd, 2.0);
		//else 
			//System.out.printf("%f is not equal to %f\n", root2Sqrd, 2.0);
		
		/* Example 2: This causes an infinite loop
		double count = 0;
		do {
			System.out.println(count);
			count += 0.1;
		}while(count != 1.0);  //this should be while(count <= 1.0)
		*/
		
		
		/*
		 Create a method called isAlmostEqual which compares two values a and b, and determines 
		 if their difference is less than the given error. 
		 The method should have parameters for a, b, and error.
		 It will return true if a is "almost equal to" b and false otherwise.
		 Note the example in the comments below.
		 */
		
		// Example usage: uncomment to test
		 
		if(isAlmostEqual(root2Sqrd, 2.0, 1e-10))
			System.out.printf("%f equals %f\n", root2Sqrd, 2.0);
		else 
			System.out.printf("%f is not equal to %f\n", root2Sqrd, 2.0);
		
		
		
		
		
		/*
		 * Problem 2
		 ****************************************************************************************
		 Create three overloaded methods called printType which take one parameter
		 and prints a message including its value and its type.
		 
		 a. Create the first printType method which takes a String as a parameter and prints out its
		 value with the message " is a String". Call this method with an appropriate argument.
		 b. Create a second printType method, but this time use an int parameter, and modify the message.
		    Call this method as well.
		 c. Repeat this one more time with a double parameter. Call this method too.
		 
		 */
		
		int x = 2;
		printType(x);
		double y = 2.0;
		printType(y);
		String z = "Hello";
		printType(z);

	}
	

	// Method to check if two double values are almost equal
	public static boolean isAlmostEqual(double a, double b, double error) {
	    return Math.abs(a - b) < error;
	}

	// Overloaded printType method for String
	public static void printType(String value) {
	    System.out.printf("%s is a String\n", value);
	}

	// Overloaded printType method for int
	public static void printType(int value) {
		System.out.printf("%d is a Integer\n", value);
		}

	// Overloaded printType method for double
	public static void printType(double value) {
		System.out.printf("%f is a Double\n", value);
		}
}

