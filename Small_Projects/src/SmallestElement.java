//Jeeban Bashyal
import java.util.Scanner;

public class SmallestElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner
        double[] numbers = new double[10];       // Array storage
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();     // Storing the numbers
        }
        
        System.out.print("The Minimum number is " + min(numbers));  // Calling the function
        input.close();
    }

    public static double min(double[] numbers) {   // Functions
        double min = numbers[0];                   // initializations
        for (int j = 1; j < numbers.length; j++) { // Loop from where to where
            if (numbers[j] < min) {                // Minimum conditions
                min = numbers[j];
            }
        }
        return min;                                // Returning minimum
    }
}