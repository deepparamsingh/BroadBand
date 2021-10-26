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
		@FindBy(xpath = "//span[contains(text(),'Checkbox two is required')]")
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
			System.out.println("User existing Address is: "+existingAddress);
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
			System.out.println("---Exception Occurs-->Connection Address Section is not their OR  MISSING!!");
		}
		}
		catch (TimeoutException e) {
			System.out.println("Connection Address Section is not their OR  MISSING!!");
		}
		
	}
	
	
	public void validateConnectionDeliverDate() throws Throwable
	{
		waitForElementToBeVisible(driver, selectConnectionDate, 10);
		selectConnectionDate.click();
		waitForElementToBeVisible(driver, datePickerTitle, 10);
		String monthYearVal=datePickerTitle.getText();
		System.out.println("Current month and year :"+monthYearVal);
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
//			System.out.println(holidayDetails);
//		}			
//		}
//		catch (TimeoutException e) 
		{
			System.out.println("Select Month and year :"+monthYearVal);
			Thread.sleep(2000);
			System.out.println("Selected Date :"+selectedDate.getText());
		}
		
	}
	
	public void validateSatelliteSection()
	{
		try {
			waitForElementToBeVisible(driver, satelliteSection, 10);
			if(satelliteSection.isDisplayed())
			{
				System.out.println("Heading of satellite section"+satelliteHeading.getText());
				satelliteQ1.click();
				satelliteA1.click();
				satelliteQ2.click();
				satelliteA2.click();
				satelliteQ3.click();
				satelliteA3.click();
				satelliteQ4.click();
				satelliteA4.click();
				System.out.println("Declaration of satellite section"+satelliteDeclaration.getText());
			}
		}
		catch (TimeoutException e) {
			System.out.println("This Address not contains Satellite Section OR  MISSING !!");
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
				System.out.println("User Bill will be sent to this email:"+userBillemail);
			}
			else if(BillingAddress.isDisplayed())
			{
				BillingAddress.click();
				String userbillAddress=BillingAddress.getText();
				System.out.println("User Bill will be deliver to this address: "+userbillAddress);
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
				System.out.println("No Option Selected from Billing Address Section");
			}
									
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Billing Section is not their OR  MISSING !!");
		}
		
		try {
		waitForElementToBeVisible(driver, deliverySection, 10);
		if(deliverySection.isDisplayed())
		{
			Thread.sleep(2000);
			if(DeliveryAddress.isDisplayed())
			{
			String deliveryAddress=DeliveryAddress.getText();
			System.out.println("Equiptments will be deliver to Address :"+deliveryAddress);
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
				System.out.println("No Option Selected from Delivery Address Section");
			}
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Delivery Section is not their OR  MISSING!!");
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
				System.out.println("Content of Debit card is: "+debitCardContent.getText());
			}
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("Content of Debit card is not their or missing");
			}
			
			
			driver.switchTo().frame("tx_iframe_tokenExIframeDiv");
			debitCardNumber.sendKeys(" 4111111111111111");
			driver.switchTo().defaultContent();
			debitCardName.sendKeys("Param-deep");
			debitCardValidity.sendKeys("04 25");
			driver.switchTo().frame("tx_iframe_cvv_CvvTextbox");
			debitCarCVV.sendKeys("123");
			driver.switchTo().defaultContent();
			
			System.out.println("Secure text: "+secureText.getText());
			secureText.click();
			String checkBoxValue1=debitCardCheckBox1.getText();
			System.out.println("Content Of checkBox is :"+checkBoxValue1);
			debitCardCheckBox1.click();
			Thread.sleep(2000);
//			String checkBoxValue2=debitCardCheckBox2.getText();
//			System.out.println("Content Of checkBox is :"+checkBoxValue2);
//			debitCardCheckBox2.click();
//			String securevalue=secureText.getText();
//			System.out.println("Secure text is :"+securevalue);
			
				}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Debit Card session is not their OR MISSING !!");
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
			System.out.println("--Exception Occurs -->Review connection details button is MISSING !! ");
		}
		}
		catch (TimeoutException e) {
			System.out.println("Review connection details button is MISSING !! ");
		}
			
	}
	
	
	public void connectionAddressEmptyValidationMessages() throws Throwable
	{
		validateConnectionDetailsButton();
		try {
		waitForElementToBeVisible(driver, connectionAddressSection, 30);
		if(connectionAddressSection.isDisplayed())
		{
			System.out.println("\n"+"---Validation Messages of Connection Address Section---");
			System.out.println("Validation message for Connection Address : "+residentialStatusValidation.getText());
			//waitForElementToBeVisible(driver, residentialStatus, 30);
			residentialStatus.click();
			System.out.println("residentialStatus Clicked");
			selectResidentalStatus.click();
			System.out.println("selectResidentalStatus Clicked");
			validateConnectionDetailsButton();
			waitForElementToBeVisible(driver, livingYear, 30);
			System.out.println("Validation message for Living Year: "+livingYearValidation.getText());
			waitForElementToBeVisible(driver, livingMonth, 30);
			System.out.println("Validation message for Living Month: "+livingMonthValidation.getText());
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
		else
		{
			System.out.println("\n"+"---Exception Occurs -> No option selected from Connection Address!!---");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("\n"+"---Connection Address section is Not their or Missing !!---");
		}
		
	}
	
	public void billingDeliveryEmptyValidationMessages() throws Throwable
	{
		validateConnectionDetailsButton();
		try {
		waitForElementToBeVisible(driver, BillingSection, 30);
		if(BillingSection.isDisplayed())
		{
			System.out.println("\n"+"---Validation Messages of Billing Address Section---");
			System.out.println("Validation message for Billing Section : "+billingValidation.getText());
			System.out.println("Validation message for Delivery Section : "+deliveryValidation.getText());
			waitForElementToBeVisible(driver, otherAddressBilling, 10);
			otherAddressBilling.click();
			waitForElementToBeVisible(driver, otherAddressDelivery, 10);
			otherAddressDelivery.click();
			validateConnectionDetailsButton();
			System.out.println("Validation message for Other Address Billing Section : "+billingOtherAddressValidation.getText());
			System.out.println("Validation message for Other Address Delivery Section : "+deliveryOtherAddressValidation.getText());
			validateBillingdeliveryAddress();
						
		}
		else
		{
			System.out.println("\n"+"---No option selected from billing Address section !!---");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("\n"+"---Exception Occurs Billing Address section is Not their or Missing !!---");
		}
	}
	
	public void debitCardEmptyValidationMessages() throws Throwable
	{
		validateConnectionDetailsButton();
		try {
		waitForElementToBeVisible(driver, debitCardSection, 10);
		if(debitCardSection.isDisplayed())
		{
			System.out.println("\n"+"---Validation Messages of Debit Card Section---");
			System.out.println("Validation message for Debit Card Name : "+debitCardNameValidation.getText());
			System.out.println("Validation message for Debit Card Expiry : "+debitCardValidityValidation.getText());
			System.out.println("Validation message for Delivery Section : "+chk1Validation.getText());
			System.out.println("Validation message for Delivery Section : "+chk2Validation.getText());
			validateDebitcardSection();
						
		}
		else
		{
			System.out.println("\n"+"---Exception Occurs No option selected from Debit card section !!---");
		}
		}
		catch (TimeoutException e) {
			
			System.out.println("\n"+"---Debit Card section is Not their or Missing !!---");
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
		billingDeliveryEmptyValidationMessages();
		debitCardEmptyValidationMessages();
		//validateConnectionDetailsButton();
		return new OtpPage();
	}
	
	
}
