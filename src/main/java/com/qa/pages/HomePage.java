package com.qa.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
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
	
	
	@FindBy(xpath = "//li[@class='ui-menu-item retrievepostcodeAddressApi']")
	WebElement selectAddress;
	
	
	@FindBy(xpath = "//span[@class='error_broadband_postcode text-danger fielderrormain active']")
	WebElement withOutAndWrongAddress;
	
	
	String expectedTitle = "Econnex - Mobile Comparison | Compare Mobile Plans";
	String h1Title="Compare and save on your internet plans";
	String belowh1Title="If you’re a savvy bargain hunter like us at Econnex, you’ll love saving on your Internet bills. Compare Internet plans, sign up, and start saving!";
	String withOutAdress="Please enter your complete address and select it from dropdown.";
	String wrongAddress="Address not found. Please enter correct address and select it from dropdown.";
	
	//Mannual Home
	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/p[1]/span[1]/label[1]")
	WebElement homemannual;
	@FindBy(xpath = "//input[@id='home_unitnumber']")
	WebElement homeUnit;
	@FindBy(xpath = "//input[@id='home_lot_number']")
	WebElement homeLotNumber;
	@FindBy(xpath = "//input[@id='home_streetnumber1']")
	WebElement homeStreetNumber;
	@FindBy(xpath = "//input[@id='home_streetname']")
	WebElement homeStreetName;
	@FindBy(xpath = "//input[@id='home_suburb']")
	WebElement homeSuburb;
	@FindBy(xpath = "//input[@id='home_postcode']")
	WebElement homePostCode;
	@FindBy(xpath = "//span[contains(text(),'Select State*')]")
	WebElement homeState;
	@FindBy(xpath = "//span[contains(text(),'NSW')]")
	WebElement homeStateSelect;
	@FindBy(xpath = "//a[@id='submit_mannual_postcode']")
	WebElement homeCompare;
	
	
	
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
		waitForElementToBeVisible(driver, h1Heading, 10);
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
		waitForElementToBeVisible(driver, belowh1Headng, 10);
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
		waitForElementToBeVisible(driver, homePageNavBar, 10);
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
		try {
		waitForElementToBeVisible(driver, homePageFirstImg, 10);
		if(homePageFirstImg.isDisplayed())
			{
			System.out.println("HomePage Image Displayed ");
			}
//		else 
//			{
//				System.out.println("HomePage Image NOT Displayed ");
//			}
		}
		catch (TimeoutException e) {
			System.out.println("HomePage Image NOT Displayed -->validate Home Page IMG. failed!! ");
		}
	}
	
	public void validatehomeLOGO()
	{
		try {
		waitForElementToBeVisible(driver, homePageLogo, 10);
		if(homePageLogo.isDisplayed())
			{
			System.out.println("HomePage LOGO Displayed ");
			}
//		else 
//		{
//				System.out.println("HomePage LOGO NOT Displayed ");
//			}
		
		}
		catch (TimeoutException e) {
			System.out.println("HomePage LOGO NOT Displayed -- Validate Home Logo failed!! ");
		}
		
	}
	
	public  void validateEmptyAddress() 
	{
		try {
		waitForElementToBeVisible(driver, compareButton, 10);
		compareButton.click();
		waitForElementToBeVisible(driver, withOutAndWrongAddress, 10);
		String emptyAddres= withOutAndWrongAddress.getText();
		if(emptyAddres.contentEquals(withOutAdress))
		{
			System.out.println("Validation for empty address: "+emptyAddres);
			
		}
		else
		{
			System.out.println("validateEmptyAddress --> FAILED Message didn't match!!");
		}
		}
		catch (NoSuchElementException e) {
			System.out.println("Exception Occurs-->validation Message is Missing!!");
		}
	}
	
	
	public  void validateWrongAddress() throws Throwable 
	{
		try {
		waitForElementToBeVisible(driver, addressInputBar, 10);
		addressInputBar.sendKeys("qwertyuiopasdfghjk");
		
		waitForElementToBeVisible(driver, withOutAndWrongAddress, 15);
		String wrongValueEntered= withOutAndWrongAddress.getText();
		if(wrongValueEntered.contentEquals(wrongAddress))
		{
			System.out.println("Validation for Wrong address: "+wrongValueEntered);
			homemannual.click();
			waitForElementToBeVisible(driver, homeUnit, 10);
			homeUnit.sendKeys("1");
			waitForElementToBeVisible(driver, homeLotNumber, 10);
			homeLotNumber.sendKeys("101");
			waitForElementToBeVisible(driver, homeStreetNumber, 10);
			homeStreetNumber.sendKeys("112");
			waitForElementToBeVisible(driver, homeStreetName, 10);
			homeStreetName.sendKeys("whales street");
			waitForElementToBeVisible(driver, homeSuburb, 10);
			homeSuburb.sendKeys("pakhnem");
			waitForElementToBeVisible(driver, homePostCode, 10);
			homePostCode.sendKeys("2000");
			waitForElementToBeVisible(driver, homeState, 10);
			homeState.click();
			waitForElementToBeVisible(driver, homeStateSelect, 10);
			homeStateSelect.click();
			waitForElementToBeVisible(driver, homeCompare, 10);
			homeCompare.click();
		}
		else
		{
			System.out.println("validateWrongAddress --> FAILED!! as validation Message failed!");
		}
		}
		catch (TimeoutException e) {
			System.out.println("Exception occurs ->validateWrongAddress --> FAILED!!");
		}
	}
	
	public AddressDetails validateEnterAddress() throws Throwable
	{
		waitForElementToBeVisible(driver, addressInputBar, 20);
		addressInputBar.sendKeys(prop.getProperty("address"));
		//Thread.sleep(3000);
		waitForElementToBeVisible(driver, selectAddress, 20);
		try 
		{
		if(selectAddress.isDisplayed())
		{
		selectAddress.click();		
		}
		waitForElementToBeVisible(driver, compareButton, 20);
		if(compareButton.isDisplayed())
		{
			
			compareButton.click();
		}
		}
		catch (TimeoutException e) {
			String wrongValueEntered= withOutAndWrongAddress.getText();
			System.out.println(wrongValueEntered+"--> validateEnterAddress  FAILED!!");
			return null;
		}
		return new AddressDetails();
			

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
