import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

	public class GUITest3_JCheckBox {
			public static void main(String[] args) {
				JFrame frame = new JFrame("â�̸�");
				frame.setLocation(300, 500);
				frame.setPreferredSize(new Dimension(100,200));
				
				JPanel panel= new JPanel();
				
				JCheckBox cbChicken = new JCheckBox("ġŲ");
				JCheckBox cbPizza = new JCheckBox("����");
				
				
				panel.add(cbChicken);
				panel.add(cbPizza);
			
				
				frame.add(panel);
				frame.pack();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		}

