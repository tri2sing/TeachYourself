package blackjack;

import java.util.ArrayList;

public abstract class Participant {

	private String name;
	private Hand hand;
	private ArrayList<Listener> listeners = new ArrayList<Listener>();

	public Participant(String name, Hand hand) {
		this.name = name;
		this.hand = hand;
	}

	public void addCard(Card card) {
		hand.addCard(card);
		notifyListeners();
	}

	public void play(Dealer dealer) {
		// Stop when there is a bust or a decision to not take a card
		while (!isBusted() && decideHit()) {
			dealer.requestHit(this);
		}
		// Tell the dealer that participant wants to stand
		stopPlay(dealer);
		;
	}

	public void reset() {
		hand.reset();
	}

	public Boolean isBusted() {
		return hand.isBusted();
	}

	public void addListener(Listener listener) {
		listeners.add(listener);
	}

	public String toString() {
		return name + ": " + hand.toString();
	}

	protected Hand getHand() {
		return hand;
	}

	protected void notifyListeners() {
		for (Listener listener : listeners) {
			listener.handChanged(this);
		}
	}

	/**
	 * Dealer need to override this to prevent an infinite loop.
	 * 
	 * @param dealer
	 */
	protected void stopPlay(Dealer dealer) {
		// The player hands control to the dealer to move on to the next player
		dealer.passTurn(this);
	}

	/**
	 * Decide whether to hit or not. 
	 * The details of the decision are left to the child class.
	 * 
	 * @return
	 */
	protected abstract boolean decideHit();
}
