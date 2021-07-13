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

public class QuickQuotes extends TestBase {

	// Page Factory == OR
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

	@FindBy(xpath = "//a[@class='btn btn-primary btn-fixed pull-right']")
	WebElement newQuote;

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

	@FindBy(xpath = "//div[@class=\"form-item-block\"]/div[3]/label")
	WebElement whoToInviteText;

	@FindBy(xpath = "//*[contains (text(), 'createQQByName')]")
	WebElement quoteName;
	
// QQ summary page Elements 
	@FindBy(xpath = "//h2[text()='Create QuickQuote Event with all Details']")
	WebElement nameVerify;

	@FindBy (xpath="//a[@class='collapsed' and text()='Brief']")
	WebElement briefToggel;
	
	@FindBy(xpath = "//div[@class='table-box list']/p")
	WebElement descriptionVerify;
	
	@FindBy(xpath="//a[@class='collapsed' and text()= 'Summary']")
	WebElement summaryToggel ;
	
	@FindBy(xpath="//div[@class='summary-table table-scroll']/table/tbody/tr/td/span")
	WebElement lotNameVerify ;
	
	@FindBy(xpath="//a[@class='collapsed' and text()= 'Participant List']")
	WebElement particpantToggel; 
	
	@FindBy(xpath="//table[@class='participant-table common-table']/thead/tr/th[2]")
	WebElement particpantName;
	
	@FindBy(xpath="//a[@class='collapsed' and text()= 'Participant List']")
	WebElement messageToggel; 
	
	@FindBy(xpath="//*[contains (text(),  'This is the Automated Answer of Questionnaire')]")
	WebElement questionnaireAnswerVerify;
	
//Sandpit Elements 
	
	@FindBy(xpath = "//*[contains(text(), \"Sandpit Co 1 sandpit1@marketdojo.com\")]")
	WebElement sandpitco1Checkbox;

	@FindBy(xpath = "//*[contains(text(), \"Sandpit Co 2 sandpit2@marketdojo.com\")]")
	WebElement sandpitco2Checkbox;

	@FindBy(xpath = "//*[contains(text(), \"Sandpit Co 3 sandpit3@marketdojo.com\")]")
	WebElement sandpitco3Checkbox;
	
	@FindBy(xpath="//*[contains (@class ,'navbar-nav collapse navbar-collapse navbar-module-right pull-left')]/ul/li[3]")
	WebElement sandpitHeader;
	
	@FindBy(xpath="//*[contains (text(),  'Act as Host')]")
	WebElement actAsHost;
	
	@FindBy(xpath="//*[contains (text(),  'Act as Sandpit Co 1')]")
	WebElement dropdownSandpitco1;
	
	@FindBy(xpath="//*[@id='header-navbar']/div/div[2]/ul/li/a")
	WebElement eventHeader;
	
	//Participant end Sandpit Elements 
	
	@FindBy(xpath="//*[@id=\"main-container\"]/div[3]/div/div/div[1]/div/form/table/tbody/tr[1]/td[2]/div[2]/div/div/div/div/button")
	WebElement eventInvitation;
	
	@FindBy(xpath="//*[@id=\"main-container\"]/div[3]/div/div/div[1]/div/form/table/tbody/tr[1]/td[2]/div[2]/div/div/div/div/ul/li[1]/a")
	WebElement eventAccept;
	
	@FindBy(xpath="//*[contains(@title, 'Questionnaire')]")
	WebElement questionnaireTab;
	
	@FindBy(xpath="//div[@class='form-item-block qqa-block']/div/div/div/div[2]/div/input")
	WebElement questionnaireAnwer1;
	
	@FindBy(xpath="//*[contains(text(), 'Submit answers')]")
	WebElement submitAnswer;
	
	@FindBy(xpath="//*[contains(@id, 'confirmOk')]")
	WebElement submitAnswerFinalConfirmation;
	
	@FindBy(xpath="//*[contains(text(), 'RFQs')]")
	WebElement RfqTab;
	
	@FindBy(xpath="//*[contains(text(), 'Enter Bid')]")
	WebElement enterBidBtn;
	
	@FindBy(xpath="//*[contains(@name, 'bid[price]')]")
	WebElement enterBid;
	
	@FindBy(xpath="//*[contains(@class, 'btn btn-default light-gray-color push-5-r br-green-color')]")
	WebElement submitBid;
	
	@FindBy(xpath="//*[contains(@class, 'btn btn-primary ok-btn')]")
	WebElement confirmSubmitBid;
	
	@FindBy(xpath="//*[contains(@class,'modal-dialog modal-dialog-popout custom-modal modal-lg')]/div/div[3]/button")
	WebElement confirmBidReceivedPoupup;
	
	@FindBy(xpath="//*[contains (text(), 'Allow resubmission')]")
	WebElement AllowResubmissionBtn;
	
	@FindBy(xpath="//*[contains (text(), 'Waiting for resubmission')]")
	WebElement WaitingForResubmissionText;
	
	@FindBy (xpath="//*[contains (@class, 'participant-table common-table')]/tbody/tr[2]/td[2]/a")
	WebElement particpantBid;
	
	@FindBy (xpath="//*[contains (@class, 'icon-link')]")
	WebElement deleteBid;
	
	@FindBy (xpath="//*[contains (@class, 'button-l btn btn-primary')]")
	WebElement deleteBidConfirm;
	
	// Initialize the Page Object
	public QuickQuotes() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void redirectFromMDDashboardtoQQCreate() throws InterruptedException {
		quickquoteDashbaord.click();// click on Quote from MDDashbaord
		Thread.sleep(5000);
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
	
	//Unused  script of new user license check  
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
//		wait.until(ExpectedConditions.visibilityOf(AdviceText));
		// Enter long name in quoteName field
		name.sendKeys("Automate test on enter long name validation message should appearsdfsdfsdf");
		wait.until(ExpectedConditions.visibilityOf(AdviceText));
		AdviceText.click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(longNameValidation));
		return longNameValidation.isDisplayed();
	}
	
	public boolean createGetQuoteButtonIsDisable() throws InterruptedException {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(AdviceText));
		name.clear();
		// Scroll to bottom of page
		scrollTillBottom();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(whoToInviteText));
		// verify get quote button is disabled
		return getQuoteButton.isEnabled();
	}
	
	public boolean createToasterMessage() throws InterruptedException {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(AdviceText));
		name.clear();
		name.sendKeys("Verify Toaster message");
		deadline.sendKeys("2019-04-14 19:35");
		scrollTillBottom();
		wait.until(ExpectedConditions.visibilityOf(whoToInviteText));
		getQuoteButton.click();
		Thread.sleep(4000);
		return pastDeadlineToaster.isDisplayed();
	}
	
	public boolean createQQByName() throws Throwable   {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(7000);
		name.clear();
		Thread.sleep(2000);
		name.sendKeys("createQQByName");
		deadline.clear();
		scrollTillBottom();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(whoToInviteText));
		getQuoteButton.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(quoteName));
		return quoteName.isDisplayed();
	}

	public boolean createQQEventWithAllDetails() throws InterruptedException {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(4000);
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
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(SelectDocPopup));
		SelectDocPopup.click();
		wait.until(ExpectedConditions.visibilityOf(clickBtnFromPopup));
		clickBtnFromPopup.click();
		Thread.sleep(2000);
		scroll();
		lotCheckbox.click();
		wait.until(ExpectedConditions.visibilityOf(lotName));
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
        //description Verify
//		Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOf(particpantToggel));
		briefToggel.click();
		wait.until(ExpectedConditions.visibilityOf(descriptionVerify));
		String descrption = descriptionVerify.getText();
		Assert.assertEquals(descrption, "This is my description");
