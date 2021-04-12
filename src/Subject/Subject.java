package Subject;

import java.util.Scanner;

public class Subject {
	SubjectKind kind = SubjectKind.Major;
	String name;
	float score;
	
	public Subject(){		
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

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	public Subject(String name, float score) {
		this.name = name;
		this.score = score;
	}
	
	public void printInfo() {
		System.out.println("Subject: "+ name + " Score: " + score);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Subject name: ");
		String name = input.next();
		this.setName(name);
		System.out.print("Subject score(ex. A+:4.5 , A0:4.0): ");
		float score = input.nextFloat();
		this.setScore(score);
	}
}