package bank;

public class OverDraft extends Account {
	private double creditRate;

	public OverDraft(double balance, double creditRate) {
		super(balance);
		this.creditRate = creditRate;
	}

	public double getCreditRate() {
		return creditRate;
	}

	public void setCreditRate(double creditRate) {
		this.creditRate = creditRate;
	}
	
	public void chargeInterest() {
		double balance = getBalance();
		if(balance < 0) {
			double charge = balance * creditRate;
			setBalance( + charge);
		}
	}
	
	// Have to override withdraw to allow negative balance
	// The parent class does not allow negative balances
	@Override
	public void withdraw(double amount) {
		setBalance(getBalance() - amount);
	}
}
