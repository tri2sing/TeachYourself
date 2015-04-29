package blackjack;


public class Deck {
	private Card [] deck;
	
	public Deck() {
		int i = 0;
		for (Suit s: Suit.values()) {
			for (Rank r: Rank.values()) {
				deck[i] = new Card(s, r); 
			}
		}
	}
}
