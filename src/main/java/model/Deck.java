package model;

import java.util.ArrayList;
import java.util.Collections;

import model.Card.Rank;
import model.Card.Suit;

public class Deck {
	private ArrayList<Card> deck;
	
	public Deck() {
		deck = new ArrayList<Card>();
		for(Suit s: Suit.values()) {
			for(Rank r: Rank.values()) {
				deck.add(new Card(s, r));
			}
		}
	}
	
	public int size() {
		return deck.size();
	}
	
	public Card getCard(int index) {
		if(index < deck.size())
			return deck.get(index);
		else
			return null;
	}

	public Card getCardFromFront() {
		return getCard(0);
	}
	
	public void insertCard(int index, Card card) {
		if(index < deck.size()) {
			deck.add(index, card);
		}
	}
	
	public void swapCards(int i, int j) {
		Collections.swap(deck, i, j);
	}
	
	public void addCardToBack(Card card) {
		deck.add(card);
	}
	
}
