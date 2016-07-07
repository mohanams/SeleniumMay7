package Day6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSearch {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		boolean search=false;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.search.yahoo.com");
		driver.findElement(By.id("yschsp")).sendKeys("Selenium");
		List<WebElement> list = driver.findElements(By.xpath("//b[@class='yui3-highlight']"));
		System.out.println("Number of search suggestions "+list.size());
		for(WebElement e:list)
		{
			if(e.getText().contains("selenium"))
			{
				search=true;
		    }
			else
			{
				search=false;
				break;
			}
		}
		if(search==true) 
		  System.out.println("All the search suggestion contains selenium");
		else
		  System.out.println("All the search suggestion does not contain selenium");
	}

}
