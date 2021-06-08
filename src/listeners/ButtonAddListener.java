package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.GradeAdder;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		GradeAdder adder = frame.getGradeadder();
		frame.setupPanel(adder);

	}

}
