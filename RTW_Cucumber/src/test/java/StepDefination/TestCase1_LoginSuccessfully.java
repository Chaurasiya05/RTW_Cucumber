package StepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TestCase1_LoginSuccessfully {
    
	WebDriver driver;
	BaseClass baseclass;
	LoginPage loginpage;
	  HomePage homepage ;
	@Given("Open the browser and enter the url")
	public void open_the_browser_and_enter_the_url() {
	    baseclass= new BaseClass(driver);
	   driver= baseclass.init_driver();
	}

	@When("^User enter the valid (.*) and (.*)$")
	public void user_enter_the_valid_username_and_password(String username , String password) {
	    loginpage = new LoginPage(driver);
	    loginpage.enterUsername(username);
	    loginpage.enterPassword(password);
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
	    loginpage.ClickLoginButton();
	}

	@Then("User is able to navigate to home Page")
	public void user_is_able_to_navigate_to_home_page() throws Exception{
	  homepage = new HomePage(driver);
	   homepage.VerifyTitle();
	   baseclass.Close_Browser();
	   Thread.sleep(2000);
	}

}
