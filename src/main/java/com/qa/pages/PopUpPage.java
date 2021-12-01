package com.qa.pages;

import java.util.List;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class PopUpPage extends Testbase {
	
public static String planNameSpecialText;
public static String planNameText;
	

	
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
		@FindBy(xpath = "//body[1]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/p[2]")
		WebElement typicalEveningspeedSatellite;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/p[2]")
		WebElement typicalEveningspeedSatelliteSpecial;
		
		
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
				logger.info("validateinfoPopup ---> Passed");
			}
			else
			{
				logger.error("validateinfoPopup ---> Failled");
				takeScreenShot("Info Pop-Up");
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
				logger.info("Validation message for name is visible: "+nameValidation);
			}
			else
			{
				logger.error("Validation message for name is NOT- visible");
				takeScreenShot("Name validation");
			}
			if(emailValidation.contains(emailValidationMessage))
			{
				logger.info("Validation message for email is visible: "+emailValidation);
			}
			else
			{
				logger.error("Validation message for email is NOT-visible");
				takeScreenShot("email validation");
			}
			if(phoneValidation.contains(phoneValidationMessage))
			{
				logger.info("Validation message for phone is visible: "+phoneValidation);
			}
			else
			{
				logger.error("Validation message for phone is NOT-visible");
				takeScreenShot("phone validation");
			}
			
		}
		
		
		public PopUpPage validateWrongCredentials() throws Throwable
		{
			
			waitForElementToBeVisible(driver, cust_name, 10);
			cust_name.sendKeys("12234%%");
			submitButton.click();
			String s1=nameValidateMsg.getText();
			logger.info("Enetred name as 12234%% -->"+s1);
			
			waitForElementToBeVisible(driver, cust_email, 10);
			cust_email.sendKeys("paramdeeps/cimet.com.au");
			submitButton.click();
			String s2=emailValidateMsg.getText();
			logger.info("Enetred email as paramdeeps/cimet.com.au -->"+s2);
			
			waitForElementToBeVisible(driver, cust_phone, 10);
			cust_phone.sendKeys("qwerty");
			submitButton.click();
			String s3=phoneValidateMsg.getText();
			logger.info("Enetred phone as qwerty -->"+s3);
			
		    submitButton.click();
		    return new PopUpPage();
			
		}
		
		
		public PopUpPage validateCredentials() throws Throwable
		{
			
			waitForElementToBeVisible(driver, cust_name, 15);
			cust_name.clear();
			cust_name.sendKeys(prop.getProperty("username"));
			
			waitForElementToBeVisible(driver, cust_email, 15);
			cust_email.clear();
			cust_email.sendKeys(prop.getProperty("email"));
		
			waitForElementToBeVisible(driver, cust_phone, 15);
			cust_phone.clear();
			cust_phone.sendKeys(prop.getProperty("phone"));
			
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
					logger.error("Service Name Broadband is missing.");	
				}
				else {
				logger.info("Service Name is: -->"+serviceName);
				}

				String totalPlan=planCount.getText();
				if(totalPlan.isEmpty())
				{
					logger.error("Count of total Plan is missing");
				}
				else
				{
					logger.info("Count of Total is--> "+totalPlan);
				}
				String address= topAddress.getText();
				if(address.isEmpty())
				{
					logger.error("Address on top is missing");
				}
				else
				{
					logger.info("Addrss is -->"+address);
				}
				try {
				if(typicalEveningSpeedSlider.isDisplayed()) 
				{
					logger.info("Typical Evening Speed Slider is Visible");
				}
			}
			catch(TimeoutException e)
				{
				logger.error("Typical Evening Speed Slider is MISSING or its a satellite address ");
				}
				if(filter.isDisplayed())
				{
					logger.info("Filter is visible");
				}
				else
				{
					logger.error("Filter is MISSING");
				}
			}
			else
			{
				logger.error("Top Bar Features is MISSING!!!");
				takeScreenShot("Nav Bar plan listing");
			}
		}
		

		public AddOnsPage validateCheckPlan() throws Throwable
		{
			try {
				waitForElementToBeVisible(driver, specialOfferBarSpecial, 15);
				if(specialOfferBarSpecial.isDisplayed())
				{
					logger.info("Special Offer Bar is displayed!! (s)");
					
					List<WebElement> specialOfferBarDetailsPoints = specialOfferBarDetailsSpecial;
			        //logger.info("Total points in This Plan Inclusion are: "+planInclusionPoints.size());
					logger.info("-----Below are the list of Special Offer Bar points-----");
					
			        for (WebElement getspecialOfferBarDetails : specialOfferBarDetailsPoints) 
			        	{
			            	String name = getspecialOfferBarDetails.getText();
			            	logger.info(name);
			        	}
			        logger.info("--------------------------------");
				}
				else
				{
					logger.error("Special offer Bar is MISSING!!! (s)");
				}
				waitForElementToBeVisible(driver, providerLOGOSpecial, 15);
				if(providerLOGOSpecial.isDisplayed())
				{
					logger.info("LOGO of provider is visible (s)");
				}
				else
				{
					logger.error("LOGO of provider is NOT visible (s)");
				}
				waitForElementToBeVisible(driver, planNameSpecial, 15);
				if(planNameSpecial.isDisplayed()) 
				{
					planNameSpecialText=planNameSpecial.getText();
					logger.info("Name of plan is (s) : --> "+planNameSpecialText);
				}
				else
				{
					logger.error("Plan name is MISSING!! (s)");
				}
				waitForElementToBeVisible(driver, planContractNameSpecial, 15);
				if(planContractNameSpecial.isDisplayed())
				{
					String contract=planContractNameSpecial.getText();
					logger.info("Contract of plan is (s) :--->"+contract);
				}
				else
				{
					logger.error("Contract of plan is MISSING!! (s)");
				}
				waitForElementToBeVisible(driver, planViewDetailsSpecial, 15);
				if(planViewDetailsSpecial.isDisplayed())
				{
					logger.info("View plan Link Displayed (s)");
					Thread.sleep(1000);
					planViewDetailsSpecial.click();
					
					try {
					waitForElementToBeVisible(driver, viewPlanEmailButtons, 15);
					if(viewPlanEmailButtons.isDisplayed())
					{
						viewPlanEmailButtons.click();
						waitForElementToBeVisible(driver, mailSent, 10);
						logger.info("Mail Sent (s)");						
						crossViewDetails.click();
					}
					}
					catch (TimeoutException e) 
					{
						logger.error("Email Template is DISABLE or Send Email Button is MISSING!!!! (s)");
						logger.error("Mail NOT Sent (s)");						
						crossViewDetails.click();
					}
		
				}
				else
				{
					logger.error("View plan Link is NOT Displayed (s)");
				}
				waitForElementToBeVisible(driver, planKeyFactsSpecial, 15);
				if(planKeyFactsSpecial.isDisplayed())
				{
					logger.info("KeyFact Link Displayed (s)");
				}
				else
				{
					logger.error("KeyFact Link is NOT Displayed (s)");
				}
				waitForElementToBeVisible(driver, planInclussionSectionSpecial, 15);
				if(planInclussionSectionSpecial.isDisplayed())
				{
					logger.info("Plan inclusion section is displayed!! (s)");
					
				List<WebElement> planInclusionPoints = planInclusionDetailsSpecial;
		        //logger.info("Total points in This Plan Inclusion are: "+planInclusionPoints.size());
				logger.info("-----Below are the list of plan Inclussion points-----");
				
		        for (WebElement getPlanInclussion : planInclusionPoints) 
		        	{
		            	String name = getPlanInclussion.getText();
		            	logger.info(name);
		        	}
		        logger.info("--------------------------------");
				}
				else
				{
					logger.info("Plan Inclusion");
				}	
				waitForElementToBeVisible(driver, planCostSpecial, 15);
				if(planCostSpecial.isDisplayed())
				{
					String planCost1=planCostSpecial.getText();
					logger.info("Cost of this plan is  (s):"+planCost1+"/M");
				}
				else
				{
					logger.error("Cost of plan is MISSING!!! (s)");
				}
				try {
				waitForElementToBeVisible(driver, typicalEveningspeedSpecial, 15);
				if(typicalEveningspeedSpecial.isDisplayed())
				{
					String typicaleveningSpeed1=typicalEveningspeedSpecial.getText();
					logger.info("Typical Evening Speed of plan is (s):"+typicaleveningSpeed1+"/Mbps");
				}
				}
				catch(TimeoutException e)
				{
					if(typicalEveningspeedSatelliteSpecial.isDisplayed())
					{
					String tesSatelliteSpecial=typicalEveningspeedSatelliteSpecial.getText();
					logger.info("Typical Evening Speed of Satellite plan is (s):"+tesSatelliteSpecial);
					//logger.info("Typical Evening speed of plan  is MISSING!! (s) - or its a satellite address");
					}
					else 
					{
						String tesSatellite=typicalEveningspeedSatellite.getText();
						logger.info("Typical Evening Speed of Satellite plan is:"+tesSatellite);
					}
				}
				waitForElementToBeVisible(driver, planActualCostSpecial, 15);
				if(planActualCostSpecial.isDisplayed())
				{
					String actualCost=planActualCostSpecial.getText();
					logger.info("Preview cost of this Plan is (s): "+actualCost);
				}
				else
				{
					logger.error("Special Cost of Plan is MISSING!! (s)");
				}
				return new AddOnsPage();		
			
		}
					
			catch (TimeoutException e)
			{
				waitForElementToBeVisible(driver, providerLOGO, 15);
				if(providerLOGO.isDisplayed())
				{
					logger.info("LOGO of provider is visible");
				}
				else
				{
					logger.error("LOGO of provider is NOT visible");
				}
				waitForElementToBeVisible(driver, planName, 15);
				if(planName.isDisplayed()) 
				{
					planNameText=planName.getText();
					logger.info("Name of plan is : --> "+planNameText);
					
				}
				else
				{
					logger.error("Plan name is MISSING!!");
				}
				waitForElementToBeVisible(driver, planContractName, 15);
				if(planContractName.isDisplayed())
				{
					String contract=planContractName.getText();
					logger.info("Contract of plan is :--->"+contract);
				}
				else
				{
					logger.error("Contract of plan is MISSING!!");
				}
				waitForElementToBeVisible(driver, planViewDetails, 15);
				if(planViewDetails.isDisplayed())
				{
					logger.info("View plan Link Displayed");
					planViewDetails.click();
					//Thread.sleep(3000);
					waitForElementToBeVisible(driver, viewPlanEmailButtons, 15);
					if(viewPlanEmailButtons.isDisplayed())
					{
						viewPlanEmailButtons.click();
						logger.info("Send Plan button clicked");
						waitForElementToBeVisible(driver, mailSent, 15);
						//mailSent.isDisplayed();
						logger.info("Mail Sent");
						//Thread.sleep(4000);
						crossViewDetails.click();
					}
					else
					{
						logger.error("Send Email Button is MISSING!!!!");
					}
				}
				else
				{
					logger.error("View plan Link is NOT Displayed");
				}
				waitForElementToBeVisible(driver, planKeyFacts, 15);
				if(planKeyFacts.isDisplayed())
				{
					logger.info("KeyFact Link Displayed");
				}
				else
				{
					logger.error("KeyFact Link is NOT Displayed");
				}
				waitForElementToBeVisible(driver, planInclussionSection, 15);
				if(planInclussionSection.isDisplayed())
				{
					logger.info("Plan inclusion section is displayed!!");
					
				List<WebElement> planInclusionPoints = planInclusionDetails;
		        //logger.info("Total points in This Plan Inclusion are: "+planInclusionPoints.size());
				logger.info("-----Below are the list of plan Inclussion points-----");
				
		        for (WebElement getPlanInclussion : planInclusionPoints) 
		        	{
		            	String name = getPlanInclussion.getText();
		            	logger.info(name);
		        	}
		        logger.info("--------------------------------");
				}
				else
				{
					logger.info("Plan Inclusion");
				}
				waitForElementToBeVisible(driver, planCost, 15);
				if(planCost.isDisplayed())
				{
					String planCost1=planCost.getText();
					logger.info("Cost of this plan is :"+planCost1+"/M");
				}
				else
				{
					logger.error("Cost of plan is MISSING!!!");
				}
				waitForElementToBeVisible(driver, typicalEveningspeed, 15);
				if(typicalEveningspeed.isDisplayed())
				{
					String typicaleveningSpeed1=typicalEveningspeed.getText();
					logger.info("Typical Evening Speed of plan is :"+typicaleveningSpeed1+"/Mbps");
				}
				else
				{
					logger.error("Typical Evening speed of plan  is MISSING!!");
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
					logger.info("Plan Applied !! (s)");
					return new AddOnsPage();
				}
				else
				{
					logger.error("Apply button Is MISSING!!! (s)");
					takeScreenShot("Plan Apply button(S)");
					return null;
				}
				
				}
			catch(TimeoutException e)
			{
				waitForElementToBeVisible(driver, applyPlan, 15);
				if(applyPlan.isDisplayed())
				{
					applyPlan.click();
					logger.info("Plan Applied (T)!!");
					return new AddOnsPage();
				}
				else
				{
					logger.error("Apply button Is MISSING!!!");
					takeScreenShot("Plan Apply button");
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