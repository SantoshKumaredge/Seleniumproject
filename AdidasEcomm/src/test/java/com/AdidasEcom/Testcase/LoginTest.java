package com.AdidasEcom.Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.AdidasEcom.PageObject.LoginPage;

public class LoginTest {

	public String baseURL = "https://shop.adidas.co.in/";
	
	 WebDriver driver;
	
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/git/Seleniumproject/AdidasEcomm/Drivers/chromedriver.exe");
	
		driver = new ChromeDriver();
		
	}
	
	
	@Test
	
	public void LoginTesthed() {
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.headerLoginLink();
	}
	
	@AfterClass
	
	public void tearDown()
	{
		driver.quit();
	}
}


