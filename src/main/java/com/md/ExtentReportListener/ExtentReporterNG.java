package com.md.ExtentReportListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extent;

public static ExtentReports extentReportGenerator() {

	String path = System.getProperty("user.dir") + "\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Automation result");
	reporter.config().setDocumentTitle("Extent_Report");
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("QA", "Gaurav Jain");
	return extent;
}
}