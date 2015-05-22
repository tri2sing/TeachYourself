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
	protected boolean decideHit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void requestHit(Participant participant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void passTurn(Participant participant) {
		// TODO Auto-generated method stub

	}
}
