package com.dsalgo.linkedlist.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class MainpPage  extends TestBase{


	//page objects
	@FindBy (className="btn")
	WebElement getStartedBtn;

	@FindBy (xpath="//div[@class='navbar-nav']/ul/a[3]")
	WebElement SigninBtn;



	//creating constructor to initialize page objects(webElements)
	public MainpPage () {
		PageFactory.initElements(driver, this);
	}


	//create methods to perform Actions
	public String validateMainPageTitle() {
		return driver.getTitle();
	}



	public HomePage getStartedBtnTest() {
		getStartedBtn.click();
		return new HomePage();
	}



	public WebElement SigninBtn()
	{
		return SigninBtn;

	}



}
