package com.dsalgo.linkedlist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class DeletionLLPage extends TestBase{



	//To Select Topic from Side panel  
	@FindBy(xpath=("//div[@id='content']/li[1]/a"))
	WebElement Introduction;

	@FindBy(xpath=("//div[@id='content']/li[2]/a"))
	WebElement CreatingLL;

	@FindBy(xpath=("//div[@id='content']/li[3]/a"))
	WebElement TypesOfLL;

	@FindBy(xpath=("//div[@id='content']/li[4]/a"))
	WebElement implementLL;

	@FindBy(xpath=("//div[@id='content']/li[5]/a"))
	WebElement Traversal;

	@FindBy(xpath=("//div[@id='content']/li[6]/a"))
	WebElement Insertion;

	@FindBy(xpath=("//div[@id='content']/li[7]/a"))
	WebElement Deletion;

	@FindBy(xpath=("//a[@class='list-group-item list-group-item-light text-info']"))
	WebElement PracticeQ;

	@FindBy(xpath=("//a[@class='btn btn-info']"))
	WebElement Tryhere;
	
	@FindBy(xpath=("//div[@class='navbar-nav'][2]/ul/a[3]"))
	WebElement signOut;
	
	
	

	//initialize objects
	public DeletionLLPage () {
		PageFactory.initElements(driver, this);
	}
	//Actions		
	public String verifyDeletionLLPageTitle() {
		return driver.getTitle();
	}
	public PracticePage QTest() {
		PracticeQ.click();
		return new PracticePage();
	}

	public LLTryEditorPage llTryhereTest() {
		Tryhere.click();
		return new LLTryEditorPage();
	}


	public WebElement Introduction() {
		return Introduction;
	}


	public WebElement CreatingLL () {
		return CreatingLL;
	}


	public WebElement TypesOfLL () {
		return TypesOfLL;
	}

	public WebElement implementLL() {
		return implementLL;
	}

	public WebElement Traversal() {
		return Traversal;
	}

	public WebElement Insertion() {
		return Insertion;
	}

	public WebElement Deletion()  {
		return Deletion;
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
