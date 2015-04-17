package mvc;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

// The GUI code I copied blindly as I have no interest in UI specifically.

public class AccountView extends JPanel implements AccountObserver {

	public final static String DEPOSIT = "Deposit";
	public final static String WITHDRAW = "Withdraw";

	private AccountModel model;
	private AccountController controller;

	// GUI Elements, pre-allocate all to avoid null values
	private JButton depositButton = new JButton(DEPOSIT);
	private JButton withdrawButton = new JButton(WITHDRAW);
	private JTextField amountField = new JTextField();
	private JLabel balanceLabel = new JLabel();

	private static final long serialVersionUID = -590918024321543897L;

	public AccountView(AccountModel model) {
		this.model = model;
		this.model.register(this);
		attachController(makeController());
		buildUI();
	}

	// called by model when the model changes
	@Override
	public void notifyObserver() {
		System.out.println("AccountView received notification, balance = " + String.valueOf(model.getBalance()));
		balanceLabel.setText("Balance: " + model.getBalance());
	}

	// provides access to the amount entered into the field
	public double getAmount() {
		// assume that the user entered a valid number
		return Double.parseDouble(amountField.getText());
	}

	// wires the given controller to the view, allows outside object to set
	// controller
	public void attachController(AccountController controller) {
		// each view can only have one controller, so remove the old one first
		if (this.controller != null) { // remove the old controller
			depositButton.removeActionListener(controller);
			withdrawButton.removeActionListener(controller);
		}
		this.controller = controller;
		depositButton.addActionListener(controller);
		withdrawButton.addActionListener(controller);
	}

	protected AccountController makeController() {
		return new AccountController(this, model);
	}

	private void buildUI() {
		setLayout(new BorderLayout());
		// associate each button with a commend string
		// the controller will use this string to interpret events
		depositButton.setActionCommand(DEPOSIT);
		withdrawButton.setActionCommand(WITHDRAW);
		// build the display
		JPanel buttons = new JPanel(new BorderLayout());
		JPanel balance = new JPanel(new BorderLayout());
		buttons.add(depositButton, BorderLayout.WEST);
		buttons.add(withdrawButton, BorderLayout.EAST);
		balance.add(balanceLabel, BorderLayout.NORTH);
		balance.add(amountField, BorderLayout.SOUTH);
		add(balance, BorderLayout.NORTH);
		add(buttons, BorderLayout.SOUTH);
	}
}