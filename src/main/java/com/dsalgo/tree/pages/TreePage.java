package com.dsalgo.tree.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

import io.qameta.allure.Step;



public class TreePage extends TestBase {
	
WebDriver driver;
	
	public TreePage(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver,this);
	}
	
	
		
		//page objects(Topics covered)

		@FindBy(xpath=("(//a[@class='list-group-item'])[1]"))
		WebElement link1;
		
		@FindBy(xpath=("(//a[@class='list-group-item'])[2]"))
		WebElement link2;
		
		@FindBy(xpath=("(//a[@class='list-group-item'])[3]"))
		WebElement link3;
		
		@FindBy(xpath=("(//a[@class='list-group-item'])[4]"))
		WebElement link4;
		
		@FindBy(xpath=("(//a[@class='list-group-item'])[5]"))
		WebElement link5;
		
		@FindBy(xpath=("(//a[@class='list-group-item'])[6]"))
		WebElement link6;
		
		@FindBy(xpath=("(//a[@class='list-group-item'])[7]"))
		WebElement link7;
		
		@FindBy(xpath=("(//a[@class='list-group-item'])[8]"))
		WebElement link8;
		
		@FindBy(xpath=("(//a[@class='list-group-item'])[9]"))
		WebElement link9;
		
		@FindBy(xpath=("(//a[@class='list-group-item'])[10]"))
		WebElement link10;
		
		@FindBy(xpath=("(//a[@class='list-group-item'])[11]"))
		WebElement link11;
		
		@FindBy(xpath=("(//a[@class='list-group-item'])[12]"))
		WebElement link12;
		
		@FindBy(xpath=("(//a[@class='list-group-item'])[13]"))
		WebElement link13;
		
		@FindBy(xpath=("//div[@class='navbar-nav'][2]/ul/a[3]"))
		WebElement signOut;
		
		
		//Actions
		
		@Step("getting tree page title step...")
		public String verifyTreePageTitle() {
			return driver.getTitle();
		}
		
		@Step("clicking on first link of tree step...")
		public WebElement link1() {
			return link1;
		}
		
		public WebElement link2() {
			return link2;
		}
		
		public WebElement link3() {
			return link3;
		}
		
		public WebElement link4() {
			return link4;
		}
		
		public WebElement link5() {
			return link5;
		}
		
		public WebElement link6() {
			return link6;
		}
		
		public WebElement link7() {
			return link7;
		}
		
		
		public WebElement link8() {
			return link8;
		}
		
		public WebElement link9() {
			return link9;
		}
		
		public WebElement link10() {
			return link10;
		}
		
		public WebElement link11() {
			return link11;
		}
		
		public WebElement link12() {
			return link12;
		}
		
		public WebElement link13() {
			return link13;
		}
		
		
		public WebElement signOut() {
			return signOut;
		}
	

}
