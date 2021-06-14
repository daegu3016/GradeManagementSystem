package event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.GradeViewer;
import gui.WindowFrame;
import manager.GradeManager;

public class ButtonViewListener implements ActionListener {
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		GradeViewer gradeViewer = frame.getGradeviewer();
		GradeManager grademanager = getObject("grademanager.ser");
		gradeViewer.setGrademanager(grademanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(gradeViewer);
		frame.revalidate();
		frame.repaint();
	}

	public static GradeManager getObject(String filename) {
		GradeManager grademanager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			grademanager = (GradeManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return grademanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return grademanager;
	}
	
}
