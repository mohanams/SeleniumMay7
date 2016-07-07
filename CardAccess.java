package week6;

import java.util.Scanner;

public class CardAccess {

	public static void main(String[] args) {
		
		String ExpectedPIN="10101";
		System.out.println("WELCOME TO THE BANK OF HFC");
		int f=0;
		for(int i=1;i<=3;i++)
		{
			System.out.println("ENTER YOUR PIN");
			Scanner in = new Scanner(System.in);
			String ActualPIN=in.next();
			if(ExpectedPIN.equalsIgnoreCase(ActualPIN)) 
			{	
				System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
			    break;
			}    
			else
			{
			    f=f+1;
			    if(f==3)
			      System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED");	
			    else
				  System.out.println("INCORRECT PIN. TRY AGAIN");	
			}  
		}
		

	}

}
