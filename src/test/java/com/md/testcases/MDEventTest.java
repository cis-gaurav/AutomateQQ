package com.md.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.md.base.TestBase;
import com.md.pages.MDEventPage;
import com.md.utils.TestUtils;

public class MDEventTest extends TestBase {
	MDEventPage MDEventPage;
	TestUtils TestUtils;

/////Need to create constructor super keyword will initialize  properties file
	public MDEventTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws MalformedURLException, InterruptedException {
		initializationAndLogin();
////Need to create object of class 
		MDEventPage = new MDEventPage();
		TestUtils = new TestUtils();
		Thread.sleep(3000);
	}

	@Test
	public void hi() throws InterruptedException {
		System.out.println("Hi");
		MDEventPage.test1();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
