package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class OtpPage extends Testbase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//section
	@FindBy(xpath = "//div[@class='user-info']")
	WebElement personalDetailsSection;
	@FindBy(xpath = "//div[@class='card-body detail-table']")
	WebElement yourPlansection;
	@FindBy(xpath = "//div[@class='final-terms']")
	WebElement termConditionsection;
	@FindBy(xpath = "//div[@id='mCSB_2_container']//div[@class='term-type']")
	WebElement acknowledgementsection;
	
	//personal Details Section Content
	@FindBy(xpath = "//td[@class='plan_customer_name']")
	WebElement custName;
	@FindBy(xpath = "//td[@class='plan_customer_email']")
	WebElement custEmail;
	@FindBy(xpath = "//td[@class='plan_customer_phone']")
	WebElement custPhone;
	@FindBy(xpath = "//td[@class='plan_customer_alt_phone']")
	WebElement custAltphone;
	@FindBy(xpath = "//td[@class='plan_customer_dob']")
	WebElement custDOB;
	@FindBy(xpath = "//td[@class='plan_connection_complete_address']")
	WebElement custConnectionAddress;
	@FindBy(xpath = "//td[@class='plan_delivery_complete_address']")
	WebElement custDeliveryAddress;
	@FindBy(xpath = "//td[@class='bplan_billing_complete_address']")
	WebElement custBilling;
	@FindBy(xpath = "//td[@class='plan_customer_id']")
	WebElement custCardID;
	@FindBy(xpath = "//td[@class='plan_exp_date']")
	WebElement custCardExpdate;
	
	
	//Your plan Section Content
	@FindBy(xpath = "//span[@class='selected_plan_name']")
	WebElement planName;
	@FindBy(xpath = "//span[@class='plan_provider_name']")
	WebElement providerName;
	@FindBy(xpath = "//span[@class='plan_contract_length']")
	WebElement contractLength;
	@FindBy(xpath = "//span[@class='plan_download_speed']")
	WebElement downloadSpeed;
	@FindBy(xpath = "//span[@class='plan_upload_speed']")
	WebElement uploadSpeed;
	@FindBy(xpath = "//span[@class='plan_conn_type']")
	WebElement planConnectionType;
	@FindBy(xpath = "//span[@class='plan_data']")
	WebElement planData;
	@FindBy(xpath = "//span[@class='plan_home_conn']")
	WebElement homeCallingPlan;
	@FindBy(xpath = "//span[@class='plan_selected_modem']")
	WebElement modemName;
	@FindBy(xpath = "//span[@class='plan_selected_addons']")
	WebElement addOnName;
	@FindBy(xpath = "//span[@class='plan_conn_delv_date']")
	WebElement connectionDeliveryDate;
	
	//terms and condition Section Content
	@FindBy(xpath = "//img[@class='img img-fluid term_provider_logo']")
	WebElement TandCimage;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/a[1]")
	WebElement TandCproviderLink;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/button[1]")
	WebElement TandCplanLink;
	
	
	//Your acknowledgement section content
	@FindBy(xpath = "//img[@id='providr_logo']")
	WebElement ackImage;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement planAck;
	@FindBy(xpath = "//div[@id='plan_eic_div']//div[@class='discriptionp1']")
	WebElement planAckContent;
