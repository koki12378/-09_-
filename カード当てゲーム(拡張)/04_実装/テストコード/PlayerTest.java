package CardGuessingGame2;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class PlayerTest {

	@Test
	public void playerTest1() {
		Player player = new Player("先攻");
		Card card1 = new Card(1, Suit.SPADE);
		Card card2 = player.input();
		
		assertThat(card2.getNumber(), is(card1.getNumber()));
		assertThat(card2.getSuit(), is(card1.getSuit()));
		
	}
	@Test
	public void playerTest2() {
		Player player = new Player("後攻");
		Card card1 = new Card(5, Suit.DIA);
		Card card2 = player.input();
		
		assertThat(card2.getNumber(), is(card1.getNumber()));
		assertThat(card2.getSuit(), is(card1.getSuit()));
	}

}
