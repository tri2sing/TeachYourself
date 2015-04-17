package mvc;

public class AccountCmdLineView implements AccountObserver {

	private AccountModel model;
	
	
	public AccountCmdLineView(AccountModel model) {
		this.model = model;
		this.model.register(this);
	}


	@Override
	public void notifyObserver() {
		System.out.println("Account Balance = $" + String.valueOf(model.getBalance()));
	}

}
