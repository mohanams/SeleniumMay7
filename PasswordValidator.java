package Day4;

import java.util.Scanner;

public class PasswordValidator {
	
	String epassword="Hello";
	int pcount=0;
	public void passwordCheck()
	{
		
		for (int i=1;i<=3;i++)
		{	
			System.out.println("Enter the password: ");
			Scanner in = new Scanner(System.in);
			String password=in.next();
			
			if (password.equals(epassword))
			{
				if(pcount<=3) 
				 System.out.println("Welcome");
				break;
				
			}
			else
			{
				if(pcount<=3)
				{	
					System.out.println("The password you typed is incorrect");
					pcount=pcount+1;
					if(pcount==3)
						System.out.println("Access denied");
				}	
			}
			if(pcount>3) 
			{
				System.out.println("Access denied");
			}
		}	
	}

}
