package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.GradeManager;

public class WindowFrame extends JFrame{
	
	GradeManager grademanager;
	
	MenuSelection menuselection;
	GradeAdder gradeadder;
	GradeViewer gradeviewer;
	
	
	public WindowFrame(GradeManager grademanager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.grademanager = grademanager;
		menuselection = new MenuSelection(this);
		gradeadder = new GradeAdder(this, this.grademanager);
		gradeviewer = new GradeViewer(this, this.grademanager);
		
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public GradeAdder getGradeadder() {
		return gradeadder;
	}

	public void setGradeadder(GradeAdder gradeadder) {
		this.gradeadder = gradeadder;
	}

	public GradeViewer getGradeviewer() {
		return gradeviewer;
	}

	public void setGradeviewer(GradeViewer gradeviewer) {
		this.gradeviewer = gradeviewer;
	}
}
