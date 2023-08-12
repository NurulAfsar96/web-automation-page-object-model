package afsar.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import afsar.drivers.BaseDriver;
import afsar.pages.DashBoardPage;
import afsar.utilities.ExtentFactory;

public class DashBoardTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	 
	@Test(priority = 0)
	public void DashboardTest() throws InterruptedException, IOException {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>ORANGE HRM</b></p>").assignAuthor("Nurul Afsar").assignDevice("Windows");
		childTest = parentTest.createNode("<p style=\"color:#05a16a; font-size:20px\"><b>DASHBOARD TEST</b></p>");
		DashBoardPage dashpage = new DashBoardPage(childTest);
		dashpage.checkDash();
		dashpage.clickAdmin();
		dashpage.clickPIM();
	}
	//------ For pushing report to the folder.
	@AfterClass
	public void afterClass() {
		report.flush();
	}
	

}
