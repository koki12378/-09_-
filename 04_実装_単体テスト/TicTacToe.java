package miniProject;

import java.util.ArrayList;

public class TicTacToe {
	private boolean playerFlag;
	
	private Player firstPlayer;
	private Player secondPlayer;
	private Board board;
	private ArrayList<Turn> turns;
	
	public TicTacToe(Player firstPlayer,Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
		//3*3のマスの場合の盤
		board = new Board(3);
		turns = new ArrayList<Turn>();
	}
	
	public void start() {
		Turn turn;
		Player player;
		playerFlag = true;//初期値（先攻がtrue後攻がfalse）
		
		while(true) {
			if(playerFlag == true) {
				player = this.firstPlayer;
			}else {
				player = this.secondPlayer;
			}
			
			turn = new Turn(player);
			setSign(player,turn);
			//勝利判定
			if(judge() == true) {
				break;
			}else {
				changePlayer();
			}
			
		}
		System.out.println();
		showHistory();
	}
	
	public void setSign(Player player,Turn turn) {
		player.setCoordinate(turn);
		if(board.checkRange(turn) == false) {
			System.out.println("1から3の数字を入力");
			setSign(player,turn);
		}else if(board.checkFill(turn) == true) {
			System.out.println("既に置かれています");
			setSign(player,turn);
		}else {
			turns.add(turn);
			//ボードが持っているセルにマークを記入させる
			turn.addMark(board);
			//board.addMark(turn);
			//盤を表示
			board.showBoard();
		}
	}
	
	//ターン履歴表示
	public void showHistory() {
		System.out.println("<ターン履歴>");
		for(Turn turn:turns) {
			turn.showTurn();
		}
	}
	
	public void changePlayer() {
		if(playerFlag == true) {
			playerFlag = false;
		}else {
			playerFlag = true;
		}
	}
	
	public boolean judge() {
		boolean flag  = false;
		if(board.checkSettle() == true) {
			flag = true;
			if(playerFlag == true) {
				System.out.println("勝者:先攻");
			}else {
				System.out.println("勝者:後攻");
			}
		}else {
			if(board.checkDraw() == true) {
				flag = true;
				System.out.println("引き分け");
			}
		}
		return flag;
	}
}
