package afsar.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import afsar.Drivers.BaseDriver;
import afsar.Drivers.PageDriver;
import afsar.Pages.LoginPage;

public class LoginTest extends BaseDriver{
	
	// "URL" always keep in base driver as static variable;
	
	//Open URL and maximize window----
	@BeforeClass
	public void openUrl() {
		
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
	}
	@Test(priority = 0)
	public void loginTest() throws InterruptedException {
		LoginPage loginpage = new LoginPage();
		loginpage.login();
	}

}
