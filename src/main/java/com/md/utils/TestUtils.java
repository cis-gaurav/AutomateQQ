package com.md.utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.md.base.TestBase;

public class TestUtils extends TestBase {

	// Global things
	public void scroll() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)");
	}

	public void scrollUp() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-250)");
	}

	// GlobalThings
	public void scrollTillBottom() {
		// Scroll to bottom of page
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void jsExecutor(Object element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public void switchToFrame1() {
		driver.switchTo().frame(0);
	}

	// Sandpit common methods

	@FindBy(partialLinkText = "Sandpit")
	private WebElement headerlinkSandpit;

	@FindBy(xpath = "//button[@name='button']")
	private WebElement btnleaveSandpit;

	@FindBy(css = "a[class='menu-item-tab button-label dropdown-toggle'][href^='/users/']")
	private WebElement userProfile;

	@FindBy(css = "a.logout")
	private WebElement userLogout;

	
	//page factory element initElement 
	public TestUtils() {
		PageFactory.initElements(driver, this);
	}

	public void redirectToSandpitfromMDdashbaord() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(headerlinkSandpit));
		headerlinkSandpit.click();
	}

	public void leaveSandpit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(btnleaveSandpit));
		btnleaveSandpit.click();
	}

	public void Logout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		userProfile.click();
		wait.until(ExpectedConditions.elementToBeClickable(userLogout));
		userLogout.click();
	}
}
