import java. util.Scanner;
public class factorial {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the factorial number: ");
		int num = input.nextInt();
		int result = fac(num);
		System.out.println(result);
		input.close();
		
	}
	
	public static int fac(int num) {
		if(num == 0) {
			return 1;
		}
		return  num * fac(num -1);
	}

}
