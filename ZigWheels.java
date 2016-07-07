package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZigWheels {
	
	  public void setDropdown(WebElement dropdown,String wvalue)
	  {
		  Select opt = new Select(dropdown);
		  opt.selectByVisibleText(wvalue);
	  }
	
	  public void searchCars(){
		  
		    WebDriver driver=null;
		    String epricerange="PRICE RANGE: 2 lakh  to 3 lakh";
		    String ecity="CITY: Delhi";
		    String efuel="FUEL TYPES: Diesel";
		    String efuel2="FUEL TYPES: Petrol, Diesel";
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("http://www.zigwheels.com/newcars");
	        WebElement mindropdown = driver.findElement(By.id("byPriceFrom"));
	        WebElement maxdropdown = driver.findElement(By.id("byPriceTo"));
	        WebElement fueldropdown = driver.findElement(By.id("byPriceFuelType"));
	        setDropdown(mindropdown,"2 Lakh");
	        setDropdown(maxdropdown,"3 Lakh");
	        setDropdown(fueldropdown,"Diesel");
	       /* Select minopt = new Select(mindropdown);
	        minopt.selectByVisibleText("2 Lakh");
	        Select maxopt = new Select(maxdropdown);
	        maxopt.selectByVisibleText("3 Lakh");
	        Select fuelopt = new Select(fueldropdown);
	        fuelopt.selectByVisibleText("Diesel");*/
	        
	 /*     WebDriverWait wdwait = new WebDriverWait(driver, 10);
	        JavascriptExecutor js = ((JavascriptExecutor) driver);
	        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("redBtn_nomargin_pr")));
	        WebElement element = driver.findElement(By.className("redBtn_nomargin_pr"));  
	        js.executeScript("window.scrollBy(0,-500)", "");
	        wdwait.until(ExpectedConditions.elementToBeClickable(By.className("redBtn_nomargin_pr")));
	        element.click();*/
	        
	        driver.findElement(By.className("redBtn_nomargin_pr")).submit();
	        
	        String price = driver.findElement(By.cssSelector("ul[id='search_param_place'] li:nth-child(1)")).getText();
	        String city = driver.findElement(By.cssSelector("ul[id='search_param_place'] li:nth-child(2)")).getText();
	        String fueltype = driver.findElement(By.cssSelector("ul[id='search_param_place'] li:nth-child(3)")).getText();
	        System.out.println(price);
	        System.out.println(city);
	        System.out.println(fueltype);
	        if(epricerange.equalsIgnoreCase(price) && ecity.equalsIgnoreCase(city) && efuel.equalsIgnoreCase(fueltype))
	        {
	        	System.out.println("price ranges,city and fueltypes are validated");
	        }
	        else
	        {
	        	System.out.println("price ranges,city and fueltypes are not displayed correctly");
	        }
	       
	        JavascriptExecutor js = ((JavascriptExecutor) driver);
	        js.executeScript("window.scrollBy(0,500)", "");
	        WebDriverWait wdwait = new WebDriverWait(driver, 10);
	        wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Petrol')]")));
	       // WebElement chkboxelement = driver.findElement(By.xpath("//div[@id='filterPanel']/div[5]/ul/li[3]/input"));  
	        WebElement chkboxelement = driver.findElement(By.xpath("//label[contains(text(),'Petrol')]"));  
	        if(!chkboxelement.isSelected())
	           chkboxelement.click();
	        fueltype = driver.findElement(By.cssSelector("ul[id='search_param_place'] li:nth-child(3)")).getText();
	        System.out.println(fueltype);
	        if(epricerange.equalsIgnoreCase(price) && ecity.equalsIgnoreCase(city) && efuel2.equalsIgnoreCase(fueltype))
	        {
	        	System.out.println("price ranges,city and fueltypes are validated");
	        }
	        else
	        {
	        	System.out.println("price ranges,city and fueltypes are not displayed correctly");
	        }
	       driver.close();
	  }

}
