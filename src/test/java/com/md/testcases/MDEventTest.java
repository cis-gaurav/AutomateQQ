//package com.md.testcases;
//
//import java.net.MalformedURLException;
//
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import com.md.base.TestBase;
//import com.md.pages.MDEventPage;
//import com.md.pages.QuickQuotesPage;
//import com.md.utils.TestUtils;
//
//public class MDEventTest extends TestBase {
//	MDEventPage MDEventPage;
//	TestUtils TestUtils;
//	QuickQuotesPage QuickQuotesPage;
//
///////Need to create constructor super keyword will initialize  properties file
//	public MDEventTest() {
//		super();
//	}
//
//	@BeforeMethod
//	public void setUp() throws MalformedURLException, InterruptedException {
//		initializationAndLogin(); // Logged in and Redirect to MD Dashboard page
//		MDEventPage = new MDEventPage();// Need to create object of class if need to use
//		TestUtils = new TestUtils();// Need to create object of class if need to use
//		QuickQuotesPage = new QuickQuotesPage();// Need to create object of class if need to use
//		TestUtils.redirectToSandpitfromMDdashbaord(); // Redirect from Dashboard to Sandpit
//		System.out.println("Done before method");
////		Thread.sleep(3000);
//	}
//
//	@Test(priority = 1)
//	public void md_PQQ() throws InterruptedException {
//		MDEventPage.PQQ();
////		Assert.assertTrue(flag);
//		System.out.println("P0");
//	}
//
////	@Test(priority = 2)
////	public void hello() throws InterruptedException {
////		System.out.println("Inside @test");
////		MDEventPage.test1();
////	}
//
//	@AfterMethod
//	public void tearDown() throws InterruptedException {
//		TestUtils.leaveSandpit();
//		TestUtils.Logout();
//		driver.close();
//		driver.quit();
//	}
//
//}
