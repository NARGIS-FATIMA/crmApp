package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	WebDriver driver;
	public ContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createNewContactBtn;
	
	@FindBy(name = "search_text")
	private WebElement searchField;
	
	@FindBy(name = "search_field")
	private WebElement searchInField;
	
	@FindBy(name = "submit")
	private WebElement searchBtn;
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateNewContactBtn() {
		return createNewContactBtn;
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSearchInField() {
		return searchInField;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	

}
