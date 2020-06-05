package miniProject;

public class WinLine {
	Mark[] winline = new Mark[3];
	// private Mark mark;

	public WinLine(Mark mark1, Mark mark2, Mark mark3) {
		winline[0] = mark1;
		winline[1] = mark2;
		winline[2] = mark3;
	}

	public boolean checkLine() {
		if (winline[0].getStatus() == Status.CIRCLE && winline[1].getStatus() == Status.CIRCLE && winline[2].getStatus() == Status.CIRCLE) {
			return true;
		} else if ((winline[0].getStatus() == Status.CROSS && winline[1].getStatus() == Status.CROSS && winline[2].getStatus() == Status.CROSS)){
			return true;
		}else {
			return false;
		}
	}

}
