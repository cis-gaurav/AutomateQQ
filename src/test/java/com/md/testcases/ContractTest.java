package com.md.testcases;

import org.testng.annotations.Test;


import com.md.base.TestBase;
import com.md.pages.Contract;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class ContractTest extends TestBase {
//	Contract loginPage;
//	static ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(
//			System.getProperty("user.dir") + "/test-output/AutomationReport.html");
//	static ExtentReports extent = new ExtentReports();
//	public static ExtentTest test;
//	public static ExtentTest logger;
//
//	public ContractTest() {
//		super(); // Need to create constructor to intilize properties file
//	}
//
////This code will run before executing any testcase
//	@BeforeSuite
//	public static void createReport() {
//		ExtentHtmlReporter reporter = new ExtentHtmlReporter(
//				System.getProperty("user.dir") + "/test-output/AutomationReport.html");
//		extent = new ExtentReports();
//		extent.attachReporter(reporter);
//
//		extent.setSystemInfo("Machine Name", "CIS-772G");
//		extent.setSystemInfo("OS", "Windows 10");
//		extent.setSystemInfo("Build", "Integration");
//		extent.setSystemInfo("Browser", "Chrome");
//		htmlReporter.config().setChartVisibilityOnOpen(true);
//		htmlReporter.config().setDocumentTitle("Extent Report Demo");
//		htmlReporter.config().setReportName("Market Dojo Automation Test Report");
//		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//		htmlReporter.setAppendExisting(true);
//
//		htmlReporter.config().setTheme(Theme.DARK);
//		htmlReporter.loadConfig("extent-config.xml");
//	}
//
//	@BeforeTest
//	public void setUp() throws MalformedURLException, InterruptedException {
//		initialization();
//		loginPage = new Contract();
//		loginPage.login();
//	}
//
//	@Test(priority = 1)
//	public void VerifyUserIsAbleToAddContract() throws InterruptedException {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = loginPage.VerifyUserIsAbleToMakeContract();
//		Assert.assertTrue(flag);
//	}
//
//	@Test(priority = 2)
//	public void VerifyHeadingOnContractListingPage() throws InterruptedException {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = loginPage.VerifyHeadingOnContractListingPage();
//		Assert.assertTrue(flag);
//	}
//
//	@Test(priority = 3)
//	public void VerifyUserIsAbleToSearchContract() throws InterruptedException {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = loginPage.VerifyUserIsAbleToSearchContract();
//		Assert.assertTrue(flag);
//	}
//
//	@Test(priority = 4)
//	public void VerifyDisplayOfArchivedContracts() throws InterruptedException {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = loginPage.VerifyDisplayOfArchivedContracts();
//		Assert.assertTrue(flag);
//	}
//
//	@Test(priority = 5)
//	public void VerifyAlertMsgOnSearchingContracts() throws InterruptedException {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = loginPage.VerifyAlertMsgOnSearchingContracts();
//		Assert.assertTrue(flag);
//	}
//
//	/*
//	 * @Test(priority=5) public void VerifySRMDashboard() throws
//	 * InterruptedException { logger =
//	 * extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().
//	 * toString()); //boolean flag = loginPage.validateSRMDashboard();
//	 * //Assert.assertTrue(flag); }
//	 */
//
//	@AfterTest
//	public void Teardown() throws Exception {
//		driver.close();
//	}
//
//	@AfterSuite
//	public static void reportTeardown() {
//		extent.flush();
//	}
//
}