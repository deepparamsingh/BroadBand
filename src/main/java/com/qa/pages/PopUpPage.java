package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class PopUpPage extends Testbase {
	
	//PageFactory
	
	//info POP UP
		@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]")
		WebElement infoPopUp;
		
		//validation message
		@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
		WebElement nameValidateMsg;
		@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]")
		WebElement emailValidateMsg;		
		@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]")
		WebElement phoneValidateMsg;
		
		//info pop up credentials
		@FindBy(xpath = "//input[@id='customer_name']")
		WebElement cust_name;
		@FindBy(xpath = "//input[@id='customer_email']")
		WebElement cust_email;
		@FindBy(xpath = "//input[@id='customer_mob']")
		WebElement cust_phone;		
		
		//validation wrong messages
		String nameValidationMessage="Please enter name";		
		String emailValidationMessage="Please enter email";		
		String phoneValidationMessage="Please enter mobile number";
		String wrongNameMessage="Name may only contain letters and spaces.";
		String wrongEmailMessage="Please enter a valid email address.";
		String wrongPhoneMessage="Please enter a valid mobile number.";	
		
		//submit button
		@FindBy(xpath = "//a[contains(text(),'View my plans')]")
		WebElement submitButton;
		
		//top bar features
		@FindBy(xpath = "//a[@id='nav-combo-tab']")
		WebElement serviceTab;
		@FindBy(xpath = "//span[@id='service_name']")
		WebElement serviceTabName;
		@FindBy(xpath = "//span[@id='plan_count']")
		WebElement planCount;		
		@FindBy(xpath = "//span[@id='set_postcode']")
		WebElement topAddress;
		@FindBy(xpath = "//div[@id='slider']")
		WebElement typicalEveningSpeedSlider;
		@FindBy(xpath = "//a[normalize-space()='Filter Results']")
		WebElement filter;
		
		
		//View plan details and apply
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/img[1]")
		WebElement providerLOGO;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]/strong[1]")
		WebElement planName;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[2]/span[1]")
		WebElement planContractName;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")
		WebElement planViewDetails;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/a[1]")
		WebElement planKeyFacts;
		
		
		
		
		
		
		
		//Intilizing The Page Objects
		public PopUpPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public void validateinfoPopup() throws Throwable
		{
			Thread.sleep(2000);
			if(infoPopUp.isDisplayed())
			{
				System.out.println("validateinfoPopup ---> Passed");
			}
			else
			{
				System.out.println("validateinfoPopup ---> Failled");
			}
		}
		
		public void validateValidations() throws Throwable
		{
			
			Thread.sleep(5000);
			submitButton.click();
			Thread.sleep(2000);
			String nameValidation=nameValidateMsg.getText();
			String emailValidation = emailValidateMsg.getText();
			String phoneValidation = phoneValidateMsg.getText();
			if(nameValidation.contains(nameValidationMessage))
			{
				System.out.println("Validation message for name is visible");
			}
			else
			{
				System.out.println("Validation message for name is NOT- visible");
			}
			if(emailValidation.contains(emailValidationMessage))
			{
				System.out.println("Validation message for email is visible");
			}
			else
			{
				System.out.println("Validation message for email is NOT-visible");
			}
			if(phoneValidation.contains(phoneValidationMessage))
			{
				System.out.println("Validation message for email is visible");
			}
			else
			{
				System.out.println("Validation message for phone is NOT-visible");
			}
			
		}
		
		
		public PopUpPage validateWrongCredentials() throws Throwable
		{
			Thread.sleep(4000);
			cust_name.sendKeys("12234%%");
			submitButton.click();
			String s1=nameValidateMsg.getText();
			System.out.println("Enetred name as 12234%% -->"+s1);
			Thread.sleep(2000);
			cust_email.sendKeys("paramdeeps/cimet.com.au");
			submitButton.click();
			String s2=emailValidateMsg.getText();
			System.out.println("Enetred email as paramdeeps/cimet.com.au -->"+s2);
			Thread.sleep(2000);
			cust_phone.sendKeys("qwerty");
			submitButton.click();
			String s3=phoneValidateMsg.getText();
			System.out.println("Enetred phone as qwerty -->"+s3);
			Thread.sleep(2000);
		    submitButton.click();
		    return new PopUpPage();
			
		}
		
		
		public PopUpPage validateCredentials() throws Throwable
		{
			Thread.sleep(4000);
			cust_name.clear();
			cust_name.sendKeys(prop.getProperty("username"));
			Thread.sleep(2000);
			cust_email.clear();
			cust_email.sendKeys(prop.getProperty("email"));
			Thread.sleep(2000);
			cust_phone.clear();
			cust_phone.sendKeys(prop.getProperty("phone"));
			Thread.sleep(2000);
		    submitButton.click();
		    return new PopUpPage();
			
		}
		
		public void validateTopBarFeatures() throws Throwable 
		{
			
			validateCredentials();
			if(serviceTab.isDisplayed())
			{
				String serviceName=serviceTabName.getText();
				if(serviceName.isEmpty())
				{
					System.out.println("Service Name Broadband is missing.");	
				}
				else {
				System.out.println("Service Name is: -->"+serviceName);
				}

				String totalPlan=planCount.getText();
				if(totalPlan.isEmpty())
				{
				System.out.println("Count of total Plan is missing");
				}
				else
				{
					System.out.println("Count of Total is--> "+totalPlan);
				}
				String address= topAddress.getText();
				if(address.isEmpty())
				{
					System.out.println("Address on top is missing");
				}
				else
				{
					System.out.println("Addrss is -->"+address);
				}
				
				if(typicalEveningSpeedSlider.isDisplayed()) 
				{
					System.out.println("Typical Evening Speed Slider is Visible");
				}
				else
				{
					System.out.println("Typical Evening Speed Slider is MISSING ");
				}
				if(filter.isDisplayed())
				{
					System.out.println("Filter is visible");
				}
				else
				{
					System.out.println("Filter is MISSING");
				}
			}
		}


}
