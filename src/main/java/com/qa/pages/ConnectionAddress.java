package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class ConnectionAddress extends Testbase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//Connection Address Section
		@FindBy(xpath = "//div[@class='sub-wrap dotted-area address-screen-adrs-area conn_addr_res_status_section']")
		WebElement connectionAddressSection;
		@FindBy(xpath = "//i[@id='conn_addr_disp']")
		WebElement fetchaddess;
//		@FindBy(xpath = "//span[@class='jcf-select jcf-unselectable jcf-select-resstatus jcf-select-custom-select jcf-select-custom-select-form']")
//		WebElement residentialStatus;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[2]/div[2]/div[1]/span[1]")
		WebElement residentialStatus;
		@FindBy(xpath = "//span[normalize-space()='Owner Fully Paid']")
		WebElement selectResidentalStatus;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]")
		WebElement livingYear;
		@FindBy(xpath = "//span[@class='jcf-option'][normalize-space()='4']")
		WebElement selectLivingYear;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/span[1]")
		WebElement livingMonth;
		@FindBy(xpath = "//span[@class='jcf-option'][normalize-space()='3']")
		WebElement selectLivingMonth;
		
		
		//calendar
				@FindBy(xpath = "//label[contains(text(),'Select Date')]")
				WebElement selectConnectionDate;
				@FindBy(xpath = "//div[@class='ui-datepicker-title']")
				WebElement datePickerTitle;
				@FindBy(xpath = "//span[contains(text(),'Next')]")
				WebElement datePickerNext;
				@FindBy(xpath = "//a[contains(text(),'15')]")
				WebElement datePickerDate;		
				@FindBy(xpath = "//span[@id='delivery_addr_date_show']")
				WebElement selectedDate;
				@FindBy(xpath = "//label[normalize-space()='Asap']")
				WebElement ASAP;
				@FindBy(xpath = "//div[@class='noty_body']")				
				WebElement holidayDate;
				
				
				
				//Satellite Question
				@FindBy(xpath = "//div[@id='satellite_address_section']")
				WebElement satelliteSection;
				@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[3]/h5[1]")
				WebElement satelliteHeading;	
				@FindBy(xpath = "//span[contains(text(),'POWER SOURCE TYPE')]")
				WebElement satelliteQ1;	
				@FindBy(xpath = "//span[contains(text(),'DC Power Supply')]")
				WebElement satelliteA1;
				@FindBy(xpath = "//span[contains(text(),'BUILDING HEIGHT')]") 
				WebElement satelliteQ2;
				@FindBy(xpath = "//span[contains(text(),'Two or more storeys')]")
				WebElement satelliteA2;
				@FindBy(xpath = "//span[contains(text(),'ROOF TYPE')]") 
				WebElement satelliteQ3;	
				@FindBy(xpath = "//span[contains(text(),'Tile')]")
				WebElement satelliteA3;
				@FindBy(xpath = "//span[contains(text(),'BUILDING EXTERNAL WALL MATERIALS')]")
				WebElement satelliteQ4;
				@FindBy(xpath = "//span[contains(text(),'Asbestos, Fibro')]")
				WebElement satelliteA4;
				@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/p[1]")
				WebElement satelliteDeclaration;
				
		
		//Billing And Delivery Address