//	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
//	WebElement providerAck;
	@FindBy(xpath = "//div[@id='provider_acknldg_content']//div[@class='acknowledgement-inner-info togglehidden1 active']")
	WebElement providerAckContent;
	
	
	
	//check checkBox
	@FindBy(css = "label[for='term_59']")
	WebElement chk1;
	@FindBy(css = "label[for='term_105']")
	WebElement chk2;
	@FindBy(css = "label[for='term_179']")
	WebElement chk3;
	@FindBy(css = "label[for='term_12']")
	WebElement chk4;
	@FindBy(css = "label[for='term_13']")
	WebElement chk5;
	
	
	
	//otp
	@FindBy(xpath = "//input[@id='digit-1']")
	WebElement otp1;
	@FindBy(xpath = "//input[@id='digit-2']")
	WebElement otp2;
	@FindBy(xpath = "//input[@id='digit-3']")
	WebElement otp3;
	@FindBy(xpath = "//input[@id='digit-4']")
	WebElement otp4;
	@FindBy(xpath = "//a[normalize-space()='Submit application']")
	WebElement SaleCreated;
	
	
	//Intilizing The Page Objects
		public OtpPage() {
			// TODO Auto-generated constructor stub
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public void validateOTPpageContent() throws InterruptedException
		{
			waitForElementToBeVisible(driver, personalDetailsSection, 10);
			if(personalDetailsSection.isDisplayed())
			{
				Thread.sleep(3000);
				System.out.println("Customer details are:--------------");
				System.out.println("customer Name :"+custName.getText());				
				System.out.println("customer Email :"+custEmail.getText());				
				System.out.println("customer Phone :"+custPhone.getText());				
				System.out.println("customer DOB :"+custDOB.getText());				
				System.out.println("customer Delivery Address :"+custDeliveryAddress.getText());				
				System.out.println("customer Connection Address :"+custConnectionAddress.getText());				
				System.out.println("customer Card ID :"+custCardID.getText());				
				System.out.println("customer Card Expiry :"+custCardExpdate.getText());				
				System.out.println("customer Billing  Address :"+custBilling.getText());				
				System.out.println("customer Alter Name :"+custAltphone.getText());				
			}
			else
			{
				
				System.out.println("Personal Details Section is MISSING !!");
			}
			waitForElementToBeVisible(driver, yourPlansection, 10);
			if(yourPlansection.isDisplayed())
			{
				System.out.println("Plan details are:--------------");
				System.out.println("Plan Name :"+planName.getText());				
				System.out.println("Provider Name :"+providerName.getText());				
				System.out.println("Plan Contract Length :"+contractLength.getText());				
				System.out.println("Plan Download Speed :"+downloadSpeed.getText());				
				System.out.println("Plan Upload Speed  :"+uploadSpeed.getText());				
				System.out.println("Plan Connection type :"+planConnectionType.getText());				
				System.out.println("Plan data :"+planData.getText());				
				System.out.println("Plan Home Calling Plan :"+homeCallingPlan.getText());				
				System.out.println("Plan Modem Name:"+modemName.getText());				
				System.out.println("Plan Ad on's Name :"+addOnName.getText());				
				System.out.println("Connection Delivery Date :"+connectionDeliveryDate.getText());				
			}
			else
			{
				System.out.println("Your Plan Section is MISSING !!");
			}
			waitForElementToBeVisible(driver, termConditionsection, 10);
			if(termConditionsection.isDisplayed())
			{
				
				if(TandCimage.isDisplayed())
				{
					System.out.println("Provider Image is Visible");
				}
				else 
				{
					System.out.println("Provider Image is NOT Visible");
				}
				waitForElementToBeVisible(driver, TandCproviderLink, 10);
				if(TandCproviderLink.isDisplayed())
				{
					System.out.println("Provider Link :"+TandCproviderLink.getText());
				}
				else
				{
					System.out.println("Term and condition provider Link is MISSING !!");
				}
				waitForElementToBeVisible(driver, TandCplanLink, 10);
				if(TandCplanLink.isDisplayed())
				{
					System.out.println("Provider Link :"+TandCplanLink.getText());
				}
				else
				{
					System.out.println("Term and condition plan Link is MISSING !!");
				}
				
			}
			else
			{
				System.out.println("Term and Condition Section is MISSING !!");
			}
			waitForElementToBeVisible(driver, acknowledgementsection, 10);
			if(acknowledgementsection.isDisplayed())
			{
		
				if(ackImage.isDisplayed())
				{
					System.out.println("Image is Vissible !!!");
				}
				else
				{
					System.out.println("Image is NOT Vissible !!!");
				}
				try {
				waitForElementToBeVisible(driver, planAck, 10);
				if(planAck.isDisplayed())
				{
					js.executeScript("arguments[0].scrollIntoView();", planAckContent);
					System.out.println("Content of Plan Acknowledgement is :"+planAckContent.getText());
				}
			}
				catch(TimeoutException e)
				{
					System.out.println("Plan Acknowledgement Content is MISSING !!");
				}
				
				try {
				waitForElementToBeVisible(driver, providerAckContent, 10);
				if(providerAckContent.isDisplayed())
				{
					js.executeScript("arguments[0].scrollIntoView();", providerAckContent);
					System.out.println("Content of Provider Acknowledgement is :"+providerAckContent.getText());
				}
				}
			catch(TimeoutException e)
				{
					System.out.println("Provider Acknowledgement Content is MISSING OR Section!!");
				}
			}
		}
		
		public void validateCheckBox() throws Throwable
		{
			js.executeScript("arguments[0].scrollIntoView();", chk1);
			Thread.sleep(1000);
			chk1.click();
			chk2.click();
			chk3.click();
			chk4.click();
			chk5.click();
			
		}
		
		public void  validateOtp() throws Throwable
		{
			otp1.sendKeys("2");
			otp2.sendKeys("6");
			otp3.sendKeys("0");
			otp4.sendKeys("8");
			
			
		}		
		public void  validateSubmitSale()
		{
			SaleCreated.click();
		
			
			
		}
		public SaleCreatedPage validateFullJourney() throws Throwable
		{
			validateOTPpageContent();
			validateCheckBox();
			validateOtp();
			validateSubmitSale();
			return new SaleCreatedPage();
		}
		
		

}
