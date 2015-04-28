package blackjack;

public enum Rank {
	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

	private int rank;

	private Rank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	@Override
	public String toString() {
		String result = null;
		if (rank < 11)
			return String.valueOf(rank);
		else {
			switch (rank) {
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
