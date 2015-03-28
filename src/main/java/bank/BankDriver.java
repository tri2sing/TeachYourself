package bank;

public class BankDriver {

	public static void main(String [] args) {
		Checking ca = new Checking(5000.0, 5, 2.5);
		OverDraft oa = new OverDraft(10000, 0.18);
		Savings sa = new Savings(500.0, 0.02);
		Timed ta = new Timed(10000.0, 0.06, 0.05);
		
		Bank bank = new Bank();
		bank.addAccount("Checking", ca);
		bank.addAccount("Overdraft", oa);
		bank.addAccount("Savings", sa);
		bank.addAccount("Timed", ta);
		
		System.out.println("Total holdings(should be $25500.0); $" + bank.totalHoldings() ); 
		System.out.println("Total accounts(shouldbe 4): " + bank.totalAccounts() );
		
		Rewards ra = new Rewards( 5000.00, .05, 500.00 ); 
		bank.addAccount("Rewards", ra );
		
		System.out.println("Total holdings(should be $30500.0); $" + bank.totalHoldings() ); 
		System.out.println("Total accounts(shouldbe 5): " + bank.totalAccounts() );
		
		bank.deposit("Checking", 250.00 );
		double newBalance = bank.balance("Checking"); 
		System.out.println("Checking account new balance (should be 5250.0): $" + newBalance );
	}
}
