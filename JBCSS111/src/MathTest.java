import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) {
		//TODO: add the % operation
		
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//select two operands at random 1..10
		int operand1 = (int)(Math.random() * 10) + 1;
		int operand2 = (int)(Math.random() * 10) + 1;
		
		//select a value 0..3 to represent an operator
		// 0: +
		// 1: -
		// 2: *
		// 3: / (integer division
		int operator = (int)(Math.random() * 5);  // 0 to 4 number
		
		int result = 0;
		char opSymbol = '+';
		
		//run cases depending on the value in operator
		switch(operator) {
		case 0:
			//do the math
			result = operand1 + operand2;
			//set the symbol
			opSymbol = '+';
			
			//break out of this case
			break;
		case 1:
			result = operand1 - operand2;
			opSymbol = '-';
			break;
		case 2:
			result = operand1 * operand2;
			opSymbol = '*';
			break;
		case 3:
			result = operand1 / operand2;
			opSymbol = '/';
			break;
		
			
			// Printing the 4th result 
			
		case 4:
			result = operand1 % operand2;
			opSymbol = '%';
			break;
		default:
			// go here if none of the cases apply
			//this should not happen, but just in case
			result = operand1 + operand2;
			opSymbol = '+';
		} //end switch
		
		//ask the question
		System.out.print(operand1 + " " + opSymbol + " " + operand2 + " = ");
		
		// when did we wait for the input
		long startTime = System.currentTimeMillis();  
		int answer = input.nextInt();
		
		//when did we receive the input
		long endTime = System.currentTimeMillis();
		
		if(answer == result) {
			System.out.println(answer + " is correct.");
			
			//print out how long it took.
			long diff = endTime - startTime;
			double seconds = diff/1000.0;
			System.out.println("You answered in " + seconds + " seconds.");
			
		} //end if
		else {
			System.out.println(answer + " is not correct.");
			System.out.println(operand1 + " " + opSymbol + " " + operand2 + " = " + result);
		}  //end else
		

	} //end main
 
} //end class
