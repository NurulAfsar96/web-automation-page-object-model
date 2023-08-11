package afsar.TestCases;

import org.testng.annotations.Test;

import afsar.Drivers.BaseDriver;
import afsar.Pages.DashBoardPage;

public class DashBoardTest extends BaseDriver{
	 
	@Test(priority = 0)
	public void DashboardTest() throws InterruptedException {
		DashBoardPage dashpage = new DashBoardPage();
		//dashpage.clickAdmin();
		dashpage.clickPIM();
	}
	

}
