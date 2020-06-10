package CardGuessingGame;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class Referee_Card_Deck_Test {
	
	@Ignore
	public void specifyAnswerCardの確認() {
		
	}
	
	@Test
	public void 厳しい審判で数とスートが一致している場合(){
		Card answerCard = new Card(1,Suit.HEART);
		SevereReferee severeReferee = new SevereReferee();
		severeReferee.setAnswerCard(answerCard);
		Card selectedCard = new Card(1,Suit.HEART);
		
		boolean actualResult;
		actualResult = severeReferee.judge(selectedCard);
		
		//引数がtrueかどうか判別します。falseの場合はFailure（失敗）になります。
		assertTrue(actualResult);
	}
	
	@Test
	public void 厳しい審判で数とスートが不一致の場合(){
		Card answerCard = new Card(1,Suit.HEART);
		SevereReferee severeReferee = new SevereReferee();
		severeReferee.setAnswerCard(answerCard);
		Card selectedCard = new Card(2,Suit.DIA);
		
		boolean actualResult;
		actualResult = severeReferee.judge(selectedCard);
		
		//引数がfalseかどうか判別します。trueの場合はFailure（失敗）になります。
		assertFalse(actualResult);
	}
	
	@Test
	public void 厳しい審判で数のみ一致の場合(){
		Card answerCard = new Card(1,Suit.HEART);
		SevereReferee severeReferee = new SevereReferee();
		severeReferee.setAnswerCard(answerCard);
		Card selectedCard = new Card(1,Suit.DIA);
		
		boolean actualResult;
		actualResult = severeReferee.judge(selectedCard);
		
		//引数がfalseかどうか判別します。trueの場合はFailure（失敗）になります。
		assertFalse(actualResult);
	}
	
	
	@Test
	public void 厳しい審判でスートのみ一致の場合(){
		Card answerCard = new Card(1,Suit.HEART);
		SevereReferee severeReferee = new SevereReferee();
		severeReferee.setAnswerCard(answerCard);
		Card selectedCard = new Card(2,Suit.HEART);
		
		boolean actualResult;
		actualResult = severeReferee.judge(selectedCard);
		
		//引数がfalseかどうか判別します。trueの場合はFailure（失敗）になります。
		assertFalse(actualResult);
	}
	
	@Test
	public void 優しい審判で数とスートが一致している場合(){
		Card answerCard = new Card(1,Suit.HEART);
		FriendlyReferee friendlyReferee = new FriendlyReferee();
		friendlyReferee.setAnswerCard(answerCard);
		Card selectedCard = new Card(1,Suit.HEART);
		
		boolean actualResult;
		actualResult = friendlyReferee.judge(selectedCard);
		
		//引数がtrueかどうか判別します。falseの場合はFailure（失敗）になります。
		assertTrue(actualResult);
	}
	
	@Test
	public void 優しい審判で数とスートが不一致の場合(){
		Card answerCard = new Card(1,Suit.HEART);
		FriendlyReferee friendlyReferee = new FriendlyReferee();
		friendlyReferee.setAnswerCard(answerCard);
		Card selectedCard = new Card(2,Suit.DIA);
		
		boolean actualResult;
		actualResult = friendlyReferee.judge(selectedCard);
		
		//引数がfalseかどうか判別します。trueの場合はFailure（失敗）になります。
		assertFalse(actualResult);
	}
	
	@Test
	public void 優しい審判で数のみ一致の場合(){
		Card answerCard = new Card(1,Suit.HEART);
		FriendlyReferee friendlyReferee = new FriendlyReferee();
		friendlyReferee.setAnswerCard(answerCard);
		Card selectedCard = new Card(1,Suit.SPADE);
		
		boolean actualResult;
		actualResult = friendlyReferee.judge(selectedCard);
		
		//引数がfalseかどうか判別します。trueの場合はFailure（失敗）になります。
		assertFalse(actualResult);
	}
	
	@Test
	public void 優しい審判でスートのみ一致の場合(){
		Card answerCard = new Card(2,Suit.HEART);
		FriendlyReferee friendlyReferee = new FriendlyReferee();
		friendlyReferee.setAnswerCard(answerCard);
		Card selectedCard = new Card(1,Suit.HEART);
		
		boolean actualResult;
		actualResult = friendlyReferee.judge(selectedCard);
		
		//引数がfalseかどうか判別します。trueの場合はFailure（失敗）になります。
		assertFalse(actualResult);
	}
}
	
