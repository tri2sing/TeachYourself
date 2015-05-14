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
		while(!isBusted() && takeCard()) {
			dealer.hit(this);
		}
		// Tell the dealer that participant wants to stand
		dealer.stand(this);
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
		for(Listener listener: listeners) {
			listener.handChanged(this);
		}
	}

	protected abstract boolean takeCard();
}
