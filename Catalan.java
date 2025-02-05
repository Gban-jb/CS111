public class Catalan {
	int n;
		public Catalan(int i) {
			this.n = i;
	}
		public static long c(int n) {
		if (n == 0) 
			return 1;
		else 
			return (c(n-1)*(4*n+2))/(n+2);
	}
		@Override
		public String toString() {
			return "C(" + n + ") = " + c(n);
		}
		
	public static void main(String[] args) {
		Catalan c1 = new Catalan(1);
		Catalan c2 = new Catalan(3);
		System.out.println(c1);
		System.out.println(c2);
	}
}
