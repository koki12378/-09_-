package CardGuessingGame2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardGuessingGame {
	private Referee ref;
	private Deck deck;
	private Player firstPlayer;
	private Player secondPlayer;
	private Player currentPlayer;
	private PlayMode playMode;
	List<CardSelection> inputHistry = new ArrayList<CardSelection>();
	private FileOutPut fileOutPut;
	
	public CardGuessingGame(Deck deck) {
		this.deck = deck;
	}

	public void selectReferee(Deck deck) {
		Scanner sc = new Scanner(System.in);
		int value = 0;
		System.out.println("審判を選んで下さい \n---\n* 入力例 : 1:厳しい審判, 2:やさしい審判 ");
		try {
			String str = sc.nextLine();
			value = Integer.parseInt(str);
			if (value == 1) {
				ref = new SevereReferee();
				ref.specifyAnswerCard(deck);
			} else if (value == 2) {
				ref = new FriendlyReferee();
				ref.specifyAnswerCard(deck);
			} else {
				System.out.println("値が正しくありません");
				selectReferee(deck);
			}
		} catch (Exception e) {
			System.out.println("値が正しくありません");
			selectReferee(deck);
		}
	}

	public void start() {
		boolean flag;
		Card card = null;
		fileOutPut = new FileOutPut();
		
		ref.specifyAnswerCard(deck);
		if(playMode == PlayMode.MULTIPLAY) {
			System.out.println("～" + currentPlayer.getName() + "ターン～");
		}
		
		while (true) {
			
			card = currentPlayer.input();
			CardSelection selection = new CardSelection(currentPlayer,card);
			inputHistry.add(selection);
			flag = ref.judge(card);

			if (flag) {
				System.out.println("ゲーム終了");
				break;
			}else {
				changePlayer();
			}
		}
		showWinner();
		fileOutPut.outPut(inputHistry);
	}
	
	public PlayMode selectPlayMode() {
		boolean flag = true;
		while(flag) {
			System.out.println("1：1人でプレイ　2：2人でプレイ");
			Scanner sc = new Scanner(System.in);
			int value = 0;
			try{
				String str = sc.nextLine();
				value = Integer.parseInt(str);
				if(value == 1) {
					playMode = PlayMode.SINGLEPLAY;
					firstPlayer = new Player("先攻");
					currentPlayer = new Player("現在のプレイヤ");
					currentPlayer = firstPlayer;
					break;
				}else if(value == 2) {
					playMode = PlayMode.MULTIPLAY;
					firstPlayer = new Player("先攻");
					secondPlayer = new Player("後攻");
					currentPlayer = new Player("現在のプレイヤ");
					currentPlayer = firstPlayer;
					break;
				}else {
					System.out.println("1から2の数字を入力");
					continue;
				}
			}catch(Exception e) {
				System.out.println("1から2の数字を入力");
				continue;
			}
		}
		flag = false;
		return playMode;
	}
	
	private void changePlayer() {
		if(playMode == PlayMode.MULTIPLAY) {
			if(currentPlayer.getName() == firstPlayer.getName()) {
				currentPlayer = secondPlayer;
				System.out.println("～" + currentPlayer.getName() + "ターン～");
			}else {
				currentPlayer = firstPlayer;
				System.out.println("～" + currentPlayer.getName() + "ターン～");
			}
		}
	}
	
	private void showWinner() {
		if(playMode == PlayMode.MULTIPLAY) {
			System.out.println("勝者:" + currentPlayer.getName());
		}
	}
}
