package bank;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

/* Methods getBalance(), depositFunds(), addAccount(), and totalHoldings() demonstrate 
 * inclusion polymorphism.  hese methods work for any subclass of Account that you create 
 * without knowing about the the additional features that a subclass may add.
 */

public class Bank {
	
	private HashMap<String, Account> accounts;
	
	public Bank() {
		accounts = new HashMap<String, Account>();
	}
	
	public void addAccount(String accountName, Account account) {
		accounts.put(accountName, account);
	}
	
	private Account retrieveAccount(String accountName) {
		return accounts.get(accountName);
	}
	
	public double getBalance(String accountName) {
		Account account = retrieveAccount(accountName);
		if(account != null) {
			return account.getBalance();
		}
		else {
			throw new InvalidParameterException(accountName + " does not exist in the bank");
		}
	}
	
	public void depositFunds(String accountName, double amount) {
		Account account = retrieveAccount(accountName);
		if(account != null) {
			account.deposit(amount);
		}
		else {
			throw new InvalidParameterException(accountName + " does not exist in the bank");
		}
	}
	
	public double totalHoldings() {
		double total = 0.0;
		for(Map.Entry<String, Account> entry : accounts.entrySet()) {
			total += entry.getValue().getBalance(); // The value is the entry is the account
		}
		return total;
	}
	

}
