package mvc;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class MVCDriver {
	public static void main(String[] args) {
		AccountModel model = new AccountModel(10000.00);
		AccountGUIView guiView = new AccountGUIView(model);
		AccountConsoleView clView = new AccountConsoleView(model);
		
		JFrame frame = new JFrame();
		WindowAdapter wa = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		frame.addWindowListener(wa);
		frame.getContentPane().add(guiView);
		frame.pack();
		frame.setVisible(true);
	}
}