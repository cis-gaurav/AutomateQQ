package com.md.testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.md.base.TestBase;
import com.md.pages.Contract;
import com.md.pages.QuickQuotes;

public class QuickQuotesTest extends TestBase {

	QuickQuotes QuickQuotesPage;
	
	// Need to create constructor to initialize properties file
	public QuickQuotesTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException {
		initialization();
		QuickQuotesPage = new QuickQuotes();
		TestBase.login();//User get logged in 
		QuickQuotesPage.redirectFromMDDashboardtoQQCreate();
	}

	@Test(priority = 1)
	public void verifyValidationMessageOnNamefield() throws InterruptedException {
		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString()); 
		boolean flag = QuickQuotesPage.createNameFieldValidaions();
		Assert.assertTrue(flag);
	}
	
//	@Test(priority=2)
//	public void verifyGetQuoteButtonIsDisable () throws InterruptedException {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString()); 
//		boolean flag = QuickQuotesPage.createGetQuoteButtonIsDisable();
//		Assert.assertFalse(flag);
//	}
//	
//	@Test(priority=3)
//	public void verifyToasterMessage () throws InterruptedException {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString()); 
//		boolean flag=QuickQuotesPage.createToasterMessage();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=4)
//	public void verifyQuotebyName() throws Throwable {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString()); 
//		boolean flag= QuickQuotesPage.createQQByName();
//		Assert.assertTrue(flag);	
//	}
//	
//	@Test (priority=5)
//	public void verfiyQQEventWithAllDetails() throws InterruptedException {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString()); 
//		boolean flag=QuickQuotesPage.createQQEventWithAllDetails();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=6)	
//	public void verifySandpitEventWithQuestionnaire () throws InterruptedException {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString()); 
//		QuickQuotesPage.createSandpitEventWithQuestionnaire();
//	}

	@AfterTest
	public void Teardown() throws Exception {
		driver.close();
	}
}
