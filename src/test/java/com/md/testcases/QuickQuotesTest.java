package com.md.testcases;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.md.base.TestBase;
import com.md.pages.QuickQuotesPage;

public class QuickQuotesTest extends TestBase {

	private QuickQuotesPage QuickQuotesPage;

	// Need to create constructor to initialize properties file
	public QuickQuotesTest() {
		super();
	}

	@BeforeClass
	public  void QQSetUp() throws MalformedURLException, InterruptedException {
		initializationAndLogin();
		QuickQuotesPage = new QuickQuotesPage();
		Thread.sleep(3000);
		QuickQuotesPage.redirectFromMdDashboardToQuoteListing();
		logger.info("*******Redirect to QQ Listing*******");
	}
	
	@BeforeMethod
	public void Test() throws InterruptedException {
//		Thread.sleep(2000);
		logger.info("****************");
		QuickQuotesPage.quoteListingToCreate();
	}

	@Test(priority=1)
	public void qq_VerifyValidationMessageOnNamefield() throws InterruptedException {
		boolean flag = QuickQuotesPage.createNameFieldValidaions();
		Assert.assertTrue(flag);
		logger.info("Quick Quote TC01 has passed");
	}
	
	@Test(priority=2)
	public void qq_VerifyGetQuoteButtonIsDisable () throws InterruptedException {
		boolean flag = QuickQuotesPage.createGetQuoteButtonIsDisable();
		Assert.assertFalse(flag);
		logger.info("Quick Quote TC02 has passed");
	}
	
	@Test(priority=3)
	public void qq_VerifyToasterMessage() throws InterruptedException {
		boolean flag = QuickQuotesPage.createToasterMessage();
		Assert.assertTrue(flag, "verifyToasterMessage is failed ask developer to fix");
		logger.info("Quick Quote TC03 has passed");
	}

	@Test(priority=4)
	public void qq_VerifyQuotebyName() throws Throwable {
		boolean flag = QuickQuotesPage.createQQByName();
		Assert.assertTrue(flag, "verfiyQQEventWithAllDetails is failed ask developer to fix");
		logger.info("Quick Quote TC04 has passed");
	}
	
	@Test(priority=5)	
	public void qq_VerifyEditContent() throws InterruptedException { 
		boolean flag= QuickQuotesPage.createEditContent();
		Assert.assertTrue(flag);
		logger.info("Quick Quote TC05 has passed");
	}
	
	@Test(priority=6)
	public void qq_VerifyDeleteQuote() throws InterruptedException {
		boolean flag=QuickQuotesPage.deleteQuote();
		Assert.assertTrue(flag);
		logger.info("Quick Quote TC06 has passed");
	}
   	
	@Test (priority=7)
	public void qq_VerifyParticpantAddedFromGroup() throws InterruptedException {
		boolean flag=QuickQuotesPage.particpantAddedFromGroup();
		Assert.assertTrue(flag);
		logger.info("Quick Quote TC07 has passed");
	}
	
	@Test (priority=8)
	public void qq_VerfiyQQEventWithAllDetails() throws InterruptedException {
		boolean flag=QuickQuotesPage.createQQEventWithAllDetails();
		Assert.assertTrue(flag);
		logger.info("Quick Quote TC08 has passed");
	}

	@Test(priority=9)
	public void qq_VerifyCreateMessageinSandpit() throws InterruptedException {
		QuickQuotesPage.createMessage();
		logger.info("Quick Quote TC09 has passed");
	}
	
	@Test(priority=10)	
	public void qq_VerifyQuestionnaireAndAllowResubmissioninSandpit() throws InterruptedException {
		QuickQuotesPage.createSandpitEventWithQuestionnaireAndAllowResubmission();
		logger.info("Quick Quote TC10 has passed");
	}
	
	@Test (priority=11)
	public void qq_VerfiyEditQQEvent() throws InterruptedException {
		QuickQuotesPage.EditQQEvent();
		logger.info("Quick Quote TC11 has passed");
	}
	
	@Test(priority=12)
	public void qq_VerifySearchQuote() throws InterruptedException {
		boolean flag=QuickQuotesPage.searchQuote();
		Assert.assertTrue(flag);
		logger.info("Quick Quote TC12 has passed");
	}
	
	@AfterClass
	public void Teardown() throws Exception {
		logger.info("*******QQ_test ends*******");
		driver.close();
	}
}
