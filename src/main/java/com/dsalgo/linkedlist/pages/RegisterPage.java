package com.dsalgo.linkedlist.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class RegisterPage extends TestBase{

	//page objects
	@FindBy (name="username")
	WebElement usrName;

	@FindBy (id="id_password1")
	WebElement passwd;

	@FindBy (id="id_password2")
	WebElement passwdcofirm ;


	@FindBy (css="input[value='Register']")
	WebElement Registerbutton;



	//initialize objects
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	//create methods to perform Actions
	public String validateRegisterPageTitle() {
		return driver.getTitle();
	}

	public HomePage registrationTest() {
		Registerbutton.click();
		return new HomePage();
	}

	public WebElement usrName()
	{
		return usrName;	
	}

	public WebElement passwd()
	{
		return passwd;
	}

	public WebElement passwdcofirm ()
	{
		return passwdcofirm;	
	}

	public WebElement Registerbutton()
	{
		return Registerbutton;	
	}


}
