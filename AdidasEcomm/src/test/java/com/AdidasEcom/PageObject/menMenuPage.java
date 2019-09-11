package com.AdidasEcom.PageObject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class menMenuPage {

public WebDriver ldriver;
	
	public menMenuPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using = "//span[text()='MEN']")
	@CacheLookup
	WebElement headerMenMenu;
	
	//@FindBys(@FindBy(how=How.XPATH,using="//div[@id='header']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//ul[1]//li[1]//a["+	i+"]")) 
	//List<WebElement> MenmenulistCount = ldriver.findElements(By.xpath("//div[@id='header']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//ul[1]//li[1]//a"));
	
	
	public void hmenuMen() {
	
		Actions action = new Actions(ldriver);
		
		action.moveToElement(headerMenMenu).build().perform();
		
		ldriver.findElement(By.xpath(" //div[@id='header']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//ul[1]//li[1]//a[1]")).click();
		
	}
	
	public void listofItemsMenFootware() {
		List<WebElement> MenmenulistCount = ldriver.findElements(By.xpath("//div[@id='header']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//ul[1]//li"));
		
		for(int i =0; i<MenmenulistCount.size();i++) {
			String elemtTxt = MenmenulistCount.get(i).getText();
			System.out.println(elemtTxt);
	
		}System.out.println( );
		}
	
	public void listofItemsMenClothing() {
		List<WebElement> MenmenulistCount = ldriver.findElements(By.xpath("//div[@id='header']//div[2]//div[1]//div[1]//div[1]//div[1]//div[2]//ul[1]//li"));
		
		for(int i =0; i<MenmenulistCount.size();i++) {
			String elemtTxt = MenmenulistCount.get(i).getText();
			System.out.println(elemtTxt);
	
		}System.out.println( );
	}
		
		public void listofItemsMenAccessories() {
			List<WebElement> MenmenulistCount = ldriver.findElements(By.xpath("//div[@id='header']//div[2]//div[1]//div[1]//div[1]//div[1]//div[3]//ul[1]//li"));
			
			for(int i =0; i<MenmenulistCount.size();i++) {
				String elemtTxt = MenmenulistCount.get(i).getText();
				System.out.println(elemtTxt);
			}
			System.out.println( );
		}
		
			
			public void listofItemsMenFitness() {
				List<WebElement> MenmenulistCount = ldriver.findElements(By.xpath("//div[@id='header']//div[2]//div[1]//div[1]//div[1]//div[1]//div[4]//ul[1]//li"));
				
				for(int i =0; i<MenmenulistCount.size();i++) {
					String elemtTxt = MenmenulistCount.get(i).getText();
					System.out.println(elemtTxt);
			
				}System.out.println( );
		
	}
	
	
	
	
}
