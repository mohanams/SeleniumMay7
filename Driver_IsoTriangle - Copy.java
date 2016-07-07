package Day4;

import java.util.Scanner;

public class Driver_IsoTriangle {


	public static void main(String[] args) {
		
		int size;
		System.out.println("Enter the Size:");
		Scanner in = new Scanner(System.in);
		size=in.nextInt();
		IsoTriangle it = new IsoTriangle();
		for(int i=1;i<=size;i++)
		{	
			it.addSpaces(size, i);
		    it.thedrawBar(i); 
			System.out.println("");
		}
		

	}

}
