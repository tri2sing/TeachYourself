package blackjack;

public enum Suit {
	CLUBS ("Clubs"), DIAMONDS ("Diamonds"), HEARTS ("Hearts"), SPADES ("Spades");

	private String suit;

	private Suit(String suit) {
		this.suit = suit;
	}

	public String getSuit() {
		return suit;
	}
	
	@Override
	public String toString()
	{
		return suit;
	}
	
}
