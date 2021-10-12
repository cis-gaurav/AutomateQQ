package com.md.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.List;
import com.md.base.TestBase;

		public class ContractPage extends TestBase {
		
		// Page factory 			
		@FindBy(xpath="//a[contains(text(),'Analytics')]")
		static
		WebElement AnalyticsButton;
		
		@FindBy(xpath="//a[contains(text(),'Profile')]")
		static
		WebElement ProfileButton;
		
		@FindBy(xpath="//h1[@class='page-title']")
		static
		WebElement AccountDetailsHeading;

		@FindBy(xpath="a[@class='default no_company_logo navbar-brand']")
		static
		WebElement MDLogo;
		
		@FindBy(xpath="//a[@data-toggle='dropdown']/parent::li[@class='menu-item user dropdown']")
		static
		WebElement UserIcon;
		
		@FindBy(xpath="//ul[@class='nav-header']/li/a")
		static
		WebElement SRMLink;
		
		@FindBy(xpath="//div[contains(text(),'Download SRM Guide')]")
		static
		WebElement DownloadSRMGuideButton;
		
		@FindBy(xpath="//li[@class='menu-item more dropdown']/a[contains(text(),'All Modules')]")
		static
		WebElement AllModuleButton;
		
		@FindBy(xpath="//li[@class='menu-item more dropdown open']/ul/li[2]/a")
		static
		WebElement ContractButton;
		
		@FindBy(xpath="//button[contains(text(),'Add New Contract')]")
		static
		WebElement AddNewContractButton;			
		
		@FindBy(xpath="//button[contains(text(),'Add New Contract')]/parent::div/ul/li[1]/a")
		static
		WebElement CreateContractButton;			
		
		@FindBy(xpath="//div[contains(text(),'Basic Details')]")
		static
		WebElement NewContractFormHeading;			
		
		@FindBy(xpath="//input[@name='title']")
		static
		WebElement ContractNameTextbox;		
		
		@FindBy(xpath="//label[contains(text(),'Contract Reference')]/parent::div/input")
		static
		WebElement ContractReferenceTextbox;	
		
		@FindBy(xpath="//select[@name='Contract Type']")
		static
		WebElement ContractTypeDropdown;	
		
		@FindBy(xpath="//select[@name='Contract Type']//option[contains(text(),'Software')]")
		static
		WebElement ContractTypeDropdownValue;
		
		@FindBy(xpath="//select[@name='Legal Entity']")
		static
		WebElement ContractLegalEntityTextbox;	

		@FindBy(xpath="//select[@name='Legal Entity']//option[contains(text(),'IE Legal Entity')]")
		static
		WebElement ContractLegalEntityValue;	
				
		@FindBy(xpath="//select[@name='jurisdiction']")
		static
		WebElement ContractJurisdictionTextbox;	
		
		@FindBy(xpath="//select[@name='jurisdiction']//option[contains(text(),'Jurisdiction 2')]")
		static
		WebElement ContractJurisdictionValue;			
				
		@FindBy(xpath="//td[contains(text(),'Automation Custom Field')]/parent::tr/td[2]/input")
		static
		WebElement ContractCustomField;	
		
		@FindBy(xpath="//select[@name='contract_currency']")
		static
		WebElement ContractCurrency;	
		
		@FindBy(xpath="//select[@name='contract_currency']/option[@value='INR']")
		static
		WebElement INRCurrency;	
			
		@FindBy(xpath="//input[@name='annual_value']")
		static
		WebElement ContractAnnualValue;	
		
		@FindBy(xpath="//input[@name='total_value']")
		static
		WebElement ContractTotalValue;	
		
		@FindBy(xpath="//ul[@id='supplier_tag_handler']/li/input")
		static
		WebElement SupplierContact;
		
		@FindBy(xpath="//div[contains(text(),'Supplier Contact')]/parent::div/div[3]/button[contains(text(),'Add')]")
		static
		WebElement SupplierContactAddButton;
			
		@FindBy(xpath="//ul[@id='stakeholder_tag_handler']/li/input")
		static
		WebElement StakeHolderEmail;
		
		@FindBy(xpath="//div[contains(text(),'All Stakeholders')]/parent::div/div[3]/button[contains(text(),'Add')]")
		static
		WebElement StakeHolderEmailAddButton;
		
		@FindBy(xpath="//input[@id='start_date']")
		static
		WebElement ContractStartDate;
		
		@FindBy(xpath="//input[@id='expiry_date']")
		static
		WebElement ContractExpiryDate;
				
		@FindBy(xpath="//input[@id='notice_period']")
		static
		WebElement NoticePeriod;
		
		@FindBy(xpath="//a[contains(text(),'Save')]")
		static
		WebElement ContractSaveButton;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr/td[4]/a[contains(text(),'Automation Contract')]")
		static
		WebElement ContractTitleInHomepage;
				
		@FindBy(xpath="//trix-editor")
		static
		WebElement NotesEditor;
				
		@FindBy(xpath="//thead/tr")
		static
		WebElement ListingPageHeadings;
				
		@FindBy(xpath="//input[@name='search']")
		static
		WebElement ContractSearchBar;
		
		@FindBy(xpath="//a[@title='Download Contracts']")
		static
		WebElement DownloadContractsbutton;
		
		@FindBy(xpath="//span[@class='slider round']")
		static
		WebElement ShowArchiveToggleButton;
		
		@FindBy(xpath="//div[@class='contracts_not_present']")
		static
		WebElement NoContractAlertMsg;		
		
		@FindBy(xpath="//tr[@class='search-row']/td[3]/div/div/input[@id='search_input']")
		static
		WebElement OwnerSearch;
		
		@FindBy(xpath="//ul[@class='optionContainer']/li[contains(text(),'Oliver11@yopmail.com')]/input")
		static
		WebElement OwnerName;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr/td[3]/div[contains(text(),'Automation Tester')]")
		static
		WebElement ListingPageContractOwnerName;
		
		@FindBy(xpath="//tr[@class='search-row']/td[4]/div/div//input[@id='search_input']")
		static
		WebElement TitleSearch;
		
		@FindBy(xpath="//ul[@class='optionContainer']/li[contains(text(),'Automation Contract')]")
		static
		WebElement TitleName;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr/td[4]/a[contains(text(),'Automation Contract')]")
		static
		WebElement ListingPageContractTitleName;		
		
		@FindBy(xpath="//tr[@class='search-row']/td[6]/div/div//input[@id='search_input']")
		static
		WebElement CategorySearch;
		
		@FindBy(xpath="//ul[@class='optionContainer']/li[contains(text(),'Automation Category')]")
		static
		WebElement CategoryName;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr/td[6]/div/span[contains(text(),'Automation Category')]")
		static
		WebElement ListingPageContractCategoryName;
		
		@FindBy(xpath="//td/button[@id='search_contracts']")
		static
		WebElement SearchContractButton;
		
		@FindBy(xpath="//td/button[@id='reset_contracts']")
		static
		WebElement ResetContractButton;				
		
		@FindBy(xpath="//tr[@class='search-row']/td[7]/div/div//input[@id='search_input']")
		static
		WebElement SupplierSearch;
		
		@FindBy(xpath="//ul[@class='optionContainer']/li[contains(text(),'D1@mailinator.com')]")
		static
		WebElement SupplierName;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr/td[7]/a[contains(text(),'D1 Testing')]")
		static
		WebElement ListingPageContractSupplierName;
		
		@FindBy(xpath="//input[@name='start_date']")
		static
		WebElement StartDate;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr/td[contains(text(),'01 Jun 2021')]")
		static
		WebElement ListingPageStartDate;
		
		@FindBy(xpath="//input[@name='expiry_date']")
		static
		WebElement ExpiryDate;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr[1]/td[contains(text(),'31 Dec 2021')]")
		static
		WebElement ListingPageExpiryDate;
		
		@FindBy(xpath="//input[@name='total_value']")
		static
		WebElement ContractValue;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr[1]/td[contains(text(),'550000')]")
		static
		WebElement ListingPageContractValue;
		
		@FindBy(xpath="//tr[@class='search-row']/td[12]/div/div//input[@id='search_input']")
		static
		WebElement StakeHolderSearch;
		
		@FindBy(xpath="//ul[@class='optionContainer']/li[contains(text(),'Tarique@mailinator.com')]")
		static
		WebElement StakeHolderName;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr/td[12]/div[contains(text(),'Tarique')]")
		static
		WebElement ListingPageContractStakeHolderName;
		
		@FindBy(xpath="//tr[@class='search-row']/td[13]/div/div//input[@id='search_input']")
		static
		WebElement StateSearch;
		
		@FindBy(xpath="//ul[@class='optionContainer']/li[contains(text(),'Active')]")
		static
		WebElement ActiveState;
		
		@FindBy(xpath="//ul[@class='optionContainer']/li[contains(text(),'Draft')]")
		static
		WebElement DraftState;
		
		@FindBy(xpath="//ul[@class='optionContainer']/li[contains(text(),'Expired')]")
		static
		WebElement ExpiredState;
		
		@FindBy(xpath="//ul[@class='optionContainer']/li[contains(text(),'Expiring')]")
		static
		WebElement ExpiringState;
		
		@FindBy(xpath="//ul[@class='optionContainer']/li[contains(text(),'Pending')]")
		static
		WebElement PendingState;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr/td[13][contains(text(),'ACTIVE')]")
		static
		WebElement ListingPageActiveState;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr/td[13][contains(text(),'DRAFT')]")
		static
		WebElement ListingPageDraftState;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr/td[13][contains(text(),'EXPIRED')]")
		static
		WebElement ListingPageExpiredState;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr/td[13][contains(text(),'EXPIRING')]")
		static
		WebElement ListingPageExpiringState;
		
		@FindBy(xpath="//tbody[@class='table-content']/tr/td[13][contains(text(),'PENDING')]")
		static
		WebElement ListingPagePendingState;
		
		@FindBy(xpath="//span[contains(text(),'Required')]")
		static
		WebElement contractTypeFieldAlertMsg;
		
		@FindBy(xpath="//span[contains(text(),'Please select Legal Entity')]")
		static
		WebElement LegalEntityFieldAlertMsg;
		
		@FindBy(xpath="//span[contains(text(),'Please select Jurisdiction')]")
		static
		WebElement JurisdictionFieldAlertMsg;
		
		@FindBy(xpath="/span[contains(text(),'Required')]")
		static
		WebElement RequiredFieldAlertMsg;
		
		@FindBy(xpath="//span[contains(text(),'Please add at least one contact')]")
		static
		WebElement SupplierContactAlertMsg;
		
		@FindBy(xpath="//span[contains(text(),'Please enter a contract start date')]")
		static
		WebElement ContractStartDateAlertMsg;
		
		@FindBy(xpath="//span[contains(text(),'Please enter a contract expiry date')]")
		static
		WebElement ContractExpiryDateAlertMsg;
		
		@FindBy(xpath="//span[contains(text(),'Annual value can')]")
		static
		WebElement ContractAnnualValueAlertMsg;
		
		@FindBy(xpath="//span[contains(text(),'Total value can')]")
		static
		WebElement ContractTotalValueAlertMsg;
		
		@FindBy(xpath="//th[contains(text(),'Notice Period')]")
		static
		WebElement ListingPageNoticePeriod;
		
		@FindBy(xpath="//label[contains(text(),'Notice Period')]/parent::div//select[@class='form-control']")
		static
		WebElement CNoticePeriod;
		
		@FindBy(xpath="//div[@class='contract-title']/h1")
		static
		WebElement ContractTitle;
		
		@FindBy(xpath="//div[contains(text(),'Hierarchy')]")
		static
		WebElement CategoryHeirarchyHeading;
		
		@FindBy(xpath="//ul[@id='ui-id-1']/li")
		static
		WebElement SupplierContactSuggestions;
		
		@FindBy(xpath="//ul[@id='ui-id-1']/li")
		static
		WebElement StakeHolderSuggestions;
				
		@FindBy(xpath="//tbody[@id='participant_summary_body']/tr/td/a/div[contains(text(),'D1 Testing')]")
		static
		WebElement SupplierContactName;
		
		@FindBy(xpath="//tbody[@id='participant_summary_body']/tr/td/div[contains(text(),'D1@mailinator.com')]")
		static
		WebElement SupplierContactEmail;
				
		@FindBy(xpath="//div[@class='s-alert-box-inner']/span[contains(text(),'Tarique@mailinator.com: This email address is already currently in use by one of our hosts.')]")
		static
		WebElement SupplierContactInUseAlertMsg;
		
		@FindBy(xpath="//div[@class='s-alert-box-inner']/span[contains(text(),'At least one contact must be added. Please add another contact to remove this one.')]")
		static
		WebElement MinimumOneSupplierAlertMsg;
			
		@FindBy(xpath="//i[@title='Remove']")
		static
		WebElement SupplierContactRemoveButton;
		
		@FindBy(xpath="//div[@id='supllierRemoveConfirmModal']/div/div/div[@class='modal-footer']/button[contains(text(),'OK')]")
		static
		WebElement SupplierContactRemoveOKButton;				
		
		@FindBy(xpath="//tbody[@id='participant_summary_body']/tr/td/a[contains(text(),'d2@mailinator.com')]")
		static
		WebElement SecondSupplierContactName;
		
		@FindBy(xpath="//div[@class='s-alert-box-inner']/span[contains(text(),'D1@mailinator.com: This email address is already currently in use by one of our Partcipants.')]")
		static
		WebElement StakeHolderInUseAlertMsg;
		
		@FindBy(xpath="//label[contains(text(),'File Type')]/parent::div/span/span/span/span")
		static
		WebElement FileType;	
		
		@FindBy(xpath="//label[contains(text(),'File Type')]/parent::div/select/option[contains(text(),'Contract')]")
		static
		WebElement ContractFileType;
		
		@FindBy(xpath="//div[@class='filepicker dropzone dz-clickable']")
		static
		WebElement FileDropbox;
		  
		@FindBy(xpath="//a[@data-target='#expiryNotificationModal']")
		static
		WebElement ExpiryNotificationLink;
		
		@FindBy(xpath="//h4[contains(text(),'Add recipients')]/parent::div")
		static
		WebElement ExpiryNotificationModalWindow;
		
		@FindBy(xpath="//div[@class='notification-content-box custom_notification_table']/table/tbody/tr/td[2]")
		static
		WebElement ExpiryNotificationWindowStakeholder;
		
		@FindBy(xpath="//li/a[contains(text(),'Suppliers')]")
		static
		WebElement ExpiryNotificationSuppliertab;
		
		@FindBy(xpath="//div[@class='notification-content-box custom_notification_table']/table/tbody/tr/td[2]")
		static
		WebElement ExpiryNotificationWindowSupplier;
		
		@FindBy(xpath="//a[@data-target='#customNotificationModal']")
		static
		WebElement CustomNotificationLink;
		
		@FindBy(xpath="//button[@name='add_notes_btn']")
		static
		WebElement AddNotesButton;
		
		@FindBy(xpath="//table[@class='notes-table style-table-contracts']/tbody/tr[1]/td[2]/div/div/div")
		static
		WebElement publicNotes;
		 
		@FindBy(xpath="//label[@for='make_private_note']")
		static
		WebElement privateNoteCheckbox;
		
		@FindBy(xpath="//div[contains(text(),'Parent')]/span")
		static
		WebElement parentHeirarchyDropdown;
		
		@FindBy(xpath="//div[contains(text(),'Parent')]/select/option[contains(text(),'Heirarchy Contract for Testing')]")
		static
		WebElement parentValue;
		
		@FindBy(xpath="//div/span[contains(text(),'No Contract may be an Ancestor or Descendant of itself')]")
		static
		WebElement DuplicateCategoryAlertMsg;
		
		@FindBy(xpath="//div[contains(text(),'Author Name')]")
		static
		WebElement AuthorName;
				
		@FindBy(xpath="//div[contains(text(),'Children')]/ul/li/ul/li/span")
		static
		WebElement childHeirarchyDropdown;
		
		@FindBy(xpath="//div[contains(text(),'Children')]/ul/li/ul/li/select/option[contains(text(),'Heirarchy Contract for Testing')]")
		static
		WebElement childrenValue;
		
		@FindBy(xpath="//div[@id='navbarSupportedContent']/ul/li/a[@href='/contracts']")
		static
		WebElement ContractNavbar;
		
		@FindBy(xpath="//i[@class='fa fa-globe']/parent::a")
		static
		WebElement GlobeIcon;
		
		@FindBy(xpath="//a[contains(text(),'Deutsch')]")
		static
		WebElement DeutschLanguage;
		
		@FindBy(xpath="//a[contains(text(),'English')]")
		static
		WebElement EnglishLanguage;
		
		@FindBy(xpath="//button[contains(text(),'Neuen Vertrag hinzufügen')]")
		static
		WebElement DeutschLanguageAddContractButton;
		
		@FindBy(xpath="//li[@class='nav-item admin']/div/a")
		static
		WebElement AdminButton;
				
		@FindBy(xpath="//li[@class='nav-item admin']/div/ul/li/a[contains(text(),'Contracts Settings')]")
		static
		WebElement ContractSettingButton;
		
		@FindBy(xpath="//h1[contains(text(),'Contracts Settings')]")
		static
		WebElement ContractSettingHeading;
				
		@FindBy(xpath="//span[contains(text(),'Contract Reference')]")
		static
		WebElement ContractReferenceCheckbox;
				
		@FindBy(xpath="//span[contains(text(),'Parent')]")
		static
		WebElement ContractSettingParentCheckbox;
		
		@FindBy(xpath="//th[contains(text(),'Parent')]")
		static
		WebElement ListingPageParentColoumn;

		@FindBy(xpath="//h4[contains(text(),'Add notification')]")
		static
		WebElement AddNotificationHeading;
		
		@FindBy(xpath="//input[@name='subject']")
		static
		WebElement CustomNotificationSubject;
		
		@FindBy(xpath="//input[@name='subject']")
		static
		WebElement CustomNotificationDescription;
		
		
		
		
		//Dutch language Listing page xpaths
		@FindBy(xpath="//span[contains(text(),'Show archiviert')]")
		static
		WebElement DeutschShowArchiveButton;
		@FindBy(xpath="//th[contains(text(),'Eigentümer')]")
		static
		WebElement DeutschContractOwnerRow;
		@FindBy(xpath="//th[contains(text(),'Titel')]")
		static
		WebElement DeutschContractTItleRow;
		@FindBy(xpath="//th[contains(text(),'Kategorie')]")
		static
		WebElement DeutschContractCategoryRow;
		@FindBy(xpath="//th[contains(text(),'Lieferant')]")
		static
		WebElement DeutschContractSupplierRow;
		@FindBy(xpath="//button[contains(text(),'Neuen Vertrag hinzufügen')]")
		static
		WebElement DeutschAddContractButton;
		
		@FindBy(xpath="//div[@class='col-12']/div/table/tbody/tr/td/label")
		static
		WebElement SupplierCheckboxinCustomNotification;
		
		@FindBy(xpath="//div[@title='Custom Test Field']/ancestor::tr/td[4]/div/div/label/input")
		static
		WebElement CustomFieldActiveCheckboxinSettings;
		
		@FindBy(xpath="//tr/td[contains(text(),'Custom Test Field')]")
		static
		WebElement CustomField;
		
		

		// Initialize page factory 
			public ContractPage() 
			{
			PageFactory.initElements(driver, this);
			}	
		
			//Scripts
			public boolean VerifyUserIsAbleToAddContract() throws InterruptedException {
			driver.navigate().to(prop.getProperty("ContractHomepage"));
			WebDriverWait wait = new WebDriverWait(driver,60);
	        System.out.println(" execution started");
	        Thread.sleep(5000);
	        //Wait for Contract Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));        
	        //Click on Add New Contract Button
	        AddNewContractButton.click();	  
	        //Click on Create Button
	        CreateContractButton.click();	     
	        //Wait for Contract Form to load.
	        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));	     
	        //Enter Contract Name
	        ContractNameTextbox.sendKeys("Automation Contract");	              
	        //Select Legal Entity
	        ContractLegalEntityTextbox.click();
	        ContractLegalEntityValue.click();	              
	        //Select Jurisdiction
	        ContractJurisdictionTextbox.click();
	        ContractJurisdictionValue.click();	      	 	       
	        //Select Contract Type	  
	        ContractTypeDropdown.click();
	        ContractTypeDropdownValue.click();	       
	        //Enter Custom Field Data
	        ContractCustomField.sendKeys("Test");	      
	        //Select Currency INR
	        ContractCurrency.click();
	        Thread.sleep(1000);
	        INRCurrency.click();	        
	        //Enter Annual Value
	        ContractAnnualValue.sendKeys("250000");
	        Thread.sleep(1000);
	        //Enter Total Value
	        ContractTotalValue.sendKeys("550000");
	        Thread.sleep(1000);
	        //Enter Supplier contact
	        SupplierContact.sendKeys("d1@mailinator.com");
	        //Click on Add Button
	        SupplierContactAddButton.click();  
	        //Enter Stake holder Email
	        StakeHolderEmail.sendKeys("tarique@mailinator.com");
	        //Click on Add Button
	        StakeHolderEmailAddButton.click(); 
	        //Enter Start Date
	        ContractStartDate.clear();
	       	ContractStartDate.sendKeys("2021-06-01"); 
	        //Enter Expiry Date	
	       	ContractExpiryDate.clear();
	        ContractExpiryDate.sendKeys("2021-12-31");
	        ContractExpiryDate.sendKeys(Keys.ENTER);
	        Thread.sleep(8000);
	        Actions a =new Actions(driver);	        
	        a.sendKeys(Keys.TAB).build().perform(); 
	        //Select Notice Period
	        Select s = new Select(CNoticePeriod);
	        s.selectByVisibleText("Other");
	        //Enter Notice Period Date
	        NoticePeriod.clear();
	        NoticePeriod.sendKeys("2021-11-30");
	        NoticePeriod.sendKeys(Keys.ENTER);	        	     
	        //Click on Notes
	        NotesEditor.click();	        
	        a.sendKeys(Keys.TAB).build().perform();
	        a.sendKeys(Keys.TAB).build().perform();
	        a.sendKeys(Keys.TAB).build().perform();
	        //Click on Save Button       
	        a.sendKeys(Keys.ENTER).build().perform();
	        Thread.sleep(4000);
	        //verify Contract is Displayed in Listing Page
	        wait.until(ExpectedConditions.elementToBeClickable(ContractTitleInHomepage));
			return ContractTitleInHomepage.isDisplayed();
		}	
		
			public boolean VerifyHeadingOnContractListingPage() throws InterruptedException{
			driver.navigate().to(prop.getProperty("ContractHomepage"));
			WebDriverWait wait = new WebDriverWait(driver,60);
	        
	        //Wait for Contract Page to Load
	        wait.until(ExpectedConditions.visibilityOf(ListingPageHeadings ));
			return ListingPageHeadings.isDisplayed();
		}
			
			public boolean VerifyUserIsAbleToSearchContract() throws InterruptedException{
			
			driver.navigate().to(prop.getProperty("ContractHomepage"));
			WebDriverWait wait = new WebDriverWait(driver,60);
	        
	        //Wait for Contract Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
			
	        //Enter Data in Search Bar
	        ContractSearchBar.sendKeys("Automation Contract");
	        Actions a=new Actions(driver);
	        a.sendKeys(Keys.ENTER).build().perform();
	        
	        //Verify that Automation Contract is Displayed
	        wait.until(ExpectedConditions.visibilityOf(ContractTitleInHomepage));
			return ContractTitleInHomepage.isDisplayed();
		}
		
			public boolean VerifyDisplayOfArchivedContracts() throws InterruptedException{
			driver.navigate().to(prop.getProperty("ContractHomepage"));
			WebDriverWait wait = new WebDriverWait(driver,60);
	      	        
	        //Wait for Contract Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
			
	        //Store value of Download Contract Unarchived Contracts
	        String A= DownloadContractsbutton.getText();
	        String totalcontracts = A.substring(A.length() -3);

	        System.out.println("Total Contracts: "+totalcontracts);
	        
	        //Clcik on Show All Contracts Button
	        ShowArchiveToggleButton.click();
	        
	        //get First Four Characters 
	        String Str3= DownloadContractsbutton.getText();
	        String All = Str3.substring(0,3);
	        
	        System.out.println("All Contracts: "+All);
	        
	        wait.until(ExpectedConditions.visibilityOf(DownloadContractsbutton));	        
			return totalcontracts.equals(All);
		}
		
			public boolean VerifyAlertMsgOnSearchingContracts() throws InterruptedException{
			driver.navigate().to(prop.getProperty("ContractHomepage"));
			WebDriverWait wait = new WebDriverWait(driver,60);
				        
	        //Wait for Contract Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
			
	        //Enter Data in Search Bar
	        ContractSearchBar.sendKeys("kjbsufibub");
	        Actions a=new Actions(driver);
	        a.sendKeys(Keys.ENTER).build().perform();
	        
	        //Verify that Automation Contract is Displayed
	        wait.until(ExpectedConditions.visibilityOf(NoContractAlertMsg));			
			return NoContractAlertMsg.isDisplayed();
		}
		
			public boolean VerifySearchContractUsingOwner() throws InterruptedException{
			driver.navigate().to(prop.getProperty("ContractHomepage"));
			WebDriverWait wait = new WebDriverWait(driver,60);
				
	        //Wait for Contract Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));			
	        
	        //click on Owner Search
	        OwnerSearch.click();	 	
	       
	        //Select Owner
	      //  OwnerName.click();
	        Actions a=new Actions(driver);
	        a.sendKeys(Keys.ENTER).build().perform();
	        
	        //Click on Search Button
	        SearchContractButton.click();

	        //verify Owner Contract is Displayed in Listing Page
	        wait.until(ExpectedConditions.visibilityOf(ListingPageContractOwnerName));
			return ListingPageContractOwnerName.isDisplayed();	        	   
		}
		
			public boolean VerifySearchContractUsingTitle() throws InterruptedException{
			driver.navigate().to(prop.getProperty("ContractHomepage"));
			WebDriverWait wait = new WebDriverWait(driver,60);
				        
	        //Wait for Contract Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
			
	        //click on Title Search
	        TitleSearch.click();
	        
	        //Select Title
	        TitleName.click();
	        
	        //Click on Search Button
	        SearchContractButton.click();
	        
	        //verify Owner Contract is Displayed in Listing Page
	        wait.until(ExpectedConditions.visibilityOf(ListingPageContractTitleName));
			return ListingPageContractTitleName.isDisplayed();	        	   
		}
		
			public boolean VerifySearchContractUsingCategory() throws InterruptedException{
			driver.navigate().to(prop.getProperty("ContractHomepage"));
			WebDriverWait wait = new WebDriverWait(driver,60);
				        
	        //Wait for Contract Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
			
	        //click on Owner Search
	        CategorySearch.click();
	        
	        //Select Owner
	        CategoryName.click();
	        
	        //Click on Search Button
	        SearchContractButton.click();
	        
	        //verify Owner Contract is Displayed in Listing Page
	        wait.until(ExpectedConditions.visibilityOf(ListingPageContractCategoryName));
			return ListingPageContractCategoryName.isDisplayed();	        	   
		}
		
			public boolean VerifySearchContractUsingSupplier() throws InterruptedException{
			driver.navigate().to(prop.getProperty("ContractHomepage"));
			WebDriverWait wait = new WebDriverWait(driver,60);
				        
	        //Wait for Contract Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
			
	        Actions a =new Actions(driver);
	        a.moveToElement(SupplierSearch).build().perform();
	        Thread.sleep(3000);
	        //click on Supplier Search
	        SupplierSearch.click();
	        
	        System.out.println("Clicked on supplier search button");
	        
	        wait.until(ExpectedConditions.visibilityOf(SupplierName ));
	        //Select Supplier
	        SupplierName.click();
	        
	        //Click on Search Button
	        SearchContractButton.click();
	        
	        //verify Owner Contract is Displayed in Listing Page
	        wait.until(ExpectedConditions.visibilityOf(ListingPageContractSupplierName));
			return ListingPageContractSupplierName.isDisplayed();	        	   
		}

			public boolean VerifySearchContractUsingStartDate() throws InterruptedException{
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
					        
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
				
		        //Enter Date in Start Date Filter
		        StartDate.sendKeys("2021-06-01");
	
		        //Click on Search Button
		        SearchContractButton.click();
		        
		        //verify Owner Contract is Displayed in Listing Page
		        wait.until(ExpectedConditions.visibilityOf(ListingPageStartDate));
				return ListingPageStartDate.isDisplayed();	        	   
			}
			
			public boolean VerifySearchContractUsingExpiryDate() throws InterruptedException{
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
					        
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
				
		        //Enter Date in Start Date Filter
		        ExpiryDate.sendKeys("2021-12-31");
	
		        //Click on Search Button
		        SearchContractButton.click();
		        
		        //verify Owner Contract is Displayed in Listing Page
		        wait.until(ExpectedConditions.visibilityOf(ListingPageExpiryDate));
				return ListingPageExpiryDate.isDisplayed();	        	   
			}
		
			public boolean VerifySearchContractUsingValue() throws InterruptedException{
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
					        
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        Actions a=new Actions(driver);
		        a.moveToElement(StateSearch).build().perform();
		        
		        Thread.sleep(2000);
		        //Enter Value
		        ContractValue.click();
		        
		        ContractValue.sendKeys("550000");
		        
		        //Click on Search Button
		        SearchContractButton.click();
		        
		        
		        //verify Owner Contract is Displayed in Listing Page
		        wait.until(ExpectedConditions.visibilityOf(ListingPageContractValue));
				return ListingPageContractValue.isDisplayed();	        	   
			}
								
			public boolean VerifySearchContractUsingStakeHolder() throws InterruptedException{
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
					        
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        Actions a=new Actions(driver);
		        a.moveToElement(StateSearch).build().perform();
		        
		        Thread.sleep(2000);
		        //click on Stakeholder Search
		        StakeHolderSearch.click();
		        
		        //Select Stakeholder
		        StakeHolderName.click();
		        
		        //Click on Search Button
		        SearchContractButton.click();
		        
		        //verify Stakeholder Name is Displayed in Listing Page
		        wait.until(ExpectedConditions.visibilityOf(ListingPageContractStakeHolderName));
				return ListingPageContractStakeHolderName.isDisplayed();	        	   
			}
		 	
			public boolean VerifySearchContractUsingState() throws InterruptedException{
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
					        
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
				
		        Actions a=new Actions(driver);
		        a.moveToElement(StateSearch).build().perform();
		        
		        //click on state search
		        StateSearch.click();
		        
		        //Select state
		        ActiveState.click();
		        
		        //Click on Search Button
		        SearchContractButton.click();
		        
		        //verify Selected State Contract is Displayed in Listing Page
		        wait.until(ExpectedConditions.visibilityOf(ListingPageActiveState));
		        Assert.assertTrue(ListingPageActiveState.isDisplayed());
				
				//Click on Reset Button
		        ResetContractButton.click();
		        Thread.sleep(2000);
		  		     
				 //click on state search
		        StateSearch.click();
		        
		        //Select state
		        DraftState.click();
		        
		        //Click on Search Button
		        SearchContractButton.click();
		        
		        Thread.sleep(3000);
		        //verify Selected State Contract is Displayed in Listing Page
		        wait.until(ExpectedConditions.visibilityOf(ListingPageDraftState));
		        Assert.assertTrue(ListingPageDraftState.isDisplayed());
          
		        //verify Selected State Contract is Displayed in Listing Page
		        wait.until(ExpectedConditions.visibilityOf(ListingPageDraftState));
		        return ListingPageDraftState.isDisplayed();		
			}
			
			public boolean VerifyContractValidationMsg() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
						
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        		       		        
		        //Move to notes   
		        Actions a=new Actions(driver);
		        a.moveToElement(NotesEditor).build().perform();
		        Thread.sleep(2000);
		        
		        //Click on Notes
		        NotesEditor.click();
		        	        
		        a.sendKeys(Keys.TAB).build().perform();
		        a.sendKeys(Keys.TAB).build().perform();
		        a.sendKeys(Keys.TAB).build().perform();
		      
		        //Click on Save Button       
		        a.sendKeys(Keys.ENTER).build().perform();
		        		        
		        //verify All Alert Messages are Displayed.
		        wait.until(ExpectedConditions.visibilityOf(contractTypeFieldAlertMsg));
		        Assert.assertTrue(contractTypeFieldAlertMsg.isDisplayed());
		      //  Assert.assertTrue(LegalEntityFieldAlertMsg.isDisplayed());
		       // Assert.assertTrue(JurisdictionFieldAlertMsg.isDisplayed());
		        Assert.assertTrue(SupplierContactAlertMsg.isDisplayed());
		        Assert.assertTrue(ContractStartDateAlertMsg.isDisplayed());
		        Assert.assertTrue(ContractExpiryDateAlertMsg.isDisplayed());
		        Assert.assertTrue(ContractAnnualValueAlertMsg.isDisplayed());
				return ContractTotalValueAlertMsg.isDisplayed();
		        
			}			

			public boolean VerifyOneMonthNoticePeriodIsSelectedByDefault() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
								
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");		        		        
		        
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        
		        //Enter Custom Field Data
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        
		        //Enter Supplier contact
		        SupplierContact.sendKeys("d1@mailinator.com");
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        //Enter Stake holder Email
		        StakeHolderEmail.sendKeys("tarique@mailinator.com");
		        //Click on Add Button
		        StakeHolderEmailAddButton.click();
		        
		        //Enter Start Date
		        ContractStartDate.clear();
		       	ContractStartDate.sendKeys("2021-06-01");
		        
		        //Enter Expiry Date	
		       	ContractExpiryDate.clear();
		        ContractExpiryDate.sendKeys("2021-12-31");
		        ContractExpiryDate.sendKeys(Keys.ENTER);
		        Thread.sleep(4000);
		        Actions a=new Actions(driver);
		        a.sendKeys(Keys.TAB).build().perform();
		       
		        //Wait for notice period
		        wait.until(ExpectedConditions.visibilityOf(CNoticePeriod));
		        
		        //Verify By Default One Month Notice Period Is Displayed.     
		        //Select Notice Period
		        Select s = new Select(CNoticePeriod);
		        
		        //Get Already Selected Option
		        WebElement option = s.getFirstSelectedOption();
		        String SelectedItem = option.getText();
		        Thread.sleep(3000);
		        //verify Contract is Displayed in Listing Page		    
				return SelectedItem.equals("One Month");
			}
								
			public boolean VerifyUserNavigationToContractForm() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
						
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        return NewContractFormHeading.isDisplayed();       
			}
			
			public boolean VerifyUserIsAbleToEditContract() throws InterruptedException {								
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
					        
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //click on Title Search
		        TitleSearch.click();
		        
		        //Select Title
		        TitleName.click();
		        
		        //Click on Search Button
		        SearchContractButton.click();
		        
		        //verify Owner Contract is Displayed in Listing Page
		        wait.until(ExpectedConditions.visibilityOf(ListingPageContractTitleName));
		        
		        //Click on Contract Title
		        ListingPageContractTitleName.click();
		        
		      //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(ContractTitle));
		        
	       	    //Verify title textbox is enabled   
		        return ContractNameTextbox.isEnabled();	
			}
		
			public boolean VerifyDisplayOfCategoryInContractForm() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
						
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Verify Category Heirarchy Heading is Displayed.
		        return CategoryHeirarchyHeading.isDisplayed();		        			     	        		       
			}
		
			public boolean VerifyAutoSuggestionForSupplierContact() throws InterruptedException {	
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
						
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));		        
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
       
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        
		        //Enter Custom Field Data
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		       
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		      
		        //Enter Supplier contact
		        SupplierContact.sendKeys("d1");
		        Thread.sleep(3000);		    
		        List <WebElement> listItems = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		     
		       //Store count 
		        int a=listItems.size();
		        	System.out.println("Count of Auto suggestion is : "+a);        		       
		        //Verify		        
		        return  (a > 0);		        		  	        			     	        		       
			}
			
			public boolean VerifyAutoSuggestionForStakeHolder() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
						
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));		        
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
		               
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        
		        //Enter Custom Field Data
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		    
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		        
		        //Enter Supplier contact
		        SupplierContact.sendKeys("d1@mailinator.com");
		        
		        //Click on Add Button
		        SupplierContactAddButton.click();
		         
		        //Enter Stake holder Email
		        StakeHolderEmail.sendKeys("Gaurav");	
		        Thread.sleep(3000);		    
		        List <WebElement> listItems = driver.findElements(By.xpath("//ul[@id='stakeholder_tag_handler']/li"));
		     
		       //Store count 
		        int a=listItems.size();
		        	System.out.println("Count of Auto suggestion is : "+a);        		       
		        //Verify		        
		        return  (a > 0);	        		  	        			     	        		       
			}
			
			public boolean VerifyDisplayOfSupplierContactDetails() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
						
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));		        
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
		        		       		        
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        
		        //Enter Custom Field Data
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		    
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		        
		        //Enter Supplier contact
		        SupplierContact.sendKeys("d1@mailinator.com");
		       
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        //Wait
		        wait.until(ExpectedConditions.visibilityOf(SupplierContactName));
		        Assert.assertTrue(SupplierContactEmail.isDisplayed());
		        //Verify		        
		        return  SupplierContactName.isDisplayed();		        		  	        			     	        		       
			}
			
			public boolean VerifyAlertMsgIfHostAddedToSupplierContact() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
						
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));		        
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
		        	        
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        
		        //Enter Custom Field Data
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		    
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		        
		        //Enter Supplier contact
		        SupplierContact.sendKeys("Tarique@mailinator.com");
		       
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        //Wait
		        wait.until(ExpectedConditions.visibilityOf(SupplierContactInUseAlertMsg));

		        //Verify		        
		        return  SupplierContactInUseAlertMsg.isDisplayed();		        		  	        			     	        		       
			}
			
			public boolean VerifyRemovalOfSupplierContact() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
						
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));		        
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
		        		        
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        
		        //Enter Custom Field Data
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		    
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		        
		        //Enter Supplier contact
		        SupplierContact.sendKeys("D2@mailinator.com");
		       
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        Thread.sleep(2000);
		        //Enter Supplier contact
		        SupplierContact.sendKeys("D1@mailinator.com");
		       
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        //Click Remove
		        SupplierContactRemoveButton.click();
		        
		        //Wait for the Window		        
		        wait.until(ExpectedConditions.visibilityOf(SupplierContactRemoveOKButton));
		     
		        //Click OK Button
		        SupplierContactRemoveOKButton.click();
		        Thread.sleep(3000);
		        //Verify		 
		        return  driver.getPageSource().contains("//tbody[@id='participant_summary_body']/tr/td/a[contains(text(),'d2@mailinator.com')]");
		        				        		  	        			     	        		       
			}
			
			public boolean VerifyAtleastOneValueInSupplierContact() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
						
						
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));		        
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
		        				        
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        
		        //Enter Custom Field Data
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		    
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		        
		        //Enter Supplier contact
		        SupplierContact.sendKeys("D2@mailinator.com");
		       
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        Thread.sleep(2000);
		        //Enter Supplier contact
		        SupplierContact.sendKeys("D1@mailinator.com");
		       
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        //Click Remove
		        SupplierContactRemoveButton.click();
		        
		        //Wait for the Window		        
		        wait.until(ExpectedConditions.visibilityOf(SupplierContactRemoveOKButton));
		     
		        //Click OK Button
		        SupplierContactRemoveOKButton.click();
		        		        
		        Thread.sleep(3000);
		        //Click Remove
		        SupplierContactRemoveButton.click();
		        
		        //Wait for the Window		        
		        wait.until(ExpectedConditions.visibilityOf(SupplierContactRemoveOKButton));
		     
		        //Click OK Button
		        SupplierContactRemoveOKButton.click();
		        		        
		        wait.until(ExpectedConditions.visibilityOf(MinimumOneSupplierAlertMsg));
		        //Verify		 
		        return  MinimumOneSupplierAlertMsg.isDisplayed();		        				        		  	        			     	        		       
			}
			
			public boolean VerifyAlertMsgIfParticipantAddedToStakeHolder() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
						
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));		        
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
  
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();		        
		     
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        //Enter Custom Field Data
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		    
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		        
		        //Enter Supplier contact
		        SupplierContact.sendKeys("D2@mailinator.com");		      
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        //Enter Stake holder Email
		        StakeHolderEmail.sendKeys("D1@mailinator.com");
		        //Click on Add Button
		        StakeHolderEmailAddButton.click();
		        
		        //Wait for Alert Message
		        wait.until(ExpectedConditions.visibilityOf(StakeHolderInUseAlertMsg));
		      
		        //Verify		 
		        return  StakeHolderInUseAlertMsg.isDisplayed();		        			        		  	        			     	        		       
			}
			
			public boolean VerifyDisplayOfDropbox() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
						
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));		        
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
		    
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        		        
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        //Enter Custom Field Data
		        ContractCustomField.sendKeys("Test");
		        
		        //Select File Type
		        FileType.click();
		        Actions a=new Actions(driver);
		        a.sendKeys(Keys.DOWN).build().perform();
		        a.sendKeys(Keys.ENTER).build().perform();
		        		    		       
		        //Wait for Dropbox
		        wait.until(ExpectedConditions.visibilityOf(FileDropbox));
		      
		        //Verify		 
		        return  FileDropbox.isDisplayed();		        			        		  	        			     	        		       
			}
		
			public boolean VerifyNoticePeriodChangeAccordingToPeriodSelected() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);				
				
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();

		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
			        
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        //Enter Custom Field Data
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		        //Enter Supplier contact
		        SupplierContact.sendKeys("d1@mailinator.com");
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        //Enter Stake holder Email
		        StakeHolderEmail.sendKeys("tarique@mailinator.com");
		        //Click on Add Button
		        StakeHolderEmailAddButton.click();
		        
		        //Enter Start Date
		        ContractStartDate.clear();
		       	ContractStartDate.sendKeys("2021-06-01");
		        
		        //Enter Expiry Date	
		       	ContractExpiryDate.clear();
		        ContractExpiryDate.sendKeys("2021-12-31");
		        ContractExpiryDate.sendKeys(Keys.ENTER);
		        Thread.sleep(4000);
		        Actions a=new Actions(driver);
		        a.sendKeys(Keys.TAB).build().perform();
		        
		        System.out.println("waiting for notice period dropdown");
		        
		        wait.until(ExpectedConditions.elementToBeClickable(CNoticePeriod));
		        //Select Notice Period
		        Select s = new Select(CNoticePeriod);
		        s.selectByVisibleText("Three Month");
		        Thread.sleep(3000);
		        //Get Notice Period Date
		        String Date=NoticePeriod.getAttribute("value");
		        Thread.sleep(2000);
		        System.out.println("Three month:"+Date);    		        		       		        
		        //verify Contract is Displayed in Listing Page
		        Assert.assertEquals(Date, "2021-09-30");
		        
		        s.selectByVisibleText("Six Month");
		        Thread.sleep(4000);
		        //Get Notice Period Date
		        String Date1=NoticePeriod.getAttribute("value");
		             	    		        		       		        
		        //verify Contract is Displayed in Listing Page		     		        
				return Date1.equals("2021-06-30");
			}	
						
			public boolean VerifyDisplayOfExpiryNotiticationLink() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
				
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        System.out.println("clicked on add a new contract button");
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
		     		        
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        	        
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        //Enter Custom Field Data
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		        //Enter Supplier contact
		        SupplierContact.sendKeys("d1@mailinator.com");
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        //Enter Stake holder Email
		        StakeHolderEmail.sendKeys("tarique@mailinator.com");
		        //Click on Add Button
		        StakeHolderEmailAddButton.click();
		        
		        //Enter Start Date
		        ContractStartDate.clear();
		       	ContractStartDate.sendKeys("2021-06-01");
		        
		        //Enter Expiry Date	
		       	ContractExpiryDate.clear();
		        ContractExpiryDate.sendKeys("2021-12-31");
		        ContractExpiryDate.sendKeys(Keys.ENTER);
		        Thread.sleep(4000);
		        Actions a=new Actions(driver);
		        a.sendKeys(Keys.TAB).build().perform();
		        
		        //Select Notice Period
		        Select s = new Select(CNoticePeriod);
		        s.selectByVisibleText("Three Month");
		      
		       //Wait for Link to load.
		        wait.until(ExpectedConditions.visibilityOf(ExpiryNotificationLink));
		        
		        //verify Contract is Displayed in Listing Page		     		        
				return ExpiryNotificationLink.isDisplayed();
			}	
		
			public boolean VerifySupplierAndStakeHolderInRecipientPopup() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
				
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        System.out.println("clicked on add a new contract button");
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
		        
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        //Enter Custom Field Data
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		        //Enter Supplier contact
		        SupplierContact.sendKeys("d1@mailinator.com");
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        //Enter Stake holder Email
		        StakeHolderEmail.sendKeys("tarique@mailinator.com");
		        //Click on Add Button
		        StakeHolderEmailAddButton.click();
		        
		        //Enter Start Date
		        ContractStartDate.clear();
		       	ContractStartDate.sendKeys("2021-06-01");
		        
		        //Enter Expiry Date	
		       	ContractExpiryDate.clear();
		        ContractExpiryDate.sendKeys("2021-12-31");
		        ContractExpiryDate.sendKeys(Keys.ENTER);
		        Thread.sleep(4000);
		        Actions a=new Actions(driver);
		        a.sendKeys(Keys.TAB).build().perform();
		        
		        //Select Notice Period
		        Select s = new Select(CNoticePeriod);
		        s.selectByVisibleText("Three Month");
		      
		       //Wait for Link to load.
		        wait.until(ExpectedConditions.visibilityOf(ExpiryNotificationLink));
		        
		        //Click on Link
		        ExpiryNotificationLink.click();
		        
		        //Wait for Modal Window to Open
		        wait.until(ExpectedConditions.visibilityOf(ExpiryNotificationModalWindow));
		        
		        //Verify Stakeholdername is Displayed
		        Assert.assertTrue(ExpiryNotificationWindowStakeholder.isDisplayed(),"Stake holder name not displayed");
		        //Store value in String
		        String StakeholderName=ExpiryNotificationWindowStakeholder.getText();
		      //verify Stakeholder value
		        Assert.assertTrue(StakeholderName.equals("Tarique"),"Stake holder name does not match");
	       		  	        		        
		        //Click on Supplier tab
		        ExpiryNotificationSuppliertab.click();
		        //Wait for Modal Window to Open
		        wait.until(ExpectedConditions.visibilityOf(ExpiryNotificationWindowStakeholder));
		        
		       // Store value in String
		        String SupplierName=ExpiryNotificationWindowStakeholder.getText();
		        //verify supplier value
		        Assert.assertTrue(SupplierName.equals("D1 Testing"),"Supplier name does not match");
	       		  	        
		        //verify Contract is Displayed in Listing Page		     		        
				return ExpiryNotificationWindowSupplier.isDisplayed();
			}	
			
			public boolean VerifyDisplayOfCustomNotiticationLink() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
				
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        System.out.println("clicked on add a new contract button");
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");		        
		        
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        //Enter Custom Field Data
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		        //Enter Supplier contact
		        SupplierContact.sendKeys("d1@mailinator.com");
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        //Enter Stake holder Email
		        StakeHolderEmail.sendKeys("tarique@mailinator.com");
		        //Click on Add Button
		        StakeHolderEmailAddButton.click();
		        
		        //Enter Start Date
		        ContractStartDate.clear();
		       	ContractStartDate.sendKeys("2021-06-01");
		        
		        //Enter Expiry Date	
		       	ContractExpiryDate.clear();
		        ContractExpiryDate.sendKeys("2021-12-31");
		        ContractExpiryDate.sendKeys(Keys.ENTER);
		        Thread.sleep(4000);
		        Actions a=new Actions(driver);
		        a.sendKeys(Keys.TAB).build().perform();
		        
		        //Select Notice Period
		        Select s = new Select(CNoticePeriod);
		        s.selectByVisibleText("Three Month");
		      
		        //Wait for Link to load.
		        wait.until(ExpectedConditions.visibilityOf(CustomNotificationLink));
		        		       
		        //verify Custom notification Link is Displayed	     		        
				return CustomNotificationLink.isDisplayed();
			}	
			
		
			public boolean VerifyDisplayOfParentHeirarchyDropdown() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
							
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        		
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
		        
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        		        
		        //Verify Display of parent Heirarchy Dropdown
		        return parentHeirarchyDropdown.isDisplayed();
			}								
		
			public boolean VerifySelectedParentNotDisplayInChildDropdown() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
							
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        		
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
	        
		        //Click on Parent Heirarchy Dropdown
		        parentHeirarchyDropdown.click();
		        
		        //Select value
		        Actions a=new Actions(driver);
		        a.sendKeys("h").build().perform();
		        a.sendKeys(Keys.ENTER).build().perform();
		        			        
		        //refresh
		        driver.navigate().refresh();
		        	        
		        //wait for dropdown
		        wait.until(ExpectedConditions.visibilityOf(childHeirarchyDropdown));
		        
		        //Click on Child Heirarchy Dropdown
		        childHeirarchyDropdown.click();
		        a.sendKeys("h").build().perform();		        
		       
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(parentValue));
		    
		        //Verify Display of parent Heirarchy Dropdown
		        return parentValue.isDisplayed();
			}			
		
			public boolean VerifySelectedChildNotDisplayInParentDropdown() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
						
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        		
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");		       
		        
		        //Click on Child Heirarchy Dropdown
		        childHeirarchyDropdown.click();		        		        
		        
		        //Select value
		        childrenValue.click();		        
		        Thread.sleep(2000);		
		      
		        //refresh
		        driver.navigate().refresh();
		        	        
		        //wait for dropdown
		        wait.until(ExpectedConditions.visibilityOf(parentHeirarchyDropdown));		        
		        
		        //Click on Children Heirarchy Dropdown
		        parentHeirarchyDropdown.click();
		  		
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(parentValue));
		        
		        //Verify Display of parent Heirarchy Dropdown
		        return parentValue.isDisplayed();
			}		
		
			public boolean VerifyLanguageChange() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
							
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Globe Button
		        GlobeIcon.click();
		        
		        //Select language
		        DeutschLanguage.click();
		        		
		        //Wait for site to load.
		        wait.until(ExpectedConditions.visibilityOf(DeutschLanguageAddContractButton));
		        
		        //Verify Language is changed
		        Assert.assertTrue(DeutschLanguageAddContractButton.isDisplayed(),"Deutsch language button not displayed");
		        
		        //Click on Globe Button
		        GlobeIcon.click();
		        
		        //Select language
		        EnglishLanguage.click();
		       
		        //Wait for site to load.
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton));
		        
		        //Verify
		        return AddNewContractButton.isDisplayed();
			}		

			public boolean VerifyActiveHeadingsDisplayInContractForm() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
								
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Admin Button
		        AdminButton.click();
		        
		        //Select Contract Setting
		        ContractSettingButton.click();
		        		
		        //Wait for Contract Settings Heading
		        wait.until(ExpectedConditions.visibilityOf(ContractSettingHeading));
		        
		        //Click on Legal Entity Check-box
		        ContractReferenceCheckbox.click();
		        
		        Thread.sleep(3000);
		        //Click on All Modules Button
		        AllModuleButton.click();
		        
		        //Click on Contract Button
		        ContractButton.click();
		        
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();		        
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		   
		        
		        //Verify Legal Entity Textbox is Not Displayed		     
		        Assert.assertFalse(driver.getPageSource().contains("//label[contains(text(),'Contract Reference')]/parent::div/input"));
		        		    
		        //Back to Contract Setting to restore defaults
		        //Click on Admin Button
		        AdminButton.click();
		        
		        //Select Contract Setting
		        ContractSettingButton.click();
		        		
		        //Wait for Contract Settings Heading
		        wait.until(ExpectedConditions.visibilityOf(ContractReferenceCheckbox));
		        Thread.sleep(5000);
		        ContractReferenceCheckbox.click();
		        Thread.sleep(3000);
		        //Click on All Modules Button
		        AllModuleButton.click();
		        
		        //Click on Contract Button
		        ContractButton.click();
		        
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();		        
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Verify Legal Entity Textbox is Displayed
		        return ContractReferenceTextbox.isDisplayed();
			}		

			public boolean VerifyActiveHeadingsDisplayInContractListingPage() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
							
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Admin Button
		        AdminButton.click();
		        
		        //Select Contract Setting
		        ContractSettingButton.click();
		        		
		        //Wait for Contract Settings Heading
		        wait.until(ExpectedConditions.visibilityOf(ContractSettingHeading));
		        
		        //Click on Legal Entity Check-box
		        ContractSettingParentCheckbox.click();
		        Thread.sleep(3000);
		        
		        //Click on All Modules Button
		        AllModuleButton.click();
		        
		        //Click on Contract Button
		        ContractButton.click();
		        
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		       
		        //Verify Parent Coloumn is Not Displayed
		        Assert.assertFalse(driver.getPageSource().contains("//th[contains(text(),'Parent')]"));
		        				            
		        //Back to Contract Setting to restore defaults
		        //Click on Admin Button
		        AdminButton.click();
		        
		        //Select Contract Setting
		        ContractSettingButton.click();
		        		
		        //Wait for Contract Settings Heading
		        wait.until(ExpectedConditions.visibilityOf(ContractSettingParentCheckbox));
		        		        
		        //Click on Parent Check-box		        
		        ContractSettingParentCheckbox.click();
		        Thread.sleep(5000);
		        
		        //Click on All Modules Button
		        AllModuleButton.click();
		        
		        //Click on Contract Button
		        ContractButton.click();
		        
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        		     
		        //Verify Legal Entity Textbox is Displayed
		        return ListingPageParentColoumn.isDisplayed();
			}		
					
		    public boolean VerifyContractListingOnLanguageChange() throws InterruptedException {
			    	driver.navigate().to(prop.getProperty("ContractHomepage"));
					WebDriverWait wait = new WebDriverWait(driver,60);
								
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Globe Button
		        GlobeIcon.click();
		        
		        //Select language
		        DeutschLanguage.click();
		        		
		        //Wait for site to load.
		        wait.until(ExpectedConditions.visibilityOf(DeutschLanguageAddContractButton));
		        
		        //Verify Listing Page Headings for Deutsch Language
		        Assert.assertTrue(DeutschShowArchiveButton.isDisplayed(),"Deutsch language Show-Archive button not displayed");
		        Assert.assertTrue(DeutschContractOwnerRow.isDisplayed(),"Deutsch language Owner button not displayed");
		        Assert.assertTrue(DeutschContractTItleRow.isDisplayed(),"Deutsch language Title button not displayed");
		        Assert.assertTrue(DeutschContractCategoryRow.isDisplayed(),"Deutsch language Category button not displayed");
		        Assert.assertTrue(DeutschContractSupplierRow.isDisplayed(),"Deutsch language Supplier button not displayed");
		        Assert.assertTrue(DeutschAddContractButton.isDisplayed(),"Deutsch Add Contract button not displayed");
		     
		        //Click on Globe Button
		        GlobeIcon.click();
		        
		        //Select language
		        EnglishLanguage.click();
		       
		        //Wait for site to load.
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton));
		        
		        //Verify
		        return AddNewContractButton.isDisplayed();
			}		
				    			
			public boolean VerifyCustomFieldDisplayInContractForm() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
								
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Admin Button
		        AdminButton.click();
		        
		        //Select Contract Setting
		        ContractSettingButton.click();
		        		
		        //Wait for Contract Settings Heading
		        wait.until(ExpectedConditions.visibilityOf(ContractSettingHeading));
		        
		        //Click on Active Check-box
		        CustomFieldActiveCheckboxinSettings.click();
		        
		        Thread.sleep(3000);
		        //Click on All Modules Button
		        AllModuleButton.click();
		        
		        //Click on Contract Button
		        ContractButton.click();
		        
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();		        
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		   	        
		        //Verify custom field is Displayed		     
		        Assert.assertTrue(CustomField.isDisplayed());
		        		    
		        //Back to Contract Setting to restore defaults
		        //Click on Admin Button
		        AdminButton.click();
		        
		        //Select Contract Setting
		        ContractSettingButton.click();
		        		
		        //Wait for Contract Settings Heading
		        wait.until(ExpectedConditions.visibilityOf(CustomFieldActiveCheckboxinSettings));
		        Thread.sleep(3000);
		        CustomFieldActiveCheckboxinSettings.click();
		        Thread.sleep(3000);
		        //Click on All Modules Button
		        AllModuleButton.click();
		        
		        //Click on Contract Button
		        ContractButton.click();
		        
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();		        
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Verify Legal Entity Textbox is Displayed
		        return driver.getPageSource().contains("//tr/td[contains(text(),'Custom Test Field')]");
			}	
			
			
		  /* 
		   * 
		   *  
		   *  public boolean VerifyUserIsAbleToAddPrivateNote() throws InterruptedException {
			driver.navigate().to(prop.getProperty("ContractHomepage"));
			WebDriverWait wait = new WebDriverWait(driver,60);
						
	        //Wait for Contract Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
	        
	        //Click on Add New Contract Button
	        AddNewContractButton.click();
	        
	        //Click on Create Button
	        CreateContractButton.click();
	        		
	        //Wait for Contract Form to load.
	        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
	        
	        //Enter Contract Name
	        ContractNameTextbox.sendKeys("Automation Contract");		        
	        
	        //Select Legal Entity
	        ContractLegalEntityTextbox.click();
	        ContractLegalEntityValue.click();
	                
	        //Select Jurisdiction
	        ContractJurisdictionTextbox.click();
	        ContractJurisdictionValue.click();
	        
	        //Select Contract Type
	        ContractTypeDropdown.click();
	        ContractTypeDropdownValue.click();
	        //Enter Custom Field Data
	        ContractCustomField.sendKeys("Test");
	        
	        //Select Currency INR
	        ContractCurrency.click();
	        Thread.sleep(1000);
	        INRCurrency.click();
	        
	        //Enter Annual Value
	        ContractAnnualValue.sendKeys("250000");
	        Thread.sleep(1000);
	        //Enter Total Value
	        ContractTotalValue.sendKeys("550000");
	        Thread.sleep(1000);
	        //Enter Supplier contact
	        SupplierContact.sendKeys("d1@mailinator.com");
	        //Click on Add Button
	        SupplierContactAddButton.click();
	        
	        //Enter Stake holder Email
	        StakeHolderEmail.sendKeys("tarique@mailinator.com");
	        //Click on Add Button
	        StakeHolderEmailAddButton.click();
	        
	        //Enter Start Date
	        ContractStartDate.clear();
	       	ContractStartDate.sendKeys("2021-06-01");
	        
	        //Enter Expiry Date	
	       	ContractExpiryDate.clear();
	        ContractExpiryDate.sendKeys("2021-12-31");
	        ContractExpiryDate.sendKeys(Keys.ENTER);
	        Thread.sleep(4000);
	        Actions a=new Actions(driver);
	        a.sendKeys(Keys.TAB).build().perform();
	        
	        //Select Notice Period
	        Select s = new Select(CNoticePeriod);
	        s.selectByVisibleText("Other");
	      
	        //Enter Notice Period Date
	        NoticePeriod.clear();
	        NoticePeriod.sendKeys("2021-11-30");
	        NoticePeriod.sendKeys(Keys.ENTER);	        	    
	        
	        privateNoteCheckbox.click();
	        
	        //Click on Notes
	        NotesEditor.click();
	        	        
	        //Enter public note
	        NotesEditor.sendKeys("This is a test Note for the contract");	
	      
	        Thread.sleep(2000);
	        a.sendKeys(Keys.TAB).build().perform();
	        a.sendKeys(Keys.TAB).build().perform();
	               
	        Thread.sleep(2000);
	        //Click on Add
	        AddNotesButton.click();		        	        
	      //  wait.until(ExpectedConditions.visibilityOf(AuthorName));
	        		        
	        //Click on Notes
	        NotesEditor.click();
	        	        
	        //Enter public note
	        NotesEditor.sendKeys("Retype");	
	      
	        Thread.sleep(2000);
	        a.sendKeys(Keys.TAB).build().perform();
	        a.sendKeys(Keys.TAB).build().perform();
	               
	        Thread.sleep(2000);
	        //Click on Add
	        AddNotesButton.click();		        	        
	        wait.until(ExpectedConditions.visibilityOf(AuthorName));
	        
	        //Click on Notes
	        NotesEditor.click();
	        
	        a.sendKeys(Keys.TAB).build().perform();
	        a.sendKeys(Keys.TAB).build().perform();
	        a.sendKeys(Keys.TAB).build().perform();
	      
	        //Click on Save Button       
	        a.sendKeys(Keys.ENTER).build().perform();
	        Thread.sleep(4000);
	        
	        //Wait for  Contract to Display in Listing Page
	        wait.until(ExpectedConditions.elementToBeClickable(ContractTitleInHomepage));
	        
	        //Click on Contract
	        ContractTitleInHomepage.click();
	     
	        //wait for Contract to open
	        a.moveToElement(publicNotes).build().perform();
	        
			return publicNotes.isDisplayed();
		}	
			
			public boolean VerifyUserIsAbleToAddPublicNote() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
				
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        //Comment
		        System.out.println("Adding Public Note");
		
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");
		        		   
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();		        
		        //Enter Custom Field Data
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		        //Enter Supplier contact
		        SupplierContact.sendKeys("d1@mailinator.com");
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        //Enter Stake holder Email
		        StakeHolderEmail.sendKeys("tarique@mailinator.com");
		        //Click on Add Button
		        StakeHolderEmailAddButton.click();
		        
		        //Enter Start Date
		        ContractStartDate.clear();
		       	ContractStartDate.sendKeys("2021-06-01");
		        
		        //Enter Expiry Date	
		       	ContractExpiryDate.clear();
		        ContractExpiryDate.sendKeys("2021-12-31");
		        ContractExpiryDate.sendKeys(Keys.ENTER);
		        Thread.sleep(4000);
		        Actions a=new Actions(driver);
		        a.sendKeys(Keys.TAB).build().perform();
		        
		        //Select Notice Period
		        Select s = new Select(CNoticePeriod);
		        s.selectByVisibleText("Other");
		      
		        //Enter Notice Period Date
		        NoticePeriod.clear();
		        NoticePeriod.sendKeys("2021-11-30");
		        NoticePeriod.sendKeys(Keys.ENTER);	        	    
		        
		        //Click on Notes
		        NotesEditor.click();
		        	        
		        //Enter public note
		        NotesEditor.sendKeys("This is a test Note for the contract");		        
		        a.sendKeys(Keys.TAB).build().perform();	     
		        a.sendKeys(Keys.ENTER).build().perform();		   		     
		        
		        Thread.sleep(2000);
		        //Click on Notes
		        NotesEditor.click();
		        
		        a.sendKeys(Keys.TAB).build().perform();
		        a.sendKeys(Keys.TAB).build().perform();
		        a.sendKeys(Keys.TAB).build().perform();
		      
		        //Click on Save Button       
		        a.sendKeys(Keys.ENTER).build().perform();
		        Thread.sleep(4000);
		        
		        //Wait for  Contract to Display in Listing Page
		        wait.until(ExpectedConditions.elementToBeClickable(ContractTitleInHomepage));
		        
		        //Click on Contract
		        ContractTitleInHomepage.click();
		     
		        //wait for Contract to open
		        a.moveToElement(publicNotes).build().perform();
		        
				return publicNotes.isDisplayed();
			}	
			
		    
		    public boolean VerifyUserIsAbleToAddCustomNotitication() throws InterruptedException {
				driver.navigate().to(prop.getProperty("ContractHomepage"));
				WebDriverWait wait = new WebDriverWait(driver,60);
				
		        //Wait for Contract Page to Load
		        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
		        
		        //Click on Add New Contract Button
		        AddNewContractButton.click();
		        
		        //Click on Create Button
		        CreateContractButton.click();
		        
		        System.out.println("clicked on add a new contract button");
		        
		        //Wait for Contract Form to load.
		        wait.until(ExpectedConditions.visibilityOf(NewContractFormHeading));
		        
		        //Enter Contract Name
		        ContractNameTextbox.sendKeys("Automation Contract");		        
		        
		        //Select Legal Entity
		        ContractLegalEntityTextbox.click();
		        ContractLegalEntityValue.click();
		                
		        //Select Jurisdiction
		        ContractJurisdictionTextbox.click();
		        ContractJurisdictionValue.click();
		        
		        //Select Contract Type
		        ContractTypeDropdown.click();
		        ContractTypeDropdownValue.click();
		        //Enter Custom Field Data
		        ContractCustomField.sendKeys("Test");
		        
		        //Select Currency INR
		        ContractCurrency.click();
		        Thread.sleep(1000);
		        INRCurrency.click();
		        
		        //Enter Annual Value
		        ContractAnnualValue.sendKeys("250000");
		        Thread.sleep(1000);
		        //Enter Total Value
		        ContractTotalValue.sendKeys("550000");
		        Thread.sleep(1000);
		        //Enter Supplier contact
		        SupplierContact.sendKeys("d1@mailinator.com");
		        //Click on Add Button
		        SupplierContactAddButton.click();
		        
		        //Enter Stake holder Email
		        StakeHolderEmail.sendKeys("tarique@mailinator.com");
		        //Click on Add Button
		        StakeHolderEmailAddButton.click();
		        
		        //Enter Start Date
		        ContractStartDate.clear();
		       	ContractStartDate.sendKeys("2021-06-01");
		        
		        //Enter Expiry Date	
		       	ContractExpiryDate.clear();
		        ContractExpiryDate.sendKeys("2021-12-31");
		        ContractExpiryDate.sendKeys(Keys.ENTER);
		        Thread.sleep(4000);
		        Actions a=new Actions(driver);
		        a.sendKeys(Keys.TAB).build().perform();
		        
		        //Select Notice Period
		        Select s = new Select(CNoticePeriod);
		        s.selectByVisibleText("Three Month");
		      
		        //Wait for Link to load.
		        wait.until(ExpectedConditions.visibilityOf(CustomNotificationLink));
		        		       
		        //Click on Custom Notification Link
		        CustomNotificationLink.click();
		        		  
		        Thread.sleep(3000);
		        // To zoom out 3 times
		        for(int i=0; i<3; i++){
		         driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
		        }
		        
		        wait.until(ExpectedConditions.visibilityOf(AddNotificationHeading));
		        		      
		        CustomNotificationSubject.sendKeys("Custom notification");
		        a.sendKeys(Keys.TAB).build().perform();
		        a.sendKeys("Adding a Custom Notification").build().perform();
		        a.sendKeys(Keys.TAB).build().perform();
		        a.sendKeys("2021-11-01").build().perform();
		        a.sendKeys(Keys.TAB).build().perform();
		        a.sendKeys("5").build().perform();
		        		        
		        //Click on Supplier checkbox
		        SupplierCheckboxinCustomNotification.click();
		        
		        //verify Custom notification Link is Displayed	     		        
				return CustomNotificationLink.isDisplayed();
			}	
		
	*/
		}
