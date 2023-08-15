package afsar.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import afsar.drivers.PageDriver;
import afsar.utilities.CommonMethods;
import afsar.utilities.GetScreenshot;

public class DashBoardPage extends CommonMethods{
	ExtentTest test;
	public DashBoardPage(ExtentTest test) 
	{
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	//----------------------- Locators ----------------------------------------
	@FindBys({
		
	
		@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	})
	WebElement adminOption;
	
	@FindBys({
		@FindBy(xpath="//header/div[1]/div[1]/span[1]/h6[1]")
	})
	WebElement dashText;
	
	@FindBys({
		@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	})
	WebElement pimOption;
	
	//--------------------------------Methods-------------------------------------
	public void checkDash() throws IOException
	{
		try {
			if(dashText.isDisplayed()) {
				Assert.assertEquals(dashText.getText(), "Dashboard");
				timeout();

			}
		}
		catch (Exception e) 
		{
			test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Dashboard Text is not locateable.Please check the error message.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "DashBoardTextLocator");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "DashBoardTextLocator.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(dashText.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}	
	}
	
	public void clickAdmin() throws IOException
	{
		try {
			if(adminOption.isDisplayed()) {
				adminOption.click();
				timeout();
				test.pass("<p style=\"color:#1ccc0c; font-size:13px\"><b>Successfully Clicked on Admin.</b></p>");
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "ClickAdminPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickAdminPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch (Exception e) 
		{
			test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>AdminClick is not locateable.Please check the error message.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "ClickAdminLocator");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickAdminLocator.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(adminOption.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			
		}
			
		}

		public void clickPIM() throws IOException
		{
			try {
				if(pimOption.isDisplayed()) 
				{
					pimOption.click();
					timeout(5000);
					test.pass("<p style=\"color:#1ccc0c; font-size:13px\"><b>Successfully Clicked on PIM.</b></p>");
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "ClickPIMPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickPIMPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			}
			catch (Exception e) 
			{
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>PIM Click is not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "PIMClickLocator");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PIMClickLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(pimOption.isDisplayed());
				PageDriver.getCurrentDriver().quit();
				
			}
	}
	
}
