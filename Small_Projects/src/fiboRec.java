public class fiboRec {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int n = 7;
		fibo(0, 1, n-2);
	}
	
	public static void fibo(int a, int b, int n) {
		if(n == 0) {
			return;
		}
		int c = a + b;
		System.out.println(c);
		fibo(b, c, n-1);	
	}
}
