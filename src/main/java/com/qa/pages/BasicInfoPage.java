package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class BasicInfoPage extends Testbase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//Page factory
	@FindBy(xpath = "//a[normalize-space()='Connection Details']")
	WebElement connectionDetailsButton;
	

	

	
	//Intilizing The Page Objects
	public BasicInfoPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Actions
	public void validateErrorMessages() throws Throwable
	{
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		connectionDetailsButton.click();
		
	}
	
}
