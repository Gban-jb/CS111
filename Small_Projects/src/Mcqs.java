
public class Mcqs {
	public static final int SIZE = 10;

	public static void main(String[] args) {
		char answers[][] = new char [10][10];
		
		char [] correctAnswer = {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B'};

		Exam(answers);	
		answerCount(answers, correctAnswer);
	}
	
	public static void Exam(char answers[][]) {
		System.out.print("{\n");
		for(int i = 0; i < answers.length; i++) {
			System.out.print("{");
			for(int j = 0; j < answers[i].length; j++) {
				answers[i][j] = (char) ((Math.random()* 4) + 65);
				
			System.out.printf("'%c' ", answers[i][j]);
			
			}
			System.out.print("}");

			System.out.println();
			
			}
		System.out.print("}\n");
		}
	
	public static void answerCount(char answers[][], char[] correctAnswer) {
		for(int i = 0; i < SIZE; i++ ) {
			int correctCount = 0;
			for(int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == correctAnswer[j]) {
				correctCount ++;
			}
		}
			System.out.printf("The correct answer of %d student is %d\n", i+1, correctCount);

		
	}
	}
}

