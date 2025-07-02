package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VendorsWindowPage {
	WebDriver driver;
	public VendorsWindowPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "search_txt")
	private WebElement searchFieldElement;
	@FindBy(name = "search_field")
	private WebElement serchInField;
	@FindBy(name = "search")
	private WebElement searchbtn;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSearchFieldElement() {
		return searchFieldElement;
	}
	public WebElement getSerchInField() {
		return serchInField;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	public void passSearchData(String proName,String SearchIn) {
		searchFieldElement.sendKeys(proName);
		Select sel = new Select(serchInField);
		sel.selectByVisibleText(SearchIn);
		searchbtn.click();

}
}
