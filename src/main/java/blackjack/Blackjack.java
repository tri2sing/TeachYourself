package blackjack;


public class Blackjack {

	public static void main(String[] args) {
		Pile cards = new Pile();
		for(int i = 0; i < 4; i++) {
			cards.addDeck(new Deck());
			cards.shuffle();
		}
		Hand dealerHand = new Hand();
		Hand playerHand = new Hand();
		BlackjackDealer dealer = new BlackjackDealer("Vegas Dealer", dealerHand, cards);
		BlackjackPlayer player = new BlackjackPlayer("Novice Player", playerHand);
		dealer.addListener(InteractiveConsole.INSTANCE);
		player.addListener(InteractiveConsole.INSTANCE);
		dealer.addPlayer(player);
		dealer.startGame();
	}

}
