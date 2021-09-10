package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.Testbase;
import com.qa.pages.AddOnsPage;
import com.qa.pages.AddressDetails;
import com.qa.pages.BasicInfoPage;
import com.qa.pages.HomePage;
import com.qa.pages.PopUpPage;


public class AddOnPageTest extends Testbase {
	

	HomePage homepage;
	AddressDetails addressDetails;
	PopUpPage popupPage;	
	AddOnsPage addOnPage;
	BasicInfoPage basicInfoPage;
	

	public AddOnPageTest()
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
		   addressDetails= homepage.validateEnterAddress();
		   popupPage= addressDetails.validateFullJourney();
		   popupPage= popupPage.validateCredentials();
		   addOnPage= popupPage.validateCheckPlan();		   	
		   addOnPage= popupPage.validateApplyButton();
		   
		 
	   }
	
	@Test(enabled = false)
	public void validateAddOntitleTest() throws Throwable
	{
		addOnPage.validateAddOntitle();
		
	}


	@Test(priority = 1)
	public void validateFullJourneyTest() throws Throwable
	{
	
		basicInfoPage=addOnPage.validateFullJourney();
		
	}
	
	
	
			
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}

}
