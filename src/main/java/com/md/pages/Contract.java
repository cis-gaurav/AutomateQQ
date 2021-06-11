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
import com.md.base.TestBase;



public class Contract extends TestBase {
	
// Page factory 
		@FindBy(name = "user[login]")
		static
		WebElement username;

		@FindBy(name = "user[password]")
		static
		WebElement password;

		@FindBy(name = "commit")
		static
		WebElement loginBtn;
		
		@FindBy(xpath="//a[contains(text(),'Dashboard')]")
		static
		WebElement AdminDashboard;
		
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
		
		@FindBy(xpath="//label[contains(text(),'Contract Type')]/parent::div/span/span/span/span")
		static
		WebElement ContractTypeDropdown;	
		
		@FindBy(xpath="//span[@class='select2-results']/ul/li[contains(text(),'Software')]")
		static
		WebElement ContractTypeDropdownValue;
		
		@FindBy(xpath="//label[contains(text(),'Legal Entity')]/parent::div/span/span/span/span")
		static
		WebElement ContractLegalEntityTextbox;	

		@FindBy(xpath="//span[@class='select2-results']/ul/li[contains(text(),'IE Legal Entity')]")
		static
		WebElement ContractLegalEntityValue;	
		
		
		@FindBy(xpath="//label[contains(text(),'Jurisdiction')]/parent::div/span/span/span/span")
		static
		WebElement ContractJurisdictionTextbox;	
		
		@FindBy(xpath="//span[@class='select2-results']/ul/li[contains(text(),'Jurisdiction 2')]")
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
		
		
		
		// Intialize page factory 
			public Contract() {
			PageFactory.initElements(driver, this);
		}

		// Actions 
		public static void login () throws InterruptedException {
			username.sendKeys(prop.getProperty("username"));
			password.sendKeys(prop.getProperty("password"));
			loginBtn.click();	
			WebDriverWait wait = new WebDriverWait(driver,60);
	        wait.until(ExpectedConditions.visibilityOf(AdminDashboard ));
		}
	
		
		//Scripts
		public boolean VerifyUserIsAbleToMakeContract() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver,60);
			
			//Wait for Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AdminDashboard ));
	        
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
	        
	        //Enter Contract Name
	        ContractNameTextbox.sendKeys("Automation Contract");
	        
	        //Select Contract Type
	        ContractTypeDropdown.click();
	        ContractTypeDropdownValue.click();
	        
	        //Select Legal Entity
	        ContractLegalEntityTextbox.click();
	        ContractLegalEntityValue.click();
	                
	        //Select Jurisdiction
	        ContractJurisdictionTextbox.click();
	        ContractJurisdictionValue.click();
	        
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
	        
	        //Select Notice Period
	        Select s = new Select(driver.findElement(By.xpath("//label[contains(text(),'Notice Period')]/parent::div//select[@class='form-control']")));
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
	        
	        //verify Contract is Displayed in Listing Page
	        wait.until(ExpectedConditions.visibilityOf(ContractTitleInHomepage));
			return ContractTitleInHomepage.isDisplayed();
		}
			
		public boolean VerifyHeadingOnContractListingPage() throws InterruptedException{
			driver.navigate().to(prop.getProperty("url"));
			WebDriverWait wait = new WebDriverWait(driver,60);
	        wait.until(ExpectedConditions.visibilityOf(AdminDashboard));
	        
	    	//Click on All Modules Button
	        AllModuleButton.click();
	        
	        //Click on Contract Button
	        ContractButton.click();
	        
	        //Wait for Contract Page to Load
	        wait.until(ExpectedConditions.visibilityOf(ListingPageHeadings ));
			return ListingPageHeadings.isDisplayed();
		}
			
		public boolean VerifyUserIsAbleToSearchContract() throws InterruptedException{
			
			driver.navigate().to(prop.getProperty("url"));
			WebDriverWait wait = new WebDriverWait(driver,60);
			
			//Wait for Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AdminDashboard ));
	        
			//Click on All Modules Button
	        AllModuleButton.click();
	        
	        //Click on Contract Button
	        ContractButton.click();
	        
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
			driver.navigate().to(prop.getProperty("url"));
			WebDriverWait wait = new WebDriverWait(driver,60);
	      
			//Wait for Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AdminDashboard ));
	        
			//Click on All Modules Button
	        AllModuleButton.click();
	        
	        //Click on Contract Button
	        ContractButton.click();
	        
	        //Wait for Contract Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AddNewContractButton ));
			
	        //Store value of Download Contract Unarchived Contracts
	        String A= DownloadContractsbutton.getText();
	        String totalcontracts = A.substring(A.length() - 3);

	        System.out.println(totalcontracts);
	        
	        //Clcik on Show All Contracts Button
	        ShowArchiveToggleButton.click();
	        
	        //get First Three Characters 
	        String Str3= DownloadContractsbutton.getText();
	        String All = Str3.substring(0,3);
	        
	        System.out.println(All);
	        
	        wait.until(ExpectedConditions.visibilityOf(DownloadContractsbutton));	        
			return totalcontracts.equals(All);
		}
		
		public boolean VerifyAlertMsgOnSearchingContracts() throws InterruptedException{
			driver.navigate().to(prop.getProperty("url"));
			WebDriverWait wait = new WebDriverWait(driver,60);
			
			//Wait for Page to Load
	        wait.until(ExpectedConditions.visibilityOf(AdminDashboard ));
	        
			//Click on All Modules Button
	        AllModuleButton.click();
	        
	        //Click on Contract Button
	        ContractButton.click();
	        
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
		
}
