package com.dsalgo.datastructure.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class TryEditorPage extends TestBase {
	
	//objects	
	@FindBy(xpath=("//form[@id='answer_form']/div/div/div/textarea"))
	WebElement textArea;

	@FindBy(xpath=("//button[@type='button']"))
	WebElement runBtn;

	@FindBy(xpath=("//pre[@id = 'output']"))
	WebElement outputMsg;


	//initialize objects
	public TryEditorPage() {
		PageFactory.initElements(driver, this);
	}
     //Actions
	public String verifyTryEditorPageTitle() {
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
