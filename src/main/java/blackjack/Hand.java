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

	public boolean bust() {
		if (total > BLACKJACK) {
			return true;
		} else {
			return false;
		}
	}
}
