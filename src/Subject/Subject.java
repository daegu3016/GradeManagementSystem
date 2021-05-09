package Subject;

import java.util.Scanner;

public abstract class Subject {
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
	public abstract void printInfo();
}