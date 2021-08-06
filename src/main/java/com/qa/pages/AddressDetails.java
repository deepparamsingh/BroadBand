package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class AddressDetails extends Testbase {
	
	//PageFactory
		@FindBy(xpath = "//p[@id='loading']")
		WebElement ribbonBar;		
		
		
		@FindBy(xpath = "//div[@class='noty_body']")
		WebElement holidayDate;
		 String offdaysMessage= "We'd love to get you connected as soon as possible";
		 
		
		 
		 @FindBy(xpath = "//label[@for='moven']")
			WebElement moveInNo;
		 
		@FindBy(xpath = "//a[@id='home_page_next']")
		WebElement nextButton;
		
		
		@FindBy(xpath = "//p[@id='special_note']")
		WebElement specialNote;
		
		
		
		String addressFound="Congratulations!";

		//Intilizing The Page Objects
		public AddressDetails()
		{
			PageFactory.initElements(driver, this);
		}
		
		public void validateRibbon() throws Throwable
		{	
			Thread.sleep(7000);
			String actuaRibonText = ribbonBar.getText();
			if(actuaRibonText.contains(addressFound))
			{
				System.out.println("Address Found!  ------>"+actuaRibonText);
			}
			else
			{
				System.out.println("Address NOT Found! validateRibbon FAILED!");
			}
				
		}
		
		public void validateSpecialNote() 
		{
			if(specialNote.isDisplayed())
			{
				System.out.println("Special-Note VISIBLE");
			}
			else 
			{
				System.out.println("Special-Note is NOT visible");
			}
		}
		
		public PopUpPage validateNextButton() throws Throwable
		{
			Thread.sleep(7000);
			if(nextButton.isDisplayed())
			{
				moveInNo.click();
				nextButton.click();
				System.out.println("validateNextButton-->PASSED!!-->Next Button Clicked");
				return new PopUpPage();
			}
			else
			{
				System.out.println("validateNextButton --> FAILLED!!");
				return null;
			}
			
		}
		public void fullJourney() throws Throwable
		{
			validateRibbon();
			validateSpecialNote();
			validateNextButton();		
		}

}
