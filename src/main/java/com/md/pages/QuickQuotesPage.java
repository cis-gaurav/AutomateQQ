package com.md.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.md.base.TestBase;

public class QuickQuotesPage extends TestBase {

///////////////// Page Factory == OR

	@FindBy(name = "user[login]")
	private static  WebElement username;
	
	@FindBy(name = "user[password]")
	static private WebElement password;
	
	@FindBy(name = "commit")
	static private WebElement loginBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	static private WebElement AdminDashboard;

	@FindBy(xpath = "//*[@id='header-navbar']/div/div[2]/ul/li[6]/a")
	private static WebElement quickquoteDashbaord;

	@FindBy(xpath = "//h4[text()='YOUR QUOTES']")
	static private WebElement yourQuoteText;

	@FindBy(xpath = "//a[@class='btn btn-primary btn-fixed pull-right']")
	private WebElement newQuoteBtn;

///////////Create QQ Page Element /////////////////

	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary m-t20 btn-sizebig']")
	private WebElement getQuoteButton;

	@FindBy(xpath = "//div[@class='alert alert-warning']")
	private WebElement alertLiscenceMsg;

	@FindBy(xpath = "//input[@name='QQGeneralDetails.quote_name']")
	private WebElement name;

	@FindBy(xpath = "//*[contains(text(), 'Required')]")
	private WebElement blankNameValidation;

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

	@FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer']")
	private WebElement addParticpantManuallyArrrow;

	@FindBy(xpath = "//input[@id='react-select-2-input']")
	private WebElement addParticpantManually;

	@FindBy(xpath = "//h4[contains(text(),'Advice from procurement team')]")
	private WebElement AdviceText;

	@FindBy(xpath = "//label[text()='Who to invite']")
	private WebElement whoToInviteText;

	@FindBy(xpath = "//*[contains (text(), 'createQQByName')]")
	private WebElement quoteName;

////////////////////Left panel Element /////////////////	

	@FindBy(xpath = "//*[@id=\"app\"]//div[2]/div[2]/div/div/div/div[1]/a/i")
	private WebElement editcontentToolTip;

	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement editContentPopup;

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

	@FindBy(xpath = "//button[contains(text(), 'Send new message')]")
	private WebElement sendNewMessagePopupBtn;

	@FindBy(xpath = "	//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement sendNewMsgTxtField;

	@FindBy(xpath = "//label [contains(text(),'All participants')]")
	private WebElement allParticipantCheckbox;

	@FindBy(xpath = "//button [contains(text(),'Send Message')]")
	private WebElement sendMsgBtn;

	@FindBy(xpath = "//div[contains(text(),'Your Message has been sent.')]")
	private WebElement msgSendToasterd;

	@FindBy(xpath = "//span[contains (text(),'This is the Automated Answer of Questionnaire')]")
	private WebElement questionnaireAnswerVerify;

///////////////////////////////Sandpit Elements /////////////////////////////////////////////////////

	@FindBy(xpath = "//*[contains(text(), \"Sandpit Co 1 sandpit1@marketdojo.com\")]")
	private WebElement sandpitco1Checkbox;

	@FindBy(xpath = "//*[contains(text(), \"Sandpit Co 2 sandpit2@marketdojo.com\")]")
	private WebElement sandpitco2Checkbox;

	@FindBy(xpath = "//*[contains(text(), \"Sandpit Co 3 sandpit3@marketdojo.com\")]")
	private WebElement sandpitco3Checkbox;

	@FindBy(xpath = "//*[contains (@class ,'navbar-nav collapse navbar-collapse navbar-module-right pull-left')]/ul/li[3]")
	private WebElement sandpitHeader;

	@FindBy(xpath = "//*[contains (text(),  'Act as Host')]")
	private WebElement actAsHost;

	@FindBy(xpath = "//*[contains (text(),  'Act as Sandpit Co 1')]")
	private WebElement dropdownSandpitco1;

	@FindBy(xpath = "//*[@id='header-navbar']/div/div[2]/ul/li/a")
	private WebElement eventHeader;

	// Participant end Sandpit Elements

	@FindBy(xpath = "//*[@id=\"main-container\"]/div[3]/div/div/div[1]/div/form/table/tbody/tr[1]/td[2]/div[2]/div/div/div/div/button")
	private WebElement eventInvitation;

	@FindBy(xpath = "//*[@id=\"main-container\"]/div[3]/div/div/div[1]/div/form/table/tbody/tr[1]/td[2]/div[2]/div/div/div/div/ul/li[1]/a")
	private WebElement eventAccept;

	@FindBy(xpath = "//*[contains(@title, 'Questionnaire')]")
	private WebElement questionnaireTab;

	@FindBy(xpath = "//div[@class='form-item-block qqa-block']/div/div/div/div[2]/div/input")
	private WebElement questionnaireAnwer1;

	@FindBy(xpath = "//*[contains(text(), 'Submit answers')]")
	private WebElement submitAnswer;

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

	// Initialize the Page Object
	public  QuickQuotesPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void redirectFromMDDashboardtoQQCreate() throws InterruptedException {
		Thread.sleep(3000);
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", quickquoteDashbaord);
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
		Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));// this is load at last
		// Enter long name in quoteName field
		name.sendKeys("Automate test on enter long name validation message should appearsdfsdfsdf");
		Thread.sleep(6000);
//		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));
		AdviceText.click();
//		deadline.click();
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
		Thread.sleep(2000);
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(whoToInviteText));// this is load at last 
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
		Thread.sleep(4000);
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
	private WebElement Verify1;

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
		Thread.sleep(3000);
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
		Thread.sleep(8000);
		scrollTillBottom();
		wait.until(ExpectedConditions.elementToBeClickable(particpantToggel));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", particpantToggel);
		particpantToggel.click();
		Thread.sleep(2000);
		scroll();
		wait.until(ExpectedConditions.visibilityOf(questionnaireAnswerVerify));
		AllowResubmissionBtn.click();
		Thread.sleep(2000);
		///////////// Allow resub at Host end
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
		Thread.sleep(6000);
		particpantToggel.click();
		Thread.sleep(2000);
		scrollTillBottom();
//		String text= questionnaireAnswerVerify.getText();
//		Assert.assertEquals(text, "This is the Automated Answer of Questionnaire");
		wait.until(ExpectedConditions.visibilityOf(questionnaireAnswerVerify));
		return questionnaireAnswerVerify.isDisplayed();
	}

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
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(AutomateText1));
		Assert.assertEquals(AutomateText1.getText(), "ADVICE FROM PROCUREMENT TEAM");
		return AutomateText1.isDisplayed();
	}

	public void createMessage() throws InterruptedException {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(6000);
//	JavascriptExecutor executor = (JavascriptExecutor)driver;
//	executor.executeScript("arguments[0].click();", sandpitHeader);
		sandpitHeader.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(newQuoteBtn));
		newQuoteBtn.click();// click on new quote button on quote listing page
		wait.until(ExpectedConditions.elementToBeClickable(name));
		name.sendKeys("Automate Messages");
		scrollTillBottom();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(sandpitco1Checkbox));
		sandpitco1Checkbox.click();
		getQuoteButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(messageToggel));
		messageToggel.click();
	}

	public void Rough1() throws InterruptedException {
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
	}
}
