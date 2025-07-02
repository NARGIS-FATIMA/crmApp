package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	WebDriver driver;
	public OrganizationsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createNewORgBtn;
	
	@FindBy(name = "search_text")
	private WebElement searchEdit;
	
	@FindBy(name = "search_field")
	private WebElement serachDb;
	
	@FindBy(name = "submit")  
	private WebElement searchBtn;

	public WebElement getSearchEdit() {
		return searchEdit;
	}

	public WebElement getSerachDb() {
		return serachDb;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getCreateNewORgBtn() {
		return createNewORgBtn;
	}
	
	

}
