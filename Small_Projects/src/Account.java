import java.util.Date;
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date  dateCreated; // - It creates the date when the account is created.
	
	// no-args constructor that creates the default values.
	public Account() {
		this(0, 0, 0.0);
	}
		
// Constructor with same as class name, no return type
		public Account(int id, double balance, double annualInterestRate) {
			this.id = id;
			this.balance = balance;
			this.annualInterestRate = annualInterestRate;
			this.dateCreated= new Date();
		}
		
		// Accessor - getters
		public int getId() {
			return this.id;
		}
		
		public double getBalance() {
			return this.balance;
		}
		
		public double annualInterestRate() {
			return annualInterestRate;
		}
		
		public Date getDateCreated() {
	        return this.dateCreated;
	    }		
			
		// Mutator - setters
		public void setId(int id) {
			this.id = id;
		}
		
		public double setBalance(double balance) {
			return this.balance;
		}
		
		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}
		
		public double getMonthlyInterestRate(double n) {
			double monthlyInterestRate = n / 12;
			return monthlyInterestRate;
		}
		
		public double getMonthlyInterest(double n) {
			double monthlyInterest = ((this.balance * n) / 100) / 12;
			return monthlyInterest;
		}
		
		public double  withdraw(double n) {
			this.balance = this.balance - n;
			return this.balance;
		}
		
		public double  deposit(double n) {
			this.balance = this.balance + n;
			return this.balance;
		}	
	}
