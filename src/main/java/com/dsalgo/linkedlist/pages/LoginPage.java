package com.dsalgo.linkedlist.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//objects
	@FindBy (xpath="//form[@method='post']/input[@id='id_username']")
	WebElement username ;
	
	@FindBy (xpath="//form[@method='post']/input[@id='id_password']")
	WebElement password;
	
	@FindBy (css="input[value='Login']")
	WebElement loginBtn;
	
	@FindBy (xpath="//a[text()='Register!']")
	WebElement registerText;
	
	
	//Initialize Objects
	
	public LoginPage() {
	PageFactory.initElements(driver, this);
}


  // Actions
public String validateLoginPageTitle() {
	return driver.getTitle();
}

public HomePage login(String un, String pwd) {
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginBtn.click();
	return new HomePage();
}



public RegisterPage registerTextTest() {
	registerText.click();
	return new RegisterPage();
}
	
public WebElement username() {
	return username;
}
		
public WebElement password() {
	return password ;
}

public WebElement loginBtn(){
return 	loginBtn;
}

}
