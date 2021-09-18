package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.AddressDetails;
import com.qa.pages.HomePage;
import com.qa.pages.PopUpPage;

public class AddressDetailsTest extends Testbase {
	
	HomePage homepage;
	AddressDetails addressDetails;
	PopUpPage popUpPage;
	
	public  AddressDetailsTest() {
			
		super();
		
	}
	
	@BeforeMethod
   public void setup() throws Throwable
   {
	   initialization();
	   homepage= new HomePage();
	   addressDetails = new AddressDetails();
	   addressDetails=homepage.validateEnterAddress();
   }
	
	
	@Test(enabled = false)
	public void validateRibbonTest() throws Throwable
	{
		addressDetails.validateRibbon();
	}
	
	@Test(enabled = false)
	public void validateSpecialNoteTest() throws Throwable
	{
		addressDetails.validateSpecialNote();
	}
	
	@Test(priority = 1)
	public void validateNextButtonTest() throws Throwable
	{
		popUpPage= addressDetails.validateFullJourney();
	}
	
	@Test(enabled = false)
	public void validateSelectDateTest() throws Throwable
	{
		addressDetails.validateSelectDate();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
     	

}
