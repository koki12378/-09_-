package CardGuessingGame;

import java.util.Collections;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;


public class Deck {
	private static final int TOTAL = 52;
	private List<Card> cards;
	
	public Deck() {
		cards = new LinkedList<Card>();
		Suit[] suits = {Suit.SPADE, Suit.DIA, Suit.HEART, Suit.CLOVER};
		for(int i = 0 ; i < TOTAL; i++) {
			// カードの生成と山への登録
			int number = 1 + (i % Card.MAX);
			Suit suit = suits[(i / Card.MAX)];
			cards.add(new Card(number, suit));
		}
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		if(cards.size() != 0){
			return cards.remove(0);
		}else{
			throw new EmptyStackException();
		}
	}

}
