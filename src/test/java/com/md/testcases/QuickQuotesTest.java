package com.md.testcases;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
		logger.info("*******QQ_test start executing*******");
		QuickQuotesPage.redirectFromMDDashboardtoQQCreate();
	}

	@Test(priority=1)
	public void qq_VerifyGetQuoteButtonIsDisable () throws InterruptedException {
		boolean flag = QuickQuotesPage.createGetQuoteButtonIsDisable();
		Assert.assertFalse(flag);
	}
	
	@Test(priority=2)
	public void qq_VerifyValidationMessageOnNamefield() throws InterruptedException {
		boolean flag = QuickQuotesPage.createNameFieldValidaions();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void qq_VerifyToasterMessage() throws InterruptedException {
		boolean flag = QuickQuotesPage.createToasterMessage();
		Assert.assertTrue(flag, "verifyToasterMessage is failed ask developer to fix");
	}

	@Test(priority=4)
	public void qq_VerifyQuotebyName() throws Throwable {
		boolean flag = QuickQuotesPage.createQQByName();
		Assert.assertTrue(flag, "verfiyQQEventWithAllDetails is failed ask developer to fix");
	}

	@Test (priority=5)
	public void qq_VerfiyQQEventWithAllDetails() throws InterruptedException {
		boolean flag=QuickQuotesPage.createQQEventWithAllDetails();
		Assert.assertTrue(flag, "verfiyQQEventWithAllDetails is failed ask developer to fix");
	}

	@Test(priority=6)	
	public void qq_VerifySandpitEventWithQuestionnaireAndAllowResubmission() throws InterruptedException {
		boolean flag=QuickQuotesPage.createSandpitEventWithQuestionnaireAndAllowResubmission();
		Assert.assertTrue(flag,"verifySandpitEventWithQuestionnaireAndAllowResubmission is failed ask devloper to fix ");
	}
	
	@Test(priority=7)	
	public void qq_VerifyEditContent() throws InterruptedException { 
		boolean flag= QuickQuotesPage.createEditContent();
		Assert.assertTrue(flag);
	}

	@Test(priority=8)
	public void qq_VerifyDeleteQuote() throws InterruptedException {
		QuickQuotesPage.deleteQuote();
	}
   
	@Test(priority=9)
	public void qq_VerifySearchQuote() throws InterruptedException {
		QuickQuotesPage.searchQuote();
	}
	
	@Test(priority=10)
	public void qq_VerifyCreateMessage() throws InterruptedException {
		QuickQuotesPage.createMessage();
	}
   
	@AfterClass
	public void Teardown() throws Exception {
		logger.info("*******QQ_test ends*******");
		driver.close();
	}
}
