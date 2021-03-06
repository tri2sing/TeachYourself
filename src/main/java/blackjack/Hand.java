package blackjack;

import java.util.ArrayList;

public class Hand {

	private static final int BLACKJACK = 21;
	private ArrayList<Card> cards;
	private int total;

	public Hand() {
		cards = new ArrayList<Card>();
		total = 0;
	}

	public void addCard(Card card) {
		cards.add(card);
		total += card.getRank().getValue();
	}

	public boolean isBusted() {
		if (total > BLACKJACK) {
			return true;
		} else {
			return false;
		}
	}
	
	public void reset() {
		cards.clear();
	}
	
	public void turnOver() {
		for(Card card: cards) {
			card.setFace(Face.UP);
		}
	}
	
	public int getTotal() {
		return total;
	}
	
	public String toString() {
		StringBuffer sB = new StringBuffer();
		for(Card card: cards) {
			sB.append(card.toString() + " ");
		}
		return sB.toString();
	}
	
	
}
