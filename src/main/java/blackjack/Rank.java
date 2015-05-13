package blackjack;

public enum Rank {
	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

	private int value;

	private Rank(int rank) {
		this.value = rank;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		String result = null;
		if (value < 11)
			return String.valueOf(value);
		else {
			switch (value) {
			case 11:
				result = "Jack";
				break;
			case 12:
				result = "Queen";
				break;
			case 13:
				result = "King";
				break;
			case 14:
				result = "Ace";
				break;
			default:
				break;
			}

		}
		return result;
	}

}
