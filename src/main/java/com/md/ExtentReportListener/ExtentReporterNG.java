
package com.md.ExtentReportListener;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG {

	public static ExtentReports extent = new ExtentReports();
	// public static ExtentTest test;
	public static ExtentTest logger;
	static WebDriver driver;

	// This code will run before executing any testcase
	@BeforeSuite
	public static void createReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "/test-output/AutomationReport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);

		extent.setSystemInfo("Machine Name", "CIS-772G");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Build", "Integration");
		extent.setSystemInfo("Browser", "Chrome");
		reporter.config().setChartVisibilityOnOpen(true);
		reporter.config().setDocumentTitle("Extent Report Demo");
		reporter.config().setReportName("Automation Test Report");
		reporter.config().setTestViewChartLocation(ChartLocation.TOP);
		reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		reporter.setAppendExisting(true);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.loadConfig("extent-config.xml");
	}

	@SuppressWarnings("unused")
	@AfterMethod
	public static void tearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			// String temp=Utility.getScreenshot(driver);
			logger.fail(result.getThrowable().getMessage());

		}
	}

	@AfterSuite
	public static void reportTeardown() {
		extent.flush();
	}
}