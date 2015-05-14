package blackjack;

public enum Rank {
	TWO(2, "2"), 
	THREE(3, "3"), 
	FOUR(4, "4"), 
	FIVE(5, "5"), 
	SIX(6, "6"), 
	SEVEN(7, "7"), 
	EIGHT(8, "8"), 
	NINE(9, "9"), 
	TEN(10, "10"), 
	JACK(10, "Jack"), 
	QUEEN(10, "Queen"), 
	KING(10, "King"), 
	ACE(11, "Ace");

	private int value;
	private final String display;

	private Rank(int rank, String display) {
		this.value = rank;
		this.display = display;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return display;
	}

}
