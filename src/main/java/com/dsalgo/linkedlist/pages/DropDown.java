package com.dsalgo.linkedlist.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDown {
	WebDriver driver;
	
	public DropDown (WebDriver driver){
	this.driver = driver;
	
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='nav-item dropdown show']/a")
	WebElement dropdown;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/a")
	WebElement dropdown1;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[2]")
	WebElement dropdown2;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[3]")
	WebElement dropdown3;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[4]")
	WebElement dropdown4;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[5]")
	WebElement dropdown5;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[6]")
	WebElement dropdown6;
	
	
	public WebElement dropdown(){
		return dropdown;
	}
	
	public WebElement dropdown1(){
		return dropdown1;
	}

	public WebElement dropdown2(){
		return dropdown2;
	}
	
	public WebElement dropdown3(){
		return dropdown3;
	}
	
	public WebElement dropdown4(){
		return dropdown4;
	}
	
	public WebElement dropdown5(){
		return dropdown5;
	}
	
	public WebElement dropdown6(){
		return dropdown6;
	}
}
