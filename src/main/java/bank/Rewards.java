package bank;

public class Rewards extends Savings {
	
	private double minDepositToEarnReward;
	private int numOfDepositsThatEarnedReward;

	public Rewards(double balance, double rate, double minDepositToEarnReward) {
		super(balance, rate);
		this.minDepositToEarnReward = minDepositToEarnReward;
	}
	
	public int getNumOfDepositsThatEarnedReward() {
		return numOfDepositsThatEarnedReward;
	}
	
	public void resetnumOfDepositsThatEarnedReward() {
		numOfDepositsThatEarnedReward = 0;
	}
	
	public double getMinDepositToEarnReward() {
		return minDepositToEarnReward;
	}
	
	public void setMinDepositToEarnReward(double minDepositToEarnReward) {
		this.minDepositToEarnReward = minDepositToEarnReward;
	}
	
	public void deposit(double amount) {
		super.deposit(amount);
		if(amount > minDepositToEarnReward) {
			numOfDepositsThatEarnedReward++;
		}
	}

}
