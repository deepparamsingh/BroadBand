package com.qa.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.BrokenList;

public class BrokenLinkTest extends Testbase{

	
	BrokenList brokenList;
	
	
	public BrokenLinkTest()
	{
		super();
	}
	
	@BeforeMethod
	   public void setup() throws Throwable
	   {
		   initialization();
		   brokenList = new BrokenList();
		   
	   }
	
	
	@Test(priority=1)
	public void validateBrokenLinksTest() throws Throwable
	{
		
		brokenList.pub();
	  
	}
}
