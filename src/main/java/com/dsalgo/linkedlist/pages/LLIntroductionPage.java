package com.dsalgo.linkedlist.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class LLIntroductionPage extends TestBase {

	
	
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
	public LLIntroductionPage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyLLIntroductionPageTitle() {
		return driver.getTitle();
	}
	//Actions
	
	public CreatingLLPage llTest() {
		CreatingLL.click();
		return new CreatingLLPage();
	}
	public  TypesofLLPage typesOfLLTest() {
		TypesOfLL.click();
		return new TypesofLLPage();
	}
	
	public ImplementLLPage implemnetTest() {
		implementLL.click();
		return new ImplementLLPage();
	}
	public  TraversalLLPage traverseTest() {
		Traversal.click();
		return new TraversalLLPage();
	}
	
	public  InsertionLLPage insertionTest() {
		Insertion.click();
		return new InsertionLLPage();
	}
	
	public  DeletionLLPage deleteTest() {
		Deletion.click();
		return new DeletionLLPage();
	}
	
	public LLTryEditorPage llTryhereTest() {
		Tryhere.click();
		return new LLTryEditorPage();
	}
	
	public PracticePage practiceQueTest() {
		PracticeQ.click();
		return new PracticePage ();
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
