package com.md.ExtentReportListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class ExtentReporterNG {
	static ExtentReports extent;

public static ExtentReports extentReportGenerator() {

	String path = System.getProperty("user.dir") + "//automationReport.html";
//	String path = System.getProperty("user.dir") +"//reports//automationReport.html"; //need to change path in Jenkins config as well 

	System.out.println("******Inside ExtentReporterNG******");
	ExtentSparkReporter reporter = new ExtentSparkReporter(path).viewConfigurer().viewOrder().as(new ViewName[] {ViewName.AUTHOR,ViewName.DASHBOARD,ViewName.TEST}).apply();
	reporter.config().setTheme(Theme.DARK);
	reporter.config().setReportName("Market Dojo_ Automation Report");
	reporter.config().setDocumentTitle("Marketdojo_Report");
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("QA", "Gaurav Jain");
	return extent;
}
}