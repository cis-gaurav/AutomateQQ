package com.md.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.md.base.TestBase;
import com.md.utils.TestUtils;

public class QuickQuotesPage extends TestBase {
	TestUtils TestUtils = new TestUtils();
///////////////// Page Factory == OR

	@FindBy(name = "user[login]")
	private static  WebElement username;
	
	@FindBy(name = "user[password]")
	static private WebElement password;

	@FindBy(name = "commit")
	static private WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	static private WebElement AdminDashboard;
	
	@FindBy(xpath = "//li[@class='menu-item more dropdown']//a[@class='menu-item-tab button-label dropdown-toggle'][normalize-space()='All Modules']")
	static private WebElement AllModule;
	
	@FindBy(xpath = "//a[contains(text(),'Quick Quotes')]")
	static private WebElement quickQuickDrp;
	

//	@FindBy(xpath = "//*[@id='header-navbar']/div/div[2]/ul/li[6]/a")
//	private static WebElement quickquoteDashbaord;

	@FindBy(xpath = "//h4[text()='YOUR QUOTES']")
	static private WebElement yourQuoteText;

	@FindBy(xpath = "//a[@class='btn btn-primary btn-fixed pull-right']")
	private WebElement newQuoteBtn;

	@FindBy(xpath = "//li[@class='mobile-menu-hidden']//a[@class='menu-item-tab header-main-link'][normalize-space()='Quotes']")
	private WebElement quotesHeading;

	@FindBy(xpath = "//a[normalize-space()='Automati...']")
	private WebElement userNameLabel;

///////////Create Quote Page Element /////////////////

	// a[@class='default no_company_logo navbar-brand']//img

	@FindBy(xpath = "//a[@class='default no_company_logo navbar-brand']//img")
	private WebElement mdLogo;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary m-t20 btn-sizebig']")
	private WebElement getQuoteButton;

	@FindBy(xpath = "//div[@class='alert alert-warning']")
	private WebElement alertLiscenceMsg;

	@FindBy(xpath = "//input[@name='QQGeneralDetails.quote_name']")
	private WebElement name;

	@FindBy(xpath = "//*[contains(text(), 'Required')]")
	private WebElement blankNameValidation;

	@FindBy(xpath = "//span[@class='cke_button_icon cke_button__bold_icon']")
	private WebElement boldText;

	@FindBy(xpath = "//span[@class='text-danger']")
	private WebElement longNameValidation;

	@FindBy(xpath = "//input[@id='deadline-custom-date-time']")
	private WebElement deadline;

	@FindBy(xpath = "//div[contains(text(),'The deadline you have selected in the past. Please')]")
	private WebElement pastDeadlineToaster;

	@FindBy(xpath = "//span[@class=’time-zone’]")
	private WebElement timezone;

	@FindBy(xpath = "/html/body[contains(text(),'Details')]")
	private WebElement description;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-fontsmall']")
	private WebElement fromLibraryBtn;

	@FindBy(xpath = "//div[text()=’Drop files here or click to upload’]")
	private WebElement uploadFromSystem;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[3]/div[1]/label/span")
	private WebElement SelectDocPopup;

	@FindBy(xpath = "//button[text()='Select Document(s)']")
	private WebElement clickBtnFromPopup;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div/div/div/div/div/div/div/div/div/form/div[4]/div[1]/div/div[3]/div")
	private WebElement currencyContainer;

	@FindBy(xpath = "//*[@id='app']/div/div/div/div/div/div/div/div/div/div/div/form/div[4]/div[1]/div/div[3]/div/div/div[2]/div")
	private WebElement currencyDrop;

	@FindBy(xpath = "//*[@id='app']/div/div/div/div/div/div/div/div/div/div/div/form/div[4]/div[1]/div/div[3]/div/div/div[1]/div[1]")
	private WebElement currencyEnter;
	
	@FindBy(xpath="//*[@id='collapseOne']/div/div/table/tbody/tr/td[3]")
	private WebElement currencySymbol;

	@FindBy(xpath = "//label[text()='I want to get prices']/span")
	private WebElement lotCheckbox;

	@FindBy(xpath = "//*[contains(@name,'qqPrice.lots[0].name')]")
	private WebElement lotName;

	@FindBy(xpath = "//input[@name='qqPrice.lots[0].unit_of_measure_uomname']")
	private WebElement lotUom;

	@FindBy(xpath = "//input[@name='qqPrice.lots[0].quantity']")
	private WebElement lotQuantity;

	@FindBy(xpath = "(//I[@class='fa fa-trash'])[1]")
	private WebElement lotDelete;

	@FindBy(xpath = "//*[@class=’btn btn-primary’ and text()=’Add Another Item’]")
	private WebElement lotAdd;

	@FindBy(xpath = "//label[text()='I want to ask other questions']/span")
	private WebElement questionnaireCheckbox;

	@FindBy(xpath = "//input[@name='qqQuestions.questionnaire[0].title']")
	private WebElement questionName;

	@FindBy(xpath = "//select[@name='qqQuestions.questionnaire[0].question_type']")
	private WebElement questionDropdown;

	@FindBy(xpath = "//select[@name='qqQuestions.questionnaire[0].question_type']/option[2]")
	private WebElement oneLineText;

	@FindBy(xpath = "//select[@name='qqQuestions.questionnaire[0].question_type']/option[3]")
	private WebElement documentUpload;

	@FindBy(xpath = "//select[@name='qqQuestions.questionnaire[0].question_type']/option[4]")
	private WebElement yesno;

	@FindBy(xpath = "//select[@name=//*[@id=’optional_quality’]/div[1]/div[3]/a’]")
	private WebElement deleteQuestion;

