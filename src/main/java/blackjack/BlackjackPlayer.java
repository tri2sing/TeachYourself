package blackjack;

public class BlackjackPlayer extends Participant {

	private final static String HIT = "H";
	private final static String STAND = "S";
	private final static String MSG = "[H]it or [S]tand";
	private final static String DEFAULT = "invlaid";

	public BlackjackPlayer(String name, Hand hand) {
		super(name, hand);
	}

	@Override
	protected boolean takeCardDecision() {
		while(true) {
			InteractiveConsole.writeOutput(MSG);
			String response = InteractiveConsole.readInput(DEFAULT);
			if (response.equalsIgnoreCase(HIT)) {
				return true;
			}
			else if (response.equalsIgnoreCase(STAND)) {
				return false;
			}
			else {
				continue;
			}
		}
	}

}
