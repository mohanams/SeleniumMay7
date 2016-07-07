import java.util.Scanner;

import MonkeySmile.*;
public class Smiley {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the smile about 'a' monkey ");
		String asmile=in.next();
		System.out.println("Enter the smile about 'b' monkey ");
		String bsmile=in.next();
		MonkeySmile a=new MonkeySmile(asmile);
		MonkeySmile b=new MonkeySmile(bsmile);
		boolean result=MonkeySmile.trouble(asmile, bsmile);
	    if (result==true)
        {
        	System.out.println("we are in trouble");
        }
        else
        {
        	System.out.println("we are not in trouble");
        }
        
	}

}