	@FindBy(xpath = "//*[@class=’btn btn-primary’ and text()=’Add Another Question’]")
	private WebElement addQuestion;

	@FindBy(xpath = "//*[contains (text(),'From group')]")
	private WebElement addGroup;

	@FindBy(xpath = "//span[@title='automationGroup']")
	private WebElement selectGroup;

	@FindBy(xpath = "//button[text()='Done']")
	private WebElement btnDone;

	@FindBy(xpath = "//strong[text()='automationGroup']")
	private WebElement groupName;

	@FindBy(xpath = "//*[@id='app']/div/div/div/div/div/div/div/div/div/div/div/form/div[6]/div/div/div[1]/div[1]/div/div[3]/div/div[1]/div/div[2]")
	private WebElement addParticpantManuallyArrrow;

	@FindBy(xpath = "//input[@id='react-select-2-input']")
	private WebElement addParticpantManually;

	@FindBy(xpath = "//div[@class=' css-1wa3eu0-placeholder']")
	private WebElement addParticpantManually1;

	@FindBy(xpath = "//h4[contains(text(),'Advice from procurement team')]")
	private WebElement AdviceText;

	@FindBy(xpath = "//label[text()='Who to invite']")
	private WebElement whoToInviteText;

	@FindBy(xpath = "//*[contains (text(), 'createQQByName')]")
	private WebElement quoteName;

//// Edit Quote/////////////////////////////////

	@FindBy(xpath = "//div[@class='alert alert-warning']")
	private WebElement editModeTxt;

	@FindBy(xpath = "//a[@class='editbox']//i[@class='fa fa-pencil-square-o']")
	private WebElement editOverview;

	@FindBy(xpath = "//input[@placeholder='Quote name']")
	private WebElement editName;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement editSaveBtn;

	@FindBy(xpath = "//*[@id='app']/div/div/div/div/div/div/div/div/div/div/div[4]/div/div/div[1]/div/div[3]/table/tbody/tr[1]/td[4]/div[1]/button[1]")
	private WebElement editLot;

	@FindBy(xpath = "//input[contains(@value,'Metal Scrap')]")
	private WebElement editLotName;

	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div/div/div/div/div/div/div/div[4]/div/div/div[1]/div/div[3]/table/tbody/tr[1]/td[4]/div[2]/button[1]")
	private WebElement editSaveLot;

	@FindBy(xpath = "//tbody/tr/td[3]/div[1]/button[2]")
	private WebElement deleteQuestionnaire;

	@FindBy(xpath = "//button[text()='Go live']")
	private WebElement goLive;

////////////////////Create Quote Left panel Element /////////////////	

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")
	private WebElement editcontentToolTip;

//	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
//	private WebElement editContentPopup;

	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement delteButton;

	@FindBy(xpath = "//div[contains(text(),'Deleted')]")
	private WebElement delteToaster;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitButton;

	@FindBy(xpath = "//button[text()='Close']")
	private WebElement closeButton;

	@FindBy(xpath = "//div[@class='list']/p[1]")
	private WebElement AutomateText;

	@FindBy(xpath = "//div[@class='list']/h4")
	private WebElement AutomateText1;

///////////////// QQ summary page Elements /////////////////////////////////////////////////////////////////////////////////////////////

	@FindBy(xpath = "//h2[text()='Create QuickQuote Event with all Details']")
	private WebElement nameVerify;

	@FindBy(xpath = "//a[@class='collapsed' and text()='Brief']")
	private WebElement briefToggel;

	@FindBy(xpath = "//div[@class='table-box list']/p")
	private WebElement descriptionVerify;

	@FindBy(xpath = "//a[@class='collapsed' and text()= 'Summary']")
	private WebElement summaryToggel;

	@FindBy(xpath = "//div[@class='summary-table table-scroll']/table/tbody/tr/td/span")
	private WebElement lotNameVerify;

	@FindBy(xpath = "//*[@id='headingTwo']/h4/a")
	private WebElement particpantToggel;

	@FindBy(xpath = "//table[@class='participant-table common-table']/thead/tr/th[2]")
	private WebElement particpantName;

	@FindBy(xpath = "//*[@id='messageCollapse']")
	private WebElement messageToggel;

	@FindBy(xpath = "//div[text()='No messages available']")
	private WebElement noMessage;

	@FindBy(xpath = "//div[contains(@id, 'message_count')]")
	private WebElement messageToaster;

	@FindBy(xpath = "//button[contains(text(), 'Mark As Read')]")
	private WebElement messageMarkAsReadBtn;

	@FindBy(xpath = "//button[contains(text(), 'Send Reply')]")
	private WebElement messageSendReply;

	@FindBy(xpath = "//div[contains(@id, 'message_count')]")
	private WebElement messageBubbleCount;

	@FindBy(xpath = "//button[contains(text(), 'Send new message')]")
	private WebElement sendNewMessagePopupBtn;

	@FindBy(xpath = "//button[contains(text(), 'Send New Message')]")
	private WebElement sendNewMessagePopupBtn2;

	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement sendNewMsgTxtField;

	@FindBy(xpath = "//label [contains(text(),'All participants')]")
	private WebElement allParticipantCheckbox;

	@FindBy(xpath = "//button [contains(text(),'Send Message')]")
	private WebElement sendMsgBtn;

	@FindBy(xpath = "//div[contains(text(),'Your Message has been sent.')]")
	private WebElement msgSendToasterd;

	@FindBy(xpath = "//span[contains(text(),'Your Message has been sent.')]")
	private WebElement msgSendToasterd2;

	@FindBy(xpath = "//span[text()='Outbox']")
	private WebElement outboxTxt;

	@FindBy(xpath = "//span[text()='Inbox']")
	private WebElement InboxTxt;

	@FindBy(xpath = "//span[contains (text(),'This is the Automated Answer of Questionnaire')]")
	private WebElement questionnaireAnswerVerify;

	@FindBy(xpath = "//span[contains(text(),'2222This')]")
	private WebElement questionnaireAnswerVerify2;

	@FindBy(xpath = "//button[text()='Current']")
	private WebElement current;

	@FindBy(xpath = "//button[normalize-space()='Current']")
	private WebElement current1;

	@FindBy(xpath = "//a[text()='Current']")
	private WebElement currentDrop;

	@FindBy(xpath = "//button[normalize-space()='Closed']")
	private WebElement closeDrp1;

	@FindBy(xpath = "//a[contains(text(), 'Close Event')]")
	private WebElement closeDrop;

	@FindBy(xpath = "//div[contains(text(),'By closing')]")
	private WebElement closeAlertTxt;

	@FindBy(xpath = "//div[contains(text(),'By re-opening')]")
	private WebElement reopenAlertTxt;

	@FindBy(xpath = "//a[contains(text(), 'Re-Open')]")
	private WebElement reOpenDrop;

	@FindBy(xpath = "//div[contains(text(),'Your event has now been reopened')]")
	private WebElement reOpenToaster;

	@FindBy(xpath = "//a[text()='Delete']")
	private WebElement delteDrop;

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement confrimationOk;

	@FindBy(xpath = "//*[@id='accordion']/div[5]/button")
	private WebElement editQuote;

	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement editPoupclose;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement editPoupCancel;

	@FindBy(xpath = "//a[text()='Export Report']")
	private WebElement exportReportBtn;

	@FindBy(xpath = "//button[text()='Edit']")
	private WebElement editEvent;

	// AwardLot popup

	@FindBy(xpath = "//button[contains(text(), 'Lot')]")
	private WebElement awardLotBtn;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]")
	private WebElement awardLotCheckbox;

	@FindBy(xpath = "//button[@class='btn clearfix small white button red notified_trashed btn-award fa fa-trash-o fa-red']")
	private WebElement awardLotDelete;

	@FindBy(xpath = "//div[contains(@class, 'alert alert-info')]")
	private WebElement awardPopupValMsg;

	@FindBy(xpath = "//button[contains(text(), 'Create New Award Notice')]")
	private WebElement createAwardNoticeBtn;

	@FindBy(xpath = "//button[text()='Send Award Notice']")
	private WebElement sendAwardNoticeBtn;

	@FindBy(xpath = "//div[@class='alert alert-success msg']")
	private WebElement awardLotValidationMsg;

	@FindBy(xpath = "//*[@id='accordion']/div[5]/div/div/div/div/div/div/div/div/div/div/div[2]/div[2]/div")
	private WebElement awardLotDeleteValidationMsg;

///////////////////////////////Sandpit Elements /////////////////////////////////////////////////////

	@FindBy(xpath = "//*[contains(text(), \"Sandpit Co 1 sandpit1@marketdojo.com\")]")
	private WebElement sandpitco1Checkbox;

	@FindBy(xpath = "//*[contains(text(), \"Sandpit Co 2 sandpit2@marketdojo.com\")]")
	private WebElement sandpitco2Checkbox;

	@FindBy(xpath = "//*[contains(text(), \"Sandpit Co 3 sandpit3@marketdojo.com\")]")
	private WebElement sandpitco3Checkbox;

	@FindBy(xpath = "//ul[@class='nav-header']/li[3]/a/span/i")
	private WebElement sandpitHeader;

	@FindBy(xpath = "//p[contains(text(), 'Welcome to the')]")
	private WebElement sandpitWelcomeMessage;

	@FindBy(xpath = "//*[contains (text(),  'Act as Host')]")
	private WebElement actAsHost;

	@FindBy(xpath = "//button[text()='Leave Sandpit']")
	private WebElement leaveSandpit;

	@FindBy(xpath = "//*[contains (text(),  'Act as Sandpit Co 1')]")
	private WebElement dropdownSandpitco1;

	@FindBy(xpath = "//*[@id='header-navbar']/div/div[2]/ul/li/a")
	private WebElement eventHeader;

	// Participant end Sandpit Elements

	@FindBy(xpath = "//li[contains(@class,'menu-item events current')]//a[@class='menu-item-tab'][normalize-space()='Events']")
	private WebElement eventsHeaders;

	@FindBy(xpath = "//*[@id='main-container']/div[3]/div/div/div[1]/div/form/table/tbody/tr[1]/td[2]/div[2]/div/div/div/div/button")
	private WebElement eventInvitation;

	@FindBy(xpath = "//*[@id=\"main-container\"]/div[3]/div/div/div[1]/div/form/table/tbody/tr[1]/td[2]/div[2]/div/div/div/div/ul/li[1]/a")
	private WebElement eventAccept;

	@FindBy(xpath = "//*[contains(@title, 'Questionnaire')]")
	private WebElement questionnaireTab;

	@FindBy(xpath = "//span[contains(text(), 'Messages')]")
	private WebElement messageTab;

	@FindBy(xpath = "//button[contains(text(), 'Send New Message')]")
	private WebElement sendNewMessageBtnP;

	@FindBy(xpath = "//div[@class='form-item-block qqa-block']/div/div/div/div[2]/div/input")
	private WebElement questionnaireAnwer1;

	@FindBy(xpath = "//*[contains(text(), 'Submit answers')]")
	private WebElement submitAnswer;

	@FindBy(xpath = "//div[@class='alert alert-info alert-dismissable']")
	private WebElement reSubVal;

	@FindBy(xpath = "//h6[@class='questionnaire-status green']")
	private WebElement subVal;

	@FindBy(xpath = "//*[contains(@id, 'confirmOk')]")
	private WebElement submitAnswerFinalConfirmation;

	@FindBy(xpath = "//*[contains(text(), 'RFQs')]")
	private WebElement RfqTab;

	@FindBy(xpath = "//*[contains(text(), 'Enter Bid')]")
	private WebElement enterBidBtn;

	@FindBy(xpath = "//*[contains(@name, 'bid[price]')]")
	private WebElement enterBid;

	@FindBy(xpath = "//*[contains(@class, 'btn btn-default light-gray-color push-5-r br-green-color')]")
	private WebElement submitBid;

	@FindBy(xpath = "//*[contains(@class, 'btn btn-primary ok-btn')]")
	private WebElement confirmSubmitBid;

	@FindBy(xpath = "//*[contains(@class,'modal-dialog modal-dialog-popout custom-modal modal-lg')]/div/div[3]/button")
	private WebElement confirmBidReceivedPoupup;

	@FindBy(xpath = "//*[contains (text(), 'Allow resubmission')]")
	private WebElement AllowResubmissionBtn;

	@FindBy(xpath = "//*[contains (text(), 'Waiting for resubmission')]")
	private WebElement WaitingForResubmissionText;

	@FindBy(xpath = "//*[contains (@class, 'participant-table common-table')]/tbody/tr[2]/td[2]/a")
	private WebElement particpantBid;

	@FindBy(xpath = "//*[contains (@class, 'icon-link')]")
	private WebElement deleteBid;

	@FindBy(xpath = "//*[contains (@class, 'button-l btn btn-primary')]")
	private WebElement deleteBidConfirm;

	// QQ List page Elements

	@FindBy(xpath = "//input[@placeholder='Search for quote']")
	private WebElement searchForQuote;

	@FindBy(xpath = "//span[text()='QQ deadline']")
	private WebElement qqDeadlinetxt;

	@FindBy(xpath = "//i[@class='fa fa-search']")
	private WebElement searchBtn;

	@FindBy(xpath = "//td[text()='No Quick Quotes Found']")
	private WebElement noQuoteFound;

	@FindBy(xpath = "//a[text()='Search Quote']")
	private WebElement searchResult;

	// Initialize the Page Object
	public QuickQuotesPage() {
		PageFactory.initElements(driver, this);
	}

	////////////////////////////////////// Actions

	// Used in BeforeClass
	public void redirectFromMdDashboardToQuoteListing() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(AllModule));// Click on All module 
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", AllModule);
//		wait.until(ExpectedConditions.elementToBeClickable(quickQuickDrp));// Click on Quote option which is inside all module dropdown 
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", quickQuickDrp);
	}

	// Used in BeforeMethod
	public void quoteListingToCreate() throws InterruptedException {
		Thread.sleep(3000);
		quotesHeading.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(newQuoteBtn));
		newQuoteBtn.click();
	}

//	// Global things
//	public void scroll() {
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0,700)");
//	}
//
//	public void scrollUp() {
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0,-250)");
//	}
//
//	// GlobalThings
//	public void scrollTillBottom() {
//		// Scroll to bottom of page
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	}

	// Unused script of new user license check
	public boolean verifyQQLiscence() throws InterruptedException {
		redirectFromMdDashboardToQuoteListing();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(alertLiscenceMsg));
		return alertLiscenceMsg.isDisplayed();
	}

// Scripts 

	public String titleTest() {
		return driver.getTitle();
	}

	public boolean checkusername() {
		return userNameLabel.isDisplayed();
	}

	public boolean checkLogo() {
		return mdLogo.isDisplayed();
	}

	public boolean createNameFieldValidaions() throws InterruptedException {
		Thread.sleep(8000);// This is execute first on Jenkins
//		driver.navigate().to(prop.getProperty("QuickQuotesHomepage")); 
//		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(whoToInviteText));// this is load at last
		// Enter long name in quoteName field
		wait.until(ExpectedConditions.elementToBeClickable(name));
		name.sendKeys("Automate test on enter long name validation message should appearsdfsdfsdf");// Adding long name
		System.out.println("long name");
		Thread.sleep(3000);
		name.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(longNameValidation));
		return longNameValidation.isDisplayed();
	}

	public boolean createGetQuoteButtonIsDisable() throws InterruptedException {
//		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
//		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));// this is load at last
		name.clear();
		// Scroll to bottom of page
		TestUtils.scrollTillBottom();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		// verify get quote button is disabled
		return getQuoteButton.isEnabled();
	}

	public boolean createToasterMessage() throws InterruptedException {
//		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
//		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));// this is load at last
		name.clear();
		name.sendKeys("Verify Toaster message");
		deadline.sendKeys("2019-04-14 19:35");
		TestUtils.scrollTillBottom();
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		getQuoteButton.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(pastDeadlineToaster));
		return pastDeadlineToaster.isDisplayed();
	}

	public boolean createQQByName() throws Throwable {
//		Thread.sleep(2000);
//		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));// this is load at last
		name.clear();
		name.clear();// for test
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", name);
		name.sendKeys("createQQByName");
		deadline.clear();
		deadline.click();
//		Thread.sleep(2000);
		TestUtils.scrollTillBottom();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(whoToInviteText));// this is load at last
		executor.executeScript("arguments[0].click();", getQuoteButton);
		wait.until(ExpectedConditions.elementToBeClickable(quoteName));
		return quoteName.isDisplayed();
	}

	public boolean createQQEventWithAllDetails() throws InterruptedException {
//		Thread.sleep(2000);//Adding because failed on Jenkins
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		name.clear();
		name.sendKeys("Create QuickQuote Event with all Details");
		System.out.println("Name added");
		deadline.clear();
//		deadline.sendKeys("2024-04-14 19:35");
		driver.switchTo().frame(0);
		wait.until(ExpectedConditions.elementToBeClickable(description));
		description.sendKeys("This is my description");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		TestUtils.scroll();
		fromLibraryBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(SelectDocPopup));
		SelectDocPopup.click();
		wait.until(ExpectedConditions.elementToBeClickable(clickBtnFromPopup));
		clickBtnFromPopup.click();
		Thread.sleep(2000);
		TestUtils.scroll();
		lotCheckbox.click();
		wait.until(ExpectedConditions.elementToBeClickable(lotName));
		lotName.sendKeys("Metal Scrap");
		wait.until(ExpectedConditions.elementToBeClickable(lotUom));
		lotUom.sendKeys("tonnes");
		wait.until(ExpectedConditions.elementToBeClickable(lotQuantity));
		lotQuantity.sendKeys("5");
		System.out.println("lot added");
		wait.until(ExpectedConditions.elementToBeClickable(questionnaireCheckbox));
		questionnaireCheckbox.click();
		wait.until(ExpectedConditions.visibilityOf(questionName));
		questionName.sendKeys("Automation");
		System.out.println("questionnaire added"); // till here pass on Jenkins
		Select questionnairedrp = new Select(driver.findElement(By.name("qqQuestions.questionnaire[0].question_type")));
		questionnairedrp.selectByVisibleText("Text");
//        TestUtils.scroll();
//		Thread.sleep(2000);
//		addParticpantManuallyArrrow.click();
//		System.out.println("clicked arrow");
//		addParticpantManually.sendKeys("d1@mailinator.com");
//		addParticpantManually.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		addParticpantManually1.sendKeys(Keys.DOWN,Keys.RETURN);
//		System.out.println("Added d1");
		TestUtils.scroll();
		wait.until(ExpectedConditions.elementToBeClickable(getQuoteButton));
		getQuoteButton.click();
		// Verify on create page
		// description Verify
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(particpantToggel));
		briefToggel.click();
		wait.until(ExpectedConditions.visibilityOf(descriptionVerify));
		String descrption = descriptionVerify.getText();
		Assert.assertEquals(descrption, "This is my description");
//		briefToggel.click();
		// lotName Verify
		Thread.sleep(4000);
		summaryToggel.click();
		wait.until(ExpectedConditions.visibilityOf(lotNameVerify));
		String LotName = lotNameVerify.getText();
		Assert.assertEquals(LotName, "Metal Scrap");
		TestUtils.scroll();
		// ParticpantVerify
		particpantToggel.click();
		// verifyEventName
		wait.until(ExpectedConditions.visibilityOf(nameVerify));
		return nameVerify.isDisplayed();
	}

	public void createSandpitEventWithQuestionnaireAndAllowResubmission() throws InterruptedException {
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(whoToInviteText));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", sandpitHeader);
		Thread.sleep(3000);
//		sandpitHeader.click();
//		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(newQuoteBtn));
		newQuoteBtn.click();// click on new quote button on quote listing page
		wait.until(ExpectedConditions.elementToBeClickable(name));
		name.sendKeys("Create QuickQuote Event with Participant Answers");
		Thread.sleep(5000);
		TestUtils.scroll();
		TestUtils.scroll();
		questionnaireCheckbox.click();
		wait.until(ExpectedConditions.elementToBeClickable(questionName));
		questionName.sendKeys("Automation");
		Select questionnairedrp = new Select(driver.findElement(By.name("qqQuestions.questionnaire[0].question_type")));
		questionnairedrp.selectByVisibleText("Text");
		TestUtils.scroll();
//		questionDropdown.click();
//		wait.until(ExpectedConditions.elementToBeClickable(oneLineText));
//		oneLineText.click();
		Thread.sleep(2000);
		sandpitco1Checkbox.click();
		getQuoteButton.click();
		Thread.sleep(3000);
		///////////////// Create questionnaire event at Host End
		wait.until(ExpectedConditions.elementToBeClickable(actAsHost));
		actAsHost.click();
		Thread.sleep(2000);
		dropdownSandpitco1.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(eventHeader));
		eventHeader.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(eventInvitation));
		eventInvitation.click();
		wait.until(ExpectedConditions.elementToBeClickable(eventAccept));
		eventAccept.click();
		wait.until(ExpectedConditions.elementToBeClickable(questionnaireTab));
		questionnaireTab.click();
		TestUtils.scroll();
		Thread.sleep(3000);
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
		Thread.sleep(8000);
		TestUtils.scroll();
		wait.until(ExpectedConditions.elementToBeClickable(particpantToggel));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", particpantToggel);
		particpantToggel.click();
		Thread.sleep(2000);
		TestUtils.scroll();
		wait.until(ExpectedConditions.visibilityOf(questionnaireAnswerVerify));
		TestUtils.scroll();
		AllowResubmissionBtn.click();
		Thread.sleep(2000);
		/////////////////////////////////////// Allow Resub at Host end
		actAsHost.click();
		dropdownSandpitco1.click();
//		TestUtils.scroll();
		questionnaireTab.click();
		TestUtils.scroll();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(questionnaireAnwer1));
		questionnaireAnwer1.clear();
		System.out.println(reSubVal.getText());
		Assert.assertEquals(reSubVal.getText(), "Your answers have not been re-submitted.");
		questionnaireAnwer1.sendKeys("2222This is the Automated Answer of Questionnaire");
		submitAnswer.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitAnswerFinalConfirmation));
		submitAnswerFinalConfirmation.click();
		Assert.assertEquals(subVal.getText(), "Submitted");
		wait.until(ExpectedConditions.elementToBeClickable(actAsHost));
		actAsHost.click();
		TestUtils.scroll();
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOf(particpantToggel));
//		wait.until(ExpectedConditions.elementToBeClickable(particpantToggel));
//		JavascriptExecutor executor11 = (JavascriptExecutor)driver;
//		executor11.executeScript("arguments[0].click();", particpantToggel);
//		wait.until(ExpectedConditions.visibilityOf(questionnaireAnswerVerify2));
		particpantToggel.click();
		Thread.sleep(4000);
//		TestUtils.scroll();
		TestUtils.scrollTillBottom();
		Thread.sleep(4000);
//		String text= questionnaireAnswerVerify.getText();
		Assert.assertEquals(questionnaireAnswerVerify2.getText(), "2222This is the Automated Answer of Questionnaire");
//		System.out.println("scroll up");
		TestUtils.scrollUp();
		TestUtils.scrollUp();
		leaveSandpit.click();
		System.out.println("Leaving sandpit");
		Thread.sleep(2000);
//		executor1.executeScript("arguments[0].click();", quickquoteDashbaord);
		Assert.assertEquals(yourQuoteText.getText(), "YOUR QUOTES");
	}

	public boolean createEditContent() throws InterruptedException {
		Thread.sleep(3000);// Adding because failed on Jenkins
//		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
//		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		// Click on edit pencil icon right panel
		Thread.sleep(2000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", editcontentToolTip);
//		editcontentToolTip.click();
		Thread.sleep(5000);// Adding because failed on Jenkins
		driver.switchTo().frame(1);
		System.out.println("Inside Frame");
		wait.until(ExpectedConditions.elementToBeClickable(sendNewMsgTxtField));
		sendNewMsgTxtField.clear();
		sendNewMsgTxtField.sendKeys("Automate test");
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		submitButton.click();
		Assert.assertEquals(AutomateText.getText(), "Automate test");
		editcontentToolTip.click();
		delteButton.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(AutomateText1));
		Assert.assertEquals(AutomateText1.getText(), "ADVICE FROM PROCUREMENT TEAM");
		return AutomateText1.isDisplayed();
	}

	public boolean deleteQuote() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(name));
//		newQuoteBtn.click();		
//		wait.until(ExpectedConditions.elementToBeClickable(name));
		System.out.println("create qq");
		Thread.sleep(4000);
		name.clear();
		name.sendKeys("verify Delete quote");
		TestUtils.scrollTillBottom();
		wait.until(ExpectedConditions.elementToBeClickable(getQuoteButton));
		getQuoteButton.click();
		System.out.println("Summary page TCO6");
		// Redirect to summary page
		wait.until(ExpectedConditions.elementToBeClickable(messageToggel));
		current.click();
		wait.until(ExpectedConditions.elementToBeClickable(delteDrop));
		delteDrop.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(confrimationOk));
		confrimationOk.click();
		Thread.sleep(2000);
		System.out.println("Quote Deleted successfully");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(yourQuoteText));
		;
		Assert.assertEquals(yourQuoteText.getText(), "YOUR QUOTES");
		return yourQuoteText.isDisplayed();
	}

	public boolean searchQuote() throws InterruptedException {
//		driver.get("https://next.testmd.co.uk/quick_quotes/quotes");
		Thread.sleep(3000);
		quotesHeading.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(searchForQuote));
		searchForQuote.clear();
		wait.until(ExpectedConditions.elementToBeClickable(searchForQuote));
		searchForQuote.sendKeys("Search Quote");
		wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
		searchBtn.click();
		Thread.sleep(5000);// Adding wait as failed on Jenkins
//        wait.until(ExpectedConditions.elementToBeClickable(searchResult));
		Assert.assertEquals(searchResult.getText(), "Search Quote");
		return searchResult.isDisplayed();
	}

	public void createMessage() throws InterruptedException {
		Thread.sleep(3000);// Adding because failed on Jenkins
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		Thread.sleep(4000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", sandpitHeader);
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(newQuoteBtn));
		newQuoteBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(name));
		Thread.sleep(5000);
		// Create Quote in Sandpit mode
		Assert.assertEquals(sandpitWelcomeMessage.getText(),
				"Welcome to the Sandpit! Here you can learn to use Market Dojo; viewing events from both the host and participant perspective to test event configurations.");
		System.out.println("Entering event name ");
		name.sendKeys("Msg flow host and particpant end ");
		TestUtils.scrollTillBottom();
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		wait.until(ExpectedConditions.elementToBeClickable(sandpitco1Checkbox));
		sandpitco1Checkbox.click();
		getQuoteButton.click();
		// Redirect to summary page
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(messageToggel));
		messageToggel.click();
		Thread.sleep(2000);
		TestUtils.scroll();
		Assert.assertEquals(noMessage.getText(), "No messages available");
		sendNewMessagePopupBtn.click();
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(sendNewMsgTxtField));
		driver.switchTo().frame(0);
		sendNewMsgTxtField.sendKeys("Automated message from Host");
		driver.switchTo().defaultContent();
		allParticipantCheckbox.click();
		sendMsgBtn.click();
		Assert.assertEquals(msgSendToasterd.getText(), "YOUR MESSAGE HAS BEEN SENT.");
		Assert.assertEquals(outboxTxt.getText(), "Outbox");
		TestUtils.scrollUp();
		// At participants end
		actAsHost.click();
		dropdownSandpitco1.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(eventHeader));
		eventHeader.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(eventInvitation));
		eventInvitation.click();
		wait.until(ExpectedConditions.elementToBeClickable(eventAccept));
		eventAccept.click();
		Thread.sleep(5000);// As test failing on Jenkins
//		wait.until(ExpectedConditions.elementToBeClickable(messageTab));
		messageTab.click();
		Thread.sleep(4000);// As test failing on Jenkins
		TestUtils.scroll();
		System.out.println("Bubble count at host end");
		Assert.assertEquals(InboxTxt.getText(), "Inbox");
		Assert.assertEquals(messageBubbleCount.getText(), "1");
		wait.until(ExpectedConditions.elementToBeClickable(messageMarkAsReadBtn));
		Thread.sleep(2000);
		messageMarkAsReadBtn.click();
		messageSendReply.click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		wait.until(ExpectedConditions.elementToBeClickable(sendNewMsgTxtField));
		sendNewMsgTxtField.sendKeys("Automate message as particpant");
		driver.switchTo().defaultContent();
		sendMsgBtn.click();
		System.out.println("Sending message as participant");
		Thread.sleep(2000);// As test failing on Jenkins
		wait.until(ExpectedConditions.elementToBeClickable(msgSendToasterd2));
		Assert.assertEquals(msgSendToasterd2.getText(), "Your Message has been sent.");
		Thread.sleep(2000);
		TestUtils.scrollUp();
		leaveSandpit.click();// Redirect to MD Dashboard 
		Thread.sleep(2000);
		System.out.println("Leaving sandpit");
		mdLogo.click();
		Thread.sleep(2000);
	}

	public boolean particpantAddedFromGroup() throws InterruptedException {
//		Thread.sleep(5000);//Adding because failed on Jenkins
//		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		name.clear();
		Thread.sleep(4000);
		name.sendKeys("Add from Group");
		TestUtils.scrollTillBottom();
		Thread.sleep(2000);
//		TestUtils.scroll();
//		Thread.sleep(3000);//Adding because failed on Jenkins
//		TestUtils.scroll();
//		Thread.sleep(3000);//Adding because failed on Jenkins
//		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
//		wait.until(ExpectedConditions.elementToBeClickable(addGroup));
//		TestUtils.scroll();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", addGroup);
		Thread.sleep(3000);
		System.out.println("Group poup gets open7");
		wait.until(ExpectedConditions.elementToBeClickable(selectGroup));
		selectGroup.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(btnDone));
		btnDone.click();
		Assert.assertEquals(groupName.getText(), "AUTOMATIONGROUP");
		getQuoteButton.click();
		return groupName.isDisplayed();
	}

	public boolean EditQQEvent() throws InterruptedException {
		Thread.sleep(3000);//Adding because failed on Jenkins
//		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		System.out.println("Inside 13");
//		redirectFromMdDashboardToQuoteListing();
//		driver.navigate().refresh();
//		Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(whoToInviteText));
		name.clear();
		name.sendKeys("Create QQ Event");
		System.out.println("Entering name");
		TestUtils.scrollTillBottom();
		wait.until(ExpectedConditions.elementToBeClickable(lotCheckbox));
		///////////////////// Adding lots
		lotCheckbox.click();
		wait.until(ExpectedConditions.elementToBeClickable(lotName));
		lotName.sendKeys("Metal Scrap");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(lotUom));
		lotUom.sendKeys("tonnes");
		lotQuantity.sendKeys("5");
		TestUtils.scroll();
		System.out.println("lot added");
		wait.until(ExpectedConditions.elementToBeClickable(questionnaireCheckbox));
		//////////////////// Adding Questionnaire
		questionnaireCheckbox.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(questionName));
		questionName.sendKeys("Automation");
