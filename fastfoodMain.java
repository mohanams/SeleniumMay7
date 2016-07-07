package Day3;

import java.text.DecimalFormat;
import java.util.Scanner;



public class fastfoodMain {
	
	public static void main(String[] args) {
		
		FastFood ff = new FastFood();
		StringBuilder sb = new StringBuilder();
		double burgerprice = ff.selectFood("burgers");
		double friesprice = ff.selectFood("fries");
		double sodasprice = ff.selectFood("sodas");
		System.out.println("burgerprice "+burgerprice);
		System.out.println("friesprice "+friesprice);
		System.out.println("sodasprice "+sodasprice);
		double totalprice=burgerprice+friesprice+sodasprice;
		System.out.println("totalprice "+totalprice);
		double taxontheamount=ff.taxCalc(totalprice);
		System.out.println("taxontheamount "+taxontheamount);
		double totalamountaftertax=totalprice+taxontheamount;
		System.out.println("totalamountaftertax "+totalamountaftertax);
		System.out.println("Please enter the amount to pay the bill");
		Scanner in = new Scanner(System.in);
		double amountbyuser=in.nextDouble();
		double changetouser=ff.changeCalc(totalamountaftertax, amountbyuser);
		DecimalFormat df = new DecimalFormat("#.##");
		
		sb.append('$');
		sb.append(Double.valueOf(df.format(changetouser)));
		System.out.println(sb);
		
		
	}

}
