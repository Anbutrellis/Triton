package org.Stepdefnitions;

import org.POM.Projectcreation;
import org.POM.Uploadfile;
import org.POM.login;
import org.Uttility.Baseclass;
import org.junit.Assert;

import io.cucumber.java.en.*;

public class fileUpload extends Baseclass  {
	login l = new login();
	Projectcreation p = new Projectcreation();
	Uploadfile u=new Uploadfile();

@Given("I am on the login page")
public void i_am_on_the_login_page() {
	url(Getdata("url"));
}
@When("I log in as a client")
public void i_log_in_as_a_client() {
	sendkeys(l.getEmail(), Getdata("busemail"));
	sendkeys(l.getPassword(), Getdata("password"));
	click(l.getLogin());
	click(l.getUsername());
	time(2000);
	Assert.assertEquals("Verify the user", Getdata("companyname"), l.getUsername().getText());
}
@When("I click on a project")
public void i_click_on_a_project() {
	click(p.getProjectmenu());
	click(u.getProject());

}
@When("I click on the folder section")
public void i_click_on_the_folder_section() {
	click(u.getFolder());

}
@When("I upload a document")
public void i_upload_a_document() {
	click(u.getUploadbtn().get(0));
	click(u.getDropdown().get(0));
	click(u.getQuestionnaire());
	click(u.getDropdown().get(1));
	click(u.getCompliance());
	sendkeys(u.getFileupload(), "C:\\Users\\Admin1\\Documents\\GitHub\\Triton\\src\\test\\resources\\Documents\\Aero Paints Questionnaire.xlsx");
	click(u.getUploadbtn().get(1));

}
@Then("I should see a confirmation popup message indicating successful upload")
public void i_should_see_a_confirmation_popup_message_indicating_successful_upload() {
	Assert.assertEquals("Verify the documents is successfully upload", "Document uploaded successfully. You will receive a notification once the AI processing is completed.",l.getPopup().getText() );
}







}
