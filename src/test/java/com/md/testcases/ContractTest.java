package com.md.testcases;
import org.testng.annotations.Test;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.md.base.TestBase;
import com.md.pages.ContractPage;
import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ContractTest extends TestBase {
	ContractPage contractPage;

	public ContractTest() {
		super(); // Need to create constructor to initialize properties file
	}

	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException {
		initializationAndLogin();
	    contractPage = new ContractPage();
		Thread.sleep(4000);	
		logger.info("*******Contract_test_ starts*******");
	}

	@Test(priority=11)
	public void contract_VerifyUserIsAbleToAddContract() throws InterruptedException{		
		boolean flag = contractPage.VerifyUserIsAbleToAddContract();
		Assert.assertTrue(flag);
	}	
	
	@Test(priority=12)
	public void contract_VerifyHeadingOnContractListingPage() throws InterruptedException{
		boolean flag = contractPage.VerifyHeadingOnContractListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=13)
	public void contract_VerifyUserIsAbleToSearchContract() throws InterruptedException {	 
		boolean flag = contractPage.VerifyUserIsAbleToSearchContract();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=14)
	public void contract_VerifyAlertMsgOnSearchingContracts() throws InterruptedException {
		boolean flag = contractPage.VerifyAlertMsgOnSearchingContracts();
		Assert.assertTrue(flag);
	}
			
	@Test(priority=15)
	public void contract_VerifySearchContractUsingTitle() throws InterruptedException {		 
		boolean flag = contractPage.VerifySearchContractUsingTitle();
		Assert.assertTrue(flag);
	}
			
	@Test(priority=16)
	public void contract_VerifySearchContractUsingStartDate() throws InterruptedException {	
		boolean flag = contractPage.VerifySearchContractUsingStartDate();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=17)
	public void contract_VerifySearchContractUsingExpiryDate() throws InterruptedException {		 
		boolean flag = contractPage.VerifySearchContractUsingExpiryDate();
		Assert.assertTrue(flag);
	}	
	@Test(priority=18)
	public void contract_VerifySearchContractUsingCategory() throws InterruptedException {				
		boolean flag = contractPage.VerifySearchContractUsingCategory();
		Assert.assertTrue(flag);
	}
	@Test(priority=19)
	public void contract_VerifySearchContractUsingSupplier() throws InterruptedException {	
		boolean flag = contractPage.VerifySearchContractUsingSupplier();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=20)
	public void contract_VerifySearchContractUsingValue() throws InterruptedException {		
		boolean flag = contractPage.VerifySearchContractUsingValue();
		Assert.assertTrue(flag);
	}
	@Test(priority=21)
	public void contract_VerifySearchContractUsingStakeHolder() throws InterruptedException {	
		boolean flag = contractPage.VerifySearchContractUsingStakeHolder();
		Assert.assertTrue(flag);
	}
	@Test(priority=22)
	public void contract_VerifyContractValidationMsg() throws InterruptedException{		
		boolean flag = contractPage.VerifyContractValidationMsg();
		Assert.assertTrue(flag);
	}
	@Test(priority=23)
	public void contract_VerifyUserNavigationToContractForm() throws InterruptedException{		
		boolean flag = contractPage.VerifyUserNavigationToContractForm();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 24)
	public void contract_VerifySearchContractUsingOwner() throws InterruptedException {
		boolean flag = contractPage.VerifySearchContractUsingOwner();
		Assert.assertTrue(flag);
	}
	@Test(priority=25)
	public void contract_VerifyOneMonthNoticePeriodIsSelectedByDefault() throws InterruptedException{		
		boolean flag = contractPage.VerifyOneMonthNoticePeriodIsSelectedByDefault();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=26)
	public void contract_VerifyUserIsAbleToEditContract() throws InterruptedException{		
		boolean flag = contractPage.VerifyUserIsAbleToEditContract();
		Assert.assertTrue(flag);
	}
			
	@Test(priority=27)
	public void contract_VerifyDisplayOfCategoryInContractForm() throws InterruptedException{		
		boolean flag = contractPage.VerifyDisplayOfCategoryInContractForm();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=28)
	public void contract_VerifyAutoSuggestionForSupplierContact() throws InterruptedException{		
		boolean flag = contractPage.VerifyAutoSuggestionForSupplierContact();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=29)
	public void contract_VerifyAutoSuggestionForStakeHolder() throws InterruptedException{		
		boolean flag = contractPage.VerifyAutoSuggestionForStakeHolder();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=30)
	public void contract_VerifyDisplayOfSupplierContactDetails() throws InterruptedException{		
		boolean flag = contractPage.VerifyDisplayOfSupplierContactDetails();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=31)
	public void contract_VerifyAlertMsgIfHostAddedToSupplierContact() throws InterruptedException{		
		boolean flag = contractPage.VerifyAlertMsgIfHostAddedToSupplierContact();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=32)
	public void contract_VerifyRemovalOfSupplierContact() throws InterruptedException{		
		boolean flag = contractPage.VerifyRemovalOfSupplierContact();
		Assert.assertFalse(flag);
	}
	
	@Test(priority=33)
	public void contract_VerifyAtleastOneValueInSupplierContact() throws InterruptedException{		
		boolean flag = contractPage.VerifyAtleastOneValueInSupplierContact();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=34)
	public void contract_VerifyAlertMsgIfParticipantAddedToStakeHolder() throws InterruptedException{		
		boolean flag = contractPage.VerifyAlertMsgIfParticipantAddedToStakeHolder();
		Assert.assertTrue(flag);
	}

	@Test(priority=35)
	public void contract_VerifyDisplayOfDropbox() throws InterruptedException{		
		boolean flag = contractPage.VerifyDisplayOfDropbox();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=36)
	public void contract_VerifyNoticePeriodChangeAccordingToPeriodSelected() throws InterruptedException{		
		boolean flag = contractPage.VerifyNoticePeriodChangeAccordingToPeriodSelected();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=37)
	public void contract_VerifyDisplayOfExpiryNotiticationLink() throws InterruptedException{		
		boolean flag = contractPage.VerifyDisplayOfExpiryNotiticationLink();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=38)
	public void contract_VerifySupplierAndStakeHolderInRecipientPopup() throws InterruptedException{		
		boolean flag = contractPage.VerifySupplierAndStakeHolderInRecipientPopup();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=39)
	public void contract_VerifyDisplayOfCustomNotiticationLink() throws InterruptedException{		
		boolean flag = contractPage.VerifyDisplayOfCustomNotiticationLink();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=40)
	public void contract_VerifyDisplayOfParentHeirarchyDropdown() throws InterruptedException{		
		boolean flag = contractPage.VerifyDisplayOfParentHeirarchyDropdown();
		Assert.assertTrue(flag);
	}

    @Test(priority=41)
	public void contract_VerifySelectedParentNotDisplayInChildDropdown() throws InterruptedException{		
		boolean flag = contractPage.VerifySelectedParentNotDisplayInChildDropdown();
		Assert.assertTrue(flag);
	}
		
	@Test(priority=42)
	public void contract_VerifyLanguageChange() throws InterruptedException{		
		boolean flag = contractPage.VerifyLanguageChange();
		Assert.assertTrue(flag);
	}
	@Test(priority=43)
	public void contract_VerifyActiveHeadingsDisplayInContractForm() throws InterruptedException{		
		boolean flag = contractPage.VerifyActiveHeadingsDisplayInContractForm();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=44)
	public void contract_VerifyActiveHeadingsDisplayInContractListingPage() throws InterruptedException{		
		boolean flag = contractPage.VerifyActiveHeadingsDisplayInContractListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=45)
	public void contract_VerifyContractListingOnLanguageChange() throws InterruptedException{		
		boolean flag = contractPage.VerifyContractListingOnLanguageChange();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=46)
	public void contract_VerifyCustomFieldDisplayInContractForm() throws InterruptedException{		
		boolean flag = contractPage.VerifyCustomFieldDisplayInContractForm();
		Assert.assertFalse(flag);
	}
	
	@Test(priority=100, enabled= false)
	public void VerifySelectedChildNotDisplayInParentDropdown() throws InterruptedException{		
		boolean flag = contractPage.VerifySelectedChildNotDisplayInParentDropdown();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=101, enabled= false)
	public void VerifyDisplayOfArchivedContracts() throws InterruptedException {
		boolean flag = contractPage.VerifyDisplayOfArchivedContracts();
		Assert.assertTrue(flag);
	}
	
	@AfterClass
	public void Teardown() throws Exception {
	logger.info("*******Contract_test_ ends*******");
    driver.close();
	}

}