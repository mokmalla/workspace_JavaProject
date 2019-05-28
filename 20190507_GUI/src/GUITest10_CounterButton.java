import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUITest10_CounterButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Event");
		JPanel panel = new JPanel();
		frame.setLocation(300, 500);
		frame.setPreferredSize(new Dimension(300,100));
		
		JLabel lbNumber = new JLabel("0");
		lbNumber.setHorizontalAlignment(SwingConstants.CENTER);
		JButton btCount = new JButton("Click Counter");
		 
		GridLayout gl = new GridLayout(1,2);
		
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int count= Integer.parseInt(lbNumber.getText())+1;
				lbNumber.setText(count+"");
			}
			
		};
		
		btCount.addActionListener(al);
		panel.setLayout(gl);
		panel.add(lbNumber);
		panel.add(btCount);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
