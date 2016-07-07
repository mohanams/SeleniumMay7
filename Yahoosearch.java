package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoosearch {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://search.yahoo.com/");
		
        driver.findElement(By.id("yschsp")).sendKeys("Selenium");
        driver.findElement(By.className("sbb")).click();
       // String Result = driver.findElement(By.id("yui_3_10_0_1_1462616623283_2770")).getText();
        String Result = driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
        System.out.println(Result);
        //String actual = Result.split(" ")[0];
        String actual = Result.replace(" results", "");
        System.out.println(actual);
        actual=actual.replace(",","");
        System.out.println(actual);
        int parseactual = Integer.parseInt(actual);
        System.out.println(parseactual);
        if (parseactual>100000)
        {
        	System.out.println("Testcase has been passed");
        }
        else
        {
        	System.out.println("Testcase has been failed");
        }
        driver.close();
	}

}
