package com.qa.pages;

import java.util.List;

import org.openqa.selenium.TimeoutException;
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
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/img[1]")
		WebElement providerLOGO;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/img[1]")
		WebElement providerLOGOSpecial;
		
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]/strong[1]")
		WebElement planName;
		@FindBy(xpath = "//body[1]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/p[1]/strong[1]")
		WebElement planNameSpecial;
		
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[2]/span[1]")
		WebElement planContractName;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/p[2]/span[1]")
		WebElement planContractNameSpecial;
		
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")
		WebElement planViewDetails;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/a[1]")
		WebElement planViewDetailsSpecial;
		
		@FindBy(xpath = "//div[contains(text(),'Mail have been sent')]")
		WebElement mailSent;
		
		
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/a[1]")
		WebElement planKeyFacts;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[4]/a[1]")
		WebElement planKeyFactsSpecial;
		
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")
		WebElement planInclussionSection;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]")
		WebElement planInclussionSectionSpecial;
		
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]")
		List<WebElement> planInclusionDetails;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/ul[1]")
		List<WebElement> planInclusionDetailsSpecial;
		
		@FindBy(xpath = "//body[1]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/p[1]/span[1]")
		WebElement typicalEveningspeed;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/p[1]/span[1]")
		WebElement typicalEveningspeedSpecial;
		
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/p[1]/span[1]")
		WebElement planCost;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/p[1]/span[1]")
		WebElement planCostSpecial;
		
		
		
		
		
		//special offer additional parameters which comes only under this special offer case
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/p[1]/span[3]/strike[1]")
		WebElement planActualCostSpecial;
				
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]")
		WebElement specialOfferBarSpecial;		
		
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]")
		List<WebElement> specialOfferBarDetailsSpecial;	
		
		
		
		
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]")	 
		WebElement applyPlan;	
		
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/a[1]")	 
		WebElement applyPlanSpecial;
		
		//Comman parameters in both special and non-special plans
		@FindBy(xpath = "//button[contains(text(),'Email Plan Details')]")
		WebElement viewPlanEmailButtons;
		
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/i[1]")
		WebElement crossViewDetails;
		
		
		
		
		
		
		
		
		//Intilizing The Page Objects
		public PopUpPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public void validateinfoPopup() throws Throwable
		{
			//Thread.sleep(2000);
			waitForElementToBeVisible(driver, infoPopUp, 10);
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
			
			waitForElementToBeVisible(driver, submitButton, 10);
			submitButton.click();
			waitForElementToBeVisible(driver, nameValidateMsg, 10);
			String nameValidation=nameValidateMsg.getText();
			waitForElementToBeVisible(driver, emailValidateMsg, 10);
			String emailValidation = emailValidateMsg.getText();
			waitForElementToBeVisible(driver, phoneValidateMsg, 10);
			String phoneValidation = phoneValidateMsg.getText();
			if(nameValidation.contains(nameValidationMessage))
			{
				System.out.println("Validation message for name is visible: "+nameValidation);
			}
			else
			{
				System.out.println("Validation message for name is NOT- visible");
			}
			if(emailValidation.contains(emailValidationMessage))
			{
				System.out.println("Validation message for email is visible: "+emailValidation);
			}
			else
			{
				System.out.println("Validation message for email is NOT-visible");
			}
			if(phoneValidation.contains(phoneValidationMessage))
			{
				System.out.println("Validation message for phone is visible: "+phoneValidation);
			}
			else
			{
				System.out.println("Validation message for phone is NOT-visible");
			}
			
		}
		
		
		public PopUpPage validateWrongCredentials() throws Throwable
		{
			//Thread.sleep(4000);
			waitForElementToBeVisible(driver, cust_name, 10);
			cust_name.sendKeys("12234%%");
			submitButton.click();
			String s1=nameValidateMsg.getText();
			System.out.println("Enetred name as 12234%% -->"+s1);
			//Thread.sleep(2000);
			waitForElementToBeVisible(driver, cust_email, 10);
			cust_email.sendKeys("paramdeeps/cimet.com.au");
			submitButton.click();
			String s2=emailValidateMsg.getText();
			System.out.println("Enetred email as paramdeeps/cimet.com.au -->"+s2);
			//Thread.sleep(2000);
			waitForElementToBeVisible(driver, cust_phone, 10);
			cust_phone.sendKeys("qwerty");
			submitButton.click();
			String s3=phoneValidateMsg.getText();
			System.out.println("Enetred phone as qwerty -->"+s3);
			//Thread.sleep(2000);
		    submitButton.click();
		    return new PopUpPage();
			
		}
		
		
		public PopUpPage validateCredentials() throws Throwable
		{
			//Thread.sleep(6000);
			waitForElementToBeVisible(driver, cust_name, 15);
			cust_name.clear();
			cust_name.sendKeys(prop.getProperty("username"));
			//Thread.sleep(2000);
			waitForElementToBeVisible(driver, cust_email, 15);
			cust_email.clear();
			cust_email.sendKeys(prop.getProperty("email"));
			//Thread.sleep(2000);
			waitForElementToBeVisible(driver, cust_phone, 15);
			cust_phone.clear();
			cust_phone.sendKeys(prop.getProperty("phone"));
			//Thread.sleep(2000);
			waitForElementToBeVisible(driver, submitButton, 15);
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
			else
			{
				System.out.println("Top Bar Features is MISSING!!!");
			}
		}
		
