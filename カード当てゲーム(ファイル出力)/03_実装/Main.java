package CardGuessingGame2;

public class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();
		CardGuessingGame game = new CardGuessingGame(deck);
		game.selectPlayMode();
		game.selectReferee(deck);
		game.start();
	}
}
