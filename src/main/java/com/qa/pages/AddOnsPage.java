package com.qa.pages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class AddOnsPage extends Testbase {
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	
	PopUpPage pp1= new PopUpPage();
	
	@FindBy(xpath = "//ul[@class='price-month-list dynamic_other_addon']//li[@class='dynamic_order_detail_li']//span[1]")
	WebElement planName;
	
	@FindBy(xpath = "//ul[@class='price-month-list dynamic_other_addon']")
	WebElement yourOrderList;
	
	
	//All sections
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]")
	WebElement homecallingSection;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]")
	WebElement modemSection;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]")
	WebElement otherAddonSection;
	
	//Home Calling Section
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/strong[1]/span[1]")
	WebElement homecallingName;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement homecallingSelectButton;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]")
	List<WebElement> homecallingFeatures;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/strong[1]")
	WebElement homecallingCost;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]")
	WebElement homecallingViewDetails;
	
	
	//Modem Section
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/strong[1]/span[1]")
		WebElement modemName;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]")
		WebElement modemSelectButton;
		@FindBy(xpath = "//body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/ul[1]")
		List<WebElement> modemFeatures;
		@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/strong[1]")
		WebElement modemCost;
		
	
		
		//OtherAddon's Section
				@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]/label[1]")
				WebElement otherAddonName;
				@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/button[1]")
				WebElement otherAddonSelectButton;
				@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[2]/div[2]/h4[1]/p[2]")
				List<WebElement> otherAddonFeatures;
				@FindBy(xpath = "//body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[2]/div[3]/p[1]")
				WebElement otherAddonCost;
	
	@FindBy(xpath = "//a[normalize-space()='Identification Details']")
	WebElement identificationSubmitButton;
	
	
	
	String actualTitle="Econnex - Mobile Comparison | Compare Mobile Plans";
	
	
	//Intilizing The Page Objects
			public AddOnsPage() {
				// TODO Auto-generated constructor stub
				PageFactory.initElements(driver, this);
				
			}
			
			//Actions
			public void validateAddOntitle() throws Throwable
			{
				Thread.sleep(3000);
				String Title=driver.getTitle();
				if(Title.contentEquals(actualTitle))
				{
					logger.info("Title of addOn Page is -->"+Title);
				}
				else
				{
					logger.error("Title MISS-Match");
				}
				
			}
			
			public void validateHomeCallingSection() throws Throwable
			{
				try {
					waitForElementToBeVisible(driver, homecallingSection, 10);
				if(homecallingSection.isDisplayed())
				{
					String HCplanName=homecallingName.getText();
					logger.info("Name of Home Calling Plan is ->"+HCplanName);
					homecallingSelectButton.click();
					logger.info("Home calling Modem Selected!!");
							
						List<WebElement> homeCallingFeaturePoints = homecallingFeatures;
				       
						logger.info("-----Below are the list of home calling features points-----");
						
				        for (WebElement getHomecallingFeature : homeCallingFeaturePoints) 
				        	{
				            	String value = getHomecallingFeature.getText();
				            	logger.info(value);
				        	}
				        logger.info("--------------------------------");	
				    	String homecallingPlanCost=homecallingCost.getText();
						logger.info("Cost for home Calling Plan modem is :"+homecallingPlanCost+"\n\n");
				}
					}
				catch (NoSuchElementException e)
				{
					logger.error("Exception Occurs--> Home Calling Section MISSING");
				}
				
				
			}
						
			
			public void validateModemSection() throws Throwable
			{
				try {
					waitForElementToBeVisible(driver, modemSection, 10);
				if(modemSection.isDisplayed())
				{
					String ModemName=modemName.getText();
					logger.info("Name of Modem is ->"+ModemName);
					modemSelectButton.click();
					logger.info("Modem Selected!!");
							
						List<WebElement> modemFeaturePoints = modemFeatures;
				       
						logger.info("-----Below are the list of Modem features points-----");
						
				        for (WebElement getModemFeature : modemFeaturePoints) 
				        	{
				            	String value = getModemFeature.getText();
				            	logger.info(value);
				        	}
				        logger.info("--------------------------------");		
				        String ModemCost=modemCost.getText();
						logger.info("Cost for modem is :"+ModemCost+"\n\n");
				}
					}
				catch (NoSuchElementException e)
				{
					logger.error("Exception Occurs--> Modem Section MISSING");
				}
				
//				String ModemCost=modemCost.getText();
//				logger.info("Cost for modem is :"+ModemCost+"\n\n");
								
			}
			
			public void validateOtherAddonSection() throws Throwable
			{
				
				try {
					waitForElementToBeVisible(driver, otherAddonSection, 10);
				if(otherAddonSection.isDisplayed())
				{
					String otherAddOnName=otherAddonName.getText();
					logger.info("Name of Other AddOn is ->"+otherAddOnName);
					otherAddonSelectButton.click();
					logger.info("Other Addon Selected!!");
							
						List<WebElement> otherAddonFeaturePoints = otherAddonFeatures;
				       
						logger.info("-----Below are the list of Other AddOn features points-----");
						
				        for (WebElement getOtherAddOnFeature : otherAddonFeaturePoints) 
				        	{
				            	String value = getOtherAddOnFeature.getText();
				            	logger.info(value);
				        	}
				        logger.info("--------------------------------");	
				        String otherAddOnCost=otherAddonCost.getText();
						logger.info("Cost for modem is :"+otherAddOnCost+"\n\n");
				}
					}
				catch (NoSuchElementException e)
				{
					logger.error("Exception Occurs--> Other AddOn Section MISSING");
				}
				
//				String otherAddOnCost=otherAddonCost.getText();
//				logger.info("Cost for modem is :"+otherAddOnCost+"\n\n");
			}
			
						
			public void validateIdentificationButton() throws Throwable
			{
				//Thread.sleep(6000);
				try {
					waitForElementToBeVisible(driver, identificationSubmitButton, 10);
				if(identificationSubmitButton.isDisplayed())
				{
					identificationSubmitButton.click();
					logger.info("Identification Button Clicked !!");
					
				}
				}
				catch (NoSuchElementException e)
				{
					logger.error("Exception Occurs--> Identification Button MISSING");
				}
				
			}

			
			
			
		public void ValidatePlanName()
		{
			try {
			String n= PopUpPage.planNameSpecialText;
			logger.info("get in method 1:"+n);
			
			}
			catch (Exception e) {
				// TODO: handle exception
				String m= PopUpPage.planNameText;
				logger.info("get in method 2:"+m);
			}
			
		
		}
			
		
			
			
			public BasicInfoPage validateFullJourney() throws Throwable
			{
				validateHomeCallingSection();
				validateModemSection();
				validateOtherAddonSection();
				validateIdentificationButton();
				return new BasicInfoPage();
				
			}
			
	
	
	
}
