package Subject;

import java.util.Scanner;

import exception.CreditFormatException;

public abstract class Subject implements SubjectInput{
	protected SubjectKind kind = SubjectKind.RequiredMajor;
	protected String name;
	protected String credit;
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
	
	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) throws CreditFormatException {
		if (credit.contains(".")&&!credit.equals("")) {
			throw new CreditFormatException();
		}
		
		this.credit = credit;
	}
	
	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	public Subject(String name, String credit, float score) {
		this.name = name;
		this.credit = credit;
		this.score = score;
	}
	
	public Subject(SubjectKind kind, String name, String credit, float score) {
		this.kind = kind;
		this.name = name;
		this.credit = credit;
		this.score = score;
	}
	public abstract void printInfo();
	
	public void setSubjectName(Scanner input) {
		System.out.print("Subject name: ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setSubjectCredit(Scanner input)  {
		String credit =".";
		while(credit.contains(".")) {
			System.out.print("Subject credit: ");
			credit = input.next();
			try {
				this.setCredit(credit);
			}catch(CreditFormatException e) {
				System.out.println("Incorrect Credit Format. put the credit without dot(.)!");
			}
		}
	}
	
	public void setSubjectScore(Scanner input) {
		System.out.print("Subject score: ");
		float score = input.nextFloat();
		this.setScore(score);
	}
	
	public String getKindString() {
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
		return skind;
	}
}