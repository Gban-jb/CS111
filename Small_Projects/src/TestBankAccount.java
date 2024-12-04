import java.util.Scanner;
public class TestBankAccount {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		BankAccount account1 = new BankAccount("Jeeban", 1234);
		boolean deposited = account1.deposit(100, 1234);
		
		
		if( deposited) {
			System.out.println("You deposited the balance");
		}
		else {
			System.out.println("Error");
		}
		
		System.out.println("Enter a new pin: ");
		int newPin = input.nextInt();
		boolean check = account1.newSetValue(1234, newPin);
		System.out.println(check);
		
		
		
		//int value = account1.checkBalance(1234);
		//System.out.println(" Balance" + value);
		
		
	}

}
