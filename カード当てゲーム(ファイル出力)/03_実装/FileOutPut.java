package CardGuessingGame2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOutPut {
	
	public void outPut(List<CardSelection> inputHistry) {
		try(FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\ミニプロジェクト\\test.txt")){
			fw.write("<履歴>\n");
			for(CardSelection history:inputHistry) {
				fw.write("<" + history.getName() + "> 数：" + history.getCard().getNumber() + " ");
				switch(history.getCard().getSuit()) {
				case SPADE:
					fw.write("スート：♠\n");
					break;
				case CLOVER:
					fw.write("スート：♣\n");
					break;
				case DIA:
					fw.write("スート：♦\n");
					break;
				case HEART:
					fw.write("スート：♥\n");
					break;
				}
				
				
			}
		}catch(IOException e) {
			System.out.println("エラー：ファイルに書き込めませんでした。");
	
		}
	
	}

}
