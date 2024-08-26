package pages;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	WebDriverWait wait;
	  public BaseClass(WebDriver driver)
	 {
		 this.driver= driver;
	 }
    	public WebDriver init_driver()
	    {
		
		  ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver= new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://rtw.oneworld.com/rtw/");
			try {
			       new WebDriverWait(driver, Duration.ofSeconds(10)).
			       until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn btn-teritiary'])[1]")));
			      
			     }
			catch(Exception e) {
			       System.out.println("Element isn't clickable");
			    }
			return driver;
		    }
    	
    	public void Close_Browser()
    	{
    		driver.close();
    	}
       }
