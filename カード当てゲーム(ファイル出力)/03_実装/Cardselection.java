package CardGuessingGame2;

public class CardSelection {
	Player player;
	Card card;

	public CardSelection(Player player, Card card) {
		this.player = player;
		this.card = card;
	}

	public String getName() {
		return player.getName();
	}

	public Card getCard() {
		return card;
	}
}
