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
import com.qa.pages.SaleCreatedPage;


public class SaleCreatedTest extends Testbase {
	

	HomePage homepage;
	AddressDetails addressDetails;
	PopUpPage popupPage;	
	AddOnsPage addOnPage;
	BasicInfoPage basicInfoPage;
	ConnectionAddress connectionAddress;
	OtpPage otpPage;
	SaleCreatedPage saleCreatedPage;

	public SaleCreatedTest()
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
		   saleCreatedPage= new SaleCreatedPage();
		   addressDetails= homepage.validateEnterAddress();
		   popupPage= addressDetails.validateFullJourney();
		   popupPage= popupPage.validateCredentials();			   
		   addOnPage= popupPage.validateCheckPlan();	
		   addOnPage= popupPage.validateApplyButton();
		   basicInfoPage= addOnPage.validateFullJourney();
		   connectionAddress= basicInfoPage.validateAllSectionBasicInfoPage();	  
		   otpPage= connectionAddress.validateAllSectionConnectionAddressPage();
		   saleCreatedPage= otpPage.validateFullJourney();
		 
	   }
	
	
	@Test(priority=1)
	public void validateYourDetailsTest() throws Throwable
	{
		
		saleCreatedPage.validateFulljourney();
		
		
	  
	}
	
		
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
