import java.util.Scanner;

public class GradeManager {
	Subject subject;
	Scanner input;
	
	GradeManager(Scanner input){
		this.input = input;
	}
	
	public void addSubject() {
		subject = new Subject();
		System.out.print("Subject name: ");
		subject.name = input.next();
		System.out.print("Subject score(ex. A+:4.5 , A0:4.0): ");
		subject.score = input.nextFloat();
	}
	public void deleteGrades() {
		System.out.print("Subject name: ");
		String sbjname = input.next();
		if(subject.name.equals(sbjname)) {
			subject = null;
			System.out.println("The subject is deleted!!");
		}
		else if(subject == null) {
			System.out.println("The subject has not been registered!!");
			return;
		}
		else
			System.out.println("The subject has not been registered!!");
			return;
	}
	public void editGrades() {
		System.out.print("Subject name: ");
		String sbjname = input.next();
		if(subject.name.equals(sbjname)) {
			System.out.println("The subject to be edited is '" + sbjname + "'");
		}
	}
	public void viewGrades() {
		System.out.print("Subject name: ");
		String sbjname = input.next();
		if(subject.name.equals(sbjname)) {
			System.out.println("The subject name is '" + subject.name+"'");
			System.out.println("The subject score is '" + subject.score +"'");
		}
		else
			System.out.println("The subject has not been registered!!");
	}
}