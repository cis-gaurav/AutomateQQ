package com.md.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger = Logger.getLogger(TestBase.class);


/////////////////// properties file key value pair 
	public TestBase() {
		try {
			prop = new Properties(); // Need to create object of properties class
			String configPath = System.getProperty("user.dir") + "//src//main//resources//config.properties";
			FileInputStream ip = new FileInputStream(configPath);// create an object for Inputstream read data 
			prop.load(ip); // loading data of property file 
		}
			catch(Exception e) {
              e.printStackTrace();				
			}
		}
	
///////////// Define Execution Environment here i.e. Local/server for Jenkins
	public void initializationAndLogin() throws MalformedURLException, InterruptedException {
		String ExecutionLocation = "server";

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

			// pass chromedriver path of the server
			System.setProperty("webdriver.chrome.driver", chromedriverpath);
			ChromeOptions options = new ChromeOptions(); // using chromeoption
			options.setBinary("/usr/bin/google-chrome");
			options.addArguments("--headless");
			options.addArguments("start-maximized"); // open Browser in maximized mode
			options.addArguments("--window-size=1980,1080");
			options.addArguments("disable-infobars"); // disabling infobars
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-gpu"); // applicable to windows os only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--no-sandbox"); // Bypass OS security model
			options.addArguments("--allowed-ips");
			driver = new ChromeDriver(options);
			
//			System.out.println("*******Driver Intilaized*******");
			logger.info("*******ServerDriver Intilaized*******");
///////////////////// Navigate to url and login to marketdojo application 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.xpath("//input[@name ='commit']")).click();
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Dashboard')]")));
//			System.out.println("Logged in and redirect to MD Dashboard");
			logger.info("Logged in and redirect to MD Dashbaord");
			
		} else if (ExecutionLocation.equals("local")) {
//			System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
			
////////////////Adding WebDriverManger 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("******Local Driver Intilaized*****");
///////////////// Navigate to url and login to marketdojo application 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.xpath("//input[@name ='commit']")).click();
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Dashboard')]")));
			logger.info("Logged in and redirect to MD Dashbaord");// Redirect to MD Dashboard 
		}
	}
	
    /////Screenshot of failed test case 
	//// we use an interface called TakesScreenshot, which enables the Selenium WebDriver to capture a screenshot and store it in different ways. It has a got a method "getScreenshotAs() " which captures the screenshot and store it in the specified location.
	
	public String getScreenshotPath(String TestCaseName, WebDriver driver) throws IOException{
		
		TakesScreenshot ts = (TakesScreenshot) driver; //Convert webdriver to TakeScreenshot both are interface
		File source = ts.getScreenshotAs(OutputType.FILE); //call getScreenshotAs() method screenshot capture on server we need to save it somewhere
		String destPath = System.getProperty("user.dir")+"//reports//" +TestCaseName+".png"; // save in our location
		File file = new File(destPath);
		FileUtils.copyFile(source, file);//we need to copy it from memory to our location
		return destPath;
	}	 	
}