package org.Stepdefnitions;

import java.time.Duration;

import org.POM.login;
import org.Uttility.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class Login extends Baseclass {
	 login l= new login();
	
	@Given("The User is on the login page")
	public void the_user_is_on_the_login_page() {
	   url(Getdata("url"));
	}
	@When("The user has to enter valid username and password")
	public void the_user_has_to_enter_valid_username_and_password() {
	    sendkeys(l.getEmail(), Getdata("adminuser"));
	    sendkeys(l.getPassword(), Getdata("adminpwd"));
	}
	@When("The user has to click the login button")
	public void the_user_has_to_click_the_login_button() {
		click(l.getLogin());
	    
	}
	@Then("The user should be able logged into the account")
	public void the_user_should_be_able_logged_into_the_account() {
		
		
		Assert.assertEquals("Verify the user", "Admin Triton", l.getUsername().getText());
	    
	}
	
	
	
	@When("The user has to enter  {string} and  {string}")
	public void the_user_has_to_enter_and(String string, String string2) {
		sendkeys(l.getEmail(),string);
		sendkeys(l.getPassword(),string2);
	}
	 
	@Then("The user should see an error message indicating invalid credentials")
	public void the_user_should_see_an_error_message_indicating_invalid_credentials() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(20));
	   try {
		   
		   Assert.assertEquals("verify the warning message", "Invalid email or password.",w.until(ExpectedConditions.visibilityOf( l.getPopup())).getText());
			
	} catch (Exception e) {
		Assert.assertEquals("verify the warning message", "This field is required.", w.until(ExpectedConditions.visibilityOf( l.getWarning())).getText());
		
	} 
	  
	}
	


	
	


}
