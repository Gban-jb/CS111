public class recursionSum {

	public static void main(String[] args) {
		recursion(1, 5, 0);	
	}

	public static void recursion(int i, int n, int sum) {
		if(i == n) {
			sum += i;
			System.out.println(sum);
			return;
		}
		sum += i;
		recursion(i+1, n, sum);	
	}
}