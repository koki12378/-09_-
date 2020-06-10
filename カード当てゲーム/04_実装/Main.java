package CardGuessingGame;

public class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();
		CardGuessingGame game = new CardGuessingGame();
		game.selectReferee(deck);
		game.start();
	}

}
