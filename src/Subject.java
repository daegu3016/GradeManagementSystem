
public class Subject {
	String name;
	float score;
	
	public Subject(){		
	}

	public Subject(String name, float score) {
		this.name = name;
		this.score = score;
	}
	
	public void printInfo() {
		System.out.println("Subject:"+ name + "Score:" + score);
	}
}