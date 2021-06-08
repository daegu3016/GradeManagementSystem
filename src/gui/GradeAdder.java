package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class GradeAdder extends JPanel{
	
	WindowFrame frame;
	
	public GradeAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSName = new JLabel("Subject Name: ",JLabel.TRAILING);
		JTextField fieldSName = new JTextField(10);
		labelSName.setLabelFor(fieldSName);
		panel.add(labelSName);
		panel.add(fieldSName);
		
		JLabel labelCredit = new JLabel("Credit: ",JLabel.TRAILING);
		JTextField fieldCredit = new JTextField(10);
		labelCredit.setLabelFor(fieldCredit);
		panel.add(labelCredit);
		panel.add(fieldCredit);
		
		JLabel labelScore = new JLabel("Score: ",JLabel.TRAILING);
		JTextField fieldScore = new JTextField(10);
		labelScore.setLabelFor(fieldScore);
		panel.add(labelScore);
		panel.add(fieldScore);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		SpringUtilities.makeCompactGrid(panel,  4,  2, 6, 6, 6, 6);
		
		
		
		this.add(panel);
		this.setVisible(true);
	}
	
}
