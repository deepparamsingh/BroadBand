package com.qa.testcase;

import static org.testng.Assert.fail;

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
		   addOnPage= popupPage.validateCheckPlan();	
		   addOnPage= popupPage.validateApplyButton();
		   basicInfoPage= addOnPage.validateFullJourney();
		   connectionAddress= basicInfoPage.validateAllSectionBasicInfoPage();	   	   
		 
	   }
	
	@Test(enabled = false)
	public void validateConnectionDetailsSectionTest() throws Throwable
	{
		connectionAddress.validateConnectionDetailsSection();
		
	}
	
	@Test(enabled = false)
	public void validateBillingdeliveryAddressTest() throws Throwable
	{
		connectionAddress.validateAllSectionConnectionAddressPage();
		
	}
	@Test(enabled = false)
	public void validateEmptyValidationMessageConnectionAddressPageTest() throws Throwable 
	{
		otpPage=connectionAddress.validateEmptyValidationMessageConnectionAddressPage();
		
	}
	
	@Test(priority = 1)
	public void validateAllSectionConnectionAddressPageTest() throws Throwable
	{
		otpPage=connectionAddress.validateAllSectionConnectionAddressPage();
		
	}
	
	@Test(enabled = false)
	public void validateConnectionDeliverDateTest() throws Throwable
	{
		connectionAddress.validateConnectionDeliverDate();
		
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
	
	

}
