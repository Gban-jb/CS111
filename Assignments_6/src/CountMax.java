//Jeeban Bashyal

import java.util.Scanner;

public class CountMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers:");

        // Read the first number
        int firstNumber = sc.nextInt();
        if (firstNumber == 0) {
           // System.out.println("No numbers entered.");
            return;
        }
        
//Storing the maximum value 
        int max = firstNumber;
        int count = 1;

        // Continuing the numbers until it is 0.
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }

           //Finding the max number and the counting the number of repeatations.
            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }

        // Printing the final print statements
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}