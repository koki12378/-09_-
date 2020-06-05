package miniProject;

public class Mark {

	private int x;
	private int y;
	private Status status;
	
	public Mark(int x,int y) {//コンストラクタ
		this.x = x;
		this.y = y;
	}
	
	public void setStatus(Status status) {//CIRCLE,CROSSを入れる
		this.status = status;
	}
	
	public Status getStatus() {
		return this.status;
	}
	
	public int getCoordinateX() {
		return this.x;
	}
	
	public int getCoordinateY() {
		return this.y;
	}
	
}
