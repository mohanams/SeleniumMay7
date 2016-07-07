package Day2;

import java.util.Scanner;

public class pizza {
	
	public static void main(String[] args) {
		
		int pdia;
		System.out.println("Enter the pizza Diameter:");
		Scanner in = new Scanner(System.in);
		pdia=in.nextInt();
		PizzaCost pc=new PizzaCost();
		double pcost=pc.calculatecost(pdia);
		StringBuilder sb = new StringBuilder();
		sb.append('$');
		sb.append(pcost);
		System.out.println("The Cost of making pizza:"+sb);
		
		
	}

}
