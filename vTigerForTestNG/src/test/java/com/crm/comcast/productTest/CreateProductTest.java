package com.crm.comcast.productTest;

import java.io.IOException;
import org.testng.annotations.Test;
import com.comcast.crm.objectrepositoryUtility.CreatingNewProductPage;
import com.comcast.crm.objectrepositoryUtility.HomaPage;
import com.comcast.crm.objectrepositoryUtility.ProductInfoPage;
import com.comcast.crm.objectrepositoryUtility.ProductPage;

import com.crm.generic.baseUtility.BaseClass;

public class CreateProductTest extends BaseClass {
	@Test(groups = "smokeTest")
	public void createProductTest() throws Throwable, IOException {
		//Read test script data
		String proName = eLib.getStringDataFromExcel("product", 1, 2)+jLib.getRandomNumber();

		HomaPage hp = new HomaPage(driver);
		hp.getProdLink().click();
		ProductPage pp = new ProductPage(driver);
		pp.getCreateProductIcon().click();
		CreatingNewProductPage cpp = new CreatingNewProductPage(driver);
		cpp.createProduct(proName);
		ProductInfoPage pip = new ProductInfoPage(driver);
		String actProName = pip.getHeaderTxt().getText();
		if(actProName.contains(proName)) {
			System.out.println(proName+"is verified===Pass");
		}else {
			System.out.println(proName+"is not verified===FAIL");
		}
	}
	
	@Test(groups = {"smokeTest","RegressionTest"})
	public void createProductWithCategoryTest() throws Throwable, IOException {
		//Read test script data
		String proName = eLib.getStringDataFromExcel("product", 1, 2)+jLib.getRandomNumber();
		String proCat =eLib.getStringDataFromExcel("product", 4, 3);

		HomaPage hp = new HomaPage(driver);
		hp.getProdLink().click();
		ProductPage pp = new ProductPage(driver);
		pp.getCreateProductIcon().click();
		CreatingNewProductPage cpp = new CreatingNewProductPage(driver);
		cpp.creatProdWithCat(proName, proCat);
		ProductInfoPage pip = new ProductInfoPage(driver);
		String actProName = pip.getHeaderTxt().getText();
		if(actProName.contains(proName)) {
			System.out.println(proName+"is verified===Pass");
		}else {
			System.out.println(proName+"is not verified===FAIL");
		}
		String actCategory = pip.getProdCat().getText();
		if(actCategory.contains(proCat)) {
			System.out.println(proCat+"is verified===Pass");
		}else {
			System.out.println(proCat+"is not verified===FAIL");
		}
	}
	
	@Test(groups = {"smokeTest","RegressionTest"})
	public void createProductWithCategoryAndManufTest() throws Throwable {
		//Read test script data
		String proName = eLib.getStringDataFromExcel("product", 1, 2)+jLib.getRandomNumber();
		String proCat =eLib.getStringDataFromExcel("product", 4, 3);
		String manufact = eLib.getStringDataFromExcel("product",4,4);

		HomaPage hp = new HomaPage(driver);
		hp.getProdLink().click();
		ProductPage pp = new ProductPage(driver);
		pp.getCreateProductIcon().click();
		CreatingNewProductPage cpp = new CreatingNewProductPage(driver);
		cpp.creatProdWithCatAndManufac(proName, proCat, manufact);
		
		//verification
		ProductInfoPage pip = new ProductInfoPage(driver);
		String actProName = pip.getHeaderTxt().getText();
		if(actProName.contains(proName)) {
			System.out.println(proName+"is verified===Pass");
		}else {
			System.out.println(proName+"is not verified===FAIL");
		}
		String actCategory = pip.getProdCat().getText();
		if(actCategory.contains(proCat)) {
			System.out.println(proCat+"is verified===Pass");
		}else {
			System.out.println(proCat+"is not verified===FAIL");
		}
		String actManuf = pip.getManufVerif().getText();
		if(actManuf.contains(manufact)) {
			System.out.println(manufact+"is verified===Pass");
		}else {
			System.out.println(manufact+"is not verified===FAIL");
		}
	
	}

}
