package com.md.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.md.base.TestBase;
import com.md.utils.TestUtils;

public class MDEventPage extends TestBase {
	 private TestUtils testUtils = new TestUtils();

	//// Page Factory elements
	@FindBy(css = ".btn.center-content-vertical.height-35.shadow-light.wid-auto")
	private WebElement newEventBtn;

	@FindBy(css = "input#new_event_chck")
	private WebElement newEventRadioBtn;

	@FindBy(css = "input#new_event_template_check")
	private WebElement useTemplateRadioBtn;

	@FindBy(css = "input#clone_event_check")
	private WebElement CloneRadioBtn;

	@FindBy(css = "input#example_event_check")
	private WebElement exampleTemplateRadioBtn;

	@FindBy(css = "button#create-event-popup-btn")
	private WebElement createEventBtn;

	@FindBy(css = "button[class='btn btn-default']")
	private WebElement cancelBtnpopup;

	/// Page object for create event/setting page

	@FindBy(css = "h1.sheet-title")
	private WebElement newEventTxt;

	@FindBy(css = "input#event_name")
	private WebElement eventName;

	//// Questionnaire page object
	@FindBy(xpath = "//input[@id='event_with_questionnaires']")
	private WebElement createQuestionnaireCheckbox;

	@FindBy(css = "input[name='questionnaire[1][title]']")
	private WebElement questionnaireName;

	@FindBy(css = "input#questionnaire_1_deadline")
	private WebElement questionnaireDeadline;

	@FindBy(css = "input[name='questionnaire[1][pre_qualification]']")
	private WebElement pqqCheckbox;

	@FindBy(css = "input[name='questionnaire[1][with_scoring]']")
	private WebElement scoringCheckbox;

	//// Rfq page object
	@FindBy(css = "input#event_event_category_rfq")
	private WebElement createRfqCheckbox;

	@FindBy(css = "input[name='event[bid_deadline]']")
	private WebElement rfqDeadline;

	@FindBy(css = "input#event_event_category_auction")
	private WebElement createAuctionCheckbox;

	@FindBy(css = "button[name='button']")
	private WebElement saveAndGotoNextStepBtn;

	///// Initialize page factory element by initElements this is pointing for
	///// current class object
	public MDEventPage() {
		PageFactory.initElements(driver, this);
	}

	///// Actions
	public void test1() throws InterruptedException {
		newEventBtn.click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(newEventRadioBtn));
		newEventRadioBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(newEventRadioBtn));
		createEventBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(eventName));
		eventName.sendKeys("Automated Event");
		testUtils.scroll();
		System.out.println("1111");
		Thread.sleep(2000);
//		createQuestionnaireCheckbox.click();
//		wait.until(ExpectedConditions.elementToBeClickable(createQuestionnaireCheckbox));
		// JavascriptExecutor executor = (JavascriptExecutor)driver;
		// executor.executeScript("arguments[0].click();", createQuestionnaireCheckbox);
		testUtils.jsExecutor(createQuestionnaireCheckbox);
		System.out.println("2222");
		Thread.sleep(2000);
	}

}
