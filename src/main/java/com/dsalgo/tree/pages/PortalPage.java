package com.dsalgo.tree.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;



public class PortalPage {
WebDriver driver;
	
	public PortalPage(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver,this);
	}
	
	
	

		//page objects
		@FindBy (className="btn")
		WebElement getStartedBtn;
		
		
		@Step("getting portal page title step...")
		public String validatePortalPageTitle() {
			return driver.getTitle();
		}
		
		public WebElement getStartedBtn() {
			return getStartedBtn;
			
			
		}


}
