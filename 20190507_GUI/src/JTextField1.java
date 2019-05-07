import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextField1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(300, 500);
		frame.setPreferredSize(new Dimension(100,200));
		
		JPanel panel= new JPanel();
		JLabel label = new JLabel("ID : ");
		
		JTextField tf= new JTextField("아이디를 입력하시오");
		//클릭하면 안내문구 지움
		//tf.setText("");
		
		panel.add(label);
		panel.add(tf);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
