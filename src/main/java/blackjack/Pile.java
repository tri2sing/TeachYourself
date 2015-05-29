package blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Pile {
	private int index;
	private ArrayList<Card> pile;
	private Random random;

	public Pile() {
		index = 0;
		random = new Random();
		pile = new ArrayList<Card>();
	}

	public void addDeck(Deck deck) {
		for (Card c : deck)
			pile.add(c);
	}
	
	public Card deal(Face face) {
		// Right now I depend on the default IndexOutOfBoundsException exception
		Card card = pile.get(index++);  
		card.setFace(face);
		return card;
	}
	
	public void shuffle(int numTimes) {
		reset();
		for(int i = 0; i < numTimes; i++)
			shuffle();
	}
	
	private void reset() {
		for(Card card: pile) 
			card.setFace(Face.DOWN);
	}
	
	public void shuffle() {
		int numCards = pile.size();
		for (int current = 0; current < numCards; current++) {
			int target = random.nextInt(numCards);
			Card currentCard = pile.get(current);
			Card targetCard = pile.get(target);
			pile.set(current, targetCard);
			pile.set(target, currentCard);
		}
	}
	
	public static void main(String [] args) {
		Deck deck = new Deck();
		Pile pile = new Pile();
		pile.addDeck(deck);
		pile.shuffle(1);
		while(true) {
			System.out.println(pile.deal(Face.DOWN).toString());
		}
	}

}
