package org.POM;

import java.util.List;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uploadfile extends Baseclass {
	public Uploadfile() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//tr[@class='border-bottom']//td//div)[1]")
	private WebElement project;
	
	@FindBy(xpath="//i[@class='bi bi-folder2']")
	private WebElement folder;
	
	@FindBy(xpath="//button[text()='Upload']")
	private List<WebElement> Uploadbtn;
	
	@FindBy(xpath="//div[@class='react-select__indicators css-1wy0on6']")
	private List<WebElement> dropdown;
	
	@FindBy(xpath="(//label[text()='Upload Files']//following::div//span)[1]")
	private WebElement Fileupload;
	
	@FindBy(xpath="//div[text()='Questionnaire']")
	private WebElement Questionnaire;
	
	@FindBy(xpath="//div[text()='Support Document']")
	private WebElement SupportDocument;
	
	@FindBy(xpath="//div[text()='Security']")
	private WebElement Security;
	
	@FindBy(xpath="//div[text()='Compliance']")
	private WebElement Compliance;
	
	@FindBy(xpath="//div[@role='status']")
	private WebElement status;
	
	

	public WebElement getStatus() {
		return status;
	}

	public WebElement getSecurity() {
		return Security;
	}

	public WebElement getCompliance() {
		return Compliance;
	}

	public WebElement getQuestionnaire() {
		return Questionnaire;
	}

	public WebElement getSupportDocument() {
		return SupportDocument;
	}

	public WebElement getProject() {
		return project;
	}

	public WebElement getFolder() {
		return folder;
	}

	public List<WebElement> getUploadbtn() {
		return Uploadbtn;
	}

	public List<WebElement> getDropdown() {
		return dropdown;
	}

	public WebElement getFileupload() {
		return Fileupload;
	}
	

	
}
