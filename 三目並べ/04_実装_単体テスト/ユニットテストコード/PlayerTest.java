package miniProject;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class PlayerTest {
	@Test
	public void playerTest_1() {
		System.out.println("テストケース1(1,2を入力)");
		Player player = new Player("先攻",Status.CIRCLE);
		Turn turnStub = new Turn(player);
		
		player.setCoordinate(turnStub);
		//(1,2)を入力する
		int actual = turnStub.getX();
		int expected = 1;
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void playerTest_2() {
		System.out.println("テストケース2(2,3を入力)");
		Player player = new Player("先攻",Status.CIRCLE);
		Turn turnStub = new Turn(player);
		
		player.setCoordinate(turnStub);
		//(2,3)を入力する
		int actual = turnStub.getY();
		int expected = 3;
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void playerTest_3() {
		System.out.println("テストケース3(11を入力)");
		System.out.println("テストケース3(1,1を再入力)");
		Player player = new Player("先攻",Status.CIRCLE);
		Turn turnStub = new Turn(player);
		
		player.setCoordinate(turnStub);
		//(2,3)を入力する
		int actual = turnStub.getX();
		int expected = 1;
		
		assertThat(actual, is(expected));
	}

}
