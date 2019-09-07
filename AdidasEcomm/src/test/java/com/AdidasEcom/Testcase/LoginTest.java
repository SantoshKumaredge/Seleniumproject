package com.AdidasEcom.Testcase;
import org.testng.annotations.Test;
import com.AdidasEcom.PageObject.LoginPage;


public class LoginTest extends BaseClass {	
	
	
	@Test
	
	public void LoginTesthed() {
		//driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.headerLoginLink();
	}
	
	
}


