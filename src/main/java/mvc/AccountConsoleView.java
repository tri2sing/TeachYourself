package mvc;

public class AccountConsoleView implements AccountObserver {

	private AccountModel model;
	
	
	public AccountConsoleView(AccountModel model) {
		this.model = model;
		this.model.register(this);
	}


	@Override
	public void notifyObserver() {
		System.out.println("Account Balance = $" + String.valueOf(model.getBalance()));
	}

}
