package Day2;

import java.util.Scanner;

public class GradeCalc {
	
	private int grad;
	public String gradeStatus(char ch,int grade){
		String gradestatus=null; 	
		switch(ch){
		case 'a':
			if(grade>=90) 
			{	gradestatus="Great Job!";
				
			} 
            break;
		case 'b':
			
			if(grade<20 || grade>50) 
			{
				gradestatus="Error";
				
			}	
			break;
		case 'c':
			System.out.println("Enter the grade:");
			if(grade<100) 
			{	
				grade=grade+2;
				gradestatus="added";
			}      
			break;	
		
		}
		return gradestatus; 
		
	}

}
