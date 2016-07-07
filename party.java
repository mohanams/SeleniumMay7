import java.util.Scanner;


public class party {
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter the number of candy's in the party: ");
		int candy=in.nextInt();
		System.out.println("Please enter the number of tea's in the party: ");
		int tea=in.nextInt();
		int party=teaparty(tea,candy);
		System.out.println("Party outcome is "+party);
	}
	
	public static int teaparty(int tea,int candy)
	{
		int party=0;
		if (tea<5 || candy<5)
		{	
			System.out.println("party is bad");
		    party=0;
		}
		else if(tea>=(2*candy) || candy>=(2*tea))
		{
			System.out.println("party is great");
			party=2;
		}
		else if(tea>=5 && candy>=5)
		{
			System.out.println("party is good");
		    party=1;
		}
		
		return party;
	}

}
