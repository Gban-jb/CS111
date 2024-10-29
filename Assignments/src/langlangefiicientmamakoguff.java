
public class langlangefiicientmamakoguff {

	public static void main(String[] args) {
		System.out.println(prime(2));
	}
	public static boolean prime(int number) {
		if (number==0 || number ==1 || number%2==0) {
			return false;
		}
		else {
			for(int i=2;i<=(number/2);i=i+2) {
				if (number%i==0) {
					return true;
				}
			}
			return false;
		}
		
	}

}
