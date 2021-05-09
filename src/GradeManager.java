import java.util.ArrayList;
import java.util.Scanner;

import Subject.CulturalSubject;
import Subject.OptionalMajorSubject;
import Subject.RequiredMajorSubject;
import Subject.Subject;
import Subject.SubjectInput;
import Subject.SubjectKind;


public class GradeManager {
	ArrayList<SubjectInput> subjects = new ArrayList<SubjectInput>();
	Scanner input;
	
	GradeManager(Scanner input){
		this.input = input;
	}
	
	public void addSubject() {
		int kind = 0;
		SubjectInput subjectInput;
		while(kind != 1 && kind !=2) {
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
	}
	
	public void deleteGrades() {
		System.out.print("Subject name: ");
		String sbjname = input.next();
		int index = -1;
		for(int i = 0; i<subjects.size(); i++) {
			SubjectInput subjectInput = subjects.get(i);
			if(subjectInput.getName().equals(sbjname)) {
				index = i;
				break;				
			}
		}
		if (index >= 0) {
			subjects.remove(index);
			System.out.println("The subject" + sbjname + "is deleted!!");
		}
		else{
			System.out.println("The subject has not been registered!!");
			return;
		}
		
	}
	public void editGrades() {
		System.out.print("Subject name: ");
		String sbjname = input.next();
		for(int i = 0; i<subjects.size(); i++) {
			SubjectInput subjectInput = subjects.get(i);
			if(subjectInput.getName().equals(sbjname)) {
				int num = -1;
				while(num != 3) {
					System.out.println("=====Subject Info Edit Menu=====");
					System.out.println("1. Edit Subject Name");
					System.out.println("2. Edit Subject Credit");
					System.out.println("3. Edit Subject Grade");
					System.out.println("4. Exit");
					System.out.print("Select one number between 1-3 : ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Subject name: ");
						String name = input.next();
						subjectInput.setName(name);
					}
					else if (num ==2) {
						System.out.print("Subject credit: ");
						float credit = input.nextFloat();
						subjectInput.setCredit(credit);
					}
					else if (num == 3) {
						System.out.print("Subject score: ");
						float score = input.nextFloat();
						subjectInput.setScore(score);
					}
					else {
						continue;
					}// if
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
}