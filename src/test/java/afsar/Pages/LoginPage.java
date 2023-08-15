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

public class LoginPage extends CommonMethods {
	ExtentTest test;
	public LoginPage(ExtentTest test)
	{
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	@FindBys({
		@FindBy(name="username"),
		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
	})
	WebElement uname;
	
	@FindBys({
		@FindBy(name="password"),
		@FindBy(xpath ="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
	})
	WebElement passwd;
	
	@FindBys({
		@FindBy(tagName="button"),
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]"),
		@FindBy(xpath ="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")
	})
	WebElement loginBtn;
	
	
	public void login(String username, String password) throws InterruptedException, IOException {
		timeout();
		try {
			if(uname.isDisplayed()) { 
				uname.sendKeys(username);
				timeout();
			}
			
		} catch (Exception e)
		{
			test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Username is not locateable.Please check the error message.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "usernameLocator");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "usernameLocator.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(uname.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	
		try {
			if(passwd.isDisplayed()) { 
				passwd.sendKeys(password);
				timeout();
				}
			
		}
		catch (Exception e)
		{
			test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Password is not locateable.Please check the error message.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "passwordLocator");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "passwordLocator.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(passwd.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
			
		try {
			if(loginBtn.isDisplayed()) { 
				loginBtn.click();
				timeout();
				test.pass("<p style=\"color:#1ccc0c; font-size:13px\"><b>Successfully Login.</b></p>");
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "LoginPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LoginPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			
		}
		catch (Exception e)
		{
			test.fail("<p style=\"color:#fa3c3c; font-size:13px\"><b>LoginButton is not locateable.Please check the error message.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "LoginButtonLocator");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LoginButtonLocator.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(loginBtn.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
}
