package Subject;

import java.util.Scanner;

import exception.CreditFormatException;

public class OptionalMajorSubject extends MajorSubject {
	
	public OptionalMajorSubject (SubjectKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Optional Major Subject name: ");
		String name = input.next();
		this.setName(name);
		setSubjectScorewithYN(input);
	}

	@Override
	public void setCredit(float credit) throws CreditFormatException {
		// TODO Auto-generated method stub
		
	}
}
