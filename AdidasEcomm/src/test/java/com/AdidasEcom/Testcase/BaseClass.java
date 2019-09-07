package com.AdidasEcom.Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
public WebDriver driver;

	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/git/Seleniumproject/AdidasEcomm/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://shop4reebok.com/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);	
	}

	
	@AfterClass
	public void tearDown()
	{
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.quit();
		
	}

	

}