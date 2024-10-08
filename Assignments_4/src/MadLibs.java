// Jeeban Bashyal

import java.util.Scanner;

public class MadLibs {
	
	public static void main(String[] args) {
		/* Enter a place: classroom
 Enter an adjective: shocked
 Enter a noun: program
 Enter a plural noun: machines
 Enter a verb ending in "ing": heating

 Today I walked into the classroom to find that all of the computers were off. 
 I was shocked. Not only did I lose a critical program, 
 but the room had gotten cold. Those machines did a great job 
 heating the area. */
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// User Input string
		System.out.println("Enter an adjective: ");
		String adjective = sc.nextLine();
		
		System.out.println("Enter a noun: ");
		String noun = sc.nextLine();
		
		System.out.println("Enter a plural noun: ");
		String pluralNoun = sc.nextLine();
		
		System.out.println("Enter a verb ending in \"ing\" :");
		String verbIng = sc.nextLine();
		
		System.out.println("Today I walked into the "+ adjective + " to find that all of the computers were off.");	
		System.out.println("I was "+ noun + ". Not only did I lose a critical program,");
		System.out.println("but the room had gotten cold. Those " + pluralNoun + " did a great job");
		System.out.println(verbIng + " the area.");	
	}
}
