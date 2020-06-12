package CardGuessingGame2;

import java.util.Scanner;

public class Player {
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public Card input() {
		boolean flag = true;
		Card card = null;
		while (flag == true) {
			Scanner sc = new Scanner(System.in);
			String[] value = new String[2];
			int x = 0;
			int y = 0;
			Suit suit = null;

			System.out.println(
					"数とスートを入力してください \n--- \n* 入力例 : 数 [半角スペース] スート \n 【スートの入力 】 0:スペード, 1:クラブ, 2:ダイヤ, 3:ハート \n---");
			try {
				String str = sc.nextLine();
				value = str.split(" ", 0);
				x = Integer.parseInt(value[0]);
				y = Integer.parseInt(value[1]);
				if (x < Card.MIN || Card.MAX < x) {
					System.out.println("数を1～13の範囲で入力してください");
					continue;
				}
				switch (y) {
				case 0:
					suit = Suit.SPADE;
					break;
				case 1:
					suit = Suit.CLOVER;
					break;
				case 2:
					suit = Suit.DIA;
					break;
				case 3:
					suit = Suit.HEART;
					break;
				default:
					System.out.println("スートを0～3の範囲で入力してください");
					continue;
				}
				card = new Card(x, suit);
			} catch (Exception e) {
				System.out.println("値が正しくありません");
				continue;
			}

			flag = false;
		}
		return card;		
	}
	
	public String getName() {
		return name;
	}
}
