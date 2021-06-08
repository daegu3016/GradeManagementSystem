package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Subject.CulturalSubject;
import Subject.OptionalMajorSubject;
import Subject.RequiredMajorSubject;
import Subject.Subject;
import Subject.SubjectInput;
import Subject.SubjectKind;


public class GradeManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5365734107720301291L;
	
	ArrayList<SubjectInput> subjects = new ArrayList<SubjectInput>();
	transient Scanner input;
	
	GradeManager(Scanner input){
		this.input = input;
	}
	
	public void addSubject() {
		int kind = -1;
		SubjectInput subjectInput;
		while(kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Required Major");
				System.out.println("2 for Optional Major");
				System.out.println("3 for Cultural");
				System.out.print("Select number for Subject kind: ");
				kind = input.nextInt();
				if(kind == 1) {
					subjectInput = new RequiredMajorSubject(SubjectKind.RequiredMajor);
					subjectInput.getUserInput(input);
					subjects.add(subjectInput);
					break;
				}
				else if (kind == 2) {
					subjectInput = new OptionalMajorSubject(SubjectKind.OptionalMajor);
					subjectInput.getUserInput(input);
					subjects.add(subjectInput);
					break;
				}
				else if (kind == 3) {
					subjectInput = new CulturalSubject(SubjectKind.Cultural);
					subjectInput.getUserInput(input);
					subjects.add(subjectInput);
					break;
				}
				else {
					System.err.println("Please select again!!");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void deleteGrades() {
		System.out.print("Subject name: ");
		String sbjname = input.next();
		int index = findIndex(sbjname);
		removefromSubjects(index, sbjname);
	}
	
	public int findIndex(String sbjname) {
		int index = -1;
		for(int i = 0; i<subjects.size(); i++) {
			SubjectInput subjectInput = subjects.get(i);
			if(subjectInput.getName().equals(sbjname)) {
				index = i;
				break;				
			}
		}
		return index;
	}
	
	public int removefromSubjects(int index, String sbjname) {
		if (index >= 0) {
			subjects.remove(index);
			System.out.println("The subject" + sbjname + "is deleted!!");
			return 1;
		}
		else{
			System.out.println("The subject has not been registered!!");
			return -1;
		}
	}
	
	public void editGrades() {
		System.out.print("Subject name: ");
		String sbjname = input.next();
		for(int i = 0; i<subjects.size(); i++) {
			SubjectInput subject = subjects.get(i);
			if(subject.getName().equals(sbjname)) {
				int num = -1;
				while(num != 3) {
					showEditMenu();
					num = input.nextInt();
					
					switch(num) {
					case 1:
						subject.setSubjectName(input);
						break;
					case 2:
						subject.setSubjectCredit(input);
						break;
					case 3:
						subject.setSubjectScore(input);
						break;
					default :
						continue;
					}
				}//while
				break;
			}//if
		}//for
	}
	
	public void viewGrades() {
		System.out.println("Number of registered subjects: " + subjects.size());
		for(int i = 0; i<subjects.size(); i++) {
			subjects.get(i).printInfo();
		}
	}
	
	public int size() {
		return subjects.size();
	}
	
	public SubjectInput get(int index) {
		return (Subject) subjects.get(index);
	}
	public void showEditMenu() {
		System.out.println("=====Subject Info Edit Menu=====");
		System.out.println("1. Edit Subject Name");
		System.out.println("2. Edit Subject Credit");
		System.out.println("3. Edit Subject Grade");
		System.out.println("4. Exit");
		System.out.print("Select one number between 1-3 : ");
	}
}