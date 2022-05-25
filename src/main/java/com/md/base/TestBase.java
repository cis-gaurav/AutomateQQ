package com.md.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.md.utils.TestUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger = LogManager.getLogger(TestBase.class); // logger to show logs on console

	/////////////////// properties file key value pair

	public TestBase() {
		try {
			prop = new Properties(); // Need to create object of properties class
			String configPath = System.getProperty("user.dir") + "//src//main//resources//config.properties";
			FileInputStream ip = new FileInputStream(configPath);// create an object for Inputstream read data
			prop.load(ip); // loading data of property file
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

///////////// Define Execution Environment here i.e. Local/server for Jenkins

	public void initializationAndLogin() throws MalformedURLException, InterruptedException {
		String ExecutionLocation = "local"; // Change from here either local or server where you need to run code

		if (ExecutionLocation.equals("server")) {
			String chromedriverpath = "", s;
			Process p;
			try {
				// Execute Linux Command for getting location of Chromedriver
				p = Runtime.getRuntime().exec("which chromedriver");
				BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
				while ((s = br.readLine()) != null)
					// get the result and Store it as chromedriver path
					chromedriverpath = s;
				p.waitFor();
				p.destroy();
			} catch (Exception e) {
			}

////// pass chromeDriver path of the server
			System.setProperty("webdriver.chrome.driver", chromedriverpath);
			ChromeOptions options = new ChromeOptions(); // using chromeoption
			options.setBinary("/usr/bin/google-chrome"); // Chrome Browser Binary location through ChromeDriver
			options.addArguments("--no-sandbox"); // Bypass OS security model
			options.addArguments("--headless");
			options.addArguments("start-maximized"); // open Browser in maximized mode
			options.addArguments("--window-size=1980,1080");
			options.addArguments("disable-infobars"); // disabling infobars
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-gpu"); // applicable to windows os only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--allowed-ips");
			driver = new ChromeDriver(options);
			logger.info("*******ServerDriver Intilaized*******");
			TestUtils.Login(); // Logged in and redirect to Dashbaord/HomePage of application coming from
								// TestUtiles File

		} else if (ExecutionLocation.equals("local")) { // If test run on local system
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("******Local Driver Intilaized*****");
			TestUtils.Login(); // Logged in and redirect to Dashbaord/HomePage of application coming from
								// TestUtiles File
		}

//		TestUtils.Login(); // Logged in and redirect to Dashbaord/HomePage of application coming from TestUtiles File 
	}

	///// Screenshot of failed test case
	//// we use an interface called TakesScreenshot, which enables the Selenium
	///// WebDriver to capture a screenshot and store it in different ways. It has a
	///// got a method "getScreenshotAs() " which captures the screenshot and store
	///// it in the specified location.

	public String getScreenshotPath(String TestCaseName, WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver; // Convert webdriver to TakeScreenshot both are interface
		File source = ts.getScreenshotAs(OutputType.FILE); // call getScreenshotAs() method screenshot capture on server
															// we need to save it somewhere
		String destPath = System.getProperty("user.dir") + "//reports//" + TestCaseName + ".png"; // save in our
																									// location
		File file = new File(destPath);
		FileUtils.copyFile(source, file);// we need to copy it from memory to our location
		return destPath;
	}
}