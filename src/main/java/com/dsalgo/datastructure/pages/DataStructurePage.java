package com.dsalgo.datastructure.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class DataStructurePage extends TestBase {
	
	//pageObjects
	
	@FindBy(xpath=("//div[@class='navbar-nav'][2]/ul/a[3]"))
	WebElement signOut;
	
	
	@FindBy(xpath=("//a[@class='list-group-item']"))
	WebElement link;
	
	//objects initialization by creating constructor

public 	DataStructurePage () {
	PageFactory.initElements(driver, this);
}


public String validatepageTitle() {
	return driver.getTitle();
}


public FirstLink clickonlinkTest() {
	link.click();
	return new FirstLink();
}
}
