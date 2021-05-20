package Subject;

import java.util.Scanner;

import exception.CreditFormatException;

public interface SubjectInput {
	
	public String getName();
	
	public void setName(String name);
	
	public void setCredit(float credit) throws CreditFormatException;
	
	public void setScore(float score);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setSubjectName(Scanner input);
	
	public void setSubjectCredit(Scanner input);
	
	public void setSubjectScore(Scanner input);
	
	public void setSubjectScorewithYN(Scanner input);
}
