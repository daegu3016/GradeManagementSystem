package Subject;

import java.util.Scanner;

public class MajorSubject extends Subject {
	public void getUserInput(Scanner input) {
		System.out.print("Subject name: ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while(answer != 'y'&& answer != 'Y'&& answer != 'n'&& answer != 'N') {
			System.out.print("Is it a subject with score?(Y/N): ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Subject score(ex. A+:4.5 , A0:4.0): ");
				float score = input.nextFloat();
				this.setScore(score);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setScore(0);
				break;
			}
		}
	}
}