//		@FindBy(xpath = "//div[@id='billing_and_delivery_address_section']")
//		WebElement BillingAndDeliverySection;			
		@FindBy(xpath = "//div[@id='bill_detail_opt']//div[@class='panel-body']")
		WebElement BillingSection;	
		@FindBy(xpath = "//span[@id='billing_email_disp']") 
		WebElement BillingEmail;
		@FindBy(xpath = "//label[@for='billing_email']") 
		WebElement selectBillingEmail;	
		@FindBy(xpath = "//label[@for='billing_addr']//span[@class='current_complete_address']")
		WebElement BillingAddress;
		
		
		
		//-----------other address--------------------
		@FindBy(xpath = "//label[normalize-space()='Other address']")
		WebElement otherAddressBilling;
		@FindBy(xpath = "//input[@id='bill_address_search']")
		WebElement inputOtherAddressBilling;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]")
		WebElement selectOtherAddressBilling;
		@FindBy(xpath = "//label[@for='mannual_billing_addr_check']")
		WebElement checkBoxBilling;
		
		//-------------------------------
		
		@FindBy(xpath = "//div[@id='deliver_detail_opt']//div[@class='panel-body']")
		WebElement deliverySection;
		@FindBy(xpath = "//label[@for='cuurent_delivery_addr']//span[@class='current_complete_address']")
		WebElement DeliveryAddress;
		@FindBy(xpath = "//label[@for='cuurent_delivery_addr']")
		WebElement selectDeliveryAddress;
		
		//----------------other address for delivery equipment-----------
		@FindBy(xpath = "//label[contains(text(),\"Other address (can't be a Post Box, Locked Bag or \")]")
		WebElement otherAddressDelivery;
		@FindBy(xpath = "//input[@id='delivery_address_search']")
		WebElement inputOtherAddressDelivery;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]")
		WebElement selectOtherAddressDelivery;
		@FindBy(xpath = "//label[@for='delivery_mannual_addr_check']")
		WebElement checkBoxAddress;
		
		
		
		//Credit card Details
		@FindBy(xpath = "//div[@class='ques-wrap dotted-area credit_card_section']")
		WebElement debitCardSection;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/p[1]")			 
		WebElement debitCardContent;
		@FindBy(xpath = "//input[@placeholder='Credit/Debit Card Number']")
		WebElement debitCardNumber;
		@FindBy(xpath = "//input[@id='dcardName']")
		WebElement debitCardName;
		@FindBy(xpath = "//input[@id='valid_thru']")
		WebElement debitCardValidity;
		@FindBy(xpath = "//input[@placeholder='CVV']")
		WebElement debitCarCVV;
		@FindBy(xpath = "//label[normalize-space()='checkbox 1']")
		WebElement debitCardCheckBox1;
		@FindBy(xpath = "//label[@for='107_checkbox']")
		WebElement debitCardCheckBox2;
		@FindBy(xpath = "//p[@class='secure-text']")
		WebElement secureText;
	
		@FindBy(xpath = "//a[normalize-space()='Review Details']")
		WebElement ReviewDetailsButton;
		
		
		//Validation Message for Connection Address
		@FindBy(xpath = "//span[contains(text(),'Please select Residential status from dropdown')]")
		WebElement residentialStatusValidation;
		@FindBy(xpath = "//span[contains(text(),'Please select year from dropdown')]")
		WebElement livingYearValidation;
		@FindBy(xpath = "//span[contains(text(),'Please Select Valid month.')]")
		WebElement livingMonthValidation;
		
		//Validation Message for Satellite Question
		@FindBy(xpath = "//span[contains(text(),'Please select power type from dropdown.')]")
		WebElement satelliteQ1Validation;
		@FindBy(xpath = "//span[contains(text(),'Please select building heights from dropdown.')]")
		WebElement satelliteQ2Validation;
		@FindBy(xpath = "//span[contains(text(),'Please select roof type from dropdown.')]")
		WebElement satelliteQ3Validation;
		@FindBy(xpath = "//span[contains(text(),'Please select wallType type from dropdown.')]")
		WebElement satelliteQ4Validation;
		
		
		//Validation Message for Billing Section
		@FindBy(xpath = "//span[contains(text(),'Please select any option for billing.')]")
		WebElement billingValidation;
		@FindBy(xpath = "//span[contains(text(),'Please select any option for delivery.')]")
		WebElement deliveryValidation;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")
		WebElement billingOtherAddressValidation;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]")
		WebElement deliveryOtherAddressValidation;
		
		
		//Validation Message for Debit Card Section
		@FindBy(xpath = "//span[contains(text(),'Please enter name given on card.')]")
		WebElement debitCardNameValidation;
		@FindBy(xpath = "//span[contains(text(),'Please enter card expiry date')]")
		WebElement debitCardValidityValidation;
		@FindBy(xpath = "//span[contains(text(),'please select')]")
		WebElement chk1Validation;
		@FindBy(xpath = "//span[contains(text(),'new data')]")
		WebElement chk2Validation;
		
		
		
	//Intilizing The Page Objects
	public ConnectionAddress() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions

	public void validateConnectionDetailsSection() throws Throwable
	{
		try {
		waitForElementToBeVisible(driver, connectionAddressSection, 50);
		if(connectionAddressSection.isDisplayed())
		{
			String existingAddress= fetchaddess.getText();
			logger.info("User existing Address is: "+existingAddress);
			residentialStatus.click();
			selectResidentalStatus.click();
			livingYear.click();
			selectLivingYear.click();
			livingMonth.click();
			selectLivingMonth.click();
			//ASAP.click();
		}
		else
		{
			logger.error("---Exception Occurs-->Connection Address Section is not their OR  MISSING!!");
		}
		}
		catch (TimeoutException e) {
			logger.error("Connection Address Section is not their OR  MISSING!!");
		}
		
	}
	
	
	public void validateConnectionDeliverDate() throws Throwable
	{
		waitForElementToBeVisible(driver, selectConnectionDate, 10);
		selectConnectionDate.click();
		waitForElementToBeVisible(driver, datePickerTitle, 10);
		String monthYearVal=datePickerTitle.getText();
		logger.info("Current month and year :"+monthYearVal);
		String month= monthYearVal.split(" ")[0].trim();
		String year= monthYearVal.split(" ")[1].trim();
		
		waitForElementToBeVisible(driver, datePickerNext, 10);
		while(!(month.equals(prop.getProperty("month")) && year.equals(prop.getProperty("year"))))
		{				
			datePickerNext.click();
			waitForElementToBeVisible(driver, datePickerTitle, 10);
			monthYearVal=datePickerTitle.getText();				
			 month= monthYearVal.split(" ")[0].trim();
			 year= monthYearVal.split(" ")[1].trim();
		}
		waitForElementToBeVisible(driver, datePickerDate, 10);
		datePickerDate.click();		
		
//		try
//		{
//		waitForElementToBeVisible(driver, holidayDate, 10);
//		if(holidayDate.isDisplayed())
//		{
//			
//			String holidayDetails = holidayDate.getText();
//			logger.info(holidayDetails);
//		}			
//		}
//		catch (TimeoutException e) 
		{
			logger.info("Select Month and year :"+monthYearVal);
			Thread.sleep(2000);
			logger.info("Selected Date :"+selectedDate.getText());
		}
		
	}
	
	public void validateSatelliteSection()
	{
		try {
			waitForElementToBeVisible(driver, satelliteSection, 5);
			if(satelliteSection.isDisplayed())
			{
				logger.info("Heading of satellite section"+satelliteHeading.getText());
				satelliteQ1.click();
				satelliteA1.click();
				satelliteQ2.click();
				satelliteA2.click();
				satelliteQ3.click();
				satelliteA3.click();
				satelliteQ4.click();
				satelliteA4.click();
				logger.info("Declaration of satellite section"+satelliteDeclaration.getText());
			}
		}
		catch (TimeoutException e) {
			logger.error("This Address not contains Satellite Section OR  MISSING !!");
		}
		
	}
	
	public void validateBillingdeliveryAddress() throws Throwable
	{
		try {
		waitForElementToBeVisible(driver, BillingSection, 30);
		if(BillingSection.isDisplayed())
		{
			Thread.sleep(2000);
			if(BillingEmail.isDisplayed()) 
			{
				selectBillingEmail.click();
				String userBillemail= BillingEmail.getText();
				logger.info("User Bill will be sent to this email:"+userBillemail);
			}
			else if(BillingAddress.isDisplayed())
			{
				BillingAddress.click();
				String userbillAddress=BillingAddress.getText();
				logger.info("User Bill will be deliver to this address: "+userbillAddress);
			}
			else if(otherAddressBilling.isDisplayed())
			{
				Thread.sleep(2000);
				otherAddressBilling.click();
				inputOtherAddressBilling.sendKeys("barangaroo Alexander");
				waitForElementToBeVisible(driver, selectOtherAddressBilling, 15);
				selectOtherAddressBilling.click();
				checkBoxBilling.click();
			}
			else
			{
				logger.error("No Option Selected from Billing Address Section");
			}
									
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			logger.error("Billing Section is not their OR  MISSING !!");
		}
		
		try {
		waitForElementToBeVisible(driver, deliverySection, 10);
		if(deliverySection.isDisplayed())
		{
			Thread.sleep(2000);
			if(DeliveryAddress.isDisplayed())
			{
			String deliveryAddress=DeliveryAddress.getText();
			logger.info("Equiptments will be deliver to Address :"+deliveryAddress);
			selectDeliveryAddress.click();
			}
			else if(otherAddressDelivery.isDisplayed())
			{
			Thread.sleep(2000);
			otherAddressDelivery.click();
			inputOtherAddressDelivery.sendKeys("barangaroo Alexander");
			waitForElementToBeVisible(driver, selectOtherAddressDelivery, 15);
			selectOtherAddressDelivery.click();
			checkBoxAddress.click();
			}
			else
			{
				logger.error("No Option Selected from Delivery Address Section");
			}
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			logger.error("Delivery Section is not their OR  MISSING!!");
		}
		
	}
	
	public void validateDebitcardSection() throws Throwable
	{
		//validateBillingdeliveryAddress();
		try{
			waitForElementToBeVisible(driver, debitCardSection, 30);
			js.executeScript("arguments[0].scrollIntoView();", debitCardSection);
		if(debitCardSection.isDisplayed())
		{
			
			try {
			if(debitCardContent.isDisplayed())
			{
				logger.info("Content of Debit card is: "+debitCardContent.getText());
			}
			}
			catch (Exception e) {
				// TODO: handle exception
				logger.error("Content of Debit card is not their or missing");
			}
			
			
			driver.switchTo().frame("tx_iframe_tokenExIframeDiv");
			debitCardNumber.sendKeys(" 4111111111111111");
			driver.switchTo().defaultContent();
			debitCardName.sendKeys("Param-deep");
			debitCardValidity.sendKeys("04 25");
			driver.switchTo().frame("tx_iframe_cvv_CvvTextbox");
			debitCarCVV.sendKeys("123");
			driver.switchTo().defaultContent();
			
			logger.info("Secure text: "+secureText.getText());
			secureText.click();
			String checkBoxValue1=debitCardCheckBox1.getText();
			logger.info("Content Of checkBox is :"+checkBoxValue1);
			debitCardCheckBox1.click();
			Thread.sleep(2000);
//			String checkBoxValue2=debitCardCheckBox2.getText();
//			logger.info("Content Of checkBox is :"+checkBoxValue2);
//			debitCardCheckBox2.click();
//			String securevalue=secureText.getText();
//			logger.info("Secure text is :"+securevalue);
			
				}
		}
		catch (Exception e) {
			// TODO: handle exception
			logger.error("Debit Card session is not their OR MISSING !!");
		}			
		
	}
	
	public void validateConnectionDetailsButton()
	{
		try {
		waitForElementToBeVisible(driver, ReviewDetailsButton, 30);
		if(ReviewDetailsButton.isDisplayed())
		{
			ReviewDetailsButton.click();
		}
		else
		{
			logger.error("--Exception Occurs -->Review connection details button is MISSING !! ");
		}
		}
		catch (TimeoutException e) {
			logger.error("Review connection details button is MISSING !! ");
		}
			
	}
	
	
	public void connectionAddressEmptyValidationMessages() throws Throwable
	{
		validateConnectionDetailsButton();
		try {
		waitForElementToBeVisible(driver, connectionAddressSection, 30);
		if(connectionAddressSection.isDisplayed())
		{
			//Thread.sleep(1000);
			logger.info("\n"+"---Validation Messages of Connection Address Section---");
			logger.info("Validation message for Connection Address : "+residentialStatusValidation.getText());
			waitForElementToBeVisible(driver, residentialStatus, 10);
			residentialStatus.click();
			logger.info("residentialStatus Clicked");
			//Thread.sleep(1000);
			selectResidentalStatus.click();
			logger.info("selectResidentalStatus Clicked");
			validateConnectionDetailsButton();
			//Thread.sleep(1000);
			waitForElementToBeVisible(driver, livingYear, 10);
			logger.info("Validation message for Living Year: "+livingYearValidation.getText());
			//Thread.sleep(1000);
			waitForElementToBeVisible(driver, livingMonth, 10);
			logger.info("Validation message for Living Month: "+livingMonthValidation.getText());
			//Thread.sleep(1000);
			waitForElementToBeVisible(driver, livingYear, 10);
			livingYear.click();
			waitForElementToBeVisible(driver, selectLivingYear, 10);
			selectLivingYear.click();
			waitForElementToBeVisible(driver, livingMonth, 10);
			livingMonth.click();
			waitForElementToBeVisible(driver, selectLivingMonth, 10);
			selectLivingMonth.click();
			waitForElementToBeVisible(driver, ASAP, 10);
			ASAP.click();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			logger.error("\n"+"---Connection Address section is Not their or Missing !!---");
		}
		
	}
	
	public void satelliteValidationMessages() throws Throwable
	{
		validateConnectionDetailsButton();
		try {
		waitForElementToBeVisible(driver, satelliteSection, 10);
		if(satelliteSection.isDisplayed())
		{
			logger.info("\n"+"---Validation Messages of Satellite Section---");
			logger.info("Validation message for satellite Q1 : "+satelliteQ1Validation.getText());
			logger.info("Validation message for satellite Q2 : "+satelliteQ2Validation.getText());
			logger.info("Validation message for satellite Q3 : "+satelliteQ3Validation.getText());
			logger.info("Validation message for satellite Q4 : "+satelliteQ4Validation.getText());
			validateSatelliteSection();
						
		}
		}
		catch (TimeoutException e)
		{
			
			logger.error("\n"+"---Satellite section is Not their or Missing !!---");
		}
	}
	
	
	public void billingDeliveryEmptyValidationMessages() throws Throwable
	{
		validateConnectionDetailsButton();
		try {
		waitForElementToBeVisible(driver, BillingSection, 30);
		if(BillingSection.isDisplayed())
		{
			logger.info("\n"+"---Validation Messages of Billing Address Section---");
			logger.info("Validation message for Billing Section : "+billingValidation.getText());
			logger.info("Validation message for Delivery Section : "+deliveryValidation.getText());
			//waitForElementToBeVisible(driver, otherAddressBilling, 10);
			Thread.sleep(1000);
			otherAddressBilling.click();
			logger.info("otherAddressBilling clicked");
			//waitForElementToBeVisible(driver, otherAddressDelivery, 10);
			Thread.sleep(1000);
			otherAddressDelivery.click();
			logger.info("otherAddressDelivery clicked");
			validateConnectionDetailsButton();
			logger.info("validateConnectionDetailsButton hit");
//			logger.info("Validation message for Other Address Billing Section : "+billingOtherAddressValidation.getText());
//			logger.info("Validation message for Other Address Delivery Section : "+deliveryOtherAddressValidation.getText());
			validateBillingdeliveryAddress();
						
		}
		}
		catch (Exception e) {
			logger.error("\n"+"---Exception Occurs Billing Address section is Not their or Missing !!---");
		}
	}
	
	public void debitCardEmptyValidationMessages() throws Throwable
	{
		validateConnectionDetailsButton();
		try {
		waitForElementToBeVisible(driver, debitCardSection, 10);
		if(debitCardSection.isDisplayed())
		{
			logger.info("\n"+"---Validation Messages of Debit Card Section---");
			logger.info("Validation message for Debit Card Name : "+debitCardNameValidation.getText());
			logger.info("Validation message for Debit Card Expiry : "+debitCardValidityValidation.getText());
			logger.info("Validation message for Delivery Section : "+chk1Validation.getText());
			validateDebitcardSection();
						
		}
		}
		catch (TimeoutException e) {
			
			logger.error("\n"+"---Debit Card section is Not their or Missing !!---");
		}
	}
	
	public OtpPage validateAllSectionConnectionAddressPage() throws Throwable
	{
		validateConnectionDetailsSection();
		validateConnectionDeliverDate();
		validateSatelliteSection();
		validateBillingdeliveryAddress();
		validateDebitcardSection();
		validateConnectionDetailsButton();
		return new OtpPage();
	}
	    
	public OtpPage validateEmptyValidationMessageConnectionAddressPage() throws Throwable 
	{
	
		connectionAddressEmptyValidationMessages();
		satelliteValidationMessages();
		billingDeliveryEmptyValidationMessages();
		debitCardEmptyValidationMessages();
		validateConnectionDetailsButton();
		return new OtpPage();
	}
	
	
}
