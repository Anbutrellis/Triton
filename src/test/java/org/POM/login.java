package org.POM;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends Baseclass {
public login() {
	PageFactory.initElements(driver, this);
}
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement login;
	
	@FindBy(xpath="//span[text()='Admin Triton']")
	private WebElement username;
	
	@FindBy(xpath="//div[@role='status']")
	private WebElement popup;
	
	@FindBy(xpath="//div[@class='invalid-feedback d-block']")
	private WebElement warning;
	
	

	public WebElement getWarning() {
		return warning;
	}

	public WebElement getPopup() {
		return popup;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getUsername() {
		return username;
	}
	
	
	












}
