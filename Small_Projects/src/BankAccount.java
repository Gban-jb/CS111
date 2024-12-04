public class BankAccount {
// objects
	//constructors
	//Methods
	
	private String name;
	private long accountNumber;
	private int balance;
	private int pin;
	
	public BankAccount(String n, int p) {
		name = n;
		balance = 0;
		pin = p;
			
	}
	
	public boolean deposit(int value, int p) {
		if(pin == p) {
		balance +=value;
	return true;
		}
		return false;
	}
	
	public int checkBalance(int p) {
		if(pin == p) {
			return balance;
		}
		return -1;	
	}
	
	public String getName(int p) {
		if(pin == p) {
			return name;
		}
		return null;
	}
	
	
	public boolean newSetValue(int oldPin, int newPin) {
		if(pin == oldPin) {			
			pin = newPin;
			return true;
		}
		return false;
	}	
}
