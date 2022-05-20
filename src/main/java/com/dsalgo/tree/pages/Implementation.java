package com.dsalgo.tree.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Implementation {
	
	WebDriver driver;
	
	public  Implementation  (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		}
	

	//To Select Topic from Side panel  
	@FindBy(xpath=("//div[@id='content']/li[1]/a"))
	WebElement link1;
	
	@FindBy(xpath=("//div[@id='content']/li[2]/a"))
	WebElement link2;
	
	@FindBy(xpath=("//div[@id='content']/li[3]/a"))
	WebElement link3;
	
	@FindBy(xpath=("//div[@id='content']/li[4]/a"))
	WebElement link4;
	
	@FindBy(xpath=("//div[@id='content']/li[5]/a"))
	WebElement link5;
	
	@FindBy(xpath=("//div[@id='content']/li[6]/a"))
	WebElement link6;
	
	@FindBy(xpath=("//div[@id='content']/li[7]/a"))
	WebElement link7;
	
	@FindBy(xpath=("//div[@id='content']/li[8]/a"))
	WebElement link8;
	
	@FindBy(xpath=("//div[@id='content']/li[9]/a"))
	WebElement link9;
	
	@FindBy(xpath=("//div[@id='content']/li[10]/a"))
	WebElement link10;
	
	@FindBy(xpath=("//div[@id='content']/li[11]/a"))
	WebElement link11;
	
	@FindBy(xpath=("//div[@id='content']/li[12]/a"))
	WebElement link12;
	
	@FindBy(xpath=("//div[@id='content']/li[13]/a"))
	WebElement link13;
	
	@FindBy(xpath=("//a[@class='list-group-item list-group-item-light text-info']"))
	WebElement PracticeQ;
	
	@FindBy(xpath=("//a[@class='btn btn-info']"))
	WebElement Tryhere;
	
	@FindBy(xpath=("//div[@class='navbar-nav'][2]/ul/a[3]"))
	WebElement signOut;
	
	
	//Actions
	
	
	public String verifImplementationressTitle() {
		return driver.getTitle();
	}
	
	
	public WebElement link1() {
		return link1;
	}
	
	public WebElement link2() {
		return link2;
	}
	
	public WebElement link3() {
		return link3;
	}
	
	public WebElement link4() {
		return link4;
	}
	
	public WebElement link5() {
		return link5;
	}
	
	public WebElement link6() {
		return link6;
	}
	
	public WebElement link7() {
		return link7;
	}
	
	
	public WebElement link8() {
		return link8;
	}
	
	public WebElement link9() {
		return link9;
	}
	
	public WebElement link10() {
		return link10;
	}
	
	public WebElement link11() {
		return link11;
	}
	
	public WebElement link12() {
		return link12;
	}
	
	public WebElement link13() {
		return link13;
	}

	
	
	public WebElement PracticeQ ()  {
		return PracticeQ;
	}
	
	public WebElement Tryhere() {
		return Tryhere;
	}
	
	public WebElement signOut() {
		return signOut;
	}

}
