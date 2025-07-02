package com.crm.comcast.orgTest;

import java.io.IOException;
import org.testng.annotations.Test;
import com.comcast.crm.objectrepositoryUtility.CreateNewOrganizationPage;
import com.comcast.crm.objectrepositoryUtility.HomaPage;
import com.comcast.crm.objectrepositoryUtility.OrganizationInfoPage;
import com.comcast.crm.objectrepositoryUtility.OrganizationsPage;
import com.crm.generic.baseUtility.BaseClass;

public class CreateOrgTest extends BaseClass {
	@Test(groups = "smokeTest")
	public void createOrganizationTest() throws Throwable, IOException {

		String orgName = eLib.getStringDataFromExcel("Org", 1, 2)+jLib.getRandomNumber();

		//step1: Login to App
		HomaPage hp = new HomaPage(driver);
		hp.getOrgLink().click();
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewORgBtn().click();
		CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
		cop.createOrg(orgName);
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actOrgName = oip.getHeaderMsg().getText();
		if(actOrgName.contains(orgName)) {
			System.out.println(orgName+"is verified===Pass");
		}else {
			System.out.println(orgName+"is not verified===FAIL");
		}	
	}
	
	@Test(groups = "RegressionTest")
	public void createOrganizationWithIndustry() throws Throwable, IOException {
		//Read test script data
		String orgName = eLib.getStringDataFromExcel("Org", 1, 2)+jLib.getRandomNumber();
		String industry = eLib.getStringDataFromExcel("Org", 4, 3);
		String type = eLib.getStringDataFromExcel("Org",4,4);
		//step2 : navigate to organization
		HomaPage hp = new HomaPage(driver);
		hp.getOrgLink().click();
		//step 3: click on create organization Button
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewORgBtn().click();
		//step 4: enter all the details and create new organization
		CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
		cop.createOrgWithIndusAndType(orgName, industry, type);
		Thread.sleep(2000);
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actOrgName = oip.getHeaderMsg().getText();
		if(actOrgName.contains(orgName)) {
			System.out.println(orgName+"is verified===Pass");
		}else {
			System.out.println(orgName+"is not verified===FAIL");
		}
		String actIndust = oip.getIndustryText().getText();
		if(actIndust.equals(industry)) {
			System.out.println(industry+"is verified====PASS");
		}
		else {
			System.out.println(industry+"is not verified====FAIL");
		}
		String actType = oip.getTypeText().getText();
		if(actType.equals(type)) {
			System.out.println(type+"is verified===PASS");
		}
		else {
			System.out.println(type+"is not verified===FAIL");
		}
		
	}
	
	@Test(groups = "RegressionTest")
	public void createOrganizationWithPhoneNumber() throws Throwable, IOException {
		//Read test script data
		String orgName = eLib.getStringDataFromExcel("Org", 1, 2)+jLib.getRandomNumber();
		String phno = eLib.getStringDataFromExcel("Org", 7, 3);

		HomaPage hp = new HomaPage(driver);
		hp.getOrgLink().click();
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewORgBtn().click();
		CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
		cop.createOrgWithPno(orgName, phno);
		//cop.getSaveBtnElement().click();
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actOrgName = oip.getHeaderMsg().getText();
		if(actOrgName.contains(orgName)) {
			System.out.println(orgName+"is verified===Pass");
		}else {
			System.out.println(orgName+"is not verified===FAIL");
		}
		String actPhno = oip.getPhoneNumer().getText();
		if(actPhno.contains(phno)) {
			System.out.println(phno+"is verified===Pass");
		}else {
			System.out.println(phno+"is not verified===FAIL");
		}
	
	}



}
