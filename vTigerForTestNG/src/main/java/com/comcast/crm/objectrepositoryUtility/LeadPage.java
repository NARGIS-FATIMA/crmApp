package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
	WebDriver driver;
	public LeadPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createLeadIcon;
	@FindBy(name = "search_text")
	private WebElement searchField;
	@FindBy(name = "search_field")
	private WebElement searhIn;
	@FindBy(name = "submit")
	private WebElement searchBtn;
	public WebElement getCreateLeadIcon() {
		return createLeadIcon;
	}
	public WebElement getSearchField() {
		return searchField;
	}
	public WebElement getSearhIn() {
		return searhIn;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	

}
