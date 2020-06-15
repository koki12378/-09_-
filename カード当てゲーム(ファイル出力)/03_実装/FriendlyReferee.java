package CardGuessingGame2;


public class FriendlyReferee extends Referee {


	public boolean judge(Card card) {
		Card answer = getAnswer();
		int x = card.getNumber();
		int y = answer.getNumber();
		Suit s1 = card.getSuit();
		Suit s2 = answer.getSuit();
		
		boolean judge = true;

		System.out.print("数：");
		if (x == y) {
			System.out.print("一致");
		
		} else if (x < y) {
			System.out.print("もっと大きい");
			judge = false;
		} else {
			System.out.print("もっと小さい");
			judge = false;
		}
		
	System.out.println();

	System.out.print("スート：");
	if(s1 == s2){
		System.out.println("一致");
	} else {
		if(judgeColor(s1, s2) ){
			System.out.println("惜しい");
		}else{
			System.out.println("不一致");
		}
		judge = false;
	}
	return judge;
}
	
	private boolean judgeColor(Suit s1, Suit s2){
		boolean isSame = false;
		switch(s1){
		case SPADE:
		case CLOVER:
			if((s2 == Suit.SPADE) || (s2 == Suit.CLOVER)){
				isSame = true;
			}
			break;
		case HEART:
		case DIA:
			if((s2 == Suit.HEART) || (s2 == Suit.DIA)){
				isSame = true;
			}
			break;
		default:
			throw new IllegalStateException();
		}
		return isSame;
	}

	
}

