import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest9_Event {
public static void main(String[] args) {
	JFrame frame = new JFrame("Event");
	JPanel panel = new JPanel();
	frame.setLocation(300, 500);
	frame.setPreferredSize(new Dimension(100,200));
	
	//JTextField, JButton, JLabel
	JTextField tfInput = new JTextField(10);
	JButton btRun = new JButton("X12");
	JLabel lbOutput = new JLabel();
	//버튼에 액션 리스너 추가하자
	//액션리스너 만들자
	ActionListener al = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			int input=Integer.parseInt(tfInput.getText());
			String gob=input*12+"";
			
			lbOutput.setText(gob);
		}
	};
	
	btRun.addActionListener(al);
	panel.add(tfInput);
	panel.add(btRun);
	panel.add(lbOutput);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
