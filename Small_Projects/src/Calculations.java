
public class Calculations {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		sum(arr);
		product(arr);
		average(arr);
	}
	
	public static void sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum;
		}
		System.out.printf("The sum of the array is %d.\n", sum);
	}
	
	public static void product(int[] arr) {
		int product = 1;
		for(int i = 0; i < arr.length; i++) {
			product = product * arr[i];
		}
		System.out.printf("The product of the array is %d.\n", product);
	}
	
	public static void average(int[] arr) {
		int sum = 0;
		int average = 0;
		for(int i = 0; i< arr.length; i++) {
			sum = sum + arr[i];
			average = sum / arr.length;
		}
		System.out.printf("The average of the given array is %d.\n", average);
	}
}
