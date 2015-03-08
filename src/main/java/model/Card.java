package model;

public class Card {
	
	public enum Suit{
		CLUBS ("Clubs"), DIAMONDS ("Diamonds"), HEARTS ("Hearts"), SPADES ("Spades");
		
		private String value;
		
		private Suit(String value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return value;
		}
		
	};
	
	public enum Rank {
		TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);
		
		private int value;
		
		private Rank(int value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			String result = null;
			if(value < 11) 
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
	};
	
	public enum FaceUp {
		UP (true), DOWN (false);
		
		private boolean value;
		
		private FaceUp(boolean value) {
			this.value = value;
		}
	}
	
	private Suit suit;
	private Rank rank;
	private FaceUp face;
	
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public Rank getRank() {
		return rank;
	}

	public FaceUp getFace() {
		return face;
	}

	public void setFace(FaceUp face) {
		this.face = face;
	}
	
	@Override
	public String toString(){
		return rank.toString() + " of " + suit.toString();
	}

	public static void main(String [] args){
		
		for(Rank r: Rank.values()) {
			System.out.println("Possible rank = " + r.toString());
		}
		System.out.println();
		
		for(Suit s: Suit.values()) {
			System.out.println("Possible suit = " + s.toString());
		}
		System.out.println();
		
		Card c1 = new Card(Suit.CLUBS, Rank.SEVEN);
		System.out.println("Card = " + c1.toString());
		c1 = new Card(Suit.DIAMONDS, Rank.KING);
		System.out.println("Card = " + c1.toString());

	}
	
	
}
