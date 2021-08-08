package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class ConnectionAddress extends Testbase {
	
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
		@FindBy(xpath = "//div[@id='bill_detail_opt']//div[@class='panel-body']")
		WebElement BillingSection;	
		@FindBy(xpath = "//span[@id='billing_email_disp']")
		WebElement BillingEmail;
		@FindBy(xpath = "//label[@for='billing_addr']//span[@class='current_complete_address'][normalize-space()='Unit 30 50 Walker St, RHODES NSW, 2138']")
		WebElement BillingAddress;
		
		@FindBy(xpath = "//div[@id='deliver_detail_opt']//div[@class='panel-body']")
		WebElement deliverySection;
		@FindBy(xpath = "//label[@for='cuurent_delivery_addr']//span[@class='current_complete_address'][normalize-space()='Unit 30 50 Walker St, RHODES NSW, 2138']")
		WebElement DeliveryAddress;
		
		//Credit card Details
		@FindBy(xpath = "//div[@class='ques-wrap dotted-area credit_card_section']")
		WebElement debitCardSection;
		@FindBy(xpath = "//input[@id='dcardName']")
		WebElement debitCardName;
		@FindBy(xpath = "//input[@id='valid_thru']")
		WebElement debitCardValidity;
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
		Thread.sleep(8000);
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
			System.out.println("Connection Address Section is MISSING!!");
		}
		
	}
	
	public void validateBillingdeliveryAddress() throws Throwable
	{
		validateConnectionDetailsSection();
		if(BillingSection.isDisplayed())
		{
			String userBillemail= BillingEmail.getText();
			System.out.println("User Bill will be sent to this email:"+userBillemail);
			String userbillAddress=BillingAddress.getText();
			System.out.println("User Bill will be deliver to this address: "+userbillAddress);
			BillingEmail.click();
			 
			
		}
		else
		{
			System.out.println("Billing Section is MISSING !!");
		}
		if(deliverySection.isDisplayed())
		{
			String deliveryAddress=DeliveryAddress.getText();
			System.out.println("Equiptments will be deliver to Address :"+deliveryAddress);
			DeliveryAddress.click();
		}
		else
		{
			System.out.println("Delivery Section is MISSING!!");
		}
		
		if(debitCardSection.isDisplayed())
		{
			debitCardName.sendKeys("Param-deep");
			debitCardValidity.sendKeys("04 25");
			String checkBoxValue1=debitCardCheckBox1.getText();
			System.out.println("Content Of checkBox is :"+checkBoxValue1);
			debitCardCheckBox1.click();
			String checkBoxValue2=debitCardCheckBox2.getText();
			System.out.println("Content Of checkBox is :"+checkBoxValue2);
			debitCardCheckBox2.click();
			String securevalue=secureText.getText();
			System.out.println("Secure text is :"+securevalue);
			ReviewDetailsButton.click();
		}
	}
	       
	
	
}
