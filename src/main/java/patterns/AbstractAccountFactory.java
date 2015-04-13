package patterns;

import bank.Checking;
import bank.OverDraft;
import bank.Rewards;
import bank.Savings;
import bank.Timed;

public interface AbstractAccountFactory {

	public Checking createCheckingAccount(double initDeposit, int trans, double fee);

	public OverDraft createOverdraftAccount(double initDeposit, double rate);

	public Rewards createRewardsAccount(double initDeposit, double interest, double min);

	public Savings createSavingsAccount(double initBalance, double interestRate);

	public Timed createTimedMaturityAccount(double initBalance, double interestRate, double feeRate);

}
