package Day6;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allahabadbank {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		driver.findElement(By.name("principal")).sendKeys("100000");
		driver.findElement(By.name("interest")).sendKeys("12");
		driver.findElement(By.name("instalment")).sendKeys("5");
		driver.findElement(By.name("B1")).click();
		String ExpectedEmi = driver.findElement(By.name("total")).getAttribute("value");
		System.out.println(ExpectedEmi);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		System.out.println("number of tabs opened "+tabs.size());
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		driver.findElement(By.id("loanamount")).sendKeys("100000");
		driver.findElement(By.id("rate")).sendKeys("12");
		driver.findElement(By.id("pmonths")).sendKeys("60");
		driver.findElement(By.id("Button1")).click();
		String ExpectedEmi1 = driver.findElement(By.id("EMI")).getAttribute("value");
		System.out.println(ExpectedEmi1);
		double emi=Double.parseDouble(ExpectedEmi);
		double emi1=Double.parseDouble(ExpectedEmi1);
		if(emi==emi1) 
		  System.out.println("both emi's are same");
		else
		 System.out.println("both emi's are not same");	
		driver.close();
	}

}
