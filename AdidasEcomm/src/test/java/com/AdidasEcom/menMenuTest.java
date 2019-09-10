package com.AdidasEcom.Testcase;

import org.testng.annotations.Test;

import com.AdidasEcom.PageObject.menMenuPage;


public class menMenuTest extends BaseClass {
	
	
	
	@Test(priority = 1)
	
	public void TraningLinkTestFromMenMenu() {
		
		menMenuPage hp = new menMenuPage(driver);
		
		hp.hmenuMen();
		
		
	}
	

	@Test(priority = 2)
	
	public void Displaying_List_Men_Footware() {
		
		menMenuPage hp = new menMenuPage(driver);
		
		hp.listofItemsMenFootware();
			
	}
	
@Test(priority = 3)
	
	public void Displaying_List_Men_Clothing() {
		
		menMenuPage hp = new menMenuPage(driver);
		
		hp.listofItemsMenClothing();
			
	}
	
@Test(priority = 4)

public void Displaying_List_Men_Accessories() {
	
	menMenuPage hp = new menMenuPage(driver);
	
	hp.listofItemsMenAccessories();
		
}
	
@Test(priority = 5)

public void Displaying_List_Men_Fitness() {
	
	menMenuPage hp = new menMenuPage(driver);
	
	hp.listofItemsMenFitness();
		
}
}
