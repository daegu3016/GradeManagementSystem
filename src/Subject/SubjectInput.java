package Subject;

import java.util.Scanner;

public interface SubjectInput {
	
	public String getName();
	public void setName(String name);
	public void setCredit(float credit);
	public void setScore(float score);
	public void printInfo();
	
	public void getUserInput(Scanner input);
}
