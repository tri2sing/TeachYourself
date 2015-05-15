package blackjack;

import java.util.ArrayList;

public class BlackjackDealer extends Participant implements Dealer {

	private Pile cardPile;
	private ArrayList<Participant> players = new ArrayList<Participant>();
	private int currentPlayer;
	
	public BlackjackDealer(String name, Hand hand) {
		super(name, hand);
	}

	@Override
	protected boolean takeCardDecision() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void hit(Participant participant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stand(Participant participant) {
		// TODO Auto-generated method stub

	}
}
