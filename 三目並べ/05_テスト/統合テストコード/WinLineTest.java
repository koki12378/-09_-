package miniProject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class WinLineTest {
	@Test
	public void テスト1_1() {
		/* 入力 */
		Mark mark1 = new Mark(1, 1);
		Mark mark2 = new Mark(1, 2);
		Mark mark3 = new Mark(1, 3);
		mark1.setStatus(Status.CROSS);
		mark2.setStatus(Status.CROSS);
		mark3.setStatus(Status.CROSS);
		WinLine winline = new WinLine(mark1, mark2, mark3);
		/* 出力 */
		boolean expected_fee = true;
		/* テストの実行 */
		boolean fee = winline.checkLine();
		assertThat(fee, is(expected_fee));
	}

	@Test
	public void テスト2_1() {
		/* 入力 */
		Mark mark1 = new Mark(1, 1);
		Mark mark2 = new Mark(1, 2);
		Mark mark3 = new Mark(1, 3);
		mark1.setStatus(Status.CROSS);
		mark2.setStatus(Status.CROSS);
		mark3.setStatus(Status.CIRCLE);
		WinLine winline = new WinLine(mark1, mark2, mark3);
		/* 出力 */
		boolean expected_fee = false;
		/* テストの実行 */
		boolean fee = winline.checkLine();
		assertThat(fee, is(expected_fee));
	}

	@Test
	public void テスト3_1() {
		/* 入力 */
		Mark mark1 = new Mark(1, 1);
		Mark mark2 = new Mark(1, 2);
		Mark mark3 = new Mark(1, 3);
		mark1.setStatus(Status.CROSS);
		mark2.setStatus(Status.CIRCLE);
		mark3.setStatus(Status.CIRCLE);
		WinLine winline = new WinLine(mark1, mark2, mark3);
		/* 出力 */
		boolean expected_fee = false;
		/* テストの実行 */
		boolean fee = winline.checkLine();
		assertThat(fee, is(expected_fee));
	}

	@Test
	public void テスト4_1() {
		/* 入力 */
		Mark mark1 = new Mark(1, 1);
		Mark mark2 = new Mark(1, 2);
		Mark mark3 = new Mark(1, 3);
		mark1.setStatus(null);
		mark2.setStatus(null);
		mark3.setStatus(null);
		WinLine winline = new WinLine(mark1, mark2, mark3);
		/* 出力 */
		boolean expected_fee = false;
		/* テストの実行 */
		boolean fee = winline.checkLine();
		assertThat(fee, is(expected_fee));
	}

	@Test
	public void テスト5_1() {
		/* 入力 */
		Mark mark1 = new Mark(1, 1);
		Mark mark2 = new Mark(1, 2);
		Mark mark3 = new Mark(1, 3);
		mark1.setStatus(Status.CIRCLE);
		mark2.setStatus(Status.CIRCLE);
		mark3.setStatus(Status.CIRCLE);
		WinLine winline = new WinLine(mark1, mark2, mark3);
		/* 出力 */
		boolean expected_fee = true;
		/* テストの実行 */
		boolean fee = winline.checkLine();
		assertThat(fee, is(expected_fee));
	}

}
