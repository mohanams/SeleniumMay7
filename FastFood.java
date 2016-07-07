package Day3;

import java.util.Scanner;

public class FastFood {
		
	public double selectFood(String foodtype)
	{
		System.out.println("Please enter quantity of "+foodtype);
		Scanner in = new Scanner(System.in);
		double foodprice=0.0;
		int quantity=in.nextInt();
		switch(foodtype)
		{
		case "burgers":
			foodprice=quantity*1.69;
			break;
		case "fries":
			foodprice=quantity*1.09;
			break;
		case "sodas":
			foodprice=quantity*0.99;
			break;
		}
		
		/*if (foodtype.equalsIgnoreCase("burgers"))
		{
			foodprice=quantity*1.69;
		}
		else if(foodtype.equalsIgnoreCase("fries"))
		{
			foodprice=quantity*1.09;
		}
		else if(foodtype.equalsIgnoreCase("sodas"))
		{
			foodprice=quantity*0.99;
		}*/
		return foodprice;
		
	}
	
	public double taxCalc(double totalprice)
	{
		double tax = (6.5*totalprice)/100;
		return tax;
		
	}
	public double changeCalc(double totalamountaftertax,double amountbyuser)
	{
		double changetouser=amountbyuser-totalamountaftertax;
		return changetouser;
	}

}
