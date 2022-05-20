package com.dsalgo.linkedlist.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class LLTryEditorPage extends TestBase{



	@FindBy(xpath=("//form[@id='answer_form']/div/div/div/textarea"))
	WebElement textArea;

	@FindBy(xpath=("//button[@type='button']"))
	WebElement runBtn;

	@FindBy(xpath=("//pre[@id = 'output']"))
	WebElement outputMsg;


	//initialize objects
	public LLTryEditorPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyLLTryEditorPageTitle() {
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
