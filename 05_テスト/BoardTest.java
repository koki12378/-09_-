package miniProject;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;


public class BoardTest {
	
	@Test
	public void BoradTest_1_1() {
		Board board = new Board(3);
		Player player = new Player("先攻",Status.CIRCLE);
		Turn turn = new Turn(player);
		turn.edit(1,1);
		boolean actual = board.checkRange(turn);
		boolean expected = true;
		
		assertThat(actual,is(expected));
	}
	
	@Test
	public void BoradTest_1_2() {
		Board board = new Board(3);
		Player player = new Player("先攻",Status.CIRCLE);
		Turn turn = new Turn(player);
		turn.edit(3,3);
		boolean actual = board.checkRange(turn);
		boolean expected = true;
		
		assertThat(actual,is(expected));
	}
	
	@Test
	public void BoradTest_1_3() {
		Board board = new Board(3);
		Player player = new Player("先攻",Status.CIRCLE);
		Turn turn = new Turn(player);
		turn.edit(0,4);
		boolean actual = board.checkRange(turn);
		boolean expected = false;
		
		assertThat(actual,is(expected));
	}
	
	@Test
	public void BoradTest_1_4() {
		Board board = new Board(3);
		Player player = new Player("先攻",Status.CIRCLE);
		Turn turn = new Turn(player);
		turn.edit(4,0);
		boolean actual = board.checkRange(turn);
		boolean expected = false;
		
		assertThat(actual,is(expected));
	}
	
	@Test
	public void BoradTest_2_1() {
		Board board = new Board(3);
		Player player1 = new Player("先攻",Status.CIRCLE);
		Turn turn1 = new Turn(player1);
		turn1.edit(1,1);
		turn1.addMark(board);
		Player player2 = new Player("後攻",Status.CROSS);
		Turn turn2 = new Turn(player2);
		turn2.edit(1,1);

		boolean actual = board.checkFill(turn2);;
		boolean expected = true;
		
		assertThat(actual,is(expected));
	}
	
	@Test
	public void BoradTest_2_2() {
		Board board = new Board(3);
		Player player1 = new Player("先攻",Status.CIRCLE);
		Turn turn = new Turn(player1);
		turn.edit(1,1);
		turn.addMark(board);

		boolean actual = board.checkFill(turn);;
		boolean expected = true;
		
		assertThat(actual,is(expected));
	}
	
	@Test
	public void BoradTest_3_1() {
		Board board = new Board(3);
		Player player1 = new Player("先攻",Status.CIRCLE);
		Player player2 = new Player("後攻",Status.CROSS);
		Turn turn1 = new Turn(player1);
		turn1.edit(1,1);
		turn1.addMark(board);
		Turn turn2 = new Turn(player2);
		turn2.edit(3,1);
		turn2.addMark(board);
		Turn turn3 = new Turn(player1);
		turn3.edit(2,1);
		turn3.addMark(board);
		Turn turn4 = new Turn(player2);
		turn4.edit(1,2);
		turn4.addMark(board);
		Turn turn5 = new Turn(player1);
		turn5.edit(3,2);
		turn5.addMark(board);
		Turn turn6 = new Turn(player2);
		turn6.edit(2,2);
		turn6.addMark(board);
		Turn turn7 = new Turn(player1);
		turn7.edit(1,3);
		turn7.addMark(board);
		Turn turn8 = new Turn(player2);
		turn8.edit(3,3);
		turn8.addMark(board);
		Turn turn9 = new Turn(player1);
		turn9.edit(2,3);
		turn9.addMark(board);

		boolean actual = board.checkDraw();
		boolean expected = true;
		
		assertThat(actual,is(expected));
	}
	
	@Test
	public void BoradTest_3_2() {
		Board board = new Board(3);
		Player player1 = new Player("先攻",Status.CIRCLE);
		Player player2 = new Player("後攻",Status.CROSS);
		Turn turn1 = new Turn(player1);
		turn1.edit(2,2);
		turn1.addMark(board);
		Turn turn2 = new Turn(player2);
		turn2.edit(1,1);
		turn2.addMark(board);
		Turn turn3 = new Turn(player1);
		turn3.edit(1,3);
		turn3.addMark(board);

		boolean actual = board.checkDraw();
		boolean expected = false;
		
		assertThat(actual,is(expected));
	}
	
	@Test
	public void BoradTest_4_1() {
		Board board = new Board(3);
		Player player = new Player("先攻",Status.CROSS);
		Turn turn1 = new Turn(player);
		turn1.edit(1,1);
		turn1.addMark(board);
		Turn turn2 = new Turn(player);
		turn2.edit(2,2);
		turn2.addMark(board);
		Turn turn3 = new Turn(player);
		turn3.edit(3,3);
		turn3.addMark(board);
		
		boolean actual = board.checkSettle();
		boolean expected = true;
		
		assertThat(actual,is(expected));
	}
	
	@Test
	public void BoradTest_4_2() {
		Board board = new Board(3);
		Player player1 = new Player("先攻",Status.CROSS);
		Player player2 = new Player("後攻",Status.CIRCLE);
		Turn turn1 = new Turn(player2);
		turn1.edit(1,1);
		turn1.addMark(board);
		Turn turn2 = new Turn(player1);
		turn2.edit(2,2);
		turn2.addMark(board);
		Turn turn3 = new Turn(player1);
		turn3.edit(3,3);
		turn3.addMark(board);
		
		boolean actual = board.checkSettle();
		boolean expected = false;
		
		assertThat(actual,is(expected));
	}
	
	@Test
	public void BoradTest_5_1() {
		Player player1 = new Player("先攻",Status.CIRCLE);
		Player player2 = new Player("後攻",Status.CROSS);
		Board board = new Board(3);
		Turn turn1 = new Turn(player2);
		turn1.edit(1,1);
		turn1.addMark(board);
		Turn turn2 = new Turn(player1);
		turn2.edit(1,2);
		turn2.addMark(board);
		
		board.showBoard();
	}
}
