//Jeeban Bashyal
import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students? ");
		int number = sc.nextInt();
		
		System.out.print("How many grades? ");
		int grades = sc.nextInt();
		
	// For loop for the students number - outer loop
		
		for(int students = 1; students <= number; students++) {
			double sum = 0; // Counting the sum needed for the average.
			
			// Inner loops that runs as much as subjects students wants.
			for(int marks = 1; marks <= grades; marks++)
			{
				System.out.print("Enter student " + students + " grade "+ marks + ": " );
				double individualMarks = sc.nextDouble();
				sum += individualMarks; // updating the subject latest
				}
			// Find the averageMarks
			double averageMarks = (double) ( sum / grades);
			// Print Statements inside the outer loop
			System.out.printf("Student %d had the average %.2f%n", students,  averageMarks);
		}
	}
}
