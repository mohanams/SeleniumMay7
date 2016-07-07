package Day7;

import java.util.Scanner;

public class CarDrivingAge {

	public static void main(String[] args) {
		
		System.out.println("Please enter the age of person: ");
		Scanner in=new Scanner(System.in);
		int age=in.nextInt();
		if(age<16)
		  System.out.println("you can't drive");
		else if(age<18)
           System.out.println("you can't vote");
		else if(age<25)
			System.out.println("you can't rent a car");
		else
			System.out.println("you can do anything that's legal"); 
	}

}
