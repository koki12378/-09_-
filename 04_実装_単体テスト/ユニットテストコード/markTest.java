package miniProject;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class markTest {

	@Test
	public void markTest_1() {//Xの値確認
		Mark mark = new Mark(1,1);

		int actual = mark.getCoordinateX();
		int expected = 1;
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void markTest_2() {//Yの値確認
		Mark mark = new Mark(1,1);

		int actual = mark.getCoordinateY();
		int expected = 1;
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void markTest_3() {//CIRCLEの場合
		// 実行
		Mark mark = new Mark(1,1);
		mark.setStatus(Status.CIRCLE);
		
		// 検証
		assertThat(mark.getStatus(), is(Status.CIRCLE));
		// （必要であれば）後処理
	}
	
	@Test
	public void markTest_4() {//CROSSの場合
		// 実行
		Mark mark = new Mark(1,1);
		mark.setStatus(Status.CROSS);
		
		// 検証
		assertThat(mark.getStatus(), is(Status.CROSS));
		// （必要であれば）後処理
	}
	
}
