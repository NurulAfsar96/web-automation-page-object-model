package afsar.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import afsar.drivers.BaseDriver;
import afsar.drivers.PageDriver;
import afsar.pages.LoginPage;
import afsar.utilities.ExtentFactory;

public class LoginTest extends BaseDriver {
	
	// "URL" always keep in base driver as static variable;
	//Open URL and maximize window----
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	@BeforeClass
	public void openUrl() {
		
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>ORANGE HRM</b></p>").assignAuthor("Nurul Afsar").assignDevice("Windows");
	}
	@Test(priority = 0)
	public void loginTest() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#05a16a; font-size:20px\"><b>LOGIN TEST</b></p>");
		LoginPage loginpage = new LoginPage(childTest);
		loginpage.login();
	}
	//------ For pushing report to the folder.
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
