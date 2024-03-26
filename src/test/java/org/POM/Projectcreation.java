package org.POM;

import java.util.List;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Projectcreation extends Baseclass {
	public Projectcreation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/project/project-list']")
	private WebElement projectmenu;
	
	@FindBy(xpath="//span[@class='d-flex align-items-center']")
	private WebElement newproject;
	
	@FindBy(xpath="(//label[text()='Project Name ']//following::input)[1]")
	private WebElement projectname;
	
	@FindBy(name="description")
	private WebElement description;
	
	@FindBy(xpath="(//i[@class='bi-calendar-check calendar-input-icon text-muted border-start'])[4]")
	private WebElement date;
	
	@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--022 react-datepicker__day--keyboard-selected react-datepicker__day--today']")
	private WebElement dateselect;
	
	@FindBy(xpath="//div[text()='QA 002']")
	private WebElement assignedto;
	
	@FindBy(xpath="(//div[@class='react-select__indicators css-1wy0on6'])[4]")
	private WebElement assignedtotab;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement savebtn;
	
	@FindBy(xpath="//div[@class='invalid-feedback d-block']")
	private WebElement warningmessage;
	
	@FindBy(xpath="(//div[@class='project-table-height custom-scrollbar']//td[2]//div)[1]")
	private WebElement verifyproject;
	
	@FindBy(xpath="//h4[@class='page-title m-0']")
	private WebElement projectpage;
	
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement cancelbtn;
	
	@FindBy(xpath="//h6[@class='text-center w-100 py-2 bg-white']")
	private WebElement verifyprojectsection;
	
	
	
	

	public WebElement getVerifyprojectsection() {
		return verifyprojectsection;
	}

	public WebElement getDateselect() {
		return dateselect;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public WebElement getProjectpage() {
		return projectpage;
	}

	public WebElement getVerifyproject() {
		return verifyproject;
	}

	

	public void setNewproject(WebElement newproject) {
		this.newproject = newproject;
	}

	public void setProjectname(WebElement projectname) {
		this.projectname = projectname;
	}

	public void setDescription(WebElement description) {
		this.description = description;
	}

	public void setDate(WebElement date) {
		this.date = date;
	}

	public void setAssignedto(WebElement assignedto) {
		this.assignedto = assignedto;
	}

	public void setAssignedtotab(WebElement assignedtotab) {
		this.assignedtotab = assignedtotab;
	}

	public void setSavebtn(WebElement savebtn) {
		this.savebtn = savebtn;
	}

	public void setWarningmessage(WebElement warningmessage) {
		this.warningmessage = warningmessage;
	}

	public void setVerifyproject(WebElement verifyproject) {
		this.verifyproject = verifyproject;
	}

	public WebElement getProjectmenu() {
		return projectmenu;
	}

	public WebElement getNewproject() {
		return newproject;
	}

	public WebElement getProjectname() {
		return projectname;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getAssignedto() {
		return assignedto;
	}

	public WebElement getAssignedtotab() {
		return assignedtotab;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getWarningmessage() {
		return warningmessage;
	}
	
	
	
	

}
