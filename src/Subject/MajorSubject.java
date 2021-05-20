package Subject;

import java.util.Scanner;

import exception.CreditFormatException;

public abstract class MajorSubject extends Subject {

	public MajorSubject (SubjectKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind:" + skind + " Subject:"+ name +" Credit:" + credit + " Score:" + score);
	}
	
	public void setSubjectScorewithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y'&& answer != 'Y'&& answer != 'n'&& answer != 'N') {
			System.out.print("Is it a subject with score?(Y/N): ");
			answer = input.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					setSubjectCredit(input);
					setSubjectScore(input);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setCredit(1);
					this.setScore(0);
					break;
				}
			}catch(CreditFormatException e) {
				System.out.println("Incorrect Credit Format. put the credit without dot(.)!");
			}
		}
	}
}
