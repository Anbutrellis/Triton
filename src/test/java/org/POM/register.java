package org.POM;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class register extends Baseclass {
public register() {
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//label[text()='First Name ']//following::input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextbutton;
	
	@FindBy(name="companyName")
	private WebElement companyName;
	
	@FindBy(xpath="//button[text()='Back']")
	private WebElement backbutton;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//tr[@class='ng-scope']")
	private WebElement email;
	
	@FindBy(name="search")
	private WebElement searchemail;
	
	@FindBy(xpath="//button[text()='GO']")
	private WebElement gobutton;
	
	@FindBy(xpath="//a[@rel='nofollow']")
	private WebElement InvitationURL;

	@FindBy(xpath="//div[@role='status']")
	private WebElement status;
	
	@FindBy(xpath="//div[@class='invalid-feedback d-block']")
	private WebElement warningmsg;
	
	@FindBy(xpath="//span[text()='Company Profile']")
	private WebElement CompanyProfile;
	
	@FindBy(id="html_msg_body")
	private WebElement frame;
	
	@FindBy(xpath="//label[text()='Confirm Password ']")
	private WebElement click;
	
	
	
	public WebElement getClick() {
		return click;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getCompanyProfile() {
		return CompanyProfile;
	}

	public WebElement getWarningmsg() {
		return warningmsg;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getSearchemail() {
		return searchemail;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getNextbutton() {
		return nextbutton;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getBackbutton() {
		return backbutton;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getEmail() {
		return email;
	}


	public WebElement getGobutton() {
		return gobutton;
	}

	public WebElement getInvitationURL() {
		return InvitationURL;
	}
	
	












}
