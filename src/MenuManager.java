import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GradeManager grademanager = new GradeManager(input);
		selectMenu(input, grademanager);
		
		
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
					break;
				case 2:
					grademanager.deleteGrades();
					break;
				case 3:
					grademanager.editGrades();
					break;
				case 4:
					grademanager.viewGrades();
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
	
}