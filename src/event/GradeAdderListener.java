package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Subject.RequiredMajorSubject;
import Subject.SubjectInput;
import Subject.SubjectKind;
import exception.CreditFormatException;
import manager.GradeManager;

public class GradeAdderListener implements ActionListener {
	JTextField fieldSName;
	JTextField fieldCredit;
	JTextField fieldScore;
	
	GradeManager grademanager;

	public GradeAdderListener(
			JTextField fieldSName, 
			JTextField fieldCredit, 
			JTextField fieldScore, 	GradeManager grademanager) {
		this.fieldSName = fieldSName;
		this.fieldCredit = fieldCredit;
		this.fieldScore = fieldScore;
		this.grademanager = grademanager;

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		SubjectInput grade = new RequiredMajorSubject(SubjectKind.RequiredMajor);
		try {
			grade.setName(fieldSName.getText());
			grade.setCredit(Float.parseFloat(fieldCredit.getText()));
			grade.setScore(Float.parseFloat(fieldScore.getText()));
			grademanager.addSubject(grade);
			putObject(grademanager, "grademanager.ser");

			grade.printInfo();
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CreditFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void putObject(GradeManager grademanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(grademanager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
