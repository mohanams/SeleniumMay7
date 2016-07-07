package Day4;

public class IsoTriangle {
	
	public void thedrawBar(int i)
	{
		for(int k=1;k<=((2*i)-1);k++) 
		{	
		  System.out.print("*");
		}  
	}
	public void addSpaces(int size,int i)
	{
		
		for(int j=1;j<=size-(i-1);j++)
		{
			System.out.print(" ");
	    }
	}

}
