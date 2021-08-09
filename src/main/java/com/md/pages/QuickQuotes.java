package com.md.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.md.base.TestBase;

public class QuickQuotes extends TestBase {

///////////////// Page Factory == OR
	
	@FindBy(name = "user[login]")
	static WebElement username;

	@FindBy(name = "user[password]")
	static WebElement password;

	@FindBy(name = "commit")
	static WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	static WebElement AdminDashboard;

	@FindBy(xpath = "//ul[@class='nav-header']/li[6]/a")
	WebElement quickquoteDashbaord;

	@FindBy(xpath = "//h4[text()='YOUR QUOTES']")
	WebElement yourQuoteText;

	@FindBy(xpath = "//a[@class='btn btn-primary btn-fixed pull-right']")
	WebElement newQuoteBtn;

///////////Create QQ Page Element /////////////////
	
	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary m-t20 btn-sizebig']")
	WebElement getQuoteButton;

	@FindBy(xpath = "//div[@class='alert alert-warning']")
	WebElement alertLiscenceMsg;

	@FindBy(xpath = "//input[@name='QQGeneralDetails.quote_name']")
	WebElement name;

	@FindBy(xpath = "//*[contains(text(), 'Required')]")
	WebElement blankNameValidation;

	@FindBy(xpath = "//span[@class='text-danger']")
	WebElement longNameValidation;

	@FindBy(xpath = "//input[@id='deadline-custom-date-time']")
	WebElement deadline;

	@FindBy(xpath = "//div[contains(text(),'The deadline you have selected in the past. Please')]")
	WebElement pastDeadlineToaster;

	@FindBy(xpath = "//span[@class=’time-zone’]")
	WebElement timezone;

	@FindBy(xpath = "/html/body[contains(text(),'Details')]")
	WebElement description;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-fontsmall']")
	WebElement fromLibraryBtn;

	@FindBy(xpath = "//div[text()=’Drop files here or click to upload’]")
	WebElement uploadFromSystem;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[3]/div[1]/label/span")
	WebElement SelectDocPopup;

	@FindBy(xpath = "//button[text()='Select Document(s)']")
	WebElement clickBtnFromPopup;

	@FindBy(xpath = "//label[text()='I want to get prices']/span")
	WebElement lotCheckbox;

	@FindBy(xpath = "//*[contains(@name,'qqPrice.lots[0].name')]")
	WebElement lotName;

	@FindBy(xpath = "//input[@name='qqPrice.lots[0].unit_of_measure_uomname']")
	WebElement lotUom;

	@FindBy(xpath = "//input[@name='qqPrice.lots[0].quantity']")
	WebElement lotQuantity;

	@FindBy(xpath = "(//I[@class='fa fa-trash'])[1]")
	WebElement lotDelete;

	@FindBy(xpath = "//*[@class=’btn btn-primary’ and text()=’Add Another Item’]")
	WebElement lotAdd;

	@FindBy(xpath = "//label[text()='I want to ask other questions']/span")
	WebElement questionnaireCheckbox;

	@FindBy(xpath = "//input[@name='qqQuestions.questionnaire[0].title']")
	WebElement questionName;

	@FindBy(xpath = "//select[@name='qqQuestions.questionnaire[0].question_type']")
	WebElement questionDropdown;

	@FindBy(xpath = "//select[@name='qqQuestions.questionnaire[0].question_type']/option[2]")
	WebElement oneLineText;

	@FindBy(xpath = "//select[@name='qqQuestions.questionnaire[0].question_type']/option[3]")
	WebElement documentUpload;

	@FindBy(xpath = "//select[@name='qqQuestions.questionnaire[0].question_type']/option[4]")
	WebElement yesno;

	@FindBy(xpath = "//select[@name=//*[@id=’optional_quality’]/div[1]/div[3]/a’]")
	WebElement deleteQuestion;

	@FindBy(xpath = "//*[@class=’btn btn-primary’ and text()=’Add Another Question’]")
	WebElement addQuestion;

	@FindBy(xpath = "//*[contains (text(),'From group')]")
	WebElement addGroup;

	@FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer']")
	WebElement addParticpantManuallyArrrow;

	@FindBy(xpath = "//input[@id='react-select-2-input']")
	WebElement addParticpantManually;

	@FindBy(xpath = "//h4[contains(text(),'Advice from procurement team')]")
	WebElement AdviceText;

	@FindBy(xpath = "//label[text()='Who to invite']")
	WebElement whoToInviteText;

	@FindBy(xpath = "//*[contains (text(), 'createQQByName')]")
	WebElement quoteName;

////////////////////Left panel Element /////////////////	

	@FindBy(xpath = "//*[@id=\"app\"]//div[2]/div[2]/div/div/div/div[1]/a/i")
	WebElement editcontentToolTip;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	WebElement editContentPopup;
	
	@FindBy(xpath = "//button[text()='Delete']")
	WebElement delteButton;
	
	@FindBy(xpath = "//div[contains(text(),'Deleted')]")
	WebElement delteToaster;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//button[text()='Close']")
	WebElement closeButton;
	
	@FindBy(xpath = "//div[@class='list']/p[1]")
	WebElement AutomateText;
	
	@FindBy(xpath = "//div[@class='list']/h4")
	WebElement AutomateText1;
	
///////////////// QQ summary page Elements /////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//h2[text()='Create QuickQuote Event with all Details']")
	WebElement nameVerify;

	@FindBy(xpath = "//a[@class='collapsed' and text()='Brief']")
	WebElement briefToggel;

	@FindBy(xpath = "//div[@class='table-box list']/p")
	WebElement descriptionVerify;

	@FindBy(xpath = "//a[@class='collapsed' and text()= 'Summary']")
	WebElement summaryToggel;

	@FindBy(xpath = "//div[@class='summary-table table-scroll']/table/tbody/tr/td/span")
	WebElement lotNameVerify;

	@FindBy(xpath = "//a[@class='collapsed' and text()= 'Participant List']")
	WebElement particpantToggel;

	@FindBy(xpath = "//table[@class='participant-table common-table']/thead/tr/th[2]")
	WebElement particpantName;

	@FindBy(xpath = "//a[@class='collapsed' and text()= 'Participant List']")
	WebElement messageToggel;

//	@FindBy(xpath="//tbody/tr[3]/td[2]")
	@FindBy(xpath = "//span[contains (text(),'This is the Automated Answer of Questionnaire')]")
	WebElement questionnaireAnswerVerify;

///////////////////////////////Sandpit Elements /////////////////////////////////////////////////////

	@FindBy(xpath = "//*[contains(text(), \"Sandpit Co 1 sandpit1@marketdojo.com\")]")
	WebElement sandpitco1Checkbox;

	@FindBy(xpath = "//*[contains(text(), \"Sandpit Co 2 sandpit2@marketdojo.com\")]")
	WebElement sandpitco2Checkbox;

	@FindBy(xpath = "//*[contains(text(), \"Sandpit Co 3 sandpit3@marketdojo.com\")]")
	WebElement sandpitco3Checkbox;

	@FindBy(xpath = "//*[contains (@class ,'navbar-nav collapse navbar-collapse navbar-module-right pull-left')]/ul/li[3]")
	WebElement sandpitHeader;

	@FindBy(xpath = "//*[contains (text(),  'Act as Host')]")
	WebElement actAsHost;

	@FindBy(xpath = "//*[contains (text(),  'Act as Sandpit Co 1')]")
	WebElement dropdownSandpitco1;

	@FindBy(xpath = "//*[@id='header-navbar']/div/div[2]/ul/li/a")
	WebElement eventHeader;

	// Participant end Sandpit Elements

	@FindBy(xpath = "//*[@id=\"main-container\"]/div[3]/div/div/div[1]/div/form/table/tbody/tr[1]/td[2]/div[2]/div/div/div/div/button")
	WebElement eventInvitation;

	@FindBy(xpath = "//*[@id=\"main-container\"]/div[3]/div/div/div[1]/div/form/table/tbody/tr[1]/td[2]/div[2]/div/div/div/div/ul/li[1]/a")
	WebElement eventAccept;

	@FindBy(xpath = "//*[contains(@title, 'Questionnaire')]")
	WebElement questionnaireTab;

	@FindBy(xpath = "//div[@class='form-item-block qqa-block']/div/div/div/div[2]/div/input")
	WebElement questionnaireAnwer1;

	@FindBy(xpath = "//*[contains(text(), 'Submit answers')]")
	WebElement submitAnswer;

	@FindBy(xpath = "//*[contains(@id, 'confirmOk')]")
	WebElement submitAnswerFinalConfirmation;

	@FindBy(xpath = "//*[contains(text(), 'RFQs')]")
	WebElement RfqTab;

	@FindBy(xpath = "//*[contains(text(), 'Enter Bid')]")
	WebElement enterBidBtn;

	@FindBy(xpath = "//*[contains(@name, 'bid[price]')]")
	WebElement enterBid;

	@FindBy(xpath = "//*[contains(@class, 'btn btn-default light-gray-color push-5-r br-green-color')]")
	WebElement submitBid;

	@FindBy(xpath = "//*[contains(@class, 'btn btn-primary ok-btn')]")
	WebElement confirmSubmitBid;

	@FindBy(xpath = "//*[contains(@class,'modal-dialog modal-dialog-popout custom-modal modal-lg')]/div/div[3]/button")
	WebElement confirmBidReceivedPoupup;

	@FindBy(xpath = "//*[contains (text(), 'Allow resubmission')]")
	WebElement AllowResubmissionBtn;

	@FindBy(xpath = "//*[contains (text(), 'Waiting for resubmission')]")
	WebElement WaitingForResubmissionText;

	@FindBy(xpath = "//*[contains (@class, 'participant-table common-table')]/tbody/tr[2]/td[2]/a")
	WebElement particpantBid;

	@FindBy(xpath = "//*[contains (@class, 'icon-link')]")
	WebElement deleteBid;

	@FindBy(xpath = "//*[contains (@class, 'button-l btn btn-primary')]")
	WebElement deleteBidConfirm;

	// Initialize the Page Object
	public QuickQuotes() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void redirectFromMDDashboardtoQQCreate() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", quickquoteDashbaord);
//		quickquoteDashbaord.click();// click on Quote from MDDashbaord
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(yourQuoteText));
	}

	// Global things
	public void scroll() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)");
	}

	// GlobalThings
	public void scrollTillBottom() {
		// Scroll to bottom of page
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	// Unused script of new user license check
	public boolean verifyQQLiscence() throws InterruptedException {
		redirectFromMDDashboardtoQQCreate();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(alertLiscenceMsg));
		return alertLiscenceMsg.isDisplayed();
	}

// Scripts 
	public boolean createNameFieldValidaions() throws InterruptedException {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));// this is load at last
		// Enter long name in quoteName field
		name.sendKeys("Automate test on enter long name validation message should appearsdfsdfsdf");
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		AdviceText.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(longNameValidation));
		return longNameValidation.isDisplayed();
	}

	public boolean createGetQuoteButtonIsDisable() throws InterruptedException {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));// this is load at last
		name.clear();
		// Scroll to bottom of page
		scrollTillBottom();
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		// verify get quote button is disabled
		return getQuoteButton.isEnabled();
	}

	public boolean createToasterMessage() throws InterruptedException {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));// this is load at last 
		name.clear();
		name.sendKeys("Verify Toaster message");
		deadline.sendKeys("2019-04-14 19:35");
		scrollTillBottom();
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		getQuoteButton.click();
//		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(pastDeadlineToaster));
		return pastDeadlineToaster.isDisplayed();
	}

	public boolean createQQByName() throws Throwable {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		name.clear();
		Thread.sleep(2000);
		name.sendKeys("createQQByName");
		deadline.clear();
		scrollTillBottom();
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		getQuoteButton.click();
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(quoteName));
		return quoteName.isDisplayed();
	}

	public boolean createQQEventWithAllDetails() throws InterruptedException {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		name.clear();
		name.sendKeys("Create QuickQuote Event with all Details");
		deadline.clear();
		deadline.sendKeys("2024-04-14 19:35");
		driver.switchTo().frame(0);
		description.sendKeys("This is my description");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		scroll();
		fromLibraryBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(SelectDocPopup));
		SelectDocPopup.click();
		wait.until(ExpectedConditions.elementToBeClickable(clickBtnFromPopup));
		clickBtnFromPopup.click();
		Thread.sleep(2000);
		scroll();
		lotCheckbox.click();
		wait.until(ExpectedConditions.elementToBeClickable(lotName));
		lotName.sendKeys("Metal Scrap");
		lotUom.sendKeys("tonnes");
		lotQuantity.sendKeys("5");
		questionnaireCheckbox.click();
		wait.until(ExpectedConditions.visibilityOf(questionName));
		questionName.sendKeys("Automation");
		questionDropdown.click();
		wait.until(ExpectedConditions.visibilityOf(oneLineText));
		oneLineText.click();
		scroll();
		wait.until(ExpectedConditions.visibilityOf(addParticpantManually));
		addParticpantManually.sendKeys("d1@mailinator.com");
		addParticpantManually.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		getQuoteButton.click();
		// Verify on create page
		// description Verify
//		Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOf(particpantToggel));
		briefToggel.click();
		wait.until(ExpectedConditions.visibilityOf(descriptionVerify));
		String descrption = descriptionVerify.getText();
		Assert.assertEquals(descrption, "This is my description");
//		briefToggel.click();
		// lotName Verify
		Thread.sleep(2000);
		summaryToggel.click();
		wait.until(ExpectedConditions.visibilityOf(lotNameVerify));
		String LotName = lotNameVerify.getText();
		Assert.assertEquals(LotName, "Metal Scrap");
		scroll();
		// ParticpantVerify
		particpantToggel.click();
		// verifyEventName
		wait.until(ExpectedConditions.visibilityOf(nameVerify));
		return nameVerify.isDisplayed();
	}

	@FindBy(xpath = "//*[@id=\"flash_messages\"]/div/p/text()")
	WebElement Verify1;

	public boolean createSandpitEventWithQuestionnaireAndAllowResubmission() throws InterruptedException {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(6000);
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", sandpitHeader);
		sandpitHeader.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(newQuoteBtn));
		newQuoteBtn.click();// click on new quote button on quote listing page
		wait.until(ExpectedConditions.elementToBeClickable(name));
		name.sendKeys("Create QuickQuote Event with Particpant Answers");
		Thread.sleep(4000);
		scroll();
		scroll();
		questionnaireCheckbox.click();
		wait.until(ExpectedConditions.elementToBeClickable(questionName));
		questionName.sendKeys("Automation");
		questionDropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(oneLineText));
		oneLineText.click();
		Thread.sleep(2000);
		sandpitco1Checkbox.click();
		getQuoteButton.click();
		Thread.sleep(2000);
		///////////////// Create questionnaire event at Host End
		wait.until(ExpectedConditions.elementToBeClickable(actAsHost));
		actAsHost.click();
		dropdownSandpitco1.click();
		Thread.sleep(3000);
		eventHeader.click();
		Thread.sleep(2000);
		eventInvitation.click();
		wait.until(ExpectedConditions.elementToBeClickable(eventAccept));
		eventAccept.click();
		wait.until(ExpectedConditions.elementToBeClickable(questionnaireTab));
		questionnaireTab.click();
		wait.until(ExpectedConditions.elementToBeClickable(questionnaireAnwer1));
		questionnaireAnwer1.sendKeys("This is the Automated Answer of Questionnaire");
		System.out.println(questionnaireAnwer1.getText());
		submitAnswer.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitAnswerFinalConfirmation));
		submitAnswerFinalConfirmation.click();
///////////////////////////Submit answer at Participant End 
//		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(actAsHost));
		actAsHost.click();
		Thread.sleep(5000);
//		wait.until(ExpectedConditions.elementToBeClickable(particpantToggel));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", particpantToggel);
		particpantToggel.click();
//		Thread.sleep(2000);
		scroll();
		wait.until(ExpectedConditions.visibilityOf(questionnaireAnswerVerify));
		AllowResubmissionBtn.click();
		Thread.sleep(2000);
		///////////// Allow Resubmisson at Host end
		actAsHost.click();
		dropdownSandpitco1.click();
		questionnaireTab.click();
		wait.until(ExpectedConditions.elementToBeClickable(questionnaireAnwer1));
		questionnaireAnwer1.clear();
		questionnaireAnwer1.sendKeys("2222This is the Automated Answer of Questionnaire");
		submitAnswer.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitAnswerFinalConfirmation));
		submitAnswerFinalConfirmation.click();
		wait.until(ExpectedConditions.elementToBeClickable(actAsHost));
		actAsHost.click();
		Thread.sleep(5000);
		particpantToggel.click();
		Thread.sleep(2000);
		scrollTillBottom();
//		String text= questionnaireAnswerVerify.getText();
//		Assert.assertEquals(text, "This is the Automated Answer of Questionnaire");
		wait.until(ExpectedConditions.visibilityOf(questionnaireAnswerVerify));
		return questionnaireAnswerVerify.isDisplayed();
	}

	@FindBy(xpath = "//div[contains (@class, 'alert alert-fixed alert-info fade in')]/p")
	WebElement Verify2;

	public boolean createEditContent() throws InterruptedException {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(AutomateText1));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", editcontentToolTip);
		editcontentToolTip.click();
		driver.switchTo().frame(1);
        editContentPopup.clear();
        editContentPopup.sendKeys("Automate test");
        driver.switchTo().defaultContent();
        submitButton.click();
        Assert.assertEquals(AutomateText.getText(), "Automate test");
        editcontentToolTip.click();
        delteButton.click();
		wait.until(ExpectedConditions.visibilityOf(AutomateText1));
        Assert.assertEquals(AutomateText1.getText(), "ADVICE FROM PROCUREMENT TEAM");
        return AutomateText1.isDisplayed();
	}
}
