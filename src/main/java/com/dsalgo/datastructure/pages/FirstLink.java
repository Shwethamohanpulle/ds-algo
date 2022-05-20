package com.dsalgo.datastructure.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class FirstLink extends TestBase {
	
	//objects
	@FindBy(xpath=("//a[@class='list-group-item']"))
	WebElement link;
	
	@FindBy(xpath=("//a[@class='list-group-item list-group-item-light text-info']"))
	WebElement PracticeQ;
	
	@FindBy(xpath=("//a[@class='btn btn-info']"))
	WebElement Tryhere;
	
	@FindBy(xpath=("//div[@class='navbar-nav'][2]/ul/a[3]"))
	WebElement signOut;
	
	
	//create constructor to initialize objects
	public FirstLink() {
		PageFactory.initElements(driver,this);
	}
	
	
	public String validatepageTitle() {
		return driver.getTitle();
	}
	
	public TryEditorPage clickonTryhere() {
		Tryhere.click();
		return new TryEditorPage();
	}
	
	
	public PracticeQuestionPage clickonquestion() {
		PracticeQ.click();
		return  new  PracticeQuestionPage();
	}

}
