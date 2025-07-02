package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class CreateNewOpportunity {
	WebDriver driver;
	public CreateNewOpportunity(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
    @FindBy(name = "potentialname")
    private WebElement poteName;
    @FindBy(id = "related_to_type")
    private WebElement relatedTo;
    @FindBy(xpath = "//input[@id='related_to_display']/following-sibling::img")
    private WebElement relatedPlusIcon;
    @FindBy(name = "assigned_user_id")
    private WebElement assignedTo;
    @FindBy(xpath = "//input[@name='campaignid']/following-sibling::img")
    private WebElement campaignIcon;
    @FindBy(name = "closingdate")
    private WebElement closingDate;
    @FindBy(name = "sales_stage")
    private WebElement salesStage;
    @FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
    
    
	public WebElement getPoteName() {
		return poteName;
	}
	public WebElement getRelatedTo() {
		return relatedTo;
	}
	public WebElement getRelatedPlusIcon() {
		return relatedPlusIcon;
	}
	public WebElement getAssignedTo() {
		return assignedTo;
	}
	public WebElement getCampaignIcon() {
		return campaignIcon;
	}
	public WebElement getClosingDate() {
		return closingDate;
	}
	public WebElement getSalesStage() {
		return salesStage;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
    
    
}
