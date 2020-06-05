package miniProject;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class Player_and_Turn_Test {

	@Test
	public void Test1() {
		Player player = new Player("先攻", Status.CIRCLE);
		Turn turn1 = new Turn(player);
		
		player.setCoordinate(turn1);
		
		assertThat(turn1.getX(), is(1));
		assertThat(turn1.getY(), is(2));
		
	}
	@Test
	public void Test2() {
		Player player = new Player("先攻", Status.CIRCLE);
		Turn turn1 = new Turn(player);
		
		player.setCoordinate(turn1);
		
		assertThat(turn1.getX(), is(2));
		assertThat(turn1.getY(), is(3));
		
	}
	@Test
	public void Test3() {
		Player player = new Player("先攻", Status.CIRCLE);
		Turn turn1 = new Turn(player);
		
		player.setCoordinate(turn1);
		
		turn1.showTurn();
		
		
	}
	@Test
	public void Test4() {
		Player player = new Player("後攻", Status.CROSS);
		Turn turn1 = new Turn(player);
		
		player.setCoordinate(turn1);
		
		turn1.showTurn();
	}
	
}
