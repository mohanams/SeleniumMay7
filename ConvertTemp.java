package Day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ConvertTemp {

	public static void main(String[] args) {
		
		
		double celsiumtemp=40;
		String celsius=Double.toString(celsiumtemp);
		WebDriver driver=null;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.onlineconversion.com/temparature.htm");
		WebElement fromdropdown = driver.findElement(By.name("from"));
		Select opt=new Select(fromdropdown);
		opt.selectByVisibleText("degree Celsius");
		driver.findElement(By.name("what")).sendKeys(celsius);
		WebElement todropdown = driver.findElement(By.name("to"));
		Select opt1=new Select(todropdown);
		opt1.selectByVisibleText("degree Fahrenheit");
		driver.findElement(By.name("Go")).click();
		String ActualResult = driver.findElement(By.name("answer")).getAttribute("value");
		System.out.println(ActualResult);
		ActualResult=(ActualResult.split("=")[1]).trim();
		System.out.println(ActualResult);
		ActualResult=ActualResult.split(" ")[0];
		System.out.println(ActualResult);
		int Actual=Integer.parseInt(ActualResult);
		double expectedresult=(1.8*celsiumtemp)+32;
		System.out.println("Actual Result is "+Actual);
		System.out.println("Expected Result is "+expectedresult);
		if(Actual==expectedresult)
		{
			System.out.println("conversion is correct as per international standards");
		}
		driver.close();
		

	}

	/*private static String[] Split(String actualResult, String string) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
