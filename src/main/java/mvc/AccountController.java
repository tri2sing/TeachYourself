package mvc;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountController implements ActionListener {
	private AccountGUIView view;
	private AccountModel model;

	public AccountController(AccountGUIView view, AccountModel model) {
		this.view = view;
		this.model = model;
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		double amount = view.getAmount();
		// System.out.println("Command = " + command + ". Amount = " + String.valueOf(amount));

		if (command.equals(AccountGUIView.WITHDRAW)) {
			model.withdraw(amount);
		} else if (command.equals(AccountGUIView.DEPOSIT)) {
			model.deposit(amount);
		}
	}
}
