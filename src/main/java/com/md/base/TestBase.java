package com.md.base;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.md.ExtentReportListener.ExtentReporterNG;

public class TestBase extends ExtentReporterNG {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			//how to read data from properties file below 3 lines will do 
			prop = new Properties(); //Need to create object of properties class 
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/config.properties"); //check file at bottom config.
			prop.load(ip); // loading data of property file 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() throws MalformedURLException, InterruptedException {

		// Define Execution Environment here i.e. Local/server
		String ExecutionLocation = "local";

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
			ChromeOptions options = new ChromeOptions();
			options.setBinary("/usr/bin/google-chrome");
			options.addArguments("--headless");
			options.addArguments("start-maximized"); // open Browser in maximized mode	
			options.addArguments("--window-size=1980,1080");
//			options.addArguments("--window-size=1400,600");
//			options.addArguments("start-maximized"); // open Browser in maximized mode														 
			options.addArguments("disable-infobars"); // disabling infobars
			options.addArguments("--disable-extensions"); // disabling extensions														
			options.addArguments("--disable-gpu"); // applicable to windows os only												 
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems																
			options.addArguments("--no-sandbox"); // Bypass OS security model
			options.addArguments("--allowed-ips");

			driver = new ChromeDriver(options);
		} else if (ExecutionLocation.equals("local")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
			driver = new ChromeDriver();
		}

		// Navigate to URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		
		//Promotion Popup Close
		// WebDriverWait wait = new WebDriverWait(driver, 60);
		// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'Close')]"))));

		// Click on Close popup button
		// driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
	}

	// Page factory for Gloabl Login to MD 
	@FindBy(name = "user[login]")
	static WebElement username;
	@FindBy(name = "user[password]")
	static WebElement password;
	@FindBy(name = "commit")
	static WebElement loginBtn;
	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	static WebElement AdminDashboard;
	
	// Actions for Global Login Method 
	public static void login() throws InterruptedException {
		username.sendKeys(prop.getProperty("username")); //reading data from properties file 
		password.sendKeys(prop.getProperty("password"));
		loginBtn.click(); // User get loggedin 
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(AdminDashboard));
	}

}
