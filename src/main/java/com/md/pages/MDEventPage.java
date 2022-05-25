package com.md.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.md.base.TestBase;
import com.md.utils.TestUtils;

public class MDEventPage extends TestBase {
	private TestUtils testUtils = new TestUtils();

	//// Page Factory elements Dashboard

	@FindBy(css = "img[src='/assets/sourcing_dojo_new_logo-c36e35bae160b3fa0652adf1688be6f9ffcd836b771a90e969662172029315da.png']")
	private WebElement logo;

	@FindBy(css = "//a[normalize-space()='Dashboard']")
	private WebElement dashboardtxt;

	@FindBy(css = ".btn.center-content-vertical.height-35.shadow-light.wid-auto")
	private WebElement newEventBtn;
	
	@FindBy(xpath="//a[contains(@href, '/events/new_event_check')]")
	private WebElement newEventBtnSandpit;
	
    ////Page Factory of New event popup 
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

	@FindBy(css = "div[class='alert alert-warning alert-dismissable']")
	private WebElement afterYouAlertTxt;

	//// Questionnaire page object
	@FindBy(xpath = "//input[@id='event_with_questionnaires']")
	private WebElement createQuestionnaireCheckbox;

	@FindBy(css = "input[name='questionnaire[1][title]']")
	private WebElement questionnaireName;

	@FindBy(xpath = "//label[normalize-space()='Would you like another Questionnaire?']")
	private WebElement createQuestionnaire2Checkbox;

	@FindBy(css = "input[name='questionnaire[2][title]']")
	private WebElement questionnaire2Name;

	@FindBy(xpath = "//div[@class='questionnaires_fields ui-sortable']//div[2]//div[1]//div[1]//a[1]")
	private WebElement questionnaireDelteBtn;

	@FindBy(css = "button[class='btn btn-primary ok-btn']")
	private WebElement okBtn;

	@FindBy(xpath = "//div[@class='questionnaires_fields ui-sortable']//div[3]//div[3]//div[2]//div[1]//label[1]")
	private WebElement copyDeadline;

	@FindBy(css = "btn btn-sm btn-default cancel-btn")
	private WebElement cancelBtn;

	@FindBy(css = "input#questionnaire_1_deadline")
	private WebElement questionnaireDeadline;

	@FindBy(css = "div[data-record-type='normal'] div[class='row pqq_wrapper'] label[class='css-input css-checkbox css-checkbox-default show-inline']")
	private WebElement pqqCheckbox;

	@FindBy(css = "div[data-record-type='normal'] div[class='row'] div[class='col-md-12'] label[class='css-input css-checkbox css-checkbox-default show-inline']")
	private WebElement scoringCheckbox;

	@FindBy(css = "select[name='questionnaire[1][with_weighting]']")
	private WebElement selectWeightingDropdown;

	//// Rfq page object
	@FindBy(xpath = "//label[normalize-space()='Do you want to have an RFQ?']")
	private WebElement createRfqCheckbox;

	@FindBy(css = "input[name='event[bid_deadline]']")
	private WebElement rfqDeadline;

	@FindBy(css = "select[id='event_exchange_rates_attributes_0_currency_id']")
	private WebElement selectDefaultCurrency;

	@FindBy(css = "label[for='event_multi_currency_event']")
	private WebElement multicurrencyCheckbox;

	@FindBy(css = "select[id*=event_exchange_rates_attributes_1]")
	private WebElement selectCurrency;

	@FindBy(css = "input[class='exchange_rate_precision form-control']")
	private WebElement currencyRatio;

	@FindBy(css = "a[title='Remove']")
	private WebElement trashDeleteIcon;

	@FindBy(css = "a[data-target='#exchange_rates_fields']")
	private WebElement addNewCurrency;

	//// Auction page factory
	@FindBy(xpath = "//label[normalize-space()='Do you want to have an Online Auction?']")
	private WebElement createAuctionCheckbox;

	@FindBy(xpath = "//button[normalize-space()='Save & Go to Next Step']")
	private WebElement saveAndGotoNextStepBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Save & Go to Next Step']")
	private WebElement saveAndGotoNextStepBtnD;
	
	//// Documents tab element 
	@FindBy(css="a[href$='documents']")
	private WebElement createDocumentsTab;
	
	@FindBy(css="p[class='alert alert-info font-s12 p-t10']")
	private WebElement createDocumentsTxt;
	
