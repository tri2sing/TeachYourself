package bank;

public class Savings extends Account {

	private double rate;	// interest rate
	
	public Savings(double balance, double rate) {
		super(balance);
		this.rate = rate;
	}

	
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}


	public void addInterest() {
		setBalance( getBalance() * (1.0 + rate));
	}
	
	
}
