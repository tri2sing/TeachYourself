package patterns;

import bank.Checking;
import bank.OverDraft;
import bank.Rewards;
import bank.Savings;
import bank.Timed;

public class ConcreteAccountFactory implements AbstractAccountFactory {

	public Checking createCheckingAccount(double balance, int monthlyQuota, double fee) {
		return new Checking(balance, monthlyQuota, fee);
	}

	public OverDraft createOverdraftAccount(double balance, double creditRate) {
		return new OverDraft(balance, creditRate);
	}

	public Rewards createRewardsAccount(double balance, double rate, double minDepositToEarnReward) {
		return new Rewards(balance, rate, minDepositToEarnReward);
	}

	public Savings createSavingsAccount(double balance, double rate) {
		return new Savings(balance, rate);
	}

	public Timed createTimedMaturityAccount(double balance, double rate, double fee) {
		return new Timed(balance, rate, fee);
	}

}
