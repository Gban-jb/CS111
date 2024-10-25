// Jeeban Bashyal
public class SumSeries {

	public static void main(String[] args) {
		//double sum = 0.0;
		System.out.printf("%-15s %-15s\n", "i", "m(i)");
		series();					// Call the method series()
	}
	
	public static void series() {
		double sum = 0.0;				// Initialization sum = 0.0
		for (int i = 1; i <= 20; i++) 
		{  
			sum = sum + (i /( i + 1.0));  // formula to change into required conditions.
			System.out.printf("%-15d %-15.4f\n",i, sum);  // print statements according to the need.
		}
	}
}