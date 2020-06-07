package miniProject;

public class Board {
	private int x;
	private int y;
	
	private Mark[] markList;
	private WinLine[] winLines;
	
	public Board(int size) {
		x = size;
		y = size;
		markList = new Mark[9];
		winLines = new WinLine[8];
		
		//セルを作成しリストに追加する
		markList[0] = new Mark(1,1);
		markList[1] = new Mark(1,2);
		markList[2] = new Mark(1,3);
		markList[3] = new Mark(2,1);
		markList[4] = new Mark(2,2);
		markList[5] = new Mark(2,3);
		markList[6] = new Mark(3,1);
		markList[7] = new Mark(3,2);
		markList[8] = new Mark(3,3);

		//winLineにマークを割り当てる
		winLines[0] = new WinLine(markList[0],markList[1],markList[2]);
		winLines[1] = new WinLine(markList[3],markList[4],markList[5]);
		winLines[2] = new WinLine(markList[6],markList[7],markList[8]);
		winLines[3] = new WinLine(markList[0],markList[3],markList[6]);
		winLines[4] = new WinLine(markList[1],markList[4],markList[7]);
		winLines[5] = new WinLine(markList[2],markList[5],markList[8]);
		winLines[6] = new WinLine(markList[0],markList[4],markList[8]);
		winLines[7] = new WinLine(markList[6],markList[4],markList[2]);
	}
	
	public boolean checkRange(Turn turn) {
		if(0 < turn.getX() && turn.getX() <= x) {
			if(0 < turn.getY() && turn.getY() <= y) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean checkFill(Turn turn) {
		int x = turn.getX();
		int y = turn.getY();
		
		for(Mark mark:markList) {
			if(mark.getStatus() != null && mark.getCoordinateX() == x) {
				if(mark.getStatus() != null && mark.getCoordinateY() == y) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean checkSettle() {
		for(WinLine winLine:winLines) {
			if(winLine.checkLine() == true) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean checkDraw() {
		for(Mark mark:markList) {
			if(mark.getStatus() == null) {
				return false;
			}
		}
		return true;
	}
	
//	public void addMark(Turn turn) {
//		//list = board.getMarkList();
//		int x = turn.getValueX();
//		int y = turn.getValueY();
//		
//		for(Mark mark:markList) {
//			if(mark.getValueX() == x && mark.getValueY() == y) {
//				if(turn.getPlayer().getStatus() == Status.CIRCLE) {
//					mark.setStatus("○");
//					break;
//				}else {
//					mark.setStatus("×");
//					break;
//				}
//			}
//		}
//	}
	
	public Mark[] getMarkList() {
		return markList;
	}
	
	public void showBoard() {
		String[] newMarkList = new String[9];
		for(int i = 0;i < markList.length; i++) {
			if(markList[i].getStatus() == Status.CIRCLE) {
				newMarkList[i] = "○";
			}else if(markList[i].getStatus() == Status.CROSS) {
				newMarkList[i] = "×";
			}else {
				newMarkList[i] = " ";
			}
		}
		
		for(int i = 0; i < 7 ; i++) {
			if(i == 0 || i % 2 == 0) {
				System.out.println("-------------");
			}else if(i == 1){
				System.out.println("| " + newMarkList[0] + " | " + newMarkList[3] + " | " + newMarkList[6] + " |");
			}else if(i == 3) {
				System.out.println("| " + newMarkList[1] + " | " + newMarkList[4] + " | " + newMarkList[7] + " |");
			}else if(i == 5) {
				System.out.println("| " + newMarkList[2] + " | " + newMarkList[5] + " | " + newMarkList[8] + " |");
			}
		}
	}
}
