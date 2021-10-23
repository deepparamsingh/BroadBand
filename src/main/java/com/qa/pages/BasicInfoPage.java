package com.qa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class BasicInfoPage extends Testbase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//Page factory
	//your details section
	@FindBy(xpath = "//div[@class='sub-wrap dotted-area details-part basic_detail_section']")
	WebElement yourDetailssection;	
	@FindBy(xpath = "//span[contains(text(),'None')]")
	WebElement titleDropdown;	
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/span[1]/ul[1]/li[4]/span[1]")
	WebElement selectTitle;
	@FindBy(xpath = "//input[@id='fname']")
	WebElement fName;
	@FindBy(xpath = "//input[@id='lname']")
	WebElement lName;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='pnum']")
	WebElement pNum;
	@FindBy(xpath = "//input[@id='altpnum']")
	WebElement altpNum;
	@FindBy(xpath = "//input[@id='db']")
	WebElement dB;
	
	
	//your connection section
	@FindBy(xpath = "//div[@class='sub-wrap dotted-area connection-details connection_details_section']")
	WebElement connectionDetailsSection;	
	@FindBy(xpath = "//label[@for='alreayaccountno']")
	WebElement alreayaccountno;
	@FindBy(xpath = "//label[@for='alreadyaccountyes']")
	WebElement alreadyaccountyes;
	@FindBy(xpath = "//input[@id='accountno']")
	WebElement EnterAccountno;	
	@FindBy(xpath = "//label[@for='existingphoneno']")
	WebElement existingphoneno;
	@FindBy(xpath = "//label[@for='existingphoneyes']")
	WebElement existingphoneyes;
	@FindBy(xpath = "//input[@id='homeno']")
	WebElement Enterhomeno;
	@FindBy(xpath = "//input[@id='currentacount']")
	WebElement Entercurrentacount;
	@FindBy(xpath = "//label[contains(text(),'I have authority to transfer this service')]")
	WebElement haveAuthorityCheckBox;
	
	
	
	
	
	//your identification section
	@FindBy(xpath = "//div[@class='ques-wrap dotted-area identification-area identity_detail_section']")
	WebElement IdentificationdetailsSection;
	@FindBy(xpath = "//div[@class='ques-wrap dotted-area identification-area identity_detail_section']//ul[@class='radio-opt']")
	WebElement ListOfIdentificationdetailsBar;
	@FindBy(xpath = "//div[@class='ques-wrap dotted-area identification-area identity_detail_section']//ul[@class='radio-opt']")
	List<WebElement> ListOfIdentificationdetails;	
	
	//Australian Passport
	@FindBy(xpath = "//label[normalize-space()='Australian Passport']")
	WebElement AustralianPassport;			
	@FindBy(xpath = "//input[@id='passport_number']")
	WebElement passport_number;
	@FindBy(xpath = "//input[@id='passport_exp']")
	WebElement passport_exp;
	
	//DriverLicence
	@FindBy(xpath = "//label[normalize-space()='Drivers Licence']")
	WebElement DriversLicence;
	@FindBy(xpath = "//span[@class='jcf-select jcf-unselectable jcf-select-dl_state jcf-select-custom-select jcf-select-custom-select-form']")
	WebElement DriversLicenceState;
	@FindBy(xpath = "//span[contains(text(),'NSW')]")
	WebElement DriversLicenceStateSelect;
	@FindBy(xpath = "//input[@id='dl_num']")
	WebElement DriversLicenceNumber;
	@FindBy(xpath = "//input[@id='dl_exp_date']")
	WebElement DriversLicenceExpiry;
	
	
	//Medicare card
	@FindBy(xpath = "//label[normalize-space()='Medicare Card']")
	WebElement MedicareCard;
	@FindBy(xpath = "//input[@id='medc']")
	WebElement MedicareCardNumber;
	@FindBy(xpath = "//span[contains(text(),'Individual Reference Number (IRN)*')]")
	WebElement MedicareCardIRN;
	@FindBy(xpath = "//span[@class='jcf-option' and @data-index='2']")
	WebElement MedicareCardIRNselect;
	@FindBy(xpath = "//input[@id='card_middle_name']")
	WebElement MedicareCardMiddleName;
	@FindBy(xpath = "//span[contains(text(),'Card Color (G-Green, Y-Yellow, B-Blue)')]")
	WebElement MedicareCardColour;
	@FindBy(xpath = "//span[@class='jcf-option' and @data-index='2']")
	WebElement MedicareCardColourSelect;
	@FindBy(xpath = "//input[@id='medicare_card_expiry_date']")
	WebElement MedicareCardExpiry;
	
	//Foreign passport
	@FindBy(xpath = "//label[normalize-space()='Foreign Passport']")
	WebElement ForeignsPassport;
	@FindBy(xpath = "//span[@class='niceCountryInputMenuDefaultText']")
	WebElement ForeignsPassportCountry;
	@FindBy(xpath = "//span[contains(text(),'Albania (Shqipëri)')]")
	WebElement ForeignsPassportCountrySelect;
	@FindBy(xpath = "//input[@id='for_passport_number']")
	WebElement ForeignsPassportNumber;
	@FindBy(xpath = "//input[@id='for_passport_exp']")
	WebElement ForeignsPassportExpiry;



	
	//employment details
	@FindBy(xpath = "//div[@class='ques-wrap dotted-area employment-area employement_detail_section']")
	WebElement EmploymentDetailsSection;	
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	WebElement industry;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[1]/span[1]/ul[1]/li[3]/span[1]")
	WebElement selectindustry;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")
	WebElement occupationType;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[1]/span[1]/ul[1]/li[4]/span[1]")
	WebElement SelectoccupationType;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
	WebElement employmentStatus;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/span[1]/ul[1]/li[2]/span[1]")
	WebElement SelectemploymentStatus;
	
	
	@FindBy(xpath = "//input[@id='Occupation']")
	WebElement enterOccupation;
	
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]")
	WebElement timeOfCurrentEmploymentYear;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[1]/span[1]/ul[1]/li[6]/span[1]")
	WebElement SelectTOCEyear;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]")
	WebElement timeOfCurrentEmploymentMonth;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[1]/span[1]/ul[1]/li[6]/span[1]")
	WebElement SelectTOCEmonth;
	
	
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[7]/div[1]/ul[1]/li[1]/label[1]")
	WebElement doYouHaveCreditCardYES;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[7]/div[1]/ul[1]/li[2]/label[1]")
	WebElement doYouHaveCreditCardNO;
	
	@FindBy(xpath = "//a[normalize-space()='Connection Details']")
	WebElement connectionDetailsButton;
	
	
	//Validation Messages - Your Details section
	@FindBy(xpath = "//span[contains(text(),'Choose Title.')]")
	WebElement titleValidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter the first name.')]")
	WebElement firstNameValidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter the last name.')]")
	WebElement lastNameValidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter date of birth.')]")
	WebElement dBValidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter email.')]")
	WebElement emailValidation;
	@FindBy(xpath = "//span[contains(text(),'Please Enter Phone Number.')]")
	WebElement phoneNumberValidation;

	//Validation Messages - Connection Details section
	
	@FindBy(xpath = "//span[contains(text(),'Do you have account with this provider?')]")
	WebElement accountProviderValidation;
	@FindBy(xpath = "//span[contains(text(),'Account Number is required.')]")
	WebElement accountNumberValidation;
	@FindBy(xpath = "//span[contains(text(),'Do you want existing phone number?')]")
	WebElement existingPhoneNumberValidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter home phone number.')]")
	WebElement existingHomeNumberValidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter account number.')]")
	WebElement providerAccountNumberValidation;
	@FindBy(xpath = "//span[contains(text(),'Please check the above box to confirm the number transfer request')]")
	WebElement connectionCheckBoxValidation;
	
	//Validation Messages - Identification Details section
	//Australian passport
	@FindBy(xpath = "//span[contains(text(),'Please select any one ID.')]")
	WebElement selectIdentificationIdvalidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter passport number.')]")
	WebElement passportvalidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter expiry date.')]")
	WebElement passportExpiryValidation;
	
	//medical card
	@FindBy(xpath = "//span[contains(text(),'Please enter Medicare card number.')]")
	WebElement medicareCardNumberValidation;
	@FindBy(xpath = "//span[contains(text(),'Please select IRN from dropdown.')]")
	WebElement irnValidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter middle name on card.')]")
	WebElement medicareMidnameValidation;
	@FindBy(xpath = "//span[contains(text(),'Please select from dropdown.')]")
	WebElement medicareCardColourValidation;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/span[1]")
	WebElement medicareCardExpiryValidation;
	
	//foreign passport
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[4]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/span[1]")
	WebElement foreignPassortNumberValidation;
	//country drop down validation is missing
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[4]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/span[1]")
	WebElement foreignPassortExpiryValidation;
	
	//Driver licence
	@FindBy(xpath = "//span[contains(text(),'Please select license state from dropdown.')]")
	WebElement licenceStateValidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter license number.')]")
	WebElement licenceNumberValidation;
	@FindBy(xpath = "//span[contains(text(),'Please Enter Driving License Expiry Date.')]")
	WebElement licenceExpiryValidation;
	
	
	//Validation Messages - Employment Details section
	@FindBy(xpath = "//span[contains(text(),'Please select Industry from dropdown.')]")
	WebElement industryValidation;
	@FindBy(xpath = "//span[contains(text(),'Please select occupation type from dropdown.')]")
	WebElement occupationValidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter your occupation or job title.')]")
	WebElement enterOccupationValueValidation;
	@FindBy(xpath = "//span[contains(text(),'Please select employment status from dropdown.')]")
	WebElement employmentStatusValidation;
	@FindBy(xpath = "//span[contains(text(),'Employer Name is required.')]")
	WebElement employerNameValidation;
	@FindBy(xpath = "//span[contains(text(),'Please select year from dropdown.')]")
	WebElement yearEmploymentValidation;
	@FindBy(xpath = "//span[contains(text(),'Please select month from dropdown.')]")
	WebElement monthEmploymentValidation;
	
	//Validation Messages - Connection Address Details section
	@FindBy(xpath = "//span[contains(text(),'Please select Residential status from dropdown')]")
	WebElement residentialStatusValidation;
	@FindBy(xpath = "//span[contains(text(),'Please select year from dropdown')]")
	WebElement yearResidentailValidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter your occupation or job title.')]")
	WebElement monthResidentailValidation;
	
	//Validation Messages - Billing/Delivery Address Details section
	@FindBy(xpath = "//span[contains(text(),'Please select any option for billing.')]")
	WebElement billingAddressValidation;
	@FindBy(xpath = "//span[contains(text(),'Please select any option for delivery.')]")
	WebElement deliveryAddressValidation;
	
	//Validation Messages - Debit Card Details section
	@FindBy(xpath = "//span[contains(text(),'Please enter name given on card.')]")
	WebElement cardHolderNameValidation;
	@FindBy(xpath = "//span[contains(text(),'Please enter card expiry date')]")
	WebElement cardExpirydate;
	
	

	
	//Intilizing The Page Objects
	public BasicInfoPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Actions
	public void validateErrorMessages() throws Throwable
	{
		waitForElementToBeVisible(driver, connectionDetailsButton, 20);
		js.executeScript("arguments[0].scrollIntoView();", connectionDetailsButton);
		validatesubmitBasicDetailsButton();
		
	}
	
	public void validateYourDetailsSection() throws Throwable 
	{
		try {
		waitForElementToBeVisible(driver, yourDetailssection, 20);
		if(yourDetailssection.isDisplayed())
		{
			titleDropdown.click();
			selectTitle.click();
			String FirstName=fName.getText();
			System.out.println("Name of User is :"+FirstName);
			lName.sendKeys("Script");
			String userEmail=email.getText();
			System.out.println("Email of User is :"+userEmail);
			String userPhon=pNum.getText();
			System.out.println("User Phone Number is :"+userPhon);
			altpNum.sendKeys(prop.getProperty("altnumber"));
			dB.sendKeys("02 02 1995");
		}
		else
		{
			System.out.println("\n"+"Exception Occurs ->No option selected from YourDetails Section!!---");
		}
		}
		catch (TimeoutException e) {
			System.out.println("\n"+"Your Details section is Not their or Missing !!");
		}
		
	}
	public void validateconnectionDetailsSection() throws Throwable
	{
		try {
		waitForElementToBeVisible(driver, connectionDetailsSection, 20);
		if(connectionDetailsSection.isDisplayed())
		{
			alreadyaccountyes.click();
			EnterAccountno.sendKeys("1478961289");
			existingphoneyes.click();
			Enterhomeno.sendKeys("0244564645");
			Entercurrentacount.sendKeys("7418529636");
			haveAuthorityCheckBox.click();
			
		}
		else {
			System.out.println("\n"+"Exception Occurs ->No option selected from Connection Address!!---");
		}
		}
		catch (TimeoutException e) {
			System.out.println("\n"+"Connection Details section is Not their or Missing !!");
		}
	}
	
	public void validateIdentificationDetailsSection() throws Throwable
	{
		try {
		waitForElementToBeVisible(driver, IdentificationdetailsSection, 20);
		if(IdentificationdetailsSection.isDisplayed())
		{
			if(AustralianPassport.isDisplayed())
			{
			AustralianPassport.click();
			waitForElementToBeVisible(driver, passport_number, 20);
			passport_number.sendKeys("56566655515");
			waitForElementToBeVisible(driver, passport_exp, 20);
			passport_exp.sendKeys("15 05 2025");
			}
			else if(MedicareCard.isDisplayed())
			{
				MedicareCard.click();
				waitForElementToBeVisible(driver, MedicareCardNumber, 20);
				MedicareCardNumber.sendKeys("1234567890");
				MedicareCardIRN.click();
				waitForElementToBeVisible(driver, MedicareCardIRNselect, 20);
				MedicareCardIRNselect.click();
				waitForElementToBeVisible(driver, MedicareCardMiddleName, 20);
				MedicareCardMiddleName.sendKeys("Qwerty");
				MedicareCardColour.click();
				waitForElementToBeVisible(driver, MedicareCardColourSelect, 20);
				MedicareCardColourSelect.click();
				waitForElementToBeVisible(driver, MedicareCardExpiry, 20);
				MedicareCardExpiry.sendKeys("15 05 2025");
			}
			else if(ForeignsPassport.isDisplayed())
			{
				waitForElementToBeVisible(driver, ForeignsPassport, 20);
				ForeignsPassport.click();
				waitForElementToBeVisible(driver, ForeignsPassportCountry, 20);
				ForeignsPassportCountry.click();
				waitForElementToBeVisible(driver, ForeignsPassportCountrySelect, 20);
				ForeignsPassportCountrySelect.click();
				waitForElementToBeVisible(driver, ForeignsPassportNumber, 20);
				ForeignsPassportNumber.sendKeys("74185296");
				waitForElementToBeVisible(driver, ForeignsPassportExpiry, 20);
				ForeignsPassportExpiry.sendKeys("15 05 2025");
			}
			else if(DriversLicence.isDisplayed())
			{
				waitForElementToBeVisible(driver, DriversLicence, 20);
				DriversLicence.click();
				waitForElementToBeVisible(driver, DriversLicenceState, 20);
				DriversLicenceState.click();
				waitForElementToBeVisible(driver, DriversLicenceStateSelect, 20);
				DriversLicenceStateSelect.click();
				waitForElementToBeVisible(driver, DriversLicenceNumber, 20);
				DriversLicenceNumber.sendKeys("2422535");
				waitForElementToBeVisible(driver, DriversLicenceExpiry, 20);
				DriversLicenceExpiry.sendKeys("02 02 2028");
			}
		}

		else {
			System.out.println("\n"+"Exception Occurs ->No option selected from Identification Details!!---");
		}
		}
		catch (TimeoutException e) {
			// TODO: handle exception
			System.out.println("\n"+"Identification Details section is Not their or Missing !!");
		}
		
	}
	
	public void validateEmploymentdetailsSection() throws Throwable
	{
		
		//validateIdentificationDetailsSection();
		try {
		waitForElementToBeVisible(driver, EmploymentDetailsSection, 20);
		if(EmploymentDetailsSection.isDisplayed())
		{
			industry.click();
			selectindustry.click();
			occupationType.click();
			SelectoccupationType.click();
			employmentStatus.click();
			SelectemploymentStatus.click();
			enterOccupation.sendKeys("techie");
			timeOfCurrentEmploymentYear.click();
			SelectTOCEyear.click();
			timeOfCurrentEmploymentMonth.click();
			SelectTOCEmonth.click();
			doYouHaveCreditCardYES.click();
			
			//return new ConnectionAddress();			
		}
		else {
			System.out.println("\n"+"Exception Occurs ->No option selected from Employment Details!!---");
			//return null;
		}
		}
		catch (TimeoutException e) {
			System.out.println("\n"+"Employment Details section is Not their or  Missing !!");
		}
		
	}
	
	public void validatesubmitBasicDetailsButton()
	{
		
		try {
		waitForElementToBeVisible(driver, connectionDetailsButton, 20);
		if(connectionDetailsButton.isDisplayed())
		{
			connectionDetailsButton.click();
		}
		else
		{
			System.out.println("\n"+"Exception Occurs -> Basic details submit button is not Clicked---");
		}
		}
		catch (TimeoutException e) {
			System.out.println("\n"+"Basic details submit button is MISSING");
		}
	}
	
	
	//check all error messages
	public void yourDetailsEmptyValidationMessages() throws Throwable
	{
		try {
		waitForElementToBeVisible(driver, yourDetailssection, 20);
		if(yourDetailssection.isDisplayed())
		{
			fName.clear();
			lName.clear();
			email.clear();
			pNum.clear();
			altpNum.clear();
			dB.clear();
			validateErrorMessages();
			waitForElementToBeVisible(driver, titleValidation, 20);
			System.out.println("\n"+"---Validation Messages of Your Details Section---");
			System.out.println("Validation message for Title: "+titleValidation.getText());
			System.out.println("Validation message for first name: "+firstNameValidation.getText());
			System.out.println("Validation message for last name: "+lastNameValidation.getText());
			System.out.println("Validation message for email: "+emailValidation.getText());
			System.out.println("Validation message for phone: "+phoneNumberValidation.getText());
			System.out.println("Validation message for DOB: "+dBValidation.getText());
			
			titleDropdown.click();
			selectTitle.click();
			fName.sendKeys(prop.getProperty("username"));
			lName.sendKeys("Singh");
			email.sendKeys(prop.getProperty("email"));
			pNum.sendKeys(prop.getProperty("phone"));
			altpNum.sendKeys(prop.getProperty("altnumber"));
			dB.sendKeys("02 02 1995");
		}
		else
		{
			System.out.println("\n"+"Exception Occurs-->No option selected from YourDetails!!---");
		}
		}
		catch (TimeoutException e) {
			System.out.println("\n"+"Your Details section is Not their or Missing !!");
		}
	}
	
	public void connectionDetailsEmptyValidationMessages() throws Throwable
	{
		validateErrorMessages();
		try {
		waitForElementToBeVisible(driver, connectionDetailsSection, 20);
		if(connectionDetailsSection.isDisplayed())
		{
			System.out.println("\n"+"---Validation Messages of Connection Details Section---");
			System.out.println("Validation message for Account provider: "+accountProviderValidation.getText());
			System.out.println("Validation message for Existing Phone Number: "+existingPhoneNumberValidation.getText());
			waitForElementToBeVisible(driver, alreadyaccountyes, 20);
			alreadyaccountyes.click();
			existingphoneyes.click();
			validateErrorMessages();
			System.out.println("Validation message for Account number: "+accountNumberValidation.getText());
			EnterAccountno.sendKeys("1478961289");
			System.out.println("Validation message for Existing Home Number: "+existingHomeNumberValidation.getText());
			System.out.println("Validation message for Provider Account Number: "+providerAccountNumberValidation.getText());
			System.out.println("Validation message for CheckBox: "+connectionCheckBoxValidation.getText());			
			Enterhomeno.sendKeys("0244564645");
			Entercurrentacount.sendKeys("7418529636");
			existingphoneyes.click();
			haveAuthorityCheckBox.click();
			
			
		}
		else
		{
			System.out.println("\n"+"Exception Occurs-->No option selected from Connection Details!!---");
		}
		}
		catch (TimeoutException e) {
			System.out.println("\n"+"---Connection Details section is Not their or Missing !!---");
		}
	}
	
	public void identificationDetailsEmptyValidationMessages() throws Throwable
	{
		
		validateErrorMessages();
		try {
		waitForElementToBeVisible(driver, IdentificationdetailsSection, 20);
		if(IdentificationdetailsSection.isDisplayed())
		{
			System.out.println("\n"+"---Validation Messages of Identification Details Section---");
			System.out.println("Validation message for Select Any one identification tab: "+selectIdentificationIdvalidation.getText());
			waitForElementToBeVisible(driver, AustralianPassport, 20);
			AustralianPassport.click();
			validateErrorMessages();
			System.out.println("Validation message for Passport number: "+passportvalidation.getText());
			System.out.println("Validation message for Passport Expiry date: "+passportExpiryValidation.getText());
			passport_number.sendKeys("56566655515");
			waitForElementToBeVisible(driver, passport_exp, 20);
			passport_exp.sendKeys("15 05 2025");
		}
		else
		{
			System.out.println("\n"+"---Exception Occurs-->No option selected from Identification Details!!--");
		}
		}
		catch (TimeoutException e) {
			System.out.println("\n"+"---Identification Details section is Not their or Missing !!---");
		}
	}
	
	public void employmentDetailsEmptyValidationMessages() throws Throwable
	{
		
		validateErrorMessages();
		try {
		waitForElementToBeVisible(driver, EmploymentDetailsSection, 20);
		if(EmploymentDetailsSection.isDisplayed())
		{
			System.out.println("\n"+"---Validation Messages of Employment Details Section---");
			System.out.println("Validation message for Industry dropdown: "+industryValidation.getText());
			System.out.println("Validation message for Occupation dropdown: "+occupationValidation.getText());
			System.out.println("Validation message for Job title: "+enterOccupationValueValidation.getText());
			System.out.println("Validation message for Employment status: "+employmentStatusValidation.getText());
			System.out.println("Validation message for Curent Time Year: "+yearEmploymentValidation.getText());
			System.out.println("Validation message for Curent Time Month: "+monthEmploymentValidation.getText());
			industry.click();
			selectindustry.click();
			occupationType.click();
			SelectoccupationType.click();
			employmentStatus.click();
			SelectemploymentStatus.click();
			enterOccupation.clear();
			enterOccupation.sendKeys("techie");
			timeOfCurrentEmploymentYear.click();
			SelectTOCEyear.click();
			timeOfCurrentEmploymentMonth.click();
			SelectTOCEmonth.click();
			doYouHaveCreditCardYES.click();
		}
			
		else
		{
			System.out.println("\n"+"---Exception Occurs-->No option selected from Employment Details!!---");
		}
		}
		catch (TimeoutException e) {
			System.out.println("\n"+"---Employment Details section is Not their or Missing !!---");
		}
	}
	
	
	public ConnectionAddress validateAllSectionBasicInfoPage() throws Throwable 
	{
		validateYourDetailsSection();
		validateconnectionDetailsSection();
		validateIdentificationDetailsSection();
		validateEmploymentdetailsSection();
		validatesubmitBasicDetailsButton();
		return new ConnectionAddress();
		
	}
	public ConnectionAddress validateAllsectionEmptyErrorValidation() throws Throwable
	{
		yourDetailsEmptyValidationMessages();
		connectionDetailsEmptyValidationMessages();
		identificationDetailsEmptyValidationMessages();
		employmentDetailsEmptyValidationMessages();
		validatesubmitBasicDetailsButton();
		return new ConnectionAddress();
	}
	
}
