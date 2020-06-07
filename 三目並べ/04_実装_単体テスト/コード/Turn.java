package miniProject;

public class Turn {

	private int x;
	private int y;
	private Player player;
	private Status mark;
	//private Mark[] list;
	
	public Turn(Player player) {
		this.player = player;
		this.mark = player.getStatus();
	}
	
	
	public void edit(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showTurn(){
		String mark;//= this.mark.getStatus();
		
		
		if(this.mark == Status.CIRCLE) {
			mark = "○";
		}else if(this.mark == Status.CROSS){
			mark = "×";
		}else {
			mark = "　";
		}
		
		System.out.println(player.getName() + ":(" + x + "," + y + ")" + mark);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	public Player getPlayer() {
		return player;
	}
	
	public void addMark(Board board) {
		Mark[] list = board.getMarkList();
		
		//int x = turn.getX();
		//int y = turn.getY();
		
		for(Mark mark:list) {
			if(mark.getCoordinateX() == x && mark.getCoordinateY() == y) {
				
					mark.setStatus(this.mark);
					break;
					
				}//if(mark.setMark().getStatus() == Status.CIRCLE) {//mark.setStatus("×");
		}
	}
}