	@FindBy(css="input#participant_doc_check_box")
	private WebElement documentTabCheckBox;
	
	// Questionnaire Tab Element 
	@FindBy(xpath="//a[normalize-space()='New Questionnaire']")
	private WebElement newQuestionnaireBTn;
	
	@FindBy(xpath="//body[@class= 'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p")
	private WebElement questionDescriptionTxt;
	
	@FindBy(name="question_choice[0][killer]")
	private WebElement yesnoOptionDropdown;
	
	@FindBy(xpath="//a[normalize-space()='Save Changes']")
	private WebElement questionSaveBtn;
	
	@FindBy(xpath="//a[normalize-space()='Add New Participant']")
	private WebElement addNewParticpantBtn;
	

	///// Initialize page factory element by initElements this is pointing for
	///// current class object
	public MDEventPage() {
		PageFactory.initElements(driver, this);
	}

	///// Actions
	public void PQQ() throws InterruptedException {
//		newEventBtnSandpit.click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(createEventBtn));
//		createEventBtn.click();
//		wait.until(ExpectedConditions.elementToBeClickable(eventName));
//		eventName.sendKeys("PQQ Event"); // Enter event name
//		JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll till create questionnaire
//		js.executeScript("arguments[0].scrollIntoView();", createQuestionnaireCheckbox);
//		Thread.sleep(2000);
//		testUtils.jsExecutor(createQuestionnaireCheckbox);// click on questionnaire check-box
//		questionnaireName.sendKeys("PQQ");
//		Thread.sleep(2000);
//		pqqCheckbox.click();// click on pqq chekbox 
//		System.out.println("PQQ chekbox click ");
//		Thread.sleep(2000);
//		JavascriptExecutor js1 = (JavascriptExecutor) driver; // Scroll till create questionnaire
//		js1.executeScript("arguments[0].scrollIntoView();", saveAndGotoNextStepBtn);
//		Thread.sleep(2000);
//		saveAndGotoNextStepBtn.click();//Redirect to document tab
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Assert.assertEquals(createDocumentsTxt.getText(), "Here you can upload any documents that will guide your participants; these may be specifications, terms and conditions, images or anything else that is important to your event.");
//		js1.executeScript("arguments[0].scrollIntoView();", saveAndGotoNextStepBtnD);
//		saveAndGotoNextStepBtnD.click();//Redirect to Questionnaire tab 
//		newQuestionnaireBTn.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(2000);
//		js1.executeScript("arguments[0].scrollIntoView();",questionSaveBtn);
//		WebElement QuestioDesIframe= driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe"));
//		driver.switchTo().frame(QuestioDesIframe);
//		questionDescriptionTxt.sendKeys("Fail on Yes");
//		driver.switchTo().defaultContent();
//		Thread.sleep(1000);
//		Select s = new Select(yesnoOptionDropdown);
//		s.selectByVisibleText("Yes");
//		questionSaveBtn.click();
//		Thread.sleep(2000);
//		js1.executeScript("arguments[0].scrollIntoView();", saveAndGotoNextStepBtnD);
//		saveAndGotoNextStepBtnD.click();//Redirect to Collaborator tab 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		js1.executeScript("arguments[0].scrollIntoView();", saveAndGotoNextStepBtnD);
//		saveAndGotoNextStepBtnD.click();//Redirect to Add new participant tab 
//		wait.until(ExpectedConditions.elementToBeClickable(addNewParticpantBtn));
		
		driver.get("https://next.testmd.co.uk/events/35956/event_participants");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		addNewParticpantBtn.click();
		Thread.sleep(3000);
//		Select s= new Select (driver.findElement(By.xpath("//*[@id=\"add_participant_type\"]")));
//		s.selectByValue("Pick Group");
//		Thread.sleep(1000);
//		s.selectByValue("Pick From Participant Database");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id='participant_add_1341']")).click();
		
		WebElement element = driver.findElement(By.xpath("//table[@class='table template_upload custom-responsive-table _scrolling']/tbody/tr/td/label/input"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
//		List<WebElement>chekbox= driver.findElements(By.xpath("//table[@class='table template_upload custom-responsive-table _scrolling']/tbody/tr/td/label/input"));
//		System.out.println(chekbox.size());
//		for(int i=0; i<chekbox.size();i++) {
//			chekbox.get(i).click();
//			System.out.println("done");
//		}
			
		}
	}

