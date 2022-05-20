package com.dsalgo.datastructure.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class PortalPage extends TestBase {
	
	
	//page objects
	@FindBy (className="btn")
	WebElement getStartedBtn;
	
	@FindBy(xpath="//div[@class='content']/h1")
	WebElement headingText;
	
	
	public  PortalPage() {
		PageFactory.initElements(driver, this);//here this means current class objects
	}
	
	public String validatePortalPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateheadingText() {
		return headingText.isDisplayed();
	}
	
	public HomePage getStartedBtn() {
		getStartedBtn.click();
		return  new HomePage();
	}

}
