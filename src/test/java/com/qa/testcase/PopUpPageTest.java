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

public class PopUpPageTest extends Testbase {
	
	
	HomePage homepage;
	AddressDetails addressDetails;
	PopUpPage popupPage;	
	AddOnsPage addOnPage;
	

	public PopUpPageTest()
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
		   
		 
	   }
	
	@Test(priority = 6)
	public void validateValidationsTest() throws Throwable
	{
		popupPage.validateValidations();
		
	}
	
	@Test(priority = 7)
	public void validateCredentialsTest() throws Throwable
	{
		popupPage.validateCredentials();
		
	}
	
	@Test(priority = 8)
	public void validateWrongCredentialsTest() throws Throwable
	{
		popupPage.validateWrongCredentials();
		
	}

	@Test(enabled = false)
	public void validateTopBarFeaturesTest() throws Throwable
	{
		popupPage.validateTopBarFeatures();
		
	}
	
//	@Test(priority = 1)
//	public void validateCheckPlanTest() throws Throwable
//	{
//		popupPage.validateCredentials();
//		try {			
//			popupPage.validateCheckPlanSpecial();
//			addOnPage= popupPage.validateApplyButton();
//		}catch (Exception e) {
//			// TODO: handle exception
//			popupPage.validateCheckPlan();
//			addOnPage= popupPage.validateApplyButton();			
//		}	
//	}
	
	@Test(priority = 9)
	public void validateCheckPlanTest() throws Throwable
	{
		addOnPage = popupPage.fullJourney();
	}
	
	
			
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
}
