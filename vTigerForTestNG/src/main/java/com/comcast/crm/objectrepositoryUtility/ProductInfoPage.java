package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPage {
	WebDriver driver;
	public ProductInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement headerTxt;
	@FindBy(id = "mouseArea_Product Category")
	private WebElement prodCat;
	@FindBy(id = "dtlview_Manufacturer")
	private WebElement manufVerif;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getHeaderTxt() {
		return headerTxt;
	}
	public WebElement getProdCat() {
		return prodCat;
	}
	public WebElement getManufVerif() {
		return manufVerif;
	}
	

}
