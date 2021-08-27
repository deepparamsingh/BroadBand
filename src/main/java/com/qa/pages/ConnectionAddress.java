package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
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
		@FindBy(xpath = "//span[@class='jcf-select jcf-unselectable jcf-select-resstatus jcf-select-custom-select jcf-select-custom-select-form']")
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
		@FindBy(xpath = "//label[normalize-space()='Asap']")
		WebElement ASAP;
		
		//Billing And Delivery Address
//		@FindBy(xpath = "//div[@id='billing_and_delivery_address_section']")
//		WebElement BillingAndDeliverySection;			
		@FindBy(xpath = "//div[@id='bill_detail_opt']//div[@class='panel-body']")
		WebElement BillingSection;	
		@FindBy(xpath = "//span[@id='billing_email_disp']")
		WebElement BillingEmail;
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
		
		//----------------other address for delivery equipment-----------
		@FindBy(xpath = "//label[contains(text(),\"Other address (can't be a Post Box, Locked Bag or \")]")
		WebElement otherAddressDelivery;
		@FindBy(xpath = "//input[@id='delivery_address_search']")
		WebElement inputOtherAddressDelivery;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]")
		WebElement selectOtherAddressDelivery;
		@FindBy(xpath = "//label[@for='delivery_mannual_addr_check']")
		WebElement checkBoxAddress;
		
		
		//--------------------------------------
		
		
		//Credit card Details
		
		@FindBy(xpath = "//div[@class='ques-wrap dotted-area credit_card_section']")
		WebElement debitCardSection;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/p[1]")
		WebElement debitCardContent;
		@FindBy(xpath = "//input[@placeholder='Credit/Debit Card Number']")
		WebElement debitCardNumber;
		@FindBy(xpath = "//input[@id='dcardName']")
		WebElement debitCardName;
		@FindBy(xpath = "//input[@id='valid_thru']")
		WebElement debitCardValidity;
		@FindBy(xpath = "//input[@placeholder='CVV']")
		WebElement debitCarCVV;
		@FindBy(xpath = "//label[@for='106_checkbox']")
		WebElement debitCardCheckBox1;
		@FindBy(xpath = "//label[@for='107_checkbox']")
		WebElement debitCardCheckBox2;
		@FindBy(xpath = "//p[@class='secure-text']")
		WebElement secureText;
	
		@FindBy(xpath = "//a[normalize-space()='Review Details']")
		WebElement ReviewDetailsButton;
		
		
		
	//Intilizing The Page Objects
	public ConnectionAddress() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions

	public void validateConnectionDetailsSection() throws Throwable
	{
		waitForElementToBeVisible(driver, connectionAddressSection, 50);
		//Thread.sleep(5000);
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
			ASAP.click();
		}
		else
		{
			System.out.println("Connection Address Section is not their OR  MISSING!!");
		}
		
	}
	
	public void validateBillingdeliveryAddress() throws Throwable
	{
		//validateConnectionDetailsSection();
		waitForElementToBeVisible(driver, BillingSection, 20);
		if(BillingSection.isDisplayed())
		{
			if(BillingEmail.isDisplayed()) 
			{
				BillingEmail.click();
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
				inputOtherAddressBilling.sendKeys("barangaroo  ");
				selectOtherAddressBilling.click();
				checkBoxBilling.click();
			}
									
		}
		else
		{
			System.out.println("Billing Section is not their OR  MISSING !!");
		}
		
		//waitForElementToBeVisible(driver, deliverySection, 10);
		if(deliverySection.isDisplayed())
		{
			if(DeliveryAddress.isDisplayed())
			{
			String deliveryAddress=DeliveryAddress.getText();
			System.out.println("Equiptments will be deliver to Address :"+deliveryAddress);
			DeliveryAddress.click();
		}
		else if(otherAddressDelivery.isDisplayed())
		{
			Thread.sleep(2000);
			otherAddressDelivery.click();
			inputOtherAddressDelivery.sendKeys("barangaroo  ");
			selectOtherAddressDelivery.click();
			checkBoxAddress.click();
		}
		}
		else
		{
			System.out.println("Delivery Section is not their OR  MISSING!!");
		}
	}
	
	public void validateDebitcardSection() throws Throwable
	{
		
		//Thread.sleep(7000);
		//validateBillingdeliveryAddress();
		try {
			waitForElementToBeVisible(driver, debitCardSection, 10);
		if(debitCardSection.isDisplayed())
		{
			
			js.executeScript("arguments[0].scrollIntoView();", debitCardName);
			if(debitCardContent.isDisplayed())
			{
				System.out.println("Content of Debit card is: "+debitCardContent.getText());
			}
			else
			{
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
		
			String checkBoxValue1=debitCardCheckBox1.getText();
			System.out.println("Content Of checkBox is :"+checkBoxValue1);
			debitCardCheckBox1.click();
			String checkBoxValue2=debitCardCheckBox2.getText();
			System.out.println("Content Of checkBox is :"+checkBoxValue2);
			debitCardCheckBox2.click();
			String securevalue=secureText.getText();
			System.out.println("Secure text is :"+securevalue);
			
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Debit Card session is not their OR MISSING !!");
		}			
		
	}
	
	public void validateConnectionDetailsButton()
	{
		waitForElementToBeVisible(driver, ReviewDetailsButton, 10);
		if(ReviewDetailsButton.isDisplayed())
		{
			ReviewDetailsButton.click();
		}
		else
		{
			System.out.println("Review connection details button is MISSING !! ");
		}
			
	}
	
	
	public OtpPage validateAllSectionConnectionAddressPage() throws Throwable
	{
		validateConnectionDetailsSection();
		validateBillingdeliveryAddress();
		validateDebitcardSection();
		validateConnectionDetailsButton();
		return new OtpPage();
	}
	       
	
	
}
