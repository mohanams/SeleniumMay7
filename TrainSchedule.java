package Day8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TrainSchedule {
	
	public static void main(String[] args) {
		
		WebDriver driver=null;
		String expectedtrainrouteno=null,actualtrainrouteno,actualtrainname,actualfromsource;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.indianrail.gov.in/train_Schedule.html");
		driver.findElement(By.id("lccp_trnname")).sendKeys("123");
		driver.findElement(By.name("getIt")).click();
		List<WebElement> list = driver.findElements(By.name("lccp_trn_no"));
		boolean v=false;
		for(WebElement e:list)
		{
			if (e.getAttribute("value").contains("123"))
				v=true;
			else
			{
				v=false;
				break;
			}
		}
		if(v==true)
		   System.out.println("All the train names which contains 123 is displayed ");
		else  
		  System.out.println("All the train names which contains 123 is not displayed ");
		
		int rowcount= driver.findElements(By.xpath("//table[@class='table_border_both']/tbody/tr")).size();
		System.out.println(rowcount);
		for(int i=2;i<=rowcount;i++) 
		{
/*			System.out.println(driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr["+i+"]/td[2]")).getText());
			System.out.println(driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr["+i+"]/td[3]")).getText());
			System.out.println(driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr["+i+"]/td[1]/input[@name='lccp_trn_no']")).getAttribute("value"));*/
			if (driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr["+i+"]/td[2]")).getText().equalsIgnoreCase("ARCHANA EXPRESS") && driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr["+i+"]/td[3]")).getText().equalsIgnoreCase("JAMMU TAWI"))
			{	
				System.out.println(driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr["+i+"]/td[2]")).getText());
				System.out.println(driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr["+i+"]/td[3]")).getText());
				System.out.println(driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr["+i+"]/td[1]/input[@name='lccp_trn_no']")).getAttribute("value"));
				expectedtrainrouteno=driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr["+i+"]/td[1]/input[@name='lccp_trn_no']")).getAttribute("value");
				driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr["+i+"]/td[1]/input[@name='lccp_trn_no']")).click();
			}	
			/*else
				 System.out.println("ARCHNA EXPRESS is not selected");*/
			
			    
		}
		driver.findElement(By.className("btn_style")).click();
		if (driver.findElement(By.xpath("//table/tbody/tr/td[@class='inside_heading_text']")).getText().equalsIgnoreCase("TRAIN ROUTE"))
		{
			actualtrainrouteno=driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr[2]/td[1]")).getText();
			actualtrainname=driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr[2]/td[2]")).getText();
			actualfromsource=driver.findElement(By.xpath("//table[@class='table_border_both']/tbody/tr[2]/td[3]")).getText();
			System.out.println(actualtrainrouteno);
			System.out.println(actualtrainname);
			System.out.println(actualfromsource);
			if(actualtrainrouteno.equalsIgnoreCase(expectedtrainrouteno)&&actualtrainname.equalsIgnoreCase("ARCHANA EXPRESS")&&actualfromsource.equalsIgnoreCase("JAMMU TAWI"))
				System.out.println("all the details are correct");
			else
				System.out.println("all the details are not correct");
		}
		
		driver.close();
	}
	
	

}
