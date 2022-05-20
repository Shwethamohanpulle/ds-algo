package com.dsalgo.datastructure.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class PracticeQuestionPage extends TestBase{
	//objects
	@FindBy(xpath=("//div[@class='navbar-nav'][2]/ul/a[3]"))
	WebElement signOut;
	
	//constructor
	public PracticeQuestionPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public HomePage clickonsignOut() {
		signOut.click();
		return new HomePage();
	}

}
