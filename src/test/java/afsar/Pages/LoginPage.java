package afsar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import afsar.drivers.PageDriver;
import afsar.utilities.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage()
	{
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
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
	
	public void login() throws InterruptedException {
		timeout();
		try {
			if(uname.isDisplayed()) { 
				uname.sendKeys("Admin");
				timeout();
			}
			
		} catch (Exception e)
		{
			System.out.println(e);
		}
	
		try {
			if(passwd.isDisplayed()) { 
				passwd.sendKeys("admin123");
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
