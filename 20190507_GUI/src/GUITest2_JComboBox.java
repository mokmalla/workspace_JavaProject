import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest2_JComboBox {
		public static void main(String[] args) {
			JFrame frame = new JFrame("â�̸�");
			frame.setLocation(300, 500);
			frame.setPreferredSize(new Dimension(100,200));
			
			JLabel label = new JLabel("�¾ �� : ");
			JPanel panel= new JPanel();
			
			JComboBox<String> cb = new JComboBox<>();
			
			for(int i=1; i<=12; i++)
			cb.addItem(i+"");
			
			
			panel.add(label);
			panel.add(cb);
		
			
			frame.add(panel);
			frame.pack();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
	}
