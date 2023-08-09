package afsar.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import afsar.Drivers.PageDriver;
import afsar.Utility.CommonMethods;

public class LoginPage extends CommonMethods {

	public void loginPage()
	{
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	@FindBys({
		
		@FindBy(xpath ="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
	})
	WebElement username;
	
	@FindBys({
		
		@FindBy(xpath ="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
	})
	WebElement password;
	
	@FindBys({
		
		@FindBy(xpath ="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")
	})
	WebElement loginBtn;
	
	public void login() throws InterruptedException {
		timeout();
		try {
			if(username.isDisplayed()) { 
				username.sendKeys("Admin");
				timeout();
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	
		try {
			if(password.isDisplayed()) { 
				password.sendKeys("admin123");
				timeout();
				}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
		try {
			if(loginBtn.isDisplayed()) { 
				loginBtn.click();
				timeout();
				}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
}