//		wait.until(ExpectedConditions.elementToBeClickable(questionDropdown));
//		questionDropdown.click();
//		wait.until(ExpectedConditions.elementToBeClickable(oneLineText));
//		oneLineText.click();		
		Select questionnairedrp = new Select(driver.findElement(By.name("qqQuestions.questionnaire[0].question_type")));
		questionnairedrp.selectByVisibleText("Text");
		System.out.println("Questionnaire added");
		TestUtils.scroll();
		TestUtils.scroll();
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(addParticpantManually));
//		addParticpantManually.sendKeys("d1@mailinator.com");
//		addParticpantManually.sendKeys(Keys.ENTER);
//		wait.until(ExpectedConditions.elementToBeClickable(getQuoteButton));
		Thread.sleep(2000);
		getQuoteButton.click();
		System.out.println("QQ created");
		///////////////////////// Moving to edit mode again
		editQuote.click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(editModeTxt));
		Assert.assertEquals(editModeTxt.getText(), "This event is currently in Edit Mode which has put it on hold.");
		editOverview.click();
		wait.until(ExpectedConditions.elementToBeClickable(editModeTxt));
		editName.clear();
		editName.sendKeys("Edited QQ Event");
		TestUtils.scroll();
		wait.until(ExpectedConditions.elementToBeClickable(editSaveBtn));
		editSaveBtn.click();
		Thread.sleep(2000);
		TestUtils.scroll();
		editLot.click();
		wait.until(ExpectedConditions.elementToBeClickable(editLotName));
		editLotName.clear();
		editLotName.sendKeys("Edited Lot");
		wait.until(ExpectedConditions.elementToBeClickable(editSaveLot));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", editSaveLot);
		wait.until(ExpectedConditions.elementToBeClickable(deleteQuestionnaire));
		deleteQuestionnaire.click();
		wait.until(ExpectedConditions.elementToBeClickable(confrimationOk));
		confrimationOk.click();
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", goLive);
		// Move to current mode again
		Thread.sleep(2000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(editPoupCancel));
			editPoupCancel.click();
		} catch (Exception e) {

		}
		wait.until(ExpectedConditions.elementToBeClickable(particpantToggel));
		wait.until(ExpectedConditions.elementToBeClickable(summaryToggel));
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click();", summaryToggel);
		Thread.sleep(4000);
		Assert.assertEquals(lotNameVerify.getText(), "Edited Lot");
		return lotNameVerify.isDisplayed();
	}

	public boolean closedReopenEvent() throws InterruptedException {
		driver.navigate().to("https://next.testmd.co.uk/quick_quotes/quote/33396");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(particpantToggel));
		Thread.sleep(4000);
		closeDrp1.click();
		wait.until(ExpectedConditions.elementToBeClickable(reOpenDrop));
		Thread.sleep(2000);
		reOpenDrop.click();
		wait.until(ExpectedConditions.elementToBeClickable(confrimationOk));
		confrimationOk.click();
		Thread.sleep(2000);// Adding wait as failing on Jenkins
		Assert.assertEquals(reOpenToaster.getText(), "YOUR EVENT HAS NOW BEEN REOPENED");
		// Event gets re-opened
		wait.until(ExpectedConditions.elementToBeClickable(current));
		Thread.sleep(2000);
		current.click();
		wait.until(ExpectedConditions.elementToBeClickable(closeDrop));
		closeDrop.click();
		Thread.sleep(2000);
		Assert.assertEquals(closeAlertTxt.getText(),
				"By closing this event your participants will no longer have access to the documents, including uploading their own documents, the Lots or any of the event details. You can re-open this event manually at any time if you wish to reverse this action. Are you sure you would like to close this event?");
		wait.until(ExpectedConditions.elementToBeClickable(confrimationOk));
		confrimationOk.click();
		// Event gets closed
		Thread.sleep(4000);
		return exportReportBtn.isDisplayed();
	}

	public void awardLotPopup() throws InterruptedException {
		driver.navigate().to("https://next.testmd.co.uk/quick_quotes/quote/33416");
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(awardLotBtn));
		awardLotBtn.click();
		Thread.sleep(2000);
		Select se = new Select(driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/select[1]")));
		se.selectByVisibleText("mailinator.com");
		wait.until(ExpectedConditions.visibilityOf(awardLotCheckbox));
		awardLotCheckbox.click();
		Thread.sleep(3000);
		TestUtils.scrollTillBottom();
		wait.until(ExpectedConditions.visibilityOf(createAwardNoticeBtn));
		createAwardNoticeBtn.click();
		Thread.sleep(4000);
		TestUtils.scrollTillBottom();
		wait.until(ExpectedConditions.elementToBeClickable(sendAwardNoticeBtn));
		sendAwardNoticeBtn.click();
		System.out.println(awardLotValidationMsg.getText());
		Thread.sleep(2000);
		awardLotDelete.click();
		System.out.println(awardLotDeleteValidationMsg.getText());
		Assert.assertEquals(awardLotDeleteValidationMsg.getText(), "The Award Notice has been deleted.");
		editPoupCancel.click();
		Thread.sleep(2000);
//		return awardLotDeleteValidationMsg.isDisplayed();
	}

	public void ckEditor() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(whoToInviteText));
		name.clear();
		name.sendKeys("ckEditor Test");
		Thread.sleep(2000);
		// Inside Description
		driver.switchTo().frame(0);
		wait.until(ExpectedConditions.elementToBeClickable(description));
		description.sendKeys("boldText");
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//p[normalize-space()='boldText']"));
		act.doubleClick(ele).perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		boldText.click();
		TestUtils.scrollTillBottom();
		getQuoteButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(briefToggel));
		briefToggel.click();
		String BoldTxt1 = driver.findElement(By.xpath("//strong[normalize-space()='boldText']")).getTagName();
		Assert.assertEquals(BoldTxt1, "strong");
	}

	public boolean currencySymbol() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(AdviceText));
		Thread.sleep(4000);
		name.clear();
		name.sendKeys("currency Symbol Test");
		TestUtils.scroll();
		wait.until(ExpectedConditions.visibilityOf(lotCheckbox));
		lotCheckbox.click();
		Thread.sleep(3000);
////////Open currency dropdown
		currencyDrop.click();
		Thread.sleep(2000);
//		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
		Thread.sleep(2000);
		System.out.println(keyDown);
		TestUtils.scroll();
		wait.until(ExpectedConditions.elementToBeClickable(lotName));
		lotName.sendKeys("Metal Scrap");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(lotUom));
		lotUom.sendKeys("tonnes");
		lotQuantity.sendKeys("5");
		TestUtils.scroll();
		TestUtils.scroll();
		getQuoteButton.click();
		Thread.sleep(5000);
/////////Using JS Excecutor instead of ThreadSleeep		
		wait.until(ExpectedConditions.elementToBeClickable(summaryToggel));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", summaryToggel);
//	    summaryToggel.click();
		Thread.sleep(2000);
        System.out.println(currencySymbol.getText());
//	    Assert.assertEquals(currencySymbol.getText(), "$-");
		return currencySymbol.isDisplayed();	
	}
}
