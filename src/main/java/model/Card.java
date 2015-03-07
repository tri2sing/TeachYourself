package model;

public class Card {
	public enum Suit{
		CLUBS, DIAMONDS, HEARTS, SPADES;
	};
	
	public enum Rank {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, KING, QUUE, ACE;
		
	};
	
	public enum Face {
		UP, DOWN;
	}
	
	private Suit suit;
	private Rank rank;
	private Face face;
	
}
