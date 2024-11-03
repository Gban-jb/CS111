/* Project: Text-Based Quiz Game
Project Overview
This is a simple console-based quiz game where the user answers questions and receives a score at the end. It mainly uses arrays, strings, and basic control structures.

Steps to Implement
Question Bank:

Store questions, answer options, and correct answers in arrays or a 2D array.
For example, you could have:
java
Copy code
String[] questions = {"What is the capital of France?", "What is 5 + 7?", "Who wrote '1984'?"};
String[][] options = {{"A) Paris", "B) London", "C) Rome"}, {"A) 10", "B) 12", "C) 14"}, {"A) Orwell", "B) Shakespeare", "C) Twain"}};
char[] answers = {'A', 'B', 'A'};

Game Loop:

Display each question with answer options.
Prompt the user to enter an answer.
Check if the answer is correct and track the score.
Score Calculation:

At the end, display the user’s score as a percentage.
Additional Features (Optional):

Shuffle questions to make the quiz feel more dynamic (you could implement a simple shuffle algorithm).
Add a timer to limit how long the user has to answer each question.
This project will help you practice working with arrays, loops, and conditional statements without requiring OOP concepts. Let me know if you’d like more details on any step!






You said:
make the contents(not the technical code) for this program like questions that i can include with their options and right answers
ChatGPT said:
ChatGPT
Sure! Here’s a list of questions, multiple-choice options, and correct answers to help you get started. These cover a range of general knowledge topics and would work well for a beginner-friendly quiz game.

Questions, Options, and Answers
Question: What is the capital of France?

Options:
A) Berlin
B) Madrid
C) Paris
D) Rome
Answer: C
Question: What is the largest planet in our Solar System?

Options:
A) Earth
B) Mars
C) Jupiter
D) Venus
Answer: C
Question: Who wrote the play Romeo and Juliet?

Options:
A) William Shakespeare
B) Mark Twain
C) Charles Dickens
D) Jane Austen
Answer: A
Question: What is the boiling point of water at sea level?

Options:
A) 90°C
B) 100°C
C) 80°C
D) 120°C
Answer: B
Question: How many continents are there on Earth?

Options:
A) 5
B) 6
C) 7
D) 8
Answer: C
Question: What is the chemical symbol for water?

Options:
A) CO2
B) H2O
C) NaCl
D) O2
Answer: B
Question: In which year did World War II end?

Options:
A) 1940
B) 1945
C) 1950
D) 1960
Answer: B
Question: What is the square root of 64?

Options:
A) 6
B) 7
C) 8
D) 9
Answer: C
Question: Who painted the Mona Lisa?

Options:
A) Vincent van Gogh
B) Pablo Picasso
C) Leonardo da Vinci
D) Claude Monet
Answer: C
Question: What is the smallest prime number?

Options:
A) 0
B) 1
C) 2
D) 3
Answer: C
Additional Tips
You can expand this question bank with more questions as needed. Let me know if you’d like more ideas or any guidance on implementing this in code! 

*/



























import java.util.Scanner;
public class QuizProject1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String [] questions = {"1. What is the capital of France?", "2. What is 5 + 7?", "3. Who won 2022 Mens FIFA World Cup?", "4. Who won the ballon dor in the year 2023?", "5. Where does the Gettysburg College located?"};
		String [][] options = {{"A. Kathmandu", "B. Berlin", "C. Paris", "D. Washington"}, {"A. 10", "B. 12", "C. 14", "D. 16"}, {"A. Argentina", "B. Bhutan", "C. China", "D. Denmark"}, {"A. Kylian Mbappe", "B. Luka Modrich", "C. Cristinio Ronaldo", "D. Lionel Messi"}, {"A. Arizona", "B. Barcelona", "C. California", "D. Pennslyvania"}};
		String [] answers = { "c", "b", "a", "d", "d"};
		
		System.out.println("Welcome to the Quiz game and wish you a good luck!");
		
			questionsList(questions, options, answers, input);
			//optionsList(options, input);
	}
	
public static void questionsList(String questions[], String[][] options, String answers[],  Scanner input) {
	String userContinue = "yes";
	
	int count = 0;
	
		for(int i = 0; i<questions.length; i++) {
			if( userContinue == "yes"){
			System.out.printf("%s\n", questions[i] );
				for(int j = 0; j< options[i].length; j++) {
					System.out.printf("%s\n", options[i][j]);
						} // up to options
				
				
				System.out.println("Enter your answer: A, B, C, D: ");
				String userAnswers = input.next().toLowerCase(); 				// Guess by user.
				
					if(userAnswers == answers[i]) {
						count = count + 1;
						System.out.printf(" You have scored %d. Congratulations!\n", count);
					}
					
					else {
						System.out.println("Wrong!");
					}
								
			
			System.out.println("Do you want to continue: Yes or No? ");
			userContinue = input.next().toLowerCase();
			}
		}
		
	
	
	
	//while(userContinue == "yes");
}
}
