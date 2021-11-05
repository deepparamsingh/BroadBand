package com.qa.pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class AddressDetails extends Testbase {
	
	//PageFactory
		@FindBy(xpath = "//p[@id='loading']")
		WebElement ribbonBar;
		
		@FindBy(xpath = "//i[@class='fas fa-times nbn_msg_close']")
		WebElement ribbonBarCrosss;
		
		
		
		
			
		//calendar
		@FindBy(xpath = "//label[@for='movey']")
		WebElement moveInYes;
		@FindBy(xpath = "//div[@class='ui-datepicker-title']")
		WebElement datePickerTitle;
		@FindBy(xpath = "//span[contains(text(),'Next')]")
		WebElement datePickerNext;
		@FindBy(xpath = "//a[contains(text(),'15')]")
		WebElement datePickerDate;		
		@FindBy(xpath = "//label[@for='moven']")
		WebElement moveInNo;
		@FindBy(xpath = "//span[@id='show_date']")
		WebElement selectedDate;
		@FindBy(xpath = "//div[@class='noty_body']")
		WebElement holidayDate;
		//String offdaysMessage= "We'd love to get you connected as soon as possible";
		 
		
		 
		
		@FindBy(xpath = "//a[@id='home_page_next']")
		WebElement nextButton;
		
		
		@FindBy(xpath = "//p[@id='special_note']")
		WebElement specialNote;
		
		
		@FindBy(xpath = "//span[contains(text(),'Internet connection type')]")
		WebElement ict;
		
		
		@FindBy(xpath = "//span[contains(text(),'4G')]")
		WebElement selectICT;
		
		
		
		String addressFound="Congratulations!";
		String adressNotFound="NBN™ is not available";

		//Intilizing The Page Objects
		public AddressDetails()
		{
			PageFactory.initElements(driver, this);
		}
		
		public void validateRibbon() throws Throwable
		{	
			waitForElementToBeVisible(driver, ribbonBarCrosss, 10);
			String actuaRibonText = ribbonBar.getText();
			if(actuaRibonText.contains(addressFound))
			{
				System.out.println("Address Found!  ------>"+actuaRibonText+"\n\n");
			}
			else if(actuaRibonText.contains(adressNotFound))
			{
				ict.click();
				selectICT.click();
			}
			else
			{
				System.out.println("Address NOT Found! validateRibbon FAILED!");
				takeScreenShot("Ribbon Bar");
			}
				
		}
		
		
		public void validateSelectDate() throws Throwable
		{
			waitForElementToBeVisible(driver, ribbonBarCrosss, 10);
			moveInYes.click();
			Thread.sleep(1000);
			waitForElementToBeVisible(driver, datePickerTitle, 10);
			String monthYearVal=datePickerTitle.getText();
			System.out.println("Current month and year :"+monthYearVal);
			String month= monthYearVal.split(" ")[0].trim();
			String year= monthYearVal.split(" ")[1].trim();
			
			waitForElementToBeVisible(driver, datePickerNext, 10);
			while(!(month.equals(prop.getProperty("month")) && year.equals(prop.getProperty("year"))))
			{				
				datePickerNext.click();
				waitForElementToBeVisible(driver, datePickerTitle, 10);
				monthYearVal=datePickerTitle.getText();				
				 month= monthYearVal.split(" ")[0].trim();
				 year= monthYearVal.split(" ")[1].trim();
			}
			waitForElementToBeVisible(driver, datePickerDate, 10);
			datePickerDate.click();	
			System.out.println("Select Month and year :"+monthYearVal);
//			try {
//			if(holidayDate.isDisplayed())
//			{
//				System.out.println("1");
//				String holidayDetails = holidayDate.getText();
//				System.out.println(holidayDetails);	
//							
//			}
//			}
//			catch (Exception e)
			{		
				//System.out.println("2");
				waitForElementToBeVisible(driver, selectedDate, 10);
				System.out.println("Selected Date :"+selectedDate.getText());		
			}
			
			
			
		}
		
		
		
		public void validateSpecialNote() throws Throwable 
		{
			if(specialNote.isDisplayed())
			{
				System.out.println("Special-Note VISIBLE");
			}
			else 
			{
				System.out.println("Special-Note is NOT visible");
				takeScreenShot("Special-Note");
			}
		}
		
		public void validateNextButton() throws Throwable
		{
			try {
			waitForElementToBeVisible(driver, nextButton, 10);
			if(nextButton.isDisplayed())
			{
				nextButton.click();
				System.out.println("validateNextButton-->PASSED!!-->Next Button Clicked");
				//return new PopUpPage();
			}
			
			}
			catch (ElementClickInterceptedException e) 
				{
					System.out.println("validateNextButton --> FAILLED!!");
					takeScreenShot("Next Button");
					//return null;
				}
			
			
		}
		public PopUpPage validateFullJourney() throws Throwable
		{
			validateRibbon();
			validateSelectDate();
			validateSpecialNote();
			validateNextButton();	
			return new PopUpPage();
		}

}
