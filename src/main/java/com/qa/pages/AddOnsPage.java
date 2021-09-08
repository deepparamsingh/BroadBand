package com.qa.pages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class AddOnsPage extends Testbase {
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	
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
					System.out.println("Title of addOn Page is -->"+Title);
				}
				else
				{
					System.out.println("Title MISS-Match");
				}
				
			}
			
			public void validateHomeCallingSection() throws Throwable
			{
				try {
					waitForElementToBeVisible(driver, homecallingSection, 10);
				if(homecallingSection.isDisplayed())
				{
					String HCplanName=homecallingName.getText();
					System.out.println("Name of Home Calling Plan is ->"+HCplanName);
					homecallingSelectButton.click();
							
						List<WebElement> homeCallingFeaturePoints = homecallingFeatures;
				       
						System.out.println("-----Below are the list of home calling features points-----");
						
				        for (WebElement getHomecallingFeature : homeCallingFeaturePoints) 
				        	{
				            	String value = getHomecallingFeature.getText();
				            	System.out.println(value);
				        	}
				        System.out.println("--------------------------------");						
				}
					}
				catch (TimeoutException e)
				{
					System.out.println("Exception Occurs--> Home Calling Section MISSING");
				}
				
				String homecallingPlanCost=homecallingCost.getText();
				System.out.println("Cost for home Calling Plan modem is :"+homecallingPlanCost);
				if(homecallingViewDetails.isDisplayed())
				{
					homecallingViewDetails.click();
				}
				else
				{
					System.out.println("Home calling View Details Link Visible");
				}
				
			}
			public void validateModemSection() throws Throwable
			{
				
				
			}
			public void validateOtherAddonSection() throws Throwable
			{
				
				
			}
			
						
			public void validateIdentificationButton() throws Throwable
			{
				//Thread.sleep(6000);
				try {
					waitForElementToBeVisible(driver, identificationSubmitButton, 10);
				if(identificationSubmitButton.isDisplayed())
				{
					identificationSubmitButton.click();
					System.out.println("Identification Button Clicked !!");
					
				}
				}
				catch (NoSuchElementException e)
				{
					System.out.println("Exception Occurs--> Identification Button MISSING");
				}
				
			}
			
			
			public void fullJourney() throws Throwable
			{
				Thread.sleep(3000);
				String Title=driver.getTitle();
				if(Title.contentEquals(actualTitle))
				{
					System.out.println("Title of addOn Page is -->"+Title);
				}
				else
				{
					System.out.println("Title MISS-Match");
				}
				
			}
			
			
			
			public BasicInfoPage validateFullJourney() throws Throwable
			{
				//validateAddOntitle();
				validateIdentificationButton();
				return new BasicInfoPage();
				
			}
			
	
	
	
}
