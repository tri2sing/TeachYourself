package blackjack;

public interface Dealer {
	// A player asks the dealer for a card to stay in play
	public void giveHit(Player participant);

	// A player asks the dealer to pass the turn to stop play
	public void passTurn();
}
