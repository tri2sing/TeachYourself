package casino;

public class Dealer {
	private Deck deck;
	
	public Dealer () {
		deck = new Deck();
	}
	
	public Card dealCard() {
		if(deck.size() > 0) {
			return deck.getCardFromFront();
		}
		else {
			return null;
		}
	}
	
	public void shuffleDeck() {
		int numCards = deck.size();
		for(int i = 0; i < numCards; i++) {
			int j = (int) (Math.random() * numCards);
			if(j != i)
				deck.swapCards(i, j);
		}
	}
}
