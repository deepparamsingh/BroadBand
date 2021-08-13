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


public class OtpTest extends Testbase {
	

	HomePage homepage;
	AddressDetails addressDetails;
	PopUpPage popupPage;	
	AddOnsPage addOnPage;
	BasicInfoPage basicInfoPage;
	ConnectionAddress connectionAddress;
	OtpPage otpPage;
	SaleCreatedPage saleCreatedPage;
	

	public OtpTest()
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
		   popupPage= addressDetails.validateNextButton();
		   popupPage= popupPage.validateCredentials();
		   addOnPage= popupPage.validateApplyButton();
		   basicInfoPage= addOnPage.validateIdentificationButton();
		   connectionAddress= basicInfoPage.validateEmploymentdetailsSection();	  
		   otpPage= connectionAddress.validateDebitcardSection();
		 
	   }
	
	@Test(priority = 1)
	public void validateOTPTest() throws Throwable
	{
		otpPage.validateOTPpageContent();
		otpPage.validateCheckBox();
		otpPage.validateOtp();
		saleCreatedPage= otpPage.validateSubmitSale();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
