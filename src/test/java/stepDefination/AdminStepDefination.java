package stepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStepDefination {
	
	private WebDriver driver;
	
	@Before
	public void setup()
	{
		
		
	}
	
	@Given("User Lanch Chrome Browser")
	public void user_lanch_chrome_browser() {
	    
	}

	@When("User open url {string}")
	public void user_open_url(String string) {
	
	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String string, String string2) {
	  
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
	    
	}

	@Then("User verify page title should be {string}")
	public void user_verify_page_title_should_be(String string) {
	    
	}

	@Then("close browser")
	public void close_browser() {

	}

}
