package com.AdidasEcom.Testcase;
import org.testng.annotations.Test;
import com.AdidasEcom.PageObject.HomePage;



public class HomePageTest extends BaseClass{
	
	
	@Test
	
	public void logotest() {
		
		HomePage hp = new HomePage(driver);
		
		hp.Showlogo();
	}
	
 
@Test(priority = 2)
	
	public void headmentest() {
		
		HomePage hp = new HomePage(driver);
		
		hp.hmen();
	}

@Test(priority = 3)
public void headwomentest() {
	
	HomePage hp = new HomePage(driver);
	
	hp.hwomen();
	}

@Test(priority = 4)
public void headkidstest() {
	
	HomePage hp = new HomePage(driver);
	
	hp.hkid();
}

@Test(priority = 5)
public void headfittest() {
	
	HomePage hp = new HomePage(driver);
	
	hp.hfts();
}

@Test(priority = 6)
public void headClasstest() {
	
	HomePage hp = new HomePage(driver);
	
	hp.hcls();
}

@Test(priority = 7)
public void headouttest() {
	
	HomePage hp = new HomePage(driver);
	
	hp.hout();
}
}
