import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest {
	public static void main(String[] args) {
		JFrame Frame = new JFrame();
		JLabel label = new JLabel("���̺�");
		Frame.add(label);
		Frame.pack();
		Frame.setVisible(true);
	}
}
