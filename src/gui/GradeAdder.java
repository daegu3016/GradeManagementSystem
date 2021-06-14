package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.GradeAdderCancelListener;
import event.GradeAdderListener;
import manager.GradeManager;

public class GradeAdder extends JPanel{
	
	WindowFrame frame;

	GradeManager grademanager;

	public GradeAdder(WindowFrame frame, GradeManager grademanager) {
		this.frame = frame;
		this.grademanager = grademanager;

		
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
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new GradeAdderListener(fieldSName, fieldCredit, fieldScore, grademanager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new GradeAdderCancelListener(frame));
		panel.add(labelScore);
		panel.add(fieldScore);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		SpringUtilities.makeCompactGrid(panel,  4,  2, 6, 6, 6, 6);
		
		
		
		this.add(panel);
		this.setVisible(true);  
	}
	
}
