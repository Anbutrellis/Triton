package org.Stepdefnitions;

import static org.junit.Assert.assertEquals;

import org.POM.clientinvite;
import org.POM.login;
import org.Uttility.Baseclass;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Inviteclient extends Baseclass {
	
	login l = new login();
	clientinvite c = new clientinvite();
	
	
	
	@Given("the user has logged in with Admin credentials.")
	public void the_user_has_logged_in_with_admin_credentials() {
		url(Getdata("url"));
		sendkeys(l.getEmail(), Getdata("adminuser"));
		sendkeys(l.getPassword(), Getdata("adminpwd"));
		click(l.getLogin());
		

	}
	@When("the user clicks on the {string} button.")
	public void the_user_clicks_on_the_button(String string) {
		Assert.assertEquals("Verify the role", "Admin Triton", l.getUsername().getText());
		click(c.getInviteclientbtn());
		

	}
	@When("the user enters the Email ID of the client.")
	public void the_user_enters_the_email_id_of_the_client() {
		sendkeys(c.getBusinessemail(),Getdata("busemail"));
		click(c.getInvitebtn());

	}
	@Then("the user verifies whether the client is invited or not.")
	public void the_user_verifies_whether_the_client_is_invited_or_not() {
		refresh();
		Assert.assertEquals("Verify whether the client is invited or not", ""+Getdata("busemail")+"", c.getTableemailid().getText());

	}
	
	
	
	
	
	@When("the user enters the invalid Email ID of the client.")
	public void the_user_enters_the_invalid_email_id_of_the_client() {
		sendkeys(c.getBusinessemail(), Getdata("invalidemail"));
		click(c.getTitle());
	}
	@Then("the user verifies the Warning message {string}")
	public void the_user_verifies_the_warning_message(String string) {
		
		Assert.assertEquals("Verify the Warning message ", string, l.getWarning().getText());
		
	}
	
	

}
