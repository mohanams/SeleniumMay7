import java.util.Scanner;


public class parrottalk {
	
	public static boolean parrotTrouble(boolean talking, int hour)
	{
		boolean result=false;
		if (talking==true && (hour<7 ||hour>20)) 
		   result=true;
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("is parrot talking");
		boolean talking=in.nextBoolean();
		System.out.println("enter current hour time");
		int hour=in.nextInt();
		boolean trouble=parrotTrouble(talking,hour);
        if (trouble==true)
        {
        	System.out.println("Parrot is in trouble");
        }
        else
        {
        	System.out.println("Parrot is not in trouble");
        }
	}

}
