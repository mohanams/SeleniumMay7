package Day6;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter the number of elements in array");
		int arraysize=in.nextInt();
		int[] array=new int[arraysize];
		System.out.println("Please enter the alements of the array" );
		
		for(int i=0;i<arraysize;i++)
		{
			array[i]=in.nextInt();
			sum=sum+array[i];
		}
		System.out.println("sum of the given array is "+sum);
		
	}

}