//		briefToggel.click();
		//lotName Verify 
		Thread.sleep(2000);
		summaryToggel.click();
		wait.until(ExpectedConditions.visibilityOf(lotNameVerify));
		String LotName =  lotNameVerify.getText();
		Assert.assertEquals(LotName, "Metal Scrap");
		scroll();
		//ParticpantVerify 
		particpantToggel.click();
		//verifyEventName 
		wait.until(ExpectedConditions.visibilityOf(nameVerify));
		return nameVerify.isDisplayed();
	}
	
	
	public void createSandpitEventWithQuestionnaire () throws InterruptedException {
		driver.navigate().to(prop.getProperty("QuickQuotesHomepage"));
		Thread.sleep(6000);
		sandpitHeader.click();
		WebDriverWait wait = new WebDriverWait(driver, 6000);
		wait.until(ExpectedConditions.visibilityOf(newQuote));
		newQuote.click();// click on new quote button on quote listing page
		wait.until(ExpectedConditions.visibilityOf(name));
		name.sendKeys("Create QuickQuote Event with Particpant Answers");
		Thread.sleep(4000);
		scroll();
//		lotCheckbox.click();
//		wait.until(ExpectedConditions.visibilityOf(lotName));
//		lotName.sendKeys("Metal Scrap");
//		lotUom.sendKeys("tonnes");
//		lotQuantity.sendKeys("5");
		scroll();
		questionnaireCheckbox.click();
		wait.until(ExpectedConditions.visibilityOf(questionName));
		questionName.sendKeys("Automation");
		questionDropdown.click();
		wait.until(ExpectedConditions.visibilityOf(oneLineText));
		oneLineText.click();
//		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(sandpitco1Checkbox));
		sandpitco1Checkbox.click();
//		sandpitco2Checkbox.click();
//		sandpitco3Checkbox.click();	
		getQuoteButton.click();
		wait.until(ExpectedConditions.visibilityOf(actAsHost));
		actAsHost.click();
		dropdownSandpitco1.click();
		Thread.sleep(2000);
		eventHeader.click();
		Thread.sleep(2000);
		eventInvitation.click();
		wait.until(ExpectedConditions.visibilityOf(eventAccept));
		eventAccept.click();
		//Participant End Questionnaire Tab
		wait.until(ExpectedConditions.visibilityOf(questionnaireTab));
		questionnaireTab.click();
		wait.until(ExpectedConditions.visibilityOf(questionnaireAnwer1));
		questionnaireAnwer1.sendKeys("This is the Automated Answer of Questionnaire");
		submitAnswer.click();
		wait.until(ExpectedConditions.visibilityOf(submitAnswerFinalConfirmation));
		submitAnswerFinalConfirmation.click();
		//Participant End RFq Tab
//		wait.until(ExpectedConditions.visibilityOf(RfqTab));
//		RfqTab.click();
//		enterBidBtn.click();
//		wait.until(ExpectedConditions.visibilityOf(enterBid));
//		enterBid.sendKeys("10");
//		submitBid.click();
//		wait.until(ExpectedConditions.visibilityOf(confirmSubmitBid));
//		confirmSubmitBid.click();
//		wait.until(ExpectedConditions.visibilityOf(confirmBidReceivedPoupup));
//		confirmBidReceivedPoupup.click();
		//Act as Host 
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.visibilityOf(dropdownSandpitco1));
//		dropdownSandpitco1.click();
		wait.until(ExpectedConditions.visibilityOf(actAsHost));
		actAsHost.click();
//		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeSelected(particpantToggel));
//		wait.until(ExpectedConditions.elementToBeClickable(particpantToggel));
		particpantToggel.click();
		scroll();
//		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(questionnaireAnswerVerify));
		String text= questionnaireAnswerVerify.getText();
		Assert.assertEquals(text, "This is the Automated Answer of Questionnaire123");
	}
}
