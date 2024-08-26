package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	private By loc_username=By.xpath("(//input[@id='Email'])[1]");
	private By loc_password=By.xpath("(//input[@id='Password'])[1]");
	private By loginButton=By.xpath("(//button[@class='btn btn-teritiary'])[1]");
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername(String username)
	{
		 driver.findElement(loc_username).sendKeys(username);
		    
	}
	public void enterPassword(String password)
	{
		driver.findElement(loc_password).sendKeys(password);
	}
	public void ClickLoginButton()
	{
		 driver.findElement(loginButton).click();
	}
}
