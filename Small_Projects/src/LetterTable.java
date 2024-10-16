public class LetterTable {
	public static void main(String[] args) {
		System.out.printf("%10s%10s%10s%10s\n", "Letter", "Value", "Letter", "Value");
		
		// Initializing the ASCII value of 'a' and 'A' for using in the loop
		int lowerCaseAlphabelts = 'a';
		int upperCaseAlphabelts = 'A';
		
		// Stopping loop
		int lowerCaseLastAlphabelts = 'z';
		
		do {
			System.out.printf("%10s%10d%10s%10d\n", (char)lowerCaseAlphabelts, lowerCaseAlphabelts, (char)upperCaseAlphabelts, upperCaseAlphabelts);
			lowerCaseAlphabelts++; // increase for the next lowercase alphabelts
			upperCaseAlphabelts++; // increase for the next uppercase alphabelts
			
		} while (lowerCaseAlphabelts <= lowerCaseLastAlphabelts);
		
		
}
}
