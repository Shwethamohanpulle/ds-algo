package com.dsalgo.linkedlist.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	//objects
	@FindBy(xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div/div/div/a")
	WebElement DataStructureModule;
	
	@FindBy(xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[2]/div/div/a")
	WebElement ArrayModule;
	
	@FindBy(xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[3]/div/div/a")
	WebElement LinkedListModule;
	
	@FindBy(xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[4]/div/div/a")
	WebElement StackModule;
	
	@FindBy(xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[5]/div/div/a")
	WebElement QueueModule;
	
	@FindBy(xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[6]/div/div/a")
	WebElement TreeModule;
	
	@FindBy(xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[7]/div/div/a")
	WebElement GraphModule;
	
	@FindBy(xpath="//div[@class='navbar-nav']/ul/a[2]")
	WebElement RegisterOption;
	
	@FindBy(xpath="//div[@class='navbar-nav']/ul/a[3]")
	WebElement signinOption;
	
	//initialize objects
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
	
	//actions
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	
	public RegisterPage RegisterOptionTest() {
		RegisterOption.click();
		return new RegisterPage();
	}
	public LoginPage signinOptionTest() {
		signinOption.click();
		return new LoginPage();
	}
	
	
	public LinkedListPage llPageTest() {
		LinkedListModule.click();
		return new LinkedListPage();
	}
	
	
	public WebElement DataStructureModule(){
		return DataStructureModule;
	}
	
	public WebElement ArrayModule(){
		return ArrayModule;
	}
	
	public WebElement LinkedListModule (){
		return LinkedListModule;
	}
	
	public WebElement  StackModule (){
		return  StackModule;
	}
	
	public WebElement QueueModule(){
		return QueueModule;
	}

	public WebElement TreeModule(){
		return TreeModule;
	}

	public WebElement GraphModule (){
		return GraphModule;
	}



	public WebElement signinOption(){
		return signinOption;
	}
	

}
