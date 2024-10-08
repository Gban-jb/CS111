//Jeeban Bashyal
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);
        
        int wordCount = 0;  // Initialize a variable to store word count
        String word = "";   // Variable that hold user input
        
        // Continue the loop  while the condition is not satisfied. I.e.the input is not a period
        while (!word.equals(".")) {
            System.out.print("Enter a word: ");
            word = scanner.next();  // Use next() for reading.
            
            // Check if user input is not a period
            if (!word.equals(".")) {
                wordCount++;  // Increment wordCount
            }
        }
        
        // Output
        System.out.println("You entered " + wordCount + " words.");
        
        // Scanner closed.
        scanner.close();
    }
}
