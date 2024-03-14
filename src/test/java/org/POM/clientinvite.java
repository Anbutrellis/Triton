package org.POM;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clientinvite extends Baseclass {
	public clientinvite() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='text-end ms-2']")
	private WebElement role;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement inviteclientbtn;

	@FindBy(name = "business_email")
	private WebElement businessemail;

	@FindBy(xpath = "//button[text()='Invite']")
	private WebElement invitebtn;

	@FindBy(xpath="//table[@responsivedata-testid='tableRecord']//tr[1]/td[2]")
	private WebElement tableemailid;
	
	@FindBy(xpath="//h4[@class='modal-title']")
	private WebElement title;
	
	
	
	public WebElement getTitle() {
		return title;
	}

	public WebElement getTableemailid() {
		return tableemailid;
	}

	public WebElement getRole() {
		return role;
	}

	public WebElement getInviteclientbtn() {
		return inviteclientbtn;
	}

	public WebElement getBusinessemail() {
		return businessemail;
	}

	public WebElement getInvitebtn() {
		return invitebtn;
	}

}
