package api.basic;

import javax.swing.JFrame;

public class FrameTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("테스트");
		f.setSize(400,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
