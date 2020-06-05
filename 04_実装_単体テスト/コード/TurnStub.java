package miniProject;

public class TurnStub {
	
	private Player player;
	private int x;
	private int y;
	
	public TurnStub(Player player) {
		this.player = player;
	}
	
	public void showTurn() {
		String status = "";
		if(player.getStatus() == Status.CIRCLE) {
			status = "〇";
		} else {
			status = "×";
		}
		System.out.println(player.getName() + ":(" + x + "," + y + ")" + status);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public void edit(int x,int y) {
		this.x = x;
		this.y = y;
	}
	

}
