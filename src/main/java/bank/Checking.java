package bank;

public class Checking extends Account {
	private int monthlyQuota;
	private int transactionCount;
	private double fee;

	public Checking(double balance, int monthlyQuota, double fee) {
		super(balance);
		this.monthlyQuota = monthlyQuota;
		this.fee = fee;
	}

	@Override
	public void withdraw(double amount) {
		transactionCount++;
		super.withdraw(amount);
	}
	
	public void chargeFee() {
		int extra = transactionCount - monthlyQuota;
		if(extra > 0) {
			double totalFee = extra * fee;
			setBalance(getBalance() - totalFee);
		}
	}
	
	public int getMonthlyQuota() {
		return monthlyQuota;
	}

	public void setMonthlyQuota(int monthlyQuota) {
		this.monthlyQuota = monthlyQuota;
	}

	public int getTransactionCount() {
		return transactionCount;
	}

	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	
}
