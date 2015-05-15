package blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console implements Listener {

	// Singleton pattern
	public final static Console INSTANCE = new Console();
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public String readInput(String defaultInput) {
		try {
			return in.readLine();
		}
		catch (IOException ioe) {
			return defaultInput;
		}
	}
	
	public void handChanged(Participant participant) {
		System.out.println(participant.toString());
	}

	// Prevents instantiation from outside
	private Console() {
	}

}
