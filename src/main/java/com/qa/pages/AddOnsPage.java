package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class AddOnsPage extends Testbase {
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;

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
			public BasicInfoPage validateIdentificationButton() throws Throwable
			{
				Thread.sleep(3000);
				if(identificationSubmitButton.isDisplayed())
				{
					identificationSubmitButton.click();
					System.out.println("Identification Button Clicked !!");
					return new BasicInfoPage();
				}
				else
				{
					System.out.println("Identification Button MISSING");
				}	return null;
			}
			
			
	
	
	
}
