
public class Recursion1 {

	public static void main(String[] args) {

	recursion(1);	
	}
	
	public static void recursion(int num) {
		if(num ==5) {
			System.out.println(num);
			return;
		}
		else {
			System.out.println(num);
			recursion(num + 1);
		}
	}

}
