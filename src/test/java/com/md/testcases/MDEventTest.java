package com.md.testcases;

import java.net.MalformedURLException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.md.base.TestBase;
import com.md.pages.MDEventPage;
import com.md.pages.QuickQuotesPage;
import com.md.utils.TestUtils;

public class MDEventTest extends TestBase {
	MDEventPage MDEventPage;
	TestUtils TestUtils;
	QuickQuotesPage QuickQuotesPage;

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
		QuickQuotesPage = new QuickQuotesPage();
		Thread.sleep(3000);
	}

//	@Test(priority = 1)
//	public void md_VerifyLogo() throws InterruptedException {
//		boolean flag = MDEventPage.logo();
//		Assert.assertTrue(flag);
//	}

	@Test(priority = 2)
	public void hello() throws InterruptedException  {
		MDEventPage.test1();
	}

//	@AfterMethod
//	public void tearDown() {
//		MDEventPage.Logout();
//		driver.quit();
//	}

}
