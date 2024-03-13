package org.Stepdefnitions;

import org.POM.register;
import org.Uttility.Baseclass;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Register extends Baseclass {
	 register r = new register();
	

	 @Given("I click on the invitation link in the email")
	 public void i_click_on_the_invitation_link_in_the_email() {
		 url(Getdata("mailurl"));
		sendkeys(r.getSearchemail(), Getdata("mailid"));
		click(r.getGobutton());
		click(r.getEmail());
		frames(r.getFrame());
		click(r.getInvitationURL());
		framesout(r.getFrame());
		windowshandle(0);
	 }
	 @When("The user enter the value in the First name and second name fields")
	 public void the_user_enter_the_value_in_the_first_name_and_second_name_fields() {
		 sendkeys(r.getFirstName(), Getdata("firstname"));
			sendkeys(r.getLastName(), Getdata("lastname"));
			click(r.getNextbutton());
	 }
	 @When("The user has to enter the value in the company name field")
	 public void the_user_has_to_enter_the_value_in_the_company_name_field() {
		 sendkeys(r.getCompanyName(), Getdata("companyname"));
			click(r.getNextbutton());
	 }
	 @When("The user has to  enter the value in the both Password and confirm fields")
	 public void the_user_has_to_enter_the_value_in_the_both_password_and_confirm_fields() {
		 sendkeys(r.getPassword(), Getdata("password"));
			sendkeys(r.getConfirmPassword(), Getdata("confirmpassword"));
			//click(r.getNextbutton());
	 }
	 @Then("The application should show in the final step {string}")
	 public void the_application_should_show_in_the_final_step(String string) {
		// Assert.assertEquals("verify the sucessfully register or not", string, r.getStatus().getText());

	 }
	
	
	 
	 
	 
	 
	 @When("I click on the {string} field and without filling data click next field")
	 public void i_click_on_the_field_and_without_filling_data_click_next_field(String string) {
		 switch (string) {
			case "FirstName":
				click(r.getFirstName());
				click(r.getLastName());
				break;
			case "LastName":
				click(r.getLastName());
				click(r.getFirstName());
				break;
			}
	 }
	 @Then("the application should show the warning message in the user profile step {string}")
	 public void the_application_should_show_the_warning_message_in_the_user_profile_step(String string) {
		 Assert.assertEquals("Verify the warning message", string, r.getWarningmsg().getText());

	 }
	 
	 
	 
	 
	 @When("I enter the {string} and {string} in the First name and second name fields")
	 public void i_enter_the_and_in_the_first_name_and_second_name_fields(String string, String string2) {
		 sendkeys(r.getFirstName(), string);
			sendkeys(r.getLastName(), string2);
			click(r.getNextbutton());
	 
	 }
	 @When("I click on the next button without filling the data in the company name field")
	 public void i_click_on_the_next_button_without_filling_the_data_in_the_company_name_field() {
		 click(r.getCompanyName());
			click(r.getNextbutton());
	 }
	 @Then("The application should show the Warning message in the company detail steps {string}")
	 public void the_application_should_show_the_warning_message_in_the_company_detail_steps(String string) {
		 Assert.assertEquals("Verify the warning message", string, r.getWarningmsg().getText());

	 }
	
	
	 
	 @When("I enter the {string} in the company name field")
	 public void i_enter_the_in_the_company_name_field(String string) {
		 sendkeys(r.getCompanyName(), string);
			click(r.getNextbutton());
	 }
	 @When("I enter {string} in the Password field")
	 public void i_enter_in_the_password_field(String string) {
		 sendkeys(r.getPassword(), string);
	 }
	 @When("I enter {string} in the Confirm Password field")
	 public void i_enter_in_the_confirm_password_field(String string) {
		 sendkeys(r.getConfirmPassword(), string);
	 }
	 @Then("the application should show the warning message in the password field {string}")
	 public void the_application_should_show_the_warning_message_in_the_password_field(String string) {
		 Assert.assertEquals("Verify the warning message", string, r.getWarningmsg().getText());

	 }
	 
	 
	 
	 @When("I click on the back button")
	 public void i_click_on_the_back_button() {
		 click(r.getBackbutton());
	 }
	 @Then("the application should navigate back to the Company profile")
	 public void the_application_should_navigate_back_to_the_company_profile() {
		 Assert.assertEquals("Verify the go back to previous steps", "Company Profile", r.getCompanyProfile().getText());

	 }
	
	
	
	
	

}
