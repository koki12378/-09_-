package CardGuessingGame2;

public class Card {
	
			private int number;
		
			private Suit suit;
		
			public static int MAX = 13;
		
			public static int MIN = 1;
			
			public Card(int number,Suit suit) {
				if((MIN <= number) && (number <= MAX)) {//数字が1～13以内の時
					this.number = number;
					}else {
						throw new IllegalArgumentException();
					}
				this.suit = suit;
				}
		
			public int getNumber() {
				return number;
			}	
		
			public Suit getSuit() {
				return suit;
			}
	}

