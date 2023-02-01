package assignment1;

public class StudentB extends Marks {
	int mark1, mark2, mark3, mark4;
	
	
	public StudentB(int m1, int m2, int m3, int m4) {
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;	
		mark4 = m4;
	}


	public void getPercentage() {
		double div = 400;
		int total = mark1 + mark2 + mark3 + mark4;
		double Avg1 = (double)total/div * 100 ;
		System.out.println("The percentage of Student B is " + Avg1);
	}
	
	public static void main(String[] args) {
		Marks avg;
		System.out.println("Student Avg is following: ");
		int markA1 = 50;
		int markA2 = 60;
		int markA3 = 70;
		avg = new StudentA(markA1, markA2, markA3);
		avg.getPercentage();
		int markB1 = 50;
		int markB2 = 60;
		int markB3 = 70;
		int markB4 = 80;
		avg = new StudentB(markB1, markB2, markB3, markB4);
		avg.getPercentage();
		
	}
	

}
