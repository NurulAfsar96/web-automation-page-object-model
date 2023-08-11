package afsar.tests;

import org.testng.annotations.Test;

import afsar.drivers.BaseDriver;
import afsar.pages.DashBoardPage;

public class DashBoardTest extends BaseDriver{
	 
	@Test(priority = 0)
	public void DashboardTest() throws InterruptedException {
		DashBoardPage dashpage = new DashBoardPage();
		dashpage.checkDash();
		//dashpage.clickAdmin();
		dashpage.clickPIM();
	}
	

}
