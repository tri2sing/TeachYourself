package blackjack;

import java.util.ArrayList;

public class BlackjackDealer extends Player implements Dealer {

	private Pile cards;
	private ArrayList<Player> players = new ArrayList<Player>();
	private int currentPlayer;

	public BlackjackDealer(String name, Hand hand, Pile cardPile) {
		super(name, hand);
		this.cards = cardPile;
	}

	public void addPlayer(Player player) {
		players.add(player);
	}

	@Override
	public void play(Dealer dealer) {
		// Expose cards before
		getHand().turnOver();
		notifyListeners();
		super.play(dealer);
	}

	@Override
	public void giveHit(Player player) {
		player.addCard(cards.deal(Face.UP));
	}

	@Override
	public void passTurn() {
		if (currentPlayer != players.size()) {
			Player player = players.get(currentPlayer);
			currentPlayer++;
			player.play(this);
		} else {
			this.play(this);
		}
	}

	public void deal() {
		cards.shuffle();
		// Reset each player and deal one card to every one
		for (Player player : players) {
			player.reset();
			player.addCard(cards.deal(Face.UP));
		}
		// Deal one card to self face up
		this.addCard(cards.deal(Face.UP));

		// Deal one more card to each player
		for (Player player : players) {
			player.addCard(cards.deal(Face.UP));
		}
		// Deal one card to self face down
		this.addCard(cards.deal(Face.DOWN));

	}

	public void startGame() {
		deal();
		passTurn();
	}

	@Override
	protected boolean decideHit() {
		if (getHand().getTotal() < 17) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	protected void stopPlay(Dealer dealer) {
		// Do nothing, other players call passTurn for the dealer.
		// This prevents an infinite loop from occurring. 
	}

}
