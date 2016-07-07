package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Bookshop_ValidSearch {
	
	public int searchbook(String authorname){
		
		WebDriver driver=null;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://bookshopofindia.com/");
		WebElement dropdown = driver.findElement(By.name("searchon"));
        Select opt = new Select(dropdown); 
        opt.selectByVisibleText("Author");
        driver.findElement(By.name("searchtext")).sendKeys(authorname);
        driver.findElement(By.name("Submit")).click();
        String result = driver.findElement(By.xpath("//table/tbody/tr/td/font/b/font")).getText();
        System.out.println(result);
        int iresult = Integer.parseInt(result);
        driver.close();
        return iresult;
		
	}

}
