package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.AddOnsPage;
import com.qa.pages.AddressDetails;
import com.qa.pages.BasicInfoPage;
import com.qa.pages.ConnectionAddress;
import com.qa.pages.HomePage;
import com.qa.pages.OtpPage;
import com.qa.pages.PopUpPage;

public class ConnectionAddressTest extends Testbase {
	
	HomePage homepage;
	AddressDetails addressDetails;
	PopUpPage popupPage;	
	AddOnsPage addOnPage;
	BasicInfoPage basicInfoPage;
	ConnectionAddress connectionAddress;
	OtpPage otpPage;
	

	public ConnectionAddressTest()
	{
		super();
	}
	
	@BeforeMethod
	   public void setup() throws Throwable
	   {
		   initialization();
		   homepage= new HomePage();
		   addressDetails = new AddressDetails();
		   popupPage = new PopUpPage();
		   addOnPage = new AddOnsPage();
		   basicInfoPage = new BasicInfoPage();
		   connectionAddress = new ConnectionAddress();
		   otpPage= new OtpPage();
		   addressDetails= homepage.validateEnterAddress();
		   popupPage= addressDetails.validateFullJourney();
		   popupPage= popupPage.validateCredentials();
		   try{
			   addOnPage= popupPage.validateCheckPlanSpecial();			   
		   }catch (Exception e) 
		   {			   
			   addOnPage= popupPage.validateCheckPlan();
		   }	
		   addOnPage= popupPage.validateApplyButton();
		   basicInfoPage= addOnPage.validateIdentificationButton();
		   connectionAddress= basicInfoPage.validateAllSectionBasicInfoPage();	   	   
		 
	   }
	
	@Test(enabled = false)
	public void validateConnectionDetailsSectionTest() throws Throwable
	{
		connectionAddress.validateConnectionDetailsSection();
		
	}
	
	@Test(priority = 1)
	public void validateBillingdeliveryAddressTest() throws Throwable
	{
		otpPage=connectionAddress.validateAllSectionConnectionAddressPage();
		
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
	

}
