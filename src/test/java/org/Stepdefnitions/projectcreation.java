package org.Stepdefnitions;

import org.POM.Projectcreation;
import org.POM.login;
import org.Uttility.Baseclass;
import org.junit.Assert;

import io.cucumber.java.en.*;

public class projectcreation extends Baseclass {
		login l = new login();
		Projectcreation p = new Projectcreation();
	
	@Given("I am logged in to the Application")
	public void i_am_logged_in_to_the_application() {
		url(Getdata("url"));
		sendkeys(l.getEmail(), Getdata("busemail"));
		sendkeys(l.getPassword(), Getdata("password"));
		click(l.getLogin());
		click(l.getUsername());
		time(2000);
		Assert.assertEquals("Verify the user", Getdata("companyname"), l.getUsername().getText());
		   

	}
	@When("I navigate to the {string} page")
	public void i_navigate_to_the_page(String string) {
		click(p.getProjectmenu());
		click(p.getNewproject());

	}
	@When("I fill in the project details:")
	public void i_fill_in_the_project_details() {
		sendkeys(p.getProjectname(), Getdata("projectname"));
		sendkeys(p.getDescription(), Getdata("description"));
		click(p.getDate());
		click(p.getDateselect());
		click(p.getAssignedtotab());
		click(p.getAssignedto());
		

	}
	@When("I click the Create button")
	public void i_click_the_create_button() {

		click(p.getSavebtn());

	}
	@Then("I should see a success message confirming the project creation")
	public void i_should_see_a_success_message_confirming_the_project_creation() {
		Assert.assertNotEquals("Verify the Project Sucessfully created message", "Project has been created successfully.", l.getPopup().getText());

	}
	@Then("the new project should appear in my project list")
	public void the_new_project_should_appear_in_my_project_list() {
		Assert.assertNotEquals("Verify the Project name in the project list", Getdata("projectname"), p.getVerifyproject().getText());
		

	}
	
	
	@When("I click on the {string} option in the side menu")
	public void i_click_on_the_option_in_the_side_menu(String string) {
		click(p.getProjectmenu());
	}
	@Then("I should see a message indicating {string}")
	public void i_should_see_a_message_indicating(String string) {
		Assert.assertNotEquals("Verify the No projects available Message","No Records Found", p.getVerifyprojectsection().getText());
		
	}

	
	
	
	
	@When("I click the Cancel button")
	public void i_click_the_cancel_button() {
		click(p.getCancelbtn());
	}

	
	
	
	@Then("I should be redirected to the project dashboard")
	public void i_should_be_redirected_to_the_project_dashboard() {
		//Assert.assertNotEquals("Verify redirected to the project dashboard", "Projects", p.getProjectpage().getText());

	}
	
}

