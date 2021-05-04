package Subject;

import java.util.Scanner;

public class Subject {
	protected SubjectKind kind = SubjectKind.RequiredMajor;
	protected String name;
	protected float credit;
	protected float score;
	
	public Subject(){		
	}
	
	public Subject(SubjectKind kind) {
		this.kind = kind;
	}

	public SubjectKind getKind() {
		return kind;
	}

	public void setKind(SubjectKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}
	
	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	public Subject(String name, float credit, float score) {
		this.name = name;
		this.credit = credit;
		this.score = score;
	}
	
	public Subject(SubjectKind kind, String name, float credit, float score) {
		this.kind = kind;
		this.name = name;
		this.credit = credit;
		this.score = score;
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
}