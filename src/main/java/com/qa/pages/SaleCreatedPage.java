package com.qa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class SaleCreatedPage extends Testbase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	//PageFactory	
	
			@FindBy(xpath = "//h6[contains(text(),'Thank you')]")
			WebElement congratulations;
			@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[1]/h1[1]")
			WebElement referenceNo;			
			@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[1]/p[1]")
			WebElement belowReferencenumber;
			@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[2]/div[1]")
			WebElement WHNcontentSection;
			@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[2]/div[1]/ul[1]")
			List<WebElement> WHNcontent;
			
			
			
			

			
			
			//Intilizing The Page Objects
			public SaleCreatedPage() {
				// TODO Auto-generated constructor stub
				PageFactory.initElements(driver, this);
			}
			//Actions
			
			public void validateCongratulations() throws Throwable
			{
				try {
				waitForElementToBeVisible(driver, congratulations, 10);
				if(congratulations.isDisplayed())
				{
				System.out.println(congratulations.getText());
				}
				}
				catch (TimeoutException e) {
					System.out.println("Congratulations Line MISSING!!!!");
				}
			}
			
			public void validateReferenceNumber() throws Throwable
			{
				try {
				waitForElementToBeVisible(driver, referenceNo, 10);
				if(referenceNo.isDisplayed())
				{
				System.out.println("Your Reference Number is :"+referenceNo.getText());
				}
				}
				catch (TimeoutException e) {
					System.out.println("Reference Number is MISSING!!!!");
				}
			}
			
			public void validateWHNcontent() throws Throwable
			{
				try {
				if(WHNcontentSection.isDisplayed())
				{
					List<WebElement> WHNcontentPoints = WHNcontent;
			        //System.out.println("Total points in This Plan Inclusion are: "+planInclusionPoints.size());
					System.out.println("-----Below are the list of What happen Next points-----");
					
			        for (WebElement getWHNcontentPoints : WHNcontentPoints) 
			        	{
			            	String WHNPoints = getWHNcontentPoints.getText();
			            	System.out.println(WHNPoints);
			        	}
			        System.out.println("--------------------------------");
				}
				}
				catch (TimeoutException e) {
					System.out.println("Content of What Happen Next is MISSING!!!!");
				}
			}
			
			public void validateBelowReferenceContent() throws Throwable
			{
				try {
				waitForElementToBeVisible(driver, belowReferencenumber, 10);
				if(belowReferencenumber.isDisplayed())
				{
				System.out.println(belowReferencenumber.getText());
				}
				}
				catch (TimeoutException e) {
					System.out.println("Below Reference content is MISSING!!!");
				}
			}
			
			public void validateFulljourney() throws Throwable
			{
				validateCongratulations();
				validateWHNcontent();
				validateReferenceNumber();
				validateBelowReferenceContent();
			}
			
			

}
