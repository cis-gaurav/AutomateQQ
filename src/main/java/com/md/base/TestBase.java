package com.md.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.md.ExtentReportListener.ExtentReporterNG;
import com.md.util.TestUtil;
import com.md.util.WebEventListener;

public class TestBase extends ExtentReporterNG {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase()  {		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/MD.properties");			
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public static void initialization() throws MalformedURLException {					

		//Define Execution Environment here i.e. Local/server
		String ExecutionLocation = "server";

		if (ExecutionLocation.equals("server")) {
			 String chromedriverpath="",s;
		        Process p;
		        try {
		        	//Execute Linux Command for getting location of Chromedriver
		            p = Runtime.getRuntime().exec("which chromedriver");
		            BufferedReader br = new BufferedReader(
		                new InputStreamReader(p.getInputStream()));
		            while ((s = br.readLine()) != null)
		            	//get the result and Store it as chromedriver path
		                chromedriverpath=s;
		            p.waitFor();		           
		            p.destroy();
		        } catch (Exception e) {}

			// pass chromedriver path of the server
			System.setProperty("webdriver.chrome.driver",chromedriverpath); 
			ChromeOptions options = new ChromeOptions();
			options.setBinary("/usr/bin/google-chrome");
			options.addArguments("--headless");
			options.addArguments("--window-size=1980,1080");
			options.addArguments("start-maximized"); // open Browser in maximized mode
			options.addArguments("disable-infobars"); // disabling infobars
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-gpu"); // applicable to windows os only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--no-sandbox"); // Bypass OS security model			
			options.addArguments("--allowed-ips");
			
			driver = new ChromeDriver(options);
		}
			else if (ExecutionLocation.equals("local")) {				
			System.setProperty("webdriver.chrome.driver",prop.getProperty("driverpath"));
			driver = new ChromeDriver();
		 
		}
		
	    driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));  
	}
}
