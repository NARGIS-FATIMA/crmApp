package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {
	WebDriver driver;
	public ContactInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement headerText;
	@FindBy(id = "dtlview_Support Start Date")
	private WebElement getStartDate;
	@FindBy(id="dtlview_Support End Date")
	private WebElement getEndDate;
	
	public WebElement getHeaderText() {
		return headerText;
	}

	public WebElement getGetStartDate() {
		return getStartDate;
	}

	public WebElement getGetEndDate() {
		return getEndDate;
	}
	
	
	

}
