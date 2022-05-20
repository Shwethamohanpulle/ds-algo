package com.dsalgo.linkedlist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class PracticePage extends TestBase{
	
	
	//Page Objects
	@FindBy(xpath=("//div[@class='navbar-nav'][2]/ul/a[3]"))
	WebElement signOut;
	
	
	//initialize objects
		public PracticePage () {
			PageFactory.initElements(driver, this);
		}
	
	//Actions
	public String verifyPracticePageTitle() {
		return driver.getTitle();
	}
	
	public WebElement signOut() {
		return signOut;
	}

}
