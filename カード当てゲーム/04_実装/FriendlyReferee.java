package CardGuessingGame;

public class FriendlyReferee extends Referee {


	public boolean judge(Card card) {
		Card answer = getAnswer();
		boolean judge = true;

		System.out.print("数：");
		if (card.getNumber() == answer.getNumber()) {
			System.out.print("一致");
		
		} else if (card.getNumber() < answer.getNumber()) {
			System.out.print("もっと大きい");
			judge = false;
		} else {
			System.out.print("もっと小さい");
			judge = false;
		}
		
	System.out.println();


	System.out.print("スート：");
	if(card.getSuit()==answer.getSuit()){
		System.out.println("一致");
	}else if(card.getSuit() == Suit.SPADE && answer.getSuit() == Suit.CLOVER) {
				System.out.println("惜しい");
				judge = false;
	}else if(card.getSuit() == Suit.CLOVER && answer.getSuit() == Suit.SPADE){
		System.out.println("惜しい");
				judge = false;
	}else if(card.getSuit() == Suit.DIA && answer.getSuit() == Suit.HEART) {
		System.out.println("惜しい");
		judge = false;
	}else if(card.getSuit() == Suit.HEART && answer.getSuit() == Suit.DIA) {
		System.out.println("惜しい");
		judge = false;
	}else {
		System.out.println("不一致");
		judge = false;
	}

	
	return judge;
	
}

	
}

