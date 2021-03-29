import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {
			System.out.println("=====Grade Management System Menu=====");
			System.out.println("1. Add Grades");
			System.out.println("2. Delete Grades");
			System.out.println("3. Edit Grades");
			System.out.println("4. View Grades");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1-6 : ");
			num = input.nextInt();
			
			if (num == 1) {
				addSubject();
			}
			else if (num == 2) {
				deleteGrades();
			}
			else if (num == 3) {
				editGrades();
			}
			else if (num == 4) {
				viewGrades();
			}
			else {
				continue;
			}
		}
	}
	public static void addSubject() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject name: ");
		String sbjname = input.nextLine();
		System.out.print("Subject score(ex. A): ");
		String sbjscore = input.next();
	}
	public static void deleteGrades() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject name: ");
		String sbjname = input.next();
	}
	public static void editGrades() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject name: ");
		String sbjname = input.next();
	}
	public static void viewGrades() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject name: ");
		String sbjname = input.next();
	}
}
