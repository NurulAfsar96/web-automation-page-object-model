package afsar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import afsar.drivers.PageDriver;
import afsar.utilities.CommonMethods;

public class DashBoardPage extends CommonMethods{
	
	public DashBoardPage() 
	{
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	@FindBys({
		
	
		@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	})
	WebElement adminOption;
	
	@FindBys({
		@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	})
	WebElement pimOption;
	
	public void clickAdmin()
	{
		try {
			if(adminOption.isDisplayed()) {
				adminOption.click();
				timeout();
			}
		}
		catch (Exception e) {
			System.out.println(e);}
			
		}
		
		public void clickPIM()
		{
			try {
				if(pimOption.isDisplayed()) {
					pimOption.click();
					timeout();
				}
			}
			catch (Exception e) {
				System.out.println(e);
				
			}
	}
	
}
