package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class MaximunNumber {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter the number of elements in array");
		int arraysize=in.nextInt();
		int[] array=new int[arraysize];
		System.out.println("Please enter the alements of the array" );
		
		for(int i=0;i<arraysize;i++)
		{
			array[i]=in.nextInt();
		}
		/* bubble sort script */
		int swap;
		 for (int i = 0; i < ( arraysize - 1 ); i++) {
		      for (int j = 0; j < (arraysize - i - 1); j++) {
		        if (array[j] > array[j+1]) 
		        {
		          swap = array[j];
		          array[j]   = array[j+1];
		          array[j+1] = swap;
		        }
		      }
		 }
		 for (int c = 0; c < arraysize; c++) 
		      System.out.println(array[c]);
		int maximum=array[arraysize-1];
		System.out.println("maximum number of the given array is "+maximum);
		
		/* Normal way */
		maximum=array[0];
		for(int i=1;i<arraysize;i++)
		{
			    if(maximum<array[i])
				    maximum=array[i];
		}
		System.out.println("maximum number of the given array is "+maximum);
		
		/* using Arrays.sort() method */
		Arrays.sort(array);
		maximum=array[arraysize-1];
	
		System.out.println("maximum number of the given array is "+maximum);
        
	}

}
