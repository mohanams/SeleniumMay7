package Day4;

import java.util.Scanner;

public class ExpenditureCheck {

	
	
	public double[] Expenditure()
	{
		double[] expensearray=new double[4];
		System.out.println("Enter the amount spent last month on the following items:");
		System.out.println("Food: ");
		Scanner in = new Scanner(System.in);
		expensearray[0]=in.nextDouble();
		System.out.println("Clothing: ");
		expensearray[1]=in.nextDouble();
		System.out.println("Entertainment: ");
		expensearray[2]=in.nextDouble();
		System.out.println("rent: ");
		expensearray[3]=in.nextDouble();
		return expensearray;
	}
	
	public double[] calculateExpenditure(double[] a)
	{
		double[] percentagearray=new double[4];
		double totalexpenditure=0;
		for(int i=0;i<=3;i++)
		{
			totalexpenditure= totalexpenditure+a[i];
		}
		for(int i=0;i<=3;i++)
		{
			percentagearray[i] = ((double)(a[i]*100)/totalexpenditure);
		}
		return percentagearray;
	}

}
