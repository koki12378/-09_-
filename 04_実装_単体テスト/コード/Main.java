package miniProject;

public class Main {
	public static void main(String[] args) {
		Player first = new Player("先攻",Status.CIRCLE);
		Player second = new Player("後攻",Status.CROSS);
		TicTacToe ticTacToe = new TicTacToe(first,second);
		ticTacToe.start();
	}
}
