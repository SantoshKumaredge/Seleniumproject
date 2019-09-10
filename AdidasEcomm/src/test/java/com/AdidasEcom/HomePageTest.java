package com.AdidasEcom.Testcase;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.AdidasEcom.PageObject.HomePage;



public class HomePageTest extends BaseClass{
	
	@Test(priority = 1)
	
	public void logotest() {
		
		HomePage hp = new HomePage(driver);
		
		hp.Showlogo();
		
		
	}
	
 
	@Test(priority = 2)
	
	public void headerMenuTest() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		
		hp.hmen();
		
		driver.manage().timeouts().implicitlyWait(90000,TimeUnit.SECONDS);
		 
		hp.hwomen();
		
		driver.manage().timeouts().implicitlyWait(90000,TimeUnit.SECONDS);
		
		hp.hkid();
		
		driver.manage().timeouts().implicitlyWait(900000,TimeUnit.SECONDS);
		
		hp.hfts();
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(90000,TimeUnit.SECONDS);
		hp.hcls();
		driver.manage().timeouts().implicitlyWait(90000,TimeUnit.SECONDS);
		
		hp.hout();
		driver.manage().timeouts().implicitlyWait(90000,TimeUnit.SECONDS);
	}

	@Test(priority = 3)

	public void hpageelements() 
	{
		HomePage hp = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(90000,TimeUnit.SECONDS);
		hp.hcartbt();
	
		driver.manage().timeouts().implicitlyWait(90000,TimeUnit.SECONDS);
	
		driver.manage().timeouts().implicitlyWait(90000,TimeUnit.SECONDS);
		hp.hloginbt();
	
		driver.manage().timeouts().implicitlyWait(90000,TimeUnit.SECONDS);
	
		hp.hsingupbt();
	}


}
