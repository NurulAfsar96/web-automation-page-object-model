package afsar.Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	WebDriver driver = null;
	public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@BeforeSuite
	public void start()
	{
		String browser = System.getProperty("browser","chrome");
		
		if(browser.contains("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if(browser.contains("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		PageDriver.getInstance().setDriver(driver);
	}
	@AfterSuite
	public void close() 
	{ 
		//driver.close();
		//driver.quit(); 
		PageDriver.getCurrentDriver().quit();
	
	}

}