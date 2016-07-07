import java.util.Scanner;


public class ArrayCount {
	
	public static int numberOfnines(int[] a)
	{
		int counter=0;
		for(int i=0;i<a.length;i++)
        {
          if(a[i]==9)
          {
        	  counter+=1;
          }
        }
		return counter;
	}
	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in); 
		System.out.println("Please enter number od elements in array");
        int arraysize=in.nextInt();
        System.out.println("Please enter array elements");
        int[] array=new int[arraysize];
        for(int i=0;i<arraysize;i++)
        {
          array[i]=in.nextInt();
        }
        int c=numberOfnines(array);
		System.out.println("Number of 9's in the array is "+c);
	}

   
}
