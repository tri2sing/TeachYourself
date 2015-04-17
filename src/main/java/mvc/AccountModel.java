package mvc;

import java.util.ArrayList;

public class AccountModel {

	private double balance;
	private ArrayList<AccountObserver> observers;

	public AccountModel(double balance) {
		this.balance = balance;
		observers = new ArrayList<AccountObserver>();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}
		else {
			throw new IllegalArgumentException("The amount to withdraw is greater than the balance");
		}
	}
	
	public void register(AccountObserver observer) {
		observers.add(observer);
		observer.notifyObserver();
	}
	
	public void deregister(AccountObserver observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(AccountObserver observer: observers) {
			observer.notifyObserver();
		}
	}
	
	

}
