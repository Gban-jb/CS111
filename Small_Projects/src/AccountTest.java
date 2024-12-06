public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account(1122, 20000, 4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		
		double amount = account1.getBalance();
		System.out.println("The Current Balance is $" + amount);
		double interestRate = account1.getMonthlyInterest(4.5);
		System.out.println("The monthly interest rate is " + interestRate + ".");
		System.out.println("Account was created on " + account1.getDateCreated());	
		}
	}
