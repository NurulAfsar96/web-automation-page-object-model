package afsar.Drivers;

import org.openqa.selenium.WebDriver;

public class PageDriver {
	
	public static final ThreadLocal<WebDriver> webdriver = new ThreadLocal<WebDriver>();
	public static PageDriver instance = null;
	
	private PageDriver() {}     //constructor
	
	public static PageDriver getInstance()
	{
		if(instance == null) { instance = new PageDriver(); }
		return instance;	
	}
	
	
	public WebDriver getDriver()
	{
		return webdriver.get();
	}
	
	public void setDriver(WebDriver driver)
	{
		webdriver.set(driver);
	}
	
	public static WebDriver getCurrentDriver() 
	{
		return getInstance().getDriver();
	}

}
