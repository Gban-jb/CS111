import java.util.Scanner;
public class fiboRecor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the index of number for fiboNumber: ");
		int num = input.nextInt();
		
		System.out.println(fiboRecor(num));
		input.close();
		}

	public static int fiboRecor(int num) {
		if(num == 0) {
			return 0;
		}
		else if(num == 1) {
			return 1;
		}
			return fiboRecor(num -1) + fiboRecor(num -2);
	}
}

