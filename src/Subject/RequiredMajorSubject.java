package Subject;

import java.util.Scanner;

import exception.CreditFormatException;

public class RequiredMajorSubject extends MajorSubject {
	
	public RequiredMajorSubject (SubjectKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Required Major Subject name: ");
		String name = input.next();
		this.setName(name);
		setSubjectScorewithYN(input);
	}

	@Override
	public void setCredit(float credit) throws CreditFormatException {
		// TODO Auto-generated method stub
		
	}
}
