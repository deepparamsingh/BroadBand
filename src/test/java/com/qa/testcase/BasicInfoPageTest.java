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
import com.qa.pages.PopUpPage;

public class BasicInfoPageTest extends Testbase {

	HomePage homepage;
	AddressDetails addressDetails;
	PopUpPage popupPage;	
	AddOnsPage addOnPage;
	BasicInfoPage basicInfoPage;
	ConnectionAddress connectionAddress;
	PopUpPageTest popUpPageTest;
	

	public BasicInfoPageTest()
	{
		super();
	}
	
	@BeforeMethod
	   public void setup() throws Throwable
	   {
		   initialization();
		   homepage= new HomePage();
		   popupPage = new PopUpPage();
		   addOnPage = new AddOnsPage();
		   basicInfoPage = new BasicInfoPage();
		   connectionAddress = new ConnectionAddress();
		   addressDetails= homepage.validateEnterAddress();
		   popupPage= addressDetails.validateFullJourney();
		  // popUpPageTest.validateCheckPlanTest();
		   popupPage= popupPage.validateCredentials();
		   try{
			   addOnPage= popupPage.validateCheckPlanSpecial();			   
		   }catch (Exception e) 
		   {			   
			   addOnPage= popupPage.validateCheckPlan();
		   }		   
		   addOnPage= popupPage.validateApplyButton();
		   basicInfoPage= addOnPage.validateFullJourney();
		   	   
		 
	   }
	
	@Test(enabled = false)
	public void validateAddOntitleTest() throws Throwable
	{
		addOnPage.validateAddOntitle();
		
	}
	@Test(enabled = false)
	public void validateErrorMessagesTest() throws Throwable
	{
		basicInfoPage.validateErrorMessages();
		
	}
	
	@Test(enabled = false)
	public void validateYourDetailsSectionTest() throws Throwable
	{
		basicInfoPage.validateYourDetailsSection();
		
	}
	
	@Test(enabled = false)
	public void validateconnectionDetailsSectionTest() throws Throwable
	{
		basicInfoPage.validateconnectionDetailsSection();
		
	}
	
	@Test(enabled = false)
	public void validateIdentificationDetailsSectionTest() throws Throwable
	{
		basicInfoPage.validateIdentificationDetailsSection();
		
	}
	
	@Test(enabled = false)
	public void validateAllSectionTest() throws Throwable
	{
		connectionAddress=basicInfoPage.validateAllSectionBasicInfoPage();
		
	}
	
	@Test(priority = 1)
	public void validatevalidationmessagesTest() throws Throwable
	{
		connectionAddress=basicInfoPage.validateAllsectionEmptyErrorValidation();
		
	}
	
	
			
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
}
