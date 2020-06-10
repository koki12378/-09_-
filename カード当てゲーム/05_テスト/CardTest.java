package CardGuessingGame;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import miniProject.Mark;

public class CardTest {

	@Test
	public void CardTest1() {//numberの値の確認
		Card card = new Card(1,Suit.HEART);

		int actual = card.getNumber();
		int expected = 1;
		
		assertThat(actual, is(expected));
	}
		
	@Test
	public void CardTest2() {//suitの値の確認
		Card card = new Card(1,Suit.HEART);

		Suit actual = card.getSuit();
		Suit expected = Suit.HEART;
			
		assertThat(actual, is(expected));
	}
}
