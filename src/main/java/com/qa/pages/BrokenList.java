package com.qa.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class BrokenList extends Testbase {
	
	
	@FindBy(tagName = "a") List<WebElement> links;
	
	//Intilizing The Page Objects
	public BrokenList() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void pub() {
		// TODO Auto-generated method stub
		System.out.println(links.size());
		
		List<String> urlList = new ArrayList<String>();
		
		for(WebElement e:links)
		{
			String url= e.getAttribute("href");
			//urlList.add(url);         //fast check but requires 1.8 jvm
			checkBrokenLinks(url);      // slow check
			
		}
		
//		long stTime=System.currentTimeMillis();
//		//urlList.parallelStream().forEach(e -> checkBrokenLinks(e)));         parallel stream works with java 1.8 only . uncomment when to use
//		long endTime = System.currentTimeMillis();
//		
//		System.out.println("Total Time Taken: "+(endTime-stTime));
		driver.quit();
		
		

	}
	
	public static void checkBrokenLinks(String linkUrl) 
	{
		try {
			URL url=new URL(linkUrl);
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();
			
			if(httpURLConnection.getResponseCode() >= 400)
			{
				System.out.println(linkUrl +"-----> "+httpURLConnection.getResponseMessage() +" is a broken Link");
			}
			else
			{
				System.out.println(linkUrl +"-----> "+httpURLConnection.getResponseCode());
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	

}
