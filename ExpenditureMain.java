package Day4;

import java.util.Scanner;



public class ExpenditureMain {

	public static void main(String[] args) {
		
		ExpenditureCheck ec = new ExpenditureCheck();		
		double[] expensearray=new double[4];
		expensearray=ec.Expenditure();
		double[] percentagearray=new double[4];
		percentagearray=ec.calculateExpenditure(expensearray);
		System.out.print("Category               ");
		System.out.print("Budget");
		System.out.println("");
		System.out.print("Food                   ");
		System.out.print(percentagearray[0]+"%");
		System.out.println("");	
		System.out.print("Clothing               ");
		System.out.print(percentagearray[1]+"%");
		System.out.println("");	
		System.out.print("Entertainment          ");
		System.out.print(percentagearray[2]+"%");
		System.out.println("");	
		System.out.print("rent                   ");
		System.out.print(percentagearray[3]+"%");
		
	}  
	
	
}
