package Day2;

import java.util.Scanner;

public class Driver_BookShop_ValidSearch {

	public static void main(String[] args) {
		
		
		int expectedcount,actualcount;
		String authorname;
		System.out.println("Please enter author name and Expected count");
		Scanner in = new Scanner(System.in);
		authorname=in.next();
		expectedcount=in.nextInt();
		Bookshop_ValidSearch vs = new Bookshop_ValidSearch();
		actualcount=vs.searchbook(authorname);
		 if (expectedcount==actualcount)
	        {
	        	System.out.println("Testcase has been passed");
	        }
	        else
	        {
	        	System.out.println("Testcase has been failed");
	        }

	}

}
