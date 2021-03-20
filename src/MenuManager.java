import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		while(num != 6) {
			System.out.println("1. Add Grades");
			System.out.println("2. Delete Grades");
			System.out.println("3. Edit Grades");
			System.out.println("4. View Grades");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1-6 : ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("Subject name: ");
				String sbjname1 = input.next();
				System.out.print("Subject score(ex. A+): ");
				String sbjscr = input.next();
				break;
				
			case 2:
				System.out.print("Subject name: ");
				String sbjname2 = input.next();
				break;
			
			case 3:
				System.out.print("Subject name: ");
				String sbjname3 = input.next();
				break;
				
			case 4:
				break;
				
			case 5:
				break;
			}
		}
	}
}
