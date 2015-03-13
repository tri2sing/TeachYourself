package bank;

public class Timed extends Savings {
	private boolean mature;
	private double fee;

	public Timed(double balance, double rate, double fee) {
		super(balance, rate);
		this.fee = fee;
	}

	public boolean isMature() {
		return mature;
	}

	public void setMature(boolean mature) {
		this.mature = mature;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		if(!mature) {
			// Ignore fact that the charge can be greater than the amount
			amount -= (amount *fee);
		}
		
	}
	
	
}
