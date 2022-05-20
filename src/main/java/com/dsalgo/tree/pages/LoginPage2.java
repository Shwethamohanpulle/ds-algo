package com.dsalgo.tree.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

import io.qameta.allure.Step;



public class LoginPage2 extends TestBase{
	
WebDriver driver;
	
	public LoginPage2(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver,this);
	}
	
	
	//objects
	@FindBy (xpath="//form[@method='post']/input[@id='id_username']")
	WebElement username ;
	
	@FindBy (xpath="//form[@method='post']/input[@id='id_password']")
	WebElement password;
	
	@FindBy (css="input[value='Login']")
	WebElement loginBtn;
	
	@FindBy (xpath="//div[@class='alert alert-primary']")
	WebElement errorText;
	
	
	@FindBy (xpath="//a[text()='Register!']")
	WebElement registerText;
	
	
	  // Actions
	@Step("getting login page title")
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	@Step("getting error text")
	public String validateText() {
		return errorText.getText();
	
	}

@Step("login with username: {0} and password: {1} step...")
	public WebElement login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return loginBtn;
	}
	
	

	public WebElement username() {
		return username;
	}
	
	public WebElement password() {
		return password;
	}
	

	public WebElement loginBtn() {
		return loginBtn;
	}

}
