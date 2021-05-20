package Subject;

import java.util.Scanner;

import exception.CreditFormatException;

public class CulturalSubject extends Subject {
	
	public CulturalSubject (SubjectKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setSubjectName(input);
		setSubjectCredit(input);
		setSubjectScore(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind:" + skind + " Subject:"+ name +" Credit:" + credit + " Score:" + score);
	}

	@Override
	public void setCredit(float credit) throws CreditFormatException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSubjectScorewithYN(Scanner input) {
		// TODO Auto-generated method stub
		
	}

}
