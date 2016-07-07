package Day1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Weather {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.timeanddate.com/weather/");
		driver.findElement(By.id("wcquery")).sendKeys("Bangalore");
		driver.findElement(By.className("three")).click();
		List<WebElement> ls = driver.findElements(By.xpath("//table[@id='wt-5hr']/tbody/tr[1]/td"));
		String currenttime=driver.findElement(By.id("wtct")).getText();
		Date d=new Date();
		SimpleDateFormat sd = new SimpleDateFormat("d MMM y, H:m");
		String systemtime=sd.format(d);
		System.out.println(systemtime);
		currenttime=sd.format(d);
		System.out.println(currenttime);
		if (systemtime.equals(currenttime))
		{
			System.out.println("system time is same as of the current time of the application"); 
		}
		SimpleDateFormat sd1 = new SimpleDateFormat("H");
		systemtime=sd1.format(d);
		System.out.println(systemtime);
		Integer isystemtime=Integer.parseInt(systemtime);
		for (WebElement i:ls)
		{
			
			currenttime=i.getText();
			if (currenttime.equals("Now"))
			{
			   System.out.println("Testcase has been passed"); 
			}
			else
			{
				isystemtime=isystemtime+1;
				if (isystemtime==24)
				{
					isystemtime=0;
				}
				System.out.println(isystemtime);
				currenttime=currenttime.replace(":00","");
				Integer icurrenttime=Integer.parseInt(currenttime);
			    System.out.println(icurrenttime);
				if (isystemtime==icurrenttime)
				{
					System.out.println("Testcase has been passed"); 
				}
				
			}
			
			
		}
		
		
		driver.close();

	}

}
