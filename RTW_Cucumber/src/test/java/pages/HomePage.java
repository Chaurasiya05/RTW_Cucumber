package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

public class HomePage {
WebDriver driver ;
public String HomepageTitle="Enjoy great savings on your Round the World flights with oneworld.";
public HomePage(WebDriver driver)
{
	this.driver=driver;
}
 public void VerifyTitle() {
	 
	String actualTitle=driver.getTitle();
	assertEquals(HomepageTitle, actualTitle);
	
 }
}
