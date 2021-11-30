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
	
	//validation messages for manual address
	@FindBy(xpath = "//span[@class='error_home_unitnumber text-danger fielderrormain active']")
	WebElement validationUnitNumber;
	@FindBy(xpath = "//span[@class='error_home_lot_number text-danger fielderrormain active']")
	WebElement validationLotNumber;
	@FindBy(xpath = "//span[@class='error_home_streetnumber1 text-danger fielderrormain active']")
	WebElement validationStreetNumber;
	@FindBy(xpath = "//span[@class='error_home_streetname text-danger fielderrormain active']")
	WebElement validationStreetName;
	@FindBy(xpath = "//span[@class='error_home_suburb text-danger fielderrormain active']")
	WebElement validationSuburb;
	@FindBy(xpath = "//span[@class='error_home_state text-danger fielderrormain active']")
	WebElement validationState;
	@FindBy(xpath = "//span[@class='error_home_postcode text-danger fielderrormain active']")
	WebElement validationPostCode;
	
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
			logger.info("Title Matched!  ------>"+actuaTitle);
		}
		else
		{
			logger.info("validateHomePageTitle FAILED!");
		}
			
	}
	
	public void validateh1Heading() throws Throwable
	{
		waitForElementToBeVisible(driver, h1Heading, 10);
		String actualH1heading= h1Heading.getText();
		if(actualH1heading.contentEquals(h1Title))
		{
			logger.info("Heading Matched!  ------>"+actualH1heading);
		}
		else
		{
			logger.info("validateh1Heading FAILED!");
			takeScreenShot("H1 heading");
		}
	}

	
	public void validateBelowh1Heading() throws Throwable
	{
		waitForElementToBeVisible(driver, belowh1Headng, 10);
		String actualBelowH1heading= belowh1Headng.getText();
		if(actualBelowH1heading.contentEquals(belowh1Title))
		{
			logger.info("Below H1 Heading Matched!  ------>"+actualBelowH1heading);
		}
		else
		{
			logger.info("validateBelowh1Heading FAILED!");
			takeScreenShot("Below H1 heading");
		}
	}
	
	public void validateNavBar() throws Throwable
	{
		waitForElementToBeVisible(driver, homePageNavBar, 10);
		if(homePageNavBar.isDisplayed())
		{
			logger.info("Navigation Bar Displayed");
		}
		else
		{
			logger.info("validateNavBar FAILED!");
			takeScreenShot("Nav bar Home");
		}
		
	}
	
	
	
	public void validatehomePageImage() throws Throwable
	{
		try {
		waitForElementToBeVisible(driver, homePageFirstImg, 10);
		if(homePageFirstImg.isDisplayed())
			{
			logger.info("HomePage Image Displayed ");
			}
//		else 
//			{
//				logger.info("HomePage Image NOT Displayed ");
//			}
		}
		catch (TimeoutException e) {
			logger.info("HomePage Image NOT Displayed -->validate Home Page IMG. failed!! ");
			takeScreenShot("Home Page Image");
		}
	}
	
	public void validatehomeLOGO() throws Throwable
	{
		try {
		waitForElementToBeVisible(driver, homePageLogo, 10);
		if(homePageLogo.isDisplayed())
			{
			logger.info("HomePage LOGO Displayed ");
			}
//		else 
//		{
//				logger.info("HomePage LOGO NOT Displayed ");
//			}
		
		}
		catch (TimeoutException e) {
			logger.info("HomePage LOGO NOT Displayed -- Validate Home Logo failed!! ");
			takeScreenShot("Home Page LOGO");
		}
		
	}
	
	public  void validateEmptyAddress() throws Throwable 
	{
		try {
		waitForElementToBeVisible(driver, compareButton, 10);
		compareButton.click();
		waitForElementToBeVisible(driver, withOutAndWrongAddress, 10);
		String emptyAddres= withOutAndWrongAddress.getText();
		if(emptyAddres.contentEquals(withOutAdress))
		{
			logger.info("Validation for empty address: "+emptyAddres);
			
		}
		else
		{
			logger.info("validateEmptyAddress --> FAILED Message didn't match!!");			
		}
		}
		catch (NoSuchElementException e) {
			logger.info("Exception Occurs-->validation Message is Missing!!");
			takeScreenShot("Empty address validation");
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
			logger.info("Validation for Wrong address: "+wrongValueEntered);
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
			logger.info("validateWrongAddress --> FAILED!! as validation Message failed!");
		}
		}
		catch (TimeoutException e) {
			logger.info("Exception occurs ->validateWrongAddress --> FAILED!!");
			takeScreenShot("Wrong address validation");
		}
	}
	
	
	public void validateValidationMessagesManualAddress()
	{
		homemannual.click();
		waitForElementToBeVisible(driver, homeUnit, 10);
		homeUnit.sendKeys("test");
		waitForElementToBeVisible(driver, homeLotNumber, 10);
		homeLotNumber.sendKeys("test");
		homeCompare.click();
		waitForElementToBeVisible(driver, validationUnitNumber, 10);
		String unitVal= validationUnitNumber.getText();
		logger.info("unit validation message :"+unitVal);
		waitForElementToBeVisible(driver, validationLotNumber, 10);
		String lotVal= validationLotNumber.getText();
		logger.info("Lot number validation message :"+lotVal);
		waitForElementToBeVisible(driver, validationStreetNumber, 10);
		String streetNumberVal= validationStreetNumber.getText();
		logger.info("Street Number validation message :"+streetNumberVal);
		waitForElementToBeVisible(driver, validationStreetName, 10);
		String streetNameVal= validationStreetName.getText();
		logger.info("Street name validation message :"+streetNameVal);
		waitForElementToBeVisible(driver, validationSuburb, 10);
		String suburbVal= validationSuburb.getText();
		logger.info("Suburb validation message :"+suburbVal);
		waitForElementToBeVisible(driver, validationState, 10);
		String stateVal=validationState.getText();
		logger.info("state validation message :"+stateVal);
		waitForElementToBeVisible(driver, validationPostCode, 10);
		String postCodeVal=validationPostCode.getText();
		logger.info("postcode validation message :"+postCodeVal);
		
	}
	
	public AddressDetails validateEnterAddress() throws Throwable
	{
		waitForElementToBeVisible(driver, addressInputBar, 20);
		addressInputBar.sendKeys(prop.getProperty("address"));
		//takeScreenShot("home page image");
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
			logger.info(wrongValueEntered+"--> validateEnterAddress  FAILED!!");
			takeScreenShot("Enter address validation");
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
