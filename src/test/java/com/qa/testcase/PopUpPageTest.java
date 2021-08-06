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
	PopUpPage popupPage;
	AddressDetails addressDetails;
	

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
		   addressDetails= homepage.validateEnterAddress();
		   popupPage= addressDetails.validateNextButton();
		   
		 
	   }
	
	@Test(enabled = false)
	public void validateValidationsTest() throws Throwable
	{
		popupPage.validateValidations();
		
	}
	
	@Test(enabled = false)
	public void validateCredentialsTest() throws Throwable
	{
		popupPage.validateCredentials();
		
	}
	
	@Test(enabled = false)
	public void validateWrongCredentialsTest() throws Throwable
	{
		popupPage.validateWrongCredentials();
		
	}

	@Test(priority = 1)
	public void validateTopBarFeaturesTest() throws Throwable
	{
		popupPage.validateTopBarFeatures();
		
	}
			
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
}
