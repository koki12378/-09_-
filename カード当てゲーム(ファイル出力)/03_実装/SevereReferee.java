package CardGuessingGame2;

public class SevereReferee extends Referee {

	public boolean judge(Card card) {
		Card answer = getAnswer();

		boolean matchAnswer;

		System.out.print("数：");
		if (card.getNumber() == answer.getNumber()) {
			System.out.println("一致");
			matchAnswer = true;
		} else {
			System.out.println("不一致");
			matchAnswer = false;
		}

		System.out.print("スート：");
		if (card.getSuit() == answer.getSuit()) {
			System.out.println("一致");

		} else {
			System.out.println("不一致");
			matchAnswer = false;
		}
		System.out.println();
		return matchAnswer;
	}
}
