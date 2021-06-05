package Gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GradeViewer extends JFrame{

	public GradeViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject Name");
		model.addColumn("Credit");
		model.addColumn("Score");

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}

}
