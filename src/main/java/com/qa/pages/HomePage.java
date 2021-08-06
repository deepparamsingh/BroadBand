package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class HomePage extends Testbase {

	//PageFactory
	@FindBy(xpath = "//h1[normalize-space()='Compare and save on your internet plans']")
	WebElement h1Heading;
	
	@FindBy(xpath = "//p[contains(text(),'If you’re a savvy bargain hunter like us at Econne')]")
	WebElement belowh1Headng;
	
	
	@FindBy(xpath = "//a[@id='submit_postcode']")
	WebElement compareButton;
	
	
	@FindBy(xpath = "//input[@id='broadband_postcode']")
	WebElement addressInputBar;
	
	
	@FindBy(xpath = "//img[@alt='Compare Internet Plans - Econnex']")
	WebElement homePageFirstImg;
	
	@FindBy(xpath = "//nav[@class='navbar navbar-expand-lg navbar-light']")
	WebElement homePageNavBar;
	
	@FindBy(xpath = "//img[@class='main-site-logo']")
	WebElement homePageLogo;
	
	
	@FindBy(xpath = "//li[normalize-space()='Unit 30 50 Walker St, RHODES NSW']")
	WebElement selectAddress;
	
	
	@FindBy(xpath = "//span[@class='error_broadband_postcode text-danger fielderrormain active']")
	WebElement withOutAndWrongAddress;
	
	
	String expectedTitle = "Econnex - Mobile Comparison | Compare Mobile Plans";
	String h1Title="Compare and save on your internet plans";
	String belowh1Title="If you’re a savvy bargain hunter like us at Econnex, you’ll love saving on your Internet bills. Compare Internet plans, sign up, and start saving!";
	String withOutAdress="Please enter your complete address and select it from dropdown.";
	String wrongAddress="Address not found. Please enter correct address and select it from dropdown.";
	
	
	//Intilizing The Page Objects
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public void validateHomePageTitle()
	{	
		String actuaTitle = driver.getTitle();
		if(actuaTitle.contentEquals(expectedTitle))
		{
			System.out.println("Title Matched!  ------>"+actuaTitle);
		}
		else
		{
			System.out.println("validateHomePageTitle FAILED!");
		}
			
	}
	
	public void validateh1Heading()
	{
		String actualH1heading= h1Heading.getText();
		if(actualH1heading.contentEquals(h1Title))
		{
			System.out.println("Heading Matched!  ------>"+actualH1heading);
		}
		else
		{
			System.out.println("validateh1Heading FAILED!");
		}
	}

	
	public void validateBelowh1Heading()
	{
		String actualBelowH1heading= belowh1Headng.getText();
		if(actualBelowH1heading.contentEquals(belowh1Title))
		{
			System.out.println("Below H1 Heading Matched!  ------>"+actualBelowH1heading);
		}
		else
		{
			System.out.println("validateBelowh1Heading FAILED!");
		}
	}
	
	public void validateNavBar()
	{
		if(homePageNavBar.isDisplayed())
		{
			System.out.println("Navigation Bar Displayed");
		}
		else
		{
			System.out.println("validateNavBar FAILED!");
		}
		
	}
	
	
	
	public void validatehomePageImage()
	{
		
		if(homePageFirstImg.isDisplayed())
			{
			System.out.println("HomePage Image Displayed ");
			}
		else {
			{
				System.out.println("HomePage Image NOT Displayed ");
			}
		}
		
	}
	
	public void validatehomeLOGO()
	{
		
		if(homePageLogo.isDisplayed())
			{
			System.out.println("HomePage LOGO Displayed ");
			}
		else {
			{
				System.out.println("HomePage LOGO NOT Displayed ");
			}
		}
		
	}
	
	public  void validateEmptyAddress() 
	{
		compareButton.click();
		String emptyAddres= withOutAndWrongAddress.getText();
		if(emptyAddres.contentEquals(withOutAdress))
		{
			System.out.println(emptyAddres);
		}
		else
		{
			System.out.println("validateEmptyAddress --> FAILED!!");
		}
	}
	
	
	public  void validateWrongAddress() throws Throwable 
	{
		addressInputBar.sendKeys("qwertyuiopasdfghjk");
		Thread.sleep(3000);
		//compareButton.click();
		
		String wrongValueEntered= withOutAndWrongAddress.getText();
		if(wrongValueEntered.contentEquals(wrongAddress))
		{
			System.out.println(wrongValueEntered);
		}
		else
		{
			System.out.println("validateWrongAddress --> FAILED!!");
		}
	}
	
	public AddressDetails validateEnterAddress() throws Throwable
	{
		addressInputBar.sendKeys("unit 30 50 walker");
		Thread.sleep(3000);
		if(selectAddress.isDisplayed())
		{
		selectAddress.click();
		Thread.sleep(3000);
		}
		if(compareButton.isDisplayed())
		{
			
			compareButton.click();
			return new AddressDetails();
		}
		else {
			String wrongValueEntered= withOutAndWrongAddress.getText();
			System.out.println(wrongValueEntered+"--> validateEnterAddress  FAILED!!");
			return null;
		}		

	}

	public void fullJourney() throws Throwable
	{
		validateHomePageTitle();
		validateh1Heading();
		validateBelowh1Heading();
		validateNavBar();	
		validatehomePageImage();
		validatehomeLOGO();
		validateEmptyAddress();
		validateWrongAddress();
		validateEnterAddress();		
		
	}
	
	



}
