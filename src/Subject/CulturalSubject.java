package Subject;

import java.util.Scanner;

public class CulturalSubject extends Subject implements SubjectInput{
	
	public CulturalSubject (SubjectKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Subject name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Credit: ");
		float credit = input.nextFloat();
		this.setCredit(credit);
		
		System.out.print("Subject score(ex. A+:4.5 , A0:4.0): ");
		float score = input.nextFloat();
		this.setScore(score);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case RequiredMajor:
			skind = "RequiredMajor";
			break;
		case OptionalMajor:
			skind = "OptionalMajor";
			break;
		case Cultural:
			skind = "Cultural";
			break;
		default:
		}
		System.out.println("Kind:" + skind + " Subject:"+ name +" Credit:" + credit + " Score:" + score);
	}

}
