//Jeeban Bashyal

import java.util.Scanner;
public class ClassAverage {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);z
		
		// Marks entry in different 6 components
		
		System.out.println("Enter your average marks for Homework: ");
		double homeWork = sc.nextDouble();
		
		System.out.println("Enter your average marks for Fourth Hour Quizzes: ");
		double fourthHour = sc.nextDouble();
		
		System.out.println("Enter your average marks for Classwork: ");
		double classWork = sc.nextDouble();
		
		System.out.println("Enter your average marks for Event Attendance: ");
		double eventAttendance = sc.nextDouble();
		
		System.out.println("Enter your average marks for Tests: ");
		double tests = sc.nextDouble();
		
		System.out.println("Enter your average marks for Final Exam: ");
		double finalExam = sc.nextDouble();
		
		double courseAverage = (homeWork + fourthHour + classWork + eventAttendance + tests + finalExam);
		
		// print
		
		System.out.println("Your class average scores out of 100 is: " + courseAverage);
		
		// Grades finding
		
		/* Grade Ranges
		A+	98 - 100	A	93 - 97.5	A-	90 - 92.99
		B+	87 - 89.99	B	83 - 86.99	B-	80 - 82.99
		C+	77 - 79.99	C	73 - 76.99	C-	70 - 72.99
		D+	67 - 69.99	D	60 - 67	F	below 60 */
		
		// A grades 
		if (courseAverage >= 98 && courseAverage <= 100) {
			System.out.println(" Your Grades is A+");
		}
		
		else if (courseAverage >= 93 && courseAverage <= 97.5) {
			System.out.println(" Your Grades is A");
		}
		
		else if (courseAverage >= 90 && courseAverage <= 92.99) {
			System.out.println(" Your Grades is A-");
		}
		
		// B grades
		
		else if (courseAverage >= 87 && courseAverage <= 89.99) {
			System.out.println(" Your Grades is B+");
		}
		else if (courseAverage >= 83 && courseAverage <= 86.99) {
			System.out.println(" Your Grades is B");
		}
		else if (courseAverage >= 80 && courseAverage <= 82.99) {
			System.out.println(" Your Grades is B-");
		
		}
		// C grades

		else if (courseAverage >= 77 && courseAverage <= 77.99) {
			System.out.println(" Your Grades is C+");
		}
		else if (courseAverage >= 73 && courseAverage <= 76.99) {
			System.out.println(" Your Grades is C");
		}
		else if (courseAverage >= 70 && courseAverage <= 72.99) {
			System.out.println(" Your Grades is C-");
		}
		
		// D grades

		else if (courseAverage >= 67 && courseAverage <= 69.99) {
			System.out.println(" Your Grades is D+");
		}
		else if (courseAverage >= 60 && courseAverage <= 66.99) {
			System.out.println(" Your Grades is D");
		}
		
		// Below F
		else if (courseAverage < 60) {
			System.out.println(" Your Grades is below F");
		}
		
				
		
	}

}