//		public AddOnsPage validateCheckPlan() throws Throwable
//		{
//			
//			waitForElementToBeVisible(driver, providerLOGO, 15);
//			if(providerLOGO.isDisplayed())
//			{
//				System.out.println("LOGO of provider is visible");
//			}
//			else
//			{
//				System.out.println("LOGO of provider is NOT visible");
//			}
//			waitForElementToBeVisible(driver, planName, 15);
//			if(planName.isDisplayed()) 
//			{
//				String planNameText=planName.getText();
//				System.out.println("Name of plan is : --> "+planNameText);
//			}
//			else
//			{
//				System.out.println("Plan name is MISSING!!");
//			}
//			waitForElementToBeVisible(driver, planContractName, 15);
//			if(planContractName.isDisplayed())
//			{
//				String contract=planContractName.getText();
//				System.out.println("Contract of plan is :--->"+contract);
//			}
//			else
//			{
//				System.out.println("Contract of plan is MISSING!!");
//			}
//			waitForElementToBeVisible(driver, planViewDetails, 15);
//			if(planViewDetails.isDisplayed())
//			{
//				System.out.println("View plan Link Displayed");
//				planViewDetails.click();
//				//Thread.sleep(3000);
//				waitForElementToBeVisible(driver, viewPlanEmailButtons, 15);
//				if(viewPlanEmailButtons.isDisplayed())
//				{
//					viewPlanEmailButtons.click();
//					waitForElementToBeVisible(driver, mailSent, 15);
//					//mailSent.isDisplayed();
//					System.out.println("Mail Sent");
//					//Thread.sleep(4000);
//					crossViewDetails.click();
//				}
//				else
//				{
//					System.out.println("Send Email Button is MISSING!!!!");
//				}
//			}
//			else
//			{
//				System.out.println("View plan Link is NOT Displayed");
//			}
//			waitForElementToBeVisible(driver, planKeyFacts, 15);
//			if(planKeyFacts.isDisplayed())
//			{
//				System.out.println("KeyFact Link Displayed");
//			}
//			else
//			{
//				System.out.println("KeyFact Link is NOT Displayed");
//			}
//			waitForElementToBeVisible(driver, planInclussionSection, 15);
//			if(planInclussionSection.isDisplayed())
//			{
//				System.out.println("Plan inclusion section is displayed!!");
//				
//			List<WebElement> planInclusionPoints = planInclusionDetails;
//	        //System.out.println("Total points in This Plan Inclusion are: "+planInclusionPoints.size());
//			System.out.println("-----Below are the list of plan Inclussion points-----");
//			
//	        for (WebElement getPlanInclussion : planInclusionPoints) 
//	        	{
//	            	String name = getPlanInclussion.getText();
//	            	System.out.println(name);
//	        	}
//	        System.out.println("--------------------------------");
//			}
//			else
//			{
//				System.out.println("Plan Inclusion");
//			}
//			waitForElementToBeVisible(driver, planCost, 15);
//			if(planCost.isDisplayed())
//			{
//				String planCost1=planCost.getText();
//				System.out.println("Cost of this plan is :"+planCost1+"/M");
//			}
//			else
//			{
//				System.out.println("Cost of plan is MISSING!!!");
//			}
//			waitForElementToBeVisible(driver, typicalEveningspeed, 15);
//			if(typicalEveningspeed.isDisplayed())
//			{
//				String typicaleveningSpeed1=typicalEveningspeed.getText();
//				System.out.println("Typical Evening Speed of plan is :"+typicaleveningSpeed1+"/Mbps");
//			}
//			else
//			{
//				System.out.println("Typical Evening speed of plan  is MISSING!!");
//			}
//			return new AddOnsPage();
//		}
//		
//		
//		
//		public AddOnsPage validateCheckPlanSpecial() throws Throwable
//		{
//			//validateCredentials();
//			//Thread.sleep(2000);
//			waitForElementToBeVisible(driver, specialOfferBarSpecial, 15);
//			if(specialOfferBarSpecial.isDisplayed())
//			{
//				System.out.println("Special Offer Bar is displayed!! (s)");
//				
//				List<WebElement> specialOfferBarDetailsPoints = specialOfferBarDetailsSpecial;
//		        //System.out.println("Total points in This Plan Inclusion are: "+planInclusionPoints.size());
//				System.out.println("-----Below are the list of Special Offer Bar points-----");
//				
//		        for (WebElement getspecialOfferBarDetails : specialOfferBarDetailsPoints) 
//		        	{
//		            	String name = getspecialOfferBarDetails.getText();
//		            	System.out.println(name);
//		        	}
//		        System.out.println("--------------------------------");
//			}
//			else
//			{
//				System.out.println("Special offer Bar is MISSING!!! (s)");
//			}
//			waitForElementToBeVisible(driver, providerLOGOSpecial, 15);
//			if(providerLOGOSpecial.isDisplayed())
//			{
//				System.out.println("LOGO of provider is visible (s)");
//			}
//			else
//			{
//				System.out.println("LOGO of provider is NOT visible (s)");
//			}
//			waitForElementToBeVisible(driver, planNameSpecial, 15);
//			if(planNameSpecial.isDisplayed()) 
//			{
//				String planNameText=planNameSpecial.getText();
//				System.out.println("Name of plan is (s) : --> "+planNameText);
//			}
//			else
//			{
//				System.out.println("Plan name is MISSING!! (s)");
//			}
//			waitForElementToBeVisible(driver, planContractNameSpecial, 15);
//			if(planContractNameSpecial.isDisplayed())
//			{
//				String contract=planContractNameSpecial.getText();
//				System.out.println("Contract of plan is (s) :--->"+contract);
//			}
//			else
//			{
//				System.out.println("Contract of plan is MISSING!! (s)");
//			}
//			waitForElementToBeVisible(driver, planViewDetailsSpecial, 15);
//			if(planViewDetailsSpecial.isDisplayed())
//			{
//				System.out.println("View plan Link Displayed (s)");
//				planViewDetailsSpecial.click();
//				//Thread.sleep(3000);
//				waitForElementToBeVisible(driver, viewPlanEmailButtons, 15);
//				if(viewPlanEmailButtons.isDisplayed())
//				{
//					//Thread.sleep(2000);
//					viewPlanEmailButtons.click();
//					waitForElementToBeVisible(driver, mailSent, 15);
//					//mailSent.isDisplayed();
//					System.out.println("Mail Sent (s)");
//					//Thread.sleep(4000);
//					crossViewDetails.click();
//				}
//				else
//				{
//					System.out.println("Send Email Button is MISSING!!!! (s)");
//				}
//			}
//			else
//			{
//				System.out.println("View plan Link is NOT Displayed (s)");
//			}
//			waitForElementToBeVisible(driver, planKeyFactsSpecial, 15);
//			if(planKeyFactsSpecial.isDisplayed())
//			{
//				System.out.println("KeyFact Link Displayed (s)");
//			}
//			else
//			{
//				System.out.println("KeyFact Link is NOT Displayed (s)");
//			}
//			waitForElementToBeVisible(driver, planInclussionSectionSpecial, 15);
//			if(planInclussionSectionSpecial.isDisplayed())
//			{
//				System.out.println("Plan inclusion section is displayed!! (s)");
//				
//			List<WebElement> planInclusionPoints = planInclusionDetailsSpecial;
//	        //System.out.println("Total points in This Plan Inclusion are: "+planInclusionPoints.size());
//			System.out.println("-----Below are the list of plan Inclussion points-----");
//			
//	        for (WebElement getPlanInclussion : planInclusionPoints) 
//	        	{
//	            	String name = getPlanInclussion.getText();
//	            	System.out.println(name);
//	        	}
//	        System.out.println("--------------------------------");
//			}
//			else
//			{
//				System.out.println("Plan Inclusion");
//			}	
//			waitForElementToBeVisible(driver, planCostSpecial, 15);
//			if(planCostSpecial.isDisplayed())
//			{
//				String planCost1=planCostSpecial.getText();
//				System.out.println("Cost of this plan is  (s):"+planCost1+"/M");
//			}
//			else
//			{
//				System.out.println("Cost of plan is MISSING!!! (s)");
//			}
//			waitForElementToBeVisible(driver, typicalEveningspeedSpecial, 15);
//			if(typicalEveningspeedSpecial.isDisplayed())
//			{
//				String typicaleveningSpeed1=typicalEveningspeedSpecial.getText();
//				System.out.println("Typical Evening Speed of plan is (s):"+typicaleveningSpeed1+"/Mbps");
//			}
//			else
//			{
//				System.out.println("Typical Evening speed of plan  is MISSING!! (s)");
//			}
//			waitForElementToBeVisible(driver, planActualCostSpecial, 15);
//			if(planActualCostSpecial.isDisplayed())
//			{
//				String actualCost=planActualCostSpecial.getText();
//				System.out.println("Preview cost of this Plan is (s): "+actualCost);
//			}
//			else
//			{
//				System.out.println("Special Cost of Plan is MISSING!! (s)");
//			}
//			return new AddOnsPage();
//						
//		}
		//--------------------------------------------------------------------
		//--------------------------------------------------------------------
		public AddOnsPage validateCheckPlan() throws Throwable
		{
			try {
				waitForElementToBeVisible(driver, specialOfferBarSpecial, 15);
				if(specialOfferBarSpecial.isDisplayed())
				{
					System.out.println("Special Offer Bar is displayed!! (s)");
					
					List<WebElement> specialOfferBarDetailsPoints = specialOfferBarDetailsSpecial;
			        //System.out.println("Total points in This Plan Inclusion are: "+planInclusionPoints.size());
					System.out.println("-----Below are the list of Special Offer Bar points-----");
					
			        for (WebElement getspecialOfferBarDetails : specialOfferBarDetailsPoints) 
			        	{
			            	String name = getspecialOfferBarDetails.getText();
			            	System.out.println(name);
			        	}
			        System.out.println("--------------------------------");
				}
				else
				{
					System.out.println("Special offer Bar is MISSING!!! (s)");
				}
				waitForElementToBeVisible(driver, providerLOGOSpecial, 15);
				if(providerLOGOSpecial.isDisplayed())
				{
					System.out.println("LOGO of provider is visible (s)");
				}
				else
				{
					System.out.println("LOGO of provider is NOT visible (s)");
				}
				waitForElementToBeVisible(driver, planNameSpecial, 15);
				if(planNameSpecial.isDisplayed()) 
				{
					String planNameText=planNameSpecial.getText();
					System.out.println("Name of plan is (s) : --> "+planNameText);
				}
				else
				{
					System.out.println("Plan name is MISSING!! (s)");
				}
				waitForElementToBeVisible(driver, planContractNameSpecial, 15);
				if(planContractNameSpecial.isDisplayed())
				{
					String contract=planContractNameSpecial.getText();
					System.out.println("Contract of plan is (s) :--->"+contract);
				}
				else
				{
					System.out.println("Contract of plan is MISSING!! (s)");
				}
				waitForElementToBeVisible(driver, planViewDetailsSpecial, 15);
				if(planViewDetailsSpecial.isDisplayed())
				{
					System.out.println("View plan Link Displayed (s)");
					planViewDetailsSpecial.click();
					//Thread.sleep(3000);
					try {
					waitForElementToBeVisible(driver, viewPlanEmailButtons, 15);
					if(viewPlanEmailButtons.isDisplayed())
					{
						viewPlanEmailButtons.click();
						waitForElementToBeVisible(driver, mailSent, 10);
						System.out.println("Mail Sent (s)");						
						crossViewDetails.click();
					}
					}
					catch (TimeoutException e) 
					{
						System.out.println("Email Template is DISABLE or Send Email Button is MISSING!!!! (s)");
						System.out.println("Mail NOT Sent (s)");						
						crossViewDetails.click();
					}
		
				}
				else
				{
					System.out.println("View plan Link is NOT Displayed (s)");
				}
				waitForElementToBeVisible(driver, planKeyFactsSpecial, 15);
				if(planKeyFactsSpecial.isDisplayed())
				{
					System.out.println("KeyFact Link Displayed (s)");
				}
				else
				{
					System.out.println("KeyFact Link is NOT Displayed (s)");
				}
				waitForElementToBeVisible(driver, planInclussionSectionSpecial, 15);
				if(planInclussionSectionSpecial.isDisplayed())
				{
					System.out.println("Plan inclusion section is displayed!! (s)");
					
				List<WebElement> planInclusionPoints = planInclusionDetailsSpecial;
		        //System.out.println("Total points in This Plan Inclusion are: "+planInclusionPoints.size());
				System.out.println("-----Below are the list of plan Inclussion points-----");
				
		        for (WebElement getPlanInclussion : planInclusionPoints) 
		        	{
		            	String name = getPlanInclussion.getText();
		            	System.out.println(name);
		        	}
		        System.out.println("--------------------------------");
				}
				else
				{
					System.out.println("Plan Inclusion");
				}	
				waitForElementToBeVisible(driver, planCostSpecial, 15);
				if(planCostSpecial.isDisplayed())
				{
					String planCost1=planCostSpecial.getText();
					System.out.println("Cost of this plan is  (s):"+planCost1+"/M");
				}
				else
				{
					System.out.println("Cost of plan is MISSING!!! (s)");
				}
				waitForElementToBeVisible(driver, typicalEveningspeedSpecial, 15);
				if(typicalEveningspeedSpecial.isDisplayed())
				{
					String typicaleveningSpeed1=typicalEveningspeedSpecial.getText();
					System.out.println("Typical Evening Speed of plan is (s):"+typicaleveningSpeed1+"/Mbps");
				}
				else
				{
					System.out.println("Typical Evening speed of plan  is MISSING!! (s)");
				}
				waitForElementToBeVisible(driver, planActualCostSpecial, 15);
				if(planActualCostSpecial.isDisplayed())
				{
					String actualCost=planActualCostSpecial.getText();
					System.out.println("Preview cost of this Plan is (s): "+actualCost);
				}
				else
				{
					System.out.println("Special Cost of Plan is MISSING!! (s)");
				}
				return new AddOnsPage();		
			
		}
					
			catch (TimeoutException e)
			{
				waitForElementToBeVisible(driver, providerLOGO, 15);
				if(providerLOGO.isDisplayed())
				{
					System.out.println("LOGO of provider is visible");
				}
				else
				{
					System.out.println("LOGO of provider is NOT visible");
				}
				waitForElementToBeVisible(driver, planName, 15);
				if(planName.isDisplayed()) 
				{
					String planNameText=planName.getText();
					System.out.println("Name of plan is : --> "+planNameText);
				}
				else
				{
					System.out.println("Plan name is MISSING!!");
				}
				waitForElementToBeVisible(driver, planContractName, 15);
				if(planContractName.isDisplayed())
				{
					String contract=planContractName.getText();
					System.out.println("Contract of plan is :--->"+contract);
				}
				else
				{
					System.out.println("Contract of plan is MISSING!!");
				}
				waitForElementToBeVisible(driver, planViewDetails, 15);
				if(planViewDetails.isDisplayed())
				{
					System.out.println("View plan Link Displayed");
					planViewDetails.click();
					//Thread.sleep(3000);
					waitForElementToBeVisible(driver, viewPlanEmailButtons, 15);
					if(viewPlanEmailButtons.isDisplayed())
					{
						viewPlanEmailButtons.click();
						waitForElementToBeVisible(driver, mailSent, 15);
						//mailSent.isDisplayed();
						System.out.println("Mail Sent");
						//Thread.sleep(4000);
						crossViewDetails.click();
					}
					else
					{
						System.out.println("Send Email Button is MISSING!!!!");
					}
				}
				else
				{
					System.out.println("View plan Link is NOT Displayed");
				}
				waitForElementToBeVisible(driver, planKeyFacts, 15);
				if(planKeyFacts.isDisplayed())
				{
					System.out.println("KeyFact Link Displayed");
				}
				else
				{
					System.out.println("KeyFact Link is NOT Displayed");
				}
				waitForElementToBeVisible(driver, planInclussionSection, 15);
				if(planInclussionSection.isDisplayed())
				{
					System.out.println("Plan inclusion section is displayed!!");
					
				List<WebElement> planInclusionPoints = planInclusionDetails;
		        //System.out.println("Total points in This Plan Inclusion are: "+planInclusionPoints.size());
				System.out.println("-----Below are the list of plan Inclussion points-----");
				
		        for (WebElement getPlanInclussion : planInclusionPoints) 
		        	{
		            	String name = getPlanInclussion.getText();
		            	System.out.println(name);
		        	}
		        System.out.println("--------------------------------");
				}
				else
				{
					System.out.println("Plan Inclusion");
				}
				waitForElementToBeVisible(driver, planCost, 15);
				if(planCost.isDisplayed())
				{
					String planCost1=planCost.getText();
					System.out.println("Cost of this plan is :"+planCost1+"/M");
				}
				else
				{
					System.out.println("Cost of plan is MISSING!!!");
				}
				waitForElementToBeVisible(driver, typicalEveningspeed, 15);
				if(typicalEveningspeed.isDisplayed())
				{
					String typicaleveningSpeed1=typicalEveningspeed.getText();
					System.out.println("Typical Evening Speed of plan is :"+typicaleveningSpeed1+"/Mbps");
				}
				else
				{
					System.out.println("Typical Evening speed of plan  is MISSING!!");
				}
				return new AddOnsPage();				
				
			}
		}
		
		
		
		
		//--------------------------------------------------------------------
		//--------------------------------------------------------------------
		
		public AddOnsPage validateApplyButton() throws Throwable 
		{
			try {
				waitForElementToBeVisible(driver, applyPlanSpecial, 15);
				if(applyPlanSpecial.isDisplayed())
				{
					applyPlanSpecial.click();
					System.out.println("Plan Applied !! (s)");
					return new AddOnsPage();
				}
				else
				{
					System.out.println("Apply button Is MISSING!!! (s)");
					return null;
				}
				
				}
			catch(TimeoutException e)
			{
				waitForElementToBeVisible(driver, applyPlan, 15);
				if(applyPlan.isDisplayed())
				{
					applyPlan.click();
					System.out.println("Plan Applied (T)!!");
					return new AddOnsPage();
				}
				else
				{
					System.out.println("Apply button Is MISSING!!!");
					return null;
				}
			}
			
		}
		
		
		public AddOnsPage fullJourney() throws Throwable
		{

			validateCredentials();
			validateCheckPlan();
			validateApplyButton();
			return new AddOnsPage();
			
		}


}