package com.qa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class BasicInfoPage extends Testbase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//Page factory
	//your details section
	@FindBy(xpath = "//div[@class='sub-wrap dotted-area details-part basic_detail_section']")
	WebElement yourDetailssection;	
	@FindBy(xpath = "//span[contains(text(),'None')]")
	WebElement titleDropdown;	
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/span[1]/ul[1]/li[4]/span[1]")
	WebElement selectTitle;
	@FindBy(xpath = "//input[@id='fname']")
	WebElement fName;
	@FindBy(xpath = "//input[@id='lname']")
	WebElement lName;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='pnum']")
	WebElement pNum;
	@FindBy(xpath = "//input[@id='altpnum']")
	WebElement altpNum;
	@FindBy(xpath = "//input[@id='db']")
	WebElement dB;
	
	
	//your connection section
	@FindBy(xpath = "//div[@class='sub-wrap dotted-area connection-details connection_details_section']")
	WebElement connectionDetailsSection;	
	@FindBy(xpath = "//label[@for='alreayaccountno']")
	WebElement alreayaccountno;
	@FindBy(xpath = "//label[@for='alreadyaccountyes']")
	WebElement alreadyaccountyes;
	@FindBy(xpath = "//input[@id='accountno']")
	WebElement EnterAccountno;	
	@FindBy(xpath = "//label[@for='existingphoneno']")
	WebElement existingphoneno;
	@FindBy(xpath = "//label[@for='existingphoneyes']")
	WebElement existingphoneyes;
	@FindBy(xpath = "//input[@id='homeno']")
	WebElement Enterhomeno;
	@FindBy(xpath = "//input[@id='currentacount']")
	WebElement Entercurrentacount;
	@FindBy(xpath = "//label[contains(text(),'I have authority to transfer this service')]")
	WebElement haveAuthorityCheckBox;
	
	
	
	
	
	//your identification section
	@FindBy(xpath = "//div[@class='ques-wrap dotted-area identification-area identity_detail_section']")
	WebElement IdentificationdetailsSection;
	@FindBy(xpath = "//div[@class='ques-wrap dotted-area identification-area identity_detail_section']//ul[@class='radio-opt']")
	WebElement ListOfIdentificationdetailsBar;
	@FindBy(xpath = "//div[@class='ques-wrap dotted-area identification-area identity_detail_section']//ul[@class='radio-opt']")
	List<WebElement> ListOfIdentificationdetails;	
	@FindBy(xpath = "//label[normalize-space()='Australian Passport']")
	WebElement AustralianPassport;	
	//label[normalize-space()='Drivers Licence']
	//label[normalize-space()='Medicare Card']
	//label[normalize-space()='Foreign Passport']	
	@FindBy(xpath = "//input[@id='passport_number']")
	WebElement passport_number;
	@FindBy(xpath = "//input[@id='passport_exp']")
	WebElement passport_exp;



	
	//employment details
	@FindBy(xpath = "//div[@class='ques-wrap dotted-area employment-area employement_detail_section']")
	WebElement EmploymentDetailsSection;	
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	WebElement industry;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[1]/span[1]/ul[1]/li[3]/span[1]")
	WebElement selectindustry;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")
	WebElement occupationType;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[1]/span[1]/ul[1]/li[4]/span[1]")
	WebElement SelectoccupationType;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
	WebElement employmentStatus;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/span[1]/ul[1]/li[2]/span[1]")
	WebElement SelectemploymentStatus;
	
	
	@FindBy(xpath = "//input[@id='Occupation']")
	WebElement enterOccupation;
	
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]")
	WebElement timeOfCurrentEmploymentYear;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[1]/span[1]/ul[1]/li[6]/span[1]")
	WebElement SelectTOCEyear;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]")
	WebElement timeOfCurrentEmploymentMonth;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[1]/span[1]/ul[1]/li[6]/span[1]")
	WebElement SelectTOCEmonth;
	
	
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[7]/div[1]/ul[1]/li[1]/label[1]")
	WebElement doYouHaveCreditCardYES;
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[7]/div[1]/ul[1]/li[2]/label[1]")
	WebElement doYouHaveCreditCardNO;
	
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
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		connectionDetailsButton.click();
		
	}
	
	public void validateYourDetailsSection() throws Throwable 
	{
		Thread.sleep(5000);
		if(yourDetailssection.isDisplayed())
		{
			titleDropdown.click();
			selectTitle.click();
			String FirstName=fName.getText();
			System.out.println("Name of User is :"+FirstName);
			lName.sendKeys("Singh");
			String userEmail=email.getText();
			System.out.println("Email of User is :"+userEmail);
			String userPhon=pNum.getText();
			System.out.println("User Phone Number is :"+userPhon);
			altpNum.sendKeys("0455555555");
			dB.sendKeys("02 02 1995");
		}
		else
		{
			System.out.println("Your Details section is Missing !!");
		}
		
	}
	public void validateconnectionDetailsSection() throws Throwable
	{
		validateYourDetailsSection();
		if(connectionDetailsSection.isDisplayed())
		{
			alreadyaccountyes.click();
			EnterAccountno.sendKeys("1478961289");
			existingphoneyes.click();
			Enterhomeno.sendKeys("0244564645");
			Entercurrentacount.sendKeys("7418529636");
			haveAuthorityCheckBox.click();
			
		}
		else {
			System.out.println("Connection Details section is Missing !!");
		}
	}
	
	public void validateIdentificationDetailsSection() throws Throwable
	{
		
		validateconnectionDetailsSection();
		if(IdentificationdetailsSection.isDisplayed())
		{
			AustralianPassport.click();
			passport_number.sendKeys("56566655515");
			Thread.sleep(1000);
			passport_exp.sendKeys("15 05 2025");
			
		}
		else {
			System.out.println("Identification Details section is Missing !!");
		}
		
	}
	
	public ConnectionAddress validateEmploymentdetailsSection() throws Throwable
	{
		
		validateIdentificationDetailsSection();
		if(EmploymentDetailsSection.isDisplayed())
		{
			industry.click();
			selectindustry.click();
			occupationType.click();
			SelectoccupationType.click();
			employmentStatus.click();
			SelectemploymentStatus.click();
			enterOccupation.sendKeys("techie");
			timeOfCurrentEmploymentYear.click();
			SelectTOCEyear.click();
			timeOfCurrentEmploymentMonth.click();
			SelectTOCEmonth.click();
			doYouHaveCreditCardYES.click();
			connectionDetailsButton.click();
			connectionDetailsButton.click();
			Thread.sleep(4000);
			return new ConnectionAddress();
			
			
		}
		else {
			System.out.println("Employment Details section is Missing !!");
			return null;
		}
		
	}
}
