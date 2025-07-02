package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CreateNewCampaignPage {
	WebDriver driver;
	public CreateNewCampaignPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name = "campaignname")
	private WebElement campaignName;
	@FindBy(name = "assigned_user_id")
	private WebElement assignTo;
	@FindBy(name = "campaigntype")
	private WebElement campType;
	@FindBy(xpath = "product_name")
	private WebElement prodLookup;
	@FindBy(name = "closingdate")
	private WebElement closeDate;
	@FindBy(name = "button")
	private WebElement saveBtn;
	
	public WebElement getCampaignName() {
		return campaignName;
	}
	public WebElement getAssignTo() {
		return assignTo;
	}
	public WebElement getCampType() {
		return campType;
	}
	public WebElement getProdLookup() {
		return prodLookup;
	}
	public WebElement getCloseDate() {
		return closeDate;
	}
	
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void createCampaign(String campName,String assign, String EndDate) {
		campaignName.sendKeys(campName);
		Select sel=new Select(assignTo);
		sel.selectByVisibleText(assign);
		closeDate.clear();
		closeDate.sendKeys(EndDate);
		saveBtn.click();
	}
	public void createCampaignWithoutDate(String campName,String assign) {
		campaignName.sendKeys(campName);
		Select sel=new Select(assignTo);
		sel.selectByVisibleText(assign);
		saveBtn.click();
	}
	
	
	
}
