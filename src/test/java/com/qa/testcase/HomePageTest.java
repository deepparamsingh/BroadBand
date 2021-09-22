package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.Testbase;
import com.qa.pages.AddressDetails;
import com.qa.pages.HomePage;

public class HomePageTest extends Testbase {

  
	HomePage homepage;
	AddressDetails addressDetails;
	public  HomePageTest() {
			
		super();
		
	}
	
	@BeforeMethod
   public void setup()
   {
	   initialization();
	   homepage= new HomePage();
   }
   
//	@Test(enabled=false)
//	public void homePageTitleTest()
//	{
//    String HomePageTitle=homepage.validateHomePageTitle();
//    System.out.println("Title of Homme Page is :"+HomePageTitle);
//	}
//	
//	@Test(enabled=false)
//	public void validateBroadbandButtonTest()
//	{
//		boolean broad_flag=homepage.validateBroadbandButton();
//		Assert.assertTrue(broad_flag);
//	}
//	
//	@Test(enabled=false)
//	public void validatePhoneNumberTest()
//	{
//		String phone=homepage.validatePhone();
//		Assert.assertEquals(phone, "0420580919");
//	}
	
	@Test(enabled=false)
	public void validateHomePageTitleTest() throws Throwable
	{
		homepage.validateHomePageTitle();
//		String basicInfoTitle=driver.getCurrentUrl();
//		System.out.println("title---->"+ basicInfoTitle);
		
	}
	
	@Test(enabled=false)
	public void validateh1HeadingTest()
	{
		homepage.validateh1Heading();
	}
	
	@Test(enabled=false)
	public void validateBeowh1HeadingTest()
	{
		homepage.validateBelowh1Heading();
	}
	
	
	@Test(enabled=false)
	public void validateNavBarTest()
	{
		homepage.validateNavBar();
	}
	
	@Test(enabled=false)
	public void validatehomePageImageTest()
	{
		homepage.validatehomePageImage();
		
	}
	

	@Test(enabled=false)
	public void validatehomeLOGOTest()
	{
		homepage.validatehomeLOGO();
		
	}
	
	@Test(enabled=false)
	public void validateEmptyAddressTest()
	{
		homepage.validateEmptyAddress();
		
	}
	
	@Test(priority=2)
	public void validateWrongAddressTest() throws Throwable
	{
		homepage.validateWrongAddress();
		
	}
	
	@Test(enabled=false)
	public void validateEnterAddressTest() throws Throwable
	{
		addressDetails=homepage.validateEnterAddress();
	}
	
	@Test(priority=1)
	public void valdateValidationMessagesManualAddressTest()
	{
		homepage.valdateValidationMessagesManualAddress();
	}
	
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
     	
}
