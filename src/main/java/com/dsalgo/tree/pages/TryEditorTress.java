package com.dsalgo.tree.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryEditorTress {
	
	WebDriver driver;
	
	
	//Constructor to initialize objects
	public TryEditorTress (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	//Page Objects
	@FindBy(xpath=("//form[@id='answer_form']/div/div/div/textarea"))
	WebElement textArea;

	@FindBy(xpath=("//button[@type='button']"))
	WebElement runBtn;

	@FindBy(xpath=("//pre[@id = 'output']"))
	WebElement outputMsg;
	
	
//Actions
	public String verifyTryEditorTressPageTitle() {
		return driver.getTitle();
	}

	public String runCode( String code) {

		textArea.sendKeys(code);
		runBtn.click();
		String msg = outputMsg.getText();
		return msg;

	}


	public WebElement textArea() {
		return textArea;
	}


	public WebElement runBtn() {
		return runBtn ;
	}


}
