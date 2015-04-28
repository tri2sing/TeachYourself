package blackjack;

public class Card {
	private final Suit suit; // Suit can only be set at instantiation
	private final Rank rank; // Rank can only be set at instantiation
	private Face face; // Face can go up or down during play

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
		this.face = Face.DOWN;
	}

	public Suit getSuit() {
		return suit;
	}

	public Rank getRank() {
		return rank;
	}

	public Face getFace() {
		return face;
	}

	public void setFace(Face face) {
		this.face = face;
	}

	@Override
	public String toString() {
		return rank.toString() + " of " + suit.toString();
	}

}
