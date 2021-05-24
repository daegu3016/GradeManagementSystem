import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		GradeManager grademanager = getObject("grademanager.ser");
		if(grademanager == null) {
			grademanager =new GradeManager(input);
		}
		
		selectMenu(input, grademanager);
		putObject(grademanager, "grademanager.ser");
	}
	
	public static void selectMenu(Scanner input, GradeManager grademanager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				
				switch(num) {
				case 1:
					grademanager.addSubject();
					logger.log("add a subject");
					break;
				case 2:
					grademanager.deleteGrades();
					logger.log("delte a subject");
					break;
				case 3:
					grademanager.editGrades();
					logger.log("add a subject");
					break;
				case 4:
					grademanager.viewGrades();
					logger.log("view subject");
					break;
				default :
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
			
		}
	}
	
	public static void showMenu() {
		System.out.println("=====Grade Management System Menu=====");
		System.out.println("1. Add Grades");
		System.out.println("2. Delete Grades");
		System.out.println("3. Edit Grades");
		System.out.println("4. View Grades");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-5 : ");
	}
	
	public static GradeManager getObject(String filename) {
		GradeManager grademanager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			grademanager = (GradeManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return grademanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return grademanager;
		
	}
	
	public static void putObject(GradeManager grademanager, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(grademanager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}