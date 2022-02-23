package com.qa.testcase;

import org.testng.TestNG;

public class TestRunner {

	static TestNG testNg;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ExtentReportListner ext= new ExtentReportListner();
	testNg = new TestNG();
	testNg.setTestClasses(new Class[] {SaleCreatedTest.class});
	//testNg.addListener(ext);
	testNg.run();

	}

}
