import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GradeManager grademanager = new GradeManager(input);
		
		
		int num = 0;
		
		
		while(num != 5) {
			System.out.println("=====Grade Management System Menu=====");
			System.out.println("1. Add Grades");
			System.out.println("2. Delete Grades");
			System.out.println("3. Edit Grades");
			System.out.println("4. View Grades");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1-6 : ");
			num = input.nextInt();
			
			if (num == 1) {
				grademanager.addSubject();
			}
			else if (num == 2) {
				grademanager.deleteGrades();
			}
			else if (num == 3) {
				grademanager.editGrades();
			}
			else if (num == 4) {
				grademanager.viewGrades();
			}
			else {
				continue;
			}
		}
	}
}
