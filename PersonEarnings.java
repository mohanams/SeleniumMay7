package Day8;

import java.util.Scanner;

public class PersonEarnings {

	String name;
	double startingsalary;
	double currentsalary;
	int periodInYears;
	public PersonEarnings(String name,double startingsalary)
	{
		this.name=name;
		this.startingsalary=startingsalary;
	}
	public void calculateSalary(int periodInYears,double startingsalary)
	{
		currentsalary=startingsalary;
		for(int i=1;i<=periodInYears;i++)
		{	
			if(i==1)
				currentsalary=startingsalary;
			else
			  currentsalary=currentsalary*2;
		}
		System.out.println("Current salary of Person "+name+" is "+currentsalary);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the person name: ");
		Scanner in = new Scanner(System.in);
		String name=in.next();
		System.out.println("Please enter the person's starting slary:");
		double salary=in.nextDouble();
		System.out.println("Please enter period of time to get salary earnings");
		int period=in.nextInt();
		PersonEarnings pe=new PersonEarnings(name,salary);
		pe.calculateSalary(period,salary);
       
	}

}
