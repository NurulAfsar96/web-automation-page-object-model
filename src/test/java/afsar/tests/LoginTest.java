package afsar.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import afsar.drivers.BaseDriver;
import afsar.drivers.PageDriver;
import afsar.pages.LoginPage;

public class LoginTest extends BaseDriver {
	
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
