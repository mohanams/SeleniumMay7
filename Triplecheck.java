package week6;

import java.util.Scanner;

public class Triplecheck {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of elements in an array");
		Scanner in = new Scanner(System.in);
		boolean t=true;
		
		int s=in.nextInt();
		int array[]=new int[s];
		System.out.println("Please enter array elements");
		for(int i=0;i<s;i++)
		{
			array[i]=in.nextInt();
		}
		for(int i=0;i<s;i++)
		{
			int triples=1;
			//System.out.println("i value"+array[i]);
			for(int j=i+1;j<s;j++)	 
		    {
				//System.out.println("j value"+array[j]);
				if(array[i]==array[j]) 
			   {
				   triples=triples+1;
				   System.out.println("triples count"+triples);
				   if(triples==3)
				   { 
					   t=false;
				       break;
				   } 
				   else
					   t=true;
				   
			   }
		   }
		   if(t==false)
				break;
		  
		}
        if(t==true)
          System.out.println("True array does not contain any triples");	
        else
          System.out.println("false array contains triples");
	}

}
