package afsar.Utility;

import afsar.Drivers.BaseDriver;

public class CommonMethods extends BaseDriver {

	
	public static void timeout() throws InterruptedException {
		
		Thread.sleep(5000);
	}
	public static void timeout(int time) throws InterruptedException {
		
		Thread.sleep(time);
	}
}
