package assignment1;

public class StudentA extends Marks {
	int mark1, mark2, mark3;
	
	
	public StudentA(int m1, int m2, int m3) {
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;	
	}


	public void getPercentage() {
		double div = 300;
		double total = mark1 + mark2 + mark3;
		double avg2 = total/div *100;
		
		System.out.println("The percentage of Student A is " + avg2);
	}
	

}
