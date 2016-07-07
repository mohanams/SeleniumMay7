package Day2;

import java.util.Scanner;

public class GradeMain {
	
	public static void main(String[] args) {
		
		int grade=0;
		char ch;
		System.out.println("Enter ur choice as a or b or c:");
		Scanner in = new Scanner(System.in);
		ch=in.next(".").charAt(0);
		System.out.println("Enter the grade:");
		grade=in.nextInt();
		GradeCalc gc = new GradeCalc();
		String gradestatus=gc.gradeStatus(ch,grade);
		System.out.println(gradestatus);
		System.out.println(grade);
		
	
	}

}
