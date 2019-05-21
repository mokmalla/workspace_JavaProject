import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest4_ImageIcon {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		 JPanel panel = new JPanel();
		 frame.setPreferredSize(new Dimension(400, 600));
		 
		ImageIcon kirby = new ImageIcon("src/images/kirby.jpg");
		JLabel imageLabel = new JLabel(kirby);
		
		//ImageIcon, JButton
		ImageIcon Kiryu = new ImageIcon("src/images/키류짱 (3).png");
		
		
		//ImageIcon 크기 수정
		ImageIcon smallKiryu = new ImageIcon(Kiryu.getImage()
				.getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		JButton imageButton = new JButton(smallKiryu);
		
		panel.add(imageLabel);
		panel.add(imageButton);
		frame.add(panel); 
		 
		 
		 frame.pack();
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
