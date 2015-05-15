package blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteractiveConsole implements Listener {

	// Singleton pattern
	public final static InteractiveConsole instance = new InteractiveConsole();
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	// Prevents instantiation from outside for the singleton
	private InteractiveConsole() {
	}

	public static void writeOutput(String message) {
		System.out.println(message);
	}
	
	public static String readInput(String defaultInput) {
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


}
