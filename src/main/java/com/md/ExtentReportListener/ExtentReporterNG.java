package com.md.ExtentReportListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extent;

public static ExtentReports extentReportGenerator() {

	String path = System.getProperty("user.dir") + "\\reports\\Index.html";
	System.out.println("Inside ExtentReporterNG");
//	String path = System.getProperty("user.dir") + "\\123.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Market Dojo_ Automation Report");
	reporter.config().setDocumentTitle("Marketdojo_Report");
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("QA", "Gaurav Jain");
	return extent;
}
}