package Day3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Driver_BookShop_InvalidSearch {

	public static void main(String[] args) {
		
		
       String authorname,Expected,actualmsg;
      // System.out.println("Please enter author name:");
       Scanner in = new Scanner(System.in);
      // authorname=in.next();
       System.out.println("Please enter expected message");
       Expected=in.next();
       BookShop_InvalidSearch bs=new BookShop_InvalidSearch();
       actualmsg=bs.searchbook_Invalid("");
       actualmsg=actualmsg.replace(" ", "");
       System.out.println(actualmsg);
        if (actualmsg.equalsIgnoreCase(Expected))
        {
        	System.out.println("Test case has been passed");
        }
        else
        {
        	System.out.println("Test case has been failed");
        }
       
	}

}
