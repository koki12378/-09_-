package CardGuessingGame2;

abstract class Referee {
	
	private Deck deck;
	private Card answer;
	
	public abstract boolean judge(Card card);
	
	public void specifyAnswerCard(Deck deck) {
		this.deck = deck;
		this.answer = deck.draw();
	}
	
	protected Card getAnswer() {
		return answer;
	}
	
	//テスト用メソッド
	public void setAnswerCard(Card card) {
		this.answer = card;
	}
}
