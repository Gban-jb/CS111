/*1. Initialize counts array of size 10 with all elements set to 0
2. For i = 1 to 100
3.     Generate random number r between 0 and 9
4.     Increment counts[r] by 1
5. End For
6. For i = 0 to 9
7.     Print "Count of", i, "is", counts[i]
8. End For */

public class CountSingleDigits {
	public static void main(String[] args) {

		int[] count = new int [10];								// array for 0 - 9s total number counting
		int[] randomNumberArray = new int[100];					// array for the 100 random numbers
		
		for(int i =0; i<randomNumberArray.length; i++) {		// 100 loops running
			randomNumberArray[i] = (int) (Math.random()* 10);			//100 different random number generating
			for(int j = 0; j<= randomNumberArray[i]; j++) {  //count[randInt] = count[randInt] + 1;  Storing those specific number to the specific count
				
				if(randomNumberArray[i] == j) {
					count[j] = count[j] +1;
				}
			}	
		}
		
		for(int i = 0; i<=9; i++) {
			System.out.printf("The count of %ds is %d\n", i, count[i]);
		}
	}
}
