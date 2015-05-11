package blackjack;

import java.util.Iterator;

public class Deck implements Iterable<Card> {
	private Card[] deck;

	public Deck() {
		// I know there are 52 cards in a deck, but this is just to 
		// increase my knowledge of the API so using length.
		deck = new Card[Suit.values().length * Rank.values().length];
		int i = 0;
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck[i++] = new Card(s, r);
			}
		}
	}

	@Override
	public Iterator<Card> iterator() {
		return new DeckIterator(deck);
	}

	private class DeckIterator implements Iterator<Card> {
		private int index;
		Card[] cards;

		public DeckIterator(Card[] cards) {
			this.cards = cards;
			int index = 0;
		}

		@Override
		public boolean hasNext() {
			if (index < cards.length)
				return true;
			else
				return false;
		}

		@Override
		public Card next() {
			return cards[index++];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("Deck Iterator does not allow this operation");
		}

	}
	
	public static void main(String [] args) {
		Deck deck = new Deck();
		for(Card c: deck) {
			System.out.println(c.toString());
		}
	}

}
