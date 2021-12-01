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
//	@FindBy(xpath = "//span[@class='plan_download_speed']")
//	WebElement downloadSpeed;
	@FindBy(xpath = "//tbody/tr[6]/td[2]")
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
	
//	//check checkBox
//		@FindBy(css = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/p[1]/p[1]/span[1]/label[1]")
//		WebElement chk1;
//		@FindBy(css = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[4]/div[2]/div[3]/p[1]/p[1]/span[1]/label[1]")
//		WebElement chk2;
//		@FindBy(css = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[4]/div[2]/div[3]/p[1]/p[2]/span[1]/label[1]")
//		WebElement chk3;
//		@FindBy(css = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[4]/div[2]/div[4]/p[1]/p[1]/span[1]/label[1]")
//		WebElement chk4;
//		@FindBy(css = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[4]/div[2]/div[4]/p[1]/p[2]/span[1]/label[1]")
//		WebElement chk5;
	
	
	
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
				logger.info("Customer details are:--------------");
				logger.info("customer Name :"+custName.getText());				
				logger.info("customer Email :"+custEmail.getText());				
				logger.info("customer Phone :"+custPhone.getText());				
				logger.info("customer DOB :"+custDOB.getText());				
				logger.info("customer Delivery Address :"+custDeliveryAddress.getText());				
				logger.info("customer Connection Address :"+custConnectionAddress.getText());				
				logger.info("customer Card ID :"+custCardID.getText());				
				logger.info("customer Card Expiry :"+custCardExpdate.getText());				
				logger.info("customer Billing  Address :"+custBilling.getText());				
				logger.info("customer Alter Name :"+custAltphone.getText());				
			}
			else
			{
				
				logger.error("Personal Details Section is MISSING !!");
			}
			waitForElementToBeVisible(driver, yourPlansection, 10);
			if(yourPlansection.isDisplayed())
			{
				logger.info("Plan details are:--------------");
				logger.info("Plan Name :"+planName.getText());				
				logger.info("Provider Name :"+providerName.getText());				
				logger.info("Plan Contract Length :"+contractLength.getText());				
				logger.info("Plan Speed :"+downloadSpeed.getText());				
				logger.info("Plan Upload Speed  :"+uploadSpeed.getText());				
				logger.info("Plan Connection type :"+planConnectionType.getText());				
				logger.info("Plan data :"+planData.getText());				
				logger.info("Plan Home Calling Plan :"+homeCallingPlan.getText());				
				logger.info("Plan Modem Name:"+modemName.getText());				
				logger.info("Plan Ad on's Name :"+addOnName.getText());				
				logger.info("Connection Delivery Date :"+connectionDeliveryDate.getText());				
			}
			else
			{
				logger.error("Your Plan Section is MISSING !!");
			}
			waitForElementToBeVisible(driver, termConditionsection, 10);
			if(termConditionsection.isDisplayed())
			{
				
				if(TandCimage.isDisplayed())
				{
					logger.info("Provider Image is Visible");
				}
				else 
				{
					logger.error("Provider Image is NOT Visible");
				}
				waitForElementToBeVisible(driver, TandCproviderLink, 10);
				if(TandCproviderLink.isDisplayed())
				{
					logger.info("Provider Link :"+TandCproviderLink.getText());
				}
				else
				{
					logger.error("Term and condition provider Link is MISSING !!");
				}
				waitForElementToBeVisible(driver, TandCplanLink, 10);
				if(TandCplanLink.isDisplayed())
				{
					logger.info("Provider Link :"+TandCplanLink.getText());
				}
				else
				{
					logger.error("Term and condition plan Link is MISSING !!");
				}
				
			}
			else
			{
				logger.error("Term and Condition Section is MISSING !!");
			}
			waitForElementToBeVisible(driver, acknowledgementsection, 10);
			if(acknowledgementsection.isDisplayed())
			{
		
				if(ackImage.isDisplayed())
				{
					logger.info("Image is Vissible !!!");
				}
				else
				{
					logger.error("Image is NOT Vissible !!!");
				}
				try {
				waitForElementToBeVisible(driver, planAck, 10);
				if(planAck.isDisplayed())
				{
					js.executeScript("arguments[0].scrollIntoView();", planAckContent);
					logger.info("Content of Plan Acknowledgement is :"+planAckContent.getText());
				}
			}
				catch(TimeoutException e)
				{
					logger.error("Plan Acknowledgement Content is MISSING !!");
				}
				
				try {
				waitForElementToBeVisible(driver, providerAckContent, 10);
				if(providerAckContent.isDisplayed())
				{
					js.executeScript("arguments[0].scrollIntoView();", providerAckContent);
					logger.info("Content of Provider Acknowledgement is :"+providerAckContent.getText());
				}
				}
			catch(TimeoutException e)
				{
				logger.error("Provider Acknowledgement Content is MISSING OR Section!!");
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
