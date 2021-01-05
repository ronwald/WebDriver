package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;



import Utilities.BasicExtenReport;

public class TMS_LoginToDP extends BasicExtenReport {

String updateFromLap = "update From Laptop Jan 5 2021";
	
	
	
	@Test(priority = 0)
	public void TestLoginToDP() {
		
		test = extent.createTest("TESTCASE 1 : Test Successful Login to DP - Staging");
		
		//Initialization
		System.setProperty("webdriver.chrome.driver","C:/Chrome Driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://dp-stag.urbanfox.asia/";
		
		
		//start test
		
		driver.get(baseURL);
		test.log(Status.PASS, "STEP 1 : User is navigated to : " + baseURL);
		Wait();
		PageObjects.DP_Staging_Main_Page.Login(driver).click();
		Wait();
		
		//verify that dp portal page is displayed
		if(driver.getTitle().contains("Urbanfox")) {
			test.log(Status.PASS, "Urbanfox DP Page is displayed");		
		}
		else {
			test.log(Status.FAIL, "Urbanfox DP Page is NOT displayed");
			try {
				takeScreenshot(driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		driver.quit();
		
	}
	
	
	@Test(priority = 1)
	public void TestGooglePage() {
		
		test = extent.createTest("TESTCASE 2 : Test Successful Navigation to Google page");
		
		//Initialization
		System.setProperty("webdriver.chrome.driver","C:/Chrome Driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.google.com/";
		
		
		//start test
		
		driver.get(baseURL);
		test.log(Status.PASS, "STEP 1 : User is navigated to : " + baseURL);
		Wait();

		
		//verify that dp portal page is displayed
		if(driver.getTitle().contains("Googlessss")) {
			test.log(Status.PASS, "Google Page is displayed");		
		}
		else {
			test.log(Status.FAIL, "Google Page is NOT displayed");
			try {
				takeScreenshot(driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		driver.quit();
		
	}

	

}
