package com.dsalgo.linkedlist.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class LinkedListPage extends TestBase{
	
	
	
	
	//page objects(Topics covered)

	@FindBy(xpath=("(//a[@class='list-group-item'])[1]"))
	WebElement Topic1;
	
	@FindBy(xpath=("(//a[@class='list-group-item'])[2]"))
	WebElement Topic2;
	
	@FindBy(xpath=("(//a[@class='list-group-item'])[3]"))
	WebElement Topic3;
	
	@FindBy(xpath=("(//a[@class='list-group-item'])[4]"))
	WebElement Topic4;
	
	@FindBy(xpath=("(//a[@class='list-group-item'])[5]"))
	WebElement Topic5;
	
	@FindBy(xpath=("(//a[@class='list-group-item'])[6]"))
	WebElement Topic6;
	
	@FindBy(xpath=("(//a[@class='list-group-item'])[7]"))
	WebElement Topic7;
	
	@FindBy(xpath=("//div[@class='navbar-nav'][2]/ul/a[3]"))
	WebElement signOut;
	
	
	
	
	
	//initialize objects
			public LinkedListPage() {
				PageFactory.initElements(driver, this);
			}
	
	//Actions and methods
	
	public String verifyLinkedListPageTitle() {
		return driver.getTitle();
	}
	public LLIntroductionPage introTest() {
		Topic1.click();
		return new LLIntroductionPage();
	}
	
	
	public WebElement Topic1() {
		return Topic1;
	}
	
	public WebElement Topic2() {
		return Topic2;
	}
	
	public WebElement Topic3() {
		return Topic3;
	}
	
	public WebElement Topic4() {
		return Topic4;
	}
	
	public WebElement Topic5() {
		return Topic5;
	}
	
	public WebElement Topic6() {
		return Topic6;
	}
	
	public WebElement Topic7() {
		return Topic7;
	}
	
	public WebElement signOut() {
		return signOut;
	}
	
	
	
	

	
	
}
