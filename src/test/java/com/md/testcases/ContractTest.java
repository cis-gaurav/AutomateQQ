//package com.md.testcases;
//
//import org.testng.annotations.Test;
//import com.md.base.TestBase;
//import com.md.pages.Contract;
//import org.testng.annotations.BeforeTest;
//import java.net.MalformedURLException;
//import org.testng.Assert;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
//
//public class ContractTest extends TestBase {
//	Contract contractPage;
//	/*
//	 * static ExtentHtmlReporter htmlReporter = new
//	 * ExtentHtmlReporter(System.getProperty("user.dir")+
//	 * "/test-output/AutomationReport.html"); static ExtentReports extent = new
//	 * ExtentReports(); public static ExtentTest test; public static ExtentTest
//	 * logger;
//	 */
//
//	public ContractTest() {
//		super(); // Need to create constructor to initialize properties file
//	}
//
//	@BeforeTest
//	public void setUp() throws MalformedURLException, InterruptedException {
//		initialization();
//		contractPage = new Contract();
////		 Contract.login();	
//		TestBase.login();
//	}
//
//	@Test(priority=0)
//	public void VerifyUserIsAbleToAddContract() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyUserIsAbleToAddContract();
//		Assert.assertTrue(flag);
//	}	
//	
//	@Test(priority=1)
//	public void VerifyHeadingOnContractListingPage() throws InterruptedException{
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());   
//		boolean flag = contractPage.VerifyHeadingOnContractListingPage();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=2)
//	public void VerifyUserIsAbleToSearchContract() throws InterruptedException {	
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());  
//		boolean flag = contractPage.VerifyUserIsAbleToSearchContract();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=3)
//	public void VerifyDisplayOfArchivedContracts() throws InterruptedException {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());  
//		boolean flag = contractPage.VerifyDisplayOfArchivedContracts();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=4)
//	public void VerifyAlertMsgOnSearchingContracts() throws InterruptedException {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());  
//		boolean flag = contractPage.VerifyAlertMsgOnSearchingContracts();
//		Assert.assertTrue(flag);
//	}
//			
//	@Test(priority=5)
//	public void VerifySearchContractUsingTitle() throws InterruptedException {		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());  
//		boolean flag = contractPage.VerifySearchContractUsingTitle();
//		Assert.assertTrue(flag);
//	}
//			
//	@Test(priority=6)
//	public void VerifySearchContractUsingStartDate() throws InterruptedException {	
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());  		
//		boolean flag = contractPage.VerifySearchContractUsingStartDate();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=7)
//	public void VerifySearchContractUsingExpiryDate() throws InterruptedException {		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());  
//		boolean flag = contractPage.VerifySearchContractUsingExpiryDate();
//		Assert.assertTrue(flag);
//	}	
//	@Test(priority=8)
//	public void VerifySearchContractUsingCategory() throws InterruptedException {				
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());   
//		boolean flag = contractPage.VerifySearchContractUsingCategory();
//		Assert.assertTrue(flag);
//	}
//	@Test(priority=9)
//	public void VerifySearchContractUsingSupplier() throws InterruptedException {	
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());  
//		boolean flag = contractPage.VerifySearchContractUsingSupplier();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=10)
//	public void VerifySearchContractUsingValue() throws InterruptedException {		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());  
//		boolean flag = contractPage.VerifySearchContractUsingValue();
//		Assert.assertTrue(flag);
//	}
//	@Test(priority=11)
//	public void VerifySearchContractUsingStakeHolder() throws InterruptedException {	
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());  
//		boolean flag = contractPage.VerifySearchContractUsingStakeHolder();
//		Assert.assertTrue(flag);
//	}
//	@Test(priority=12)
//	public void VerifyContractValidationMsg() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyContractValidationMsg();
//		Assert.assertTrue(flag);
//	}
//	@Test(priority=13)
//	public void VerifyUserNavigationToContractForm() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyUserNavigationToContractForm();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority = 14)
//	public void VerifySearchContractUsingOwner() throws InterruptedException {
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifySearchContractUsingOwner();
//		Assert.assertTrue(flag);
//	}
//	@Test(priority=15)
//	public void VerifyOneMonthNoticePeriodIsSelectedByDefault() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyOneMonthNoticePeriodIsSelectedByDefault();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=16)
//	public void VerifyUserIsAbleToEditContract() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyUserIsAbleToEditContract();
//		Assert.assertTrue(flag);
//	}
//		
//	
//	
//	@Test(priority=17)
//	public void VerifyDisplayOfCategoryInContractForm() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyDisplayOfCategoryInContractForm();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=19)
//	public void VerifyAutoSuggestionForSupplierContact() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyAutoSuggestionForSupplierContact();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=20)
//	public void VerifyAutoSuggestionForStakeHolder() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyAutoSuggestionForStakeHolder();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=21)
//	public void VerifyDisplayOfSupplierContactDetails() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyDisplayOfSupplierContactDetails();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=22)
//	public void VerifyAlertMsgIfHostAddedToSupplierContact() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyAlertMsgIfHostAddedToSupplierContact();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=23)
//	public void VerifyRemovalOfSupplierContact() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyRemovalOfSupplierContact();
//		Assert.assertFalse(flag);
//	}
//	
//	@Test(priority=24)
//	public void VerifyAtleastOneValueInSupplierContact() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyAtleastOneValueInSupplierContact();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=25)
//	public void VerifyAlertMsgIfParticipantAddedToStakeHolder() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyAlertMsgIfParticipantAddedToStakeHolder();
//		Assert.assertTrue(flag);
//	}
//
//	@Test(priority=26)
//	public void VerifyDisplayOfDropbox() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyDisplayOfDropbox();
//		Assert.assertTrue(flag);
//	}
//	
//	
//	@Test(priority=27)
//	public void VerifyNoticePeriodChangeAccordingToPeriodSelected() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyNoticePeriodChangeAccordingToPeriodSelected();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=28)
//	public void VerifyDisplayOfExpiryNotiticationLink() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyDisplayOfExpiryNotiticationLink();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=29)
//	public void VerifySupplierAndStakeHolderInRecipientPopup() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifySupplierAndStakeHolderInRecipientPopup();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=30)
//	public void VerifyDisplayOfCustomNotiticationLink() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyDisplayOfCustomNotiticationLink();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=31)
//	public void VerifyDisplayOfParentHeirarchyDropdown() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyDisplayOfParentHeirarchyDropdown();
//		Assert.assertTrue(flag);
//	}
//
//    @Test(priority=32)
//	public void VerifySelectedParentNotDisplayInChildDropdown() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifySelectedParentNotDisplayInChildDropdown();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=33)
//	public void VerifySelectedChildNotDisplayInParentDropdown() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifySelectedChildNotDisplayInParentDropdown();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=34)
//	public void VerifyLanguageChange() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyLanguageChange();
//		Assert.assertTrue(flag);
//	}
//	@Test(priority=35)
//	public void VerifyActiveHeadingsDisplayInContractForm() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyActiveHeadingsDisplayInContractForm();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=36)
//	public void VerifyActiveHeadingsDisplayInContractListingPage() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyActiveHeadingsDisplayInContractListingPage();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=37)
//	public void VerifyContractListingOnLanguageChange() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyContractListingOnLanguageChange();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=38)
//	public void VerifyCustomFieldDisplayInContractForm() throws InterruptedException{		
//		logger = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName().toString());
//		boolean flag = contractPage.VerifyCustomFieldDisplayInContractForm();
//		Assert.assertFalse(flag);
//	}
//
//	@AfterTest
//	public void Teardown() throws Exception {
//
//		// driver.close();
//	}
//
//}