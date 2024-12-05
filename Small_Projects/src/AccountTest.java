
public class AccountTest {

	public static void main(String[] args) {

		Account account1 = new Account(1122, 20000, 4.5);
		double afterWithdraw = account1.getWithdraw(2500);
		//System.out.println("The balance after withdraw is: " + afterWithdraw);
		
		double afterDeposit = account1.getDeposit(3000);
		//System.out.println("The balance after deposit is " + afterDeposit);
		
		double amount = account1.getBalance();
		System.out.println("The Current Balance is " + amount);
		
		double interestRate = account1.getMonthlyInterest(4.5);
		
		System.out.println("The monthly interest rate is " + interestRate + ".");
		
		account1.getDateCreated();	
	}
}
