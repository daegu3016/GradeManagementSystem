package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Subject.SubjectInput;
import manager.GradeManager;

public class GradeViewer extends JPanel{

	WindowFrame frame;
	
	GradeManager grademanager;
	
	public GradeViewer(WindowFrame frame, GradeManager grademanager) {
		this.frame = frame;
		this.grademanager = grademanager;
		
		System.out.println("***" + grademanager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject Name");
		model.addColumn("Credit");
		model.addColumn("Score");
		
		for(int i=0; i< grademanager.size();i++) {
			Vector row = new Vector();
			SubjectInput si= grademanager.get(i);
			row.add(si.getName());
			row.add(si.getCredit());
			row.add(si.getScore());
			model.addRow(row);
		}
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
