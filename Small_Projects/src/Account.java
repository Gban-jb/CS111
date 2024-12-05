import java.util.Date;
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date  dateCreated; // - It creates the date when the account is created.
	
	
	// no-args constructor that creates the default values.
	public void noArgConstructor() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0.0;
		java.util.Date date = new java.util.Date();
	}
		
// Constructor with same as class name, no return type
		public Account(int id, double balance, double annualInterestRate) {
			this.id = id;
			this.balance = balance;
			this.annualInterestRate = annualInterestRate;
		}
		
		// Accessor
		public int getId(int id) {
			return id;
		}
		
		public double getBalance() {
			
			return this.balance;
		}
		
		public double annualInterestRate(double annualInterestRate) {
			return annualInterestRate;
		}
		
		// Mutator
		public void setId(int id) {
			this.id = id;
		}
		
		public double setBalance(double balance) {
			if(balance == this.balance) {
				return this.balance;
			}
			else
			return this.balance;
		}
		
		
		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}
		
		// Accessor
		public void getDateCreated() {
			java.util.Date date = new java.util.Date();			
			//System.out.println("The eclapsed time from jan 1 1970 is " + date.getTime() + " milliseconds)");
			System.out.println("Account was created on " + date.toString());
		}
		
		public double getMonthlyInterestRate(double n) {
			double monthlyInterestRate = n / 12;
			return monthlyInterestRate;
		}
		
		public double getMonthlyInterest(double n) {
			double monthlyInterest = ((this.balance * n) / 100) / 12;
			return monthlyInterest;
		}
		
		public double  getWithdraw(double n) {
			this.balance = this.balance - n;
			return this.balance;
		}
		
		public double  getDeposit(double n) {
			this.balance = this.balance + n;
			return this.balance;
		}	
	}
