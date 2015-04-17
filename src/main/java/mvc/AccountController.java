package mvc;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountController implements ActionListener {
	private AccountView view;
	private AccountModel model;

	public AccountController(AccountView view, AccountModel model) {
		this.view = view;
		this.model = model;
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		double amount = view.getAmount();

		if (command.equals(view.WITHDRAW)) {
			model.withdraw(amount);
		} else if (command.equals(view.DEPOSIT)) {
			model.deposit(amount);
		}
	}
}
