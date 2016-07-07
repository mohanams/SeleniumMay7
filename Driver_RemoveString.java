package Day5;

import java.util.Scanner;

public class Driver_RemoveString {

	public static void main(String[] args) {
		
		RemoveString rs = new RemoveString();
		System.out.println("Enter a sentence: ");
		Scanner in = new Scanner(System.in);
		String sentence=in.nextLine();
		System.out.println("Enter a String: ");
		String str=in.next();
		String sen=rs.removalStr(sentence,str);
		System.out.println(sen);

	}

}
