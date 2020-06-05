package miniProject;

import java.util.Scanner;

public class Player {
	
	private String name;
	private Status mark;
	
	public Player(String name,Status mark) {
		this.name = name;
		this.mark = mark;
	}
	
	public String getName() {
		return name;
	}
	
	public Status getStatus() {//Mark
		return mark;
	}
	
	public Turn setCoordinate(Turn turn) {
		Scanner sc = new Scanner(System.in);
		String[] value = new String[2];
		int x = 0;
		int y = 0;
			System.out.println("列と行を、半角スペースで区切って入力してください(例 ： 2列目の3行目 → 2 3)");
			try{
				String str = sc.nextLine();
				value = str.split(" ",0);
				x = Integer.parseInt(value[0]);
				y = Integer.parseInt(value[1]);
				turn.edit(x, y);
			}catch(Exception e) {
				System.out.println("1から3の数字を入力");
				setCoordinate(turn); //再入力
			}
			
		return turn;
	}
}
