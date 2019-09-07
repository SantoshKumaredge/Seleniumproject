package com.AdidasEcom.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver ldriver;
		
		public HomePage (WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
		
		@FindBy(how=How.XPATH,using="//div[@id='logo']//a//img")
		@CacheLookup
		WebElement logo;
		
		@FindBy(how=How.XPATH,using = "//span[text()='MEN']")
		@CacheLookup
		WebElement headerMen;
		
		@FindBy(how = How.XPATH, using ="//span[text()='WOMEN']")
		WebElement headerWomen;
		
		@FindBy(how = How.XPATH, using ="//span[text()='KIDS']")
		WebElement headerkids;
		
		@FindBy(how = How.XPATH, using ="//span[text()='FITNESS']")
		WebElement headderFitness;
		
		@FindBy(how = How.XPATH, using ="//span[text()='CLASSICS']")
		WebElement headderClassics;
		
		@FindBy(how = How.XPATH, using ="//span[text()='OUTLET']")
		WebElement headderOutlet;
		
		
		public void Showlogo() {
				
		System.out.println("Reebok Logo is Displaid(true/False)");
		System.out.println(logo.isDisplayed());
		
		}
		
		public void hmen()
		{
			headerMen.click();
		}
		
		public void hwomen()
		{
			headerWomen.click();
		}
		
		public void hkid()
		{
			headerkids.click();
		}
		
		public void hfts()
		{
			headderFitness.click();
		}
		
		public void hcls()
		{
			headderClassics.click();
		}
		
		
		public void hout()
		{
			headderOutlet.click();
		}
		
}
