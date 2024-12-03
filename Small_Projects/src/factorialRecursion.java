
public class factorialRecursion {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(facto(n));
	}
	
	public static int facto(int n) {
		if(n == 0 || n == 1) {
			return 1;	
		}
		int oneFact = facto(n-1);
		int fact = n * oneFact;
		return fact;		
	}
}
