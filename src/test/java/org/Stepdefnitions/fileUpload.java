package org.Stepdefnitions;

import java.time.Duration;

import org.POM.Projectcreation;
import org.POM.Uploadfile;
import org.POM.login;
import org.Uttility.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	sendkeys(l.getEmail(), Getdata("busmail"));
	sendkeys(l.getPassword(), Getdata("password"));
	click(l.getLogin());
	click(l.getUsername());
	time(2000);
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
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='file']"))).sendKeys("C:\\\\Users\\\\Admin1\\\\Documents\\\\Triton\\\\06. Sample documents\\\\PRIDE.xlsx");
	//sendkeys(u.getFileupload(), "C:\\Users\\Admin1\\Documents\\Triton\\06. Sample documents\\PRIDE.xlsx");
	click(u.getUploadbtn().get(1));

}
@Then("I should see a confirmation popup message indicating successful upload")
public void i_should_see_a_confirmation_popup_message_indicating_successful_upload() {
	Assert.assertEquals("Verify the documents is successfully upload", "Document uploaded successfully. You will receive a notification once the AI processing is completed.",l.getPopup().getText() );
}




@When("I upload an unsupported document")
public void i_upload_an_unsupported_document() {
	click(u.getUploadbtn().get(0));
	click(u.getDropdown().get(0));
	click(u.getQuestionnaire());
	click(u.getDropdown().get(1));
	click(u.getCompliance());
	sendkeys(u.getFileupload(), "/Triton_project/src/test/resources/Documents/Aero Paints Risk Management Policy.docx");
	click(u.getUploadbtn().get(1));

}
@Then("I should see a warning popup message indicating {string}")
public void i_should_see_a_warning_popup_message_indicating(String string) {
	Assert.assertEquals("Verify the Warrning message", "Files, Unsupported file extension.",l.getPopup().getText() );


}







}
