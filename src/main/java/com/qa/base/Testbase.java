package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.firefox.FirefoxDriver;    ----------- unable to get firefox driver

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static Logger logger;
	
	
	
	
	public Testbase()
	{
		try {
			prop = new Properties();
			//String property_file="C:/Users/paramdeep/git/eyenus_BroadBand/eyenus/src/main/java/com/qa/config/config.properties";
			String property_file="/src/main/java/com/qa/config/config.properties";
			String currentPath = System. getProperty("user.dir");
			FileInputStream ip= new FileInputStream(currentPath + property_file);
			prop.load(ip);
		}
		catch (FileLockInterruptionException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static void initialization()
	{
		String browserName= prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.silentOutput", "true");
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			//System.setProperty("webdriver.chrome.logfile","./Chromelog.txt");
			
			WebDriverManager.chromedriver().setup();
			//driver= new ChromeDriver();
			
			ChromeOptions opt = new ChromeOptions();
			opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking","enable-automation")); 
			driver= new ChromeDriver(opt);
			
			logger = Logger.getLogger("Broadband");
			PropertyConfigurator.configure("log4j.properties");
		}
		else if(browserName.equals("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\paramdeep\\Downloads\\Driver\\chromedriver.exe" );
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();    //---- unable to get firefox webdriver
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		
	}

	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void clickOn(WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	
	}
	public static void takeScreenShot(String filename) throws Throwable
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:/Users/paramdeep/git/eyenus_BroadBand/eyenus/ScreenShots/"+filename+".jpg"));
		
	}
	
	public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement webElement, int seconds )
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
		return element;
	}
	public static String getTextvalue(WebElement element)
	{
		String text = element.getText();
		return text;
	}

}
 