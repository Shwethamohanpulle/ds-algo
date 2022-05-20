package com.dsalgo.qa.testcases;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dsalgo.linkedlist.pages.CreatingLLPage;
import com.dsalgo.linkedlist.pages.DeletionLLPage;
import com.dsalgo.linkedlist.pages.HomePage;
import com.dsalgo.linkedlist.pages.ImplementLLPage;
import com.dsalgo.linkedlist.pages.InsertionLLPage;
import com.dsalgo.linkedlist.pages.LLIntroductionPage;
import com.dsalgo.linkedlist.pages.LLTryEditorPage;
import com.dsalgo.linkedlist.pages.LinkedListPage;
import com.dsalgo.linkedlist.pages.LoginPage;
import com.dsalgo.linkedlist.pages.MainpPage;
import com.dsalgo.linkedlist.pages.PracticePage;
import com.dsalgo.linkedlist.pages.RegisterPage;
import com.dsalgo.linkedlist.pages.TraversalLLPage;
import com.dsalgo.linkedlist.pages.TypesofLLPage;
import com.dsalgo.qa.ExtentReportListener.ExtentReporterNG;
import com.dsalgo.qa.base.TestBase;




@Listeners({ExtentReporterNG.class})
public class LinkedListTest extends TestBase {
	
	public LinkedListTest() {
		super();
	}

	MainpPage mp;
	HomePage  homepage ;
	RegisterPage regpage;
	LoginPage logpage;
	LinkedListPage	llPage;
	LLIntroductionPage llIntro;
	LLTryEditorPage llEdit;
	CreatingLLPage cllP;
	TypesofLLPage typll;
	ImplementLLPage imp;
	TraversalLLPage traP;
	InsertionLLPage insP;
	DeletionLLPage delP;
	PracticePage pp;
	

	
	@Parameters({"browserName"})
	@BeforeMethod
	
	public void setUp(String browserName){
		System.out.println("Browser name is : "+browserName);
		try {
			initializeDriver(browserName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mp = new MainpPage ();

	}
	
	@Test
	public void linkedListTest( ){
	
		String title =mp.validateMainPageTitle();
		Assert.assertEquals(title,"Numpy Ninja");
		System.out.println(title );

		homepage = mp.getStartedBtnTest();
		title =  homepage.validateHomePageTitle();
		Assert.assertEquals(title,"NumpyNinja");
		System.out.println(title);



		//Login TEST


		logpage = homepage.signinOptionTest();
		title=logpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login");
		homepage =logpage.login(prop.getProperty("username"), prop.getProperty("password"));

		/*//Register page:

		title =  regpage.validateRegisterPageTitle();
		Assert.assertEquals(title,"Registration");
		System.out.println(title);

		String username= "UserQaTest"+ org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(4);
		regpage.usrName().sendKeys(username);
		System.out.println(username);
		regpage.passwd().sendKeys("QAAUTOMATION1234");
		regpage.passwdcofirm().sendKeys("QAAUTOMATION1234");



		//HomePage:
		homepage =regpage.registrationTest();
		 title = homepage.validateHomePageTitle();
		Assert.assertEquals(title,"NumpyNinja");
		System.out.println(title);*/
		
		

		llPage = homepage.llPageTest();
		title= llPage.verifyLinkedListPageTitle();
		Assert.assertEquals(title,"Linked List");
		System.out.println(title);



		//Link 1:
		llIntro =llPage.introTest();
		title = llIntro.verifyLLIntroductionPageTitle();
		Assert.assertEquals(title,"Introduction");
		System.out.println(title);

		llEdit = llIntro.llTryhereTest();
		title = llEdit.verifyLLTryEditorPageTitle();
		Assert.assertEquals(title,"Assessment");
		System.out.println(title);
		String code = "print(\"Hello World\")";
		llEdit.runCode(code);



		driver.navigate().back();

		//Link 2:
		cllP = llIntro.llTest();
		title = cllP.verifyCreatingLLPageTitle();
		Assert.assertEquals(title,"Creating Linked LIst");
		System.out.println(title);

		llEdit = cllP.llTryhereTest();
		title = llEdit.verifyLLTryEditorPageTitle();
		Assert.assertEquals(title,"Assessment");
		System.out.println(title);
		code = "print(\"Successfully reached Creating LL edit box\")";
		llEdit.runCode(code);
		driver.navigate().back();

		//Link 3:
		typll =cllP.typesOfLLTest();
		title = typll.verifyTypesofLLPageTitle();
		Assert.assertEquals(title,"Types of Linked List");
		System.out.println(title);

		llEdit = typll.llTryhereTest();
		title= llEdit.verifyLLTryEditorPageTitle();
		Assert.assertEquals(title,"Assessment");
		System.out.println(title);
		code = "print(\"Successfully reached TypesOfLL edit box\")";
		llEdit.runCode(code);
		driver.navigate().back();

		//Link 4:
		imp = typll.implementTest();
		title = imp.verifyImplemnetLLPageTitle();
		Assert.assertEquals(title,"Implement Linked List in Python");
		System.out.println(title);

		llEdit = imp.llTryhereTest();
		title=llEdit.verifyLLTryEditorPageTitle(); 
		Assert.assertEquals(title,"Assessment");
		System.out.println(title);
		code = "print(\"Successfully reached Implement Linked List edit box\")";
		llEdit.runCode(code);
		driver.navigate().back();

		//Link 5:
		traP = imp.traverseTest();
		title = traP.verifyTraversalLLPageTitle();
		Assert.assertEquals(title,"Traversal");
		System.out.println(title);

		llEdit =traP.llTryhereTest();
		title =llEdit.verifyLLTryEditorPageTitle(); 
		Assert.assertEquals(title,"Assessment");
		System.out.println(title);
		code = "print(\"Successfully reached Traversal Linked List edit box\")";
		llEdit.runCode(code);
		driver.navigate().back();

		//Link6:
		insP = traP.insertionTest();
		title = insP.verifyInsertionlLLPageTitle();
		Assert.assertEquals(title,"Insertion");
		System.out.println(title);

		llEdit = insP.llTryhereTest();
		title =llEdit.verifyLLTryEditorPageTitle(); 
		Assert.assertEquals(title,"Assessment");
		System.out.println(title);
		code = "print(\"Successfully reached Insertion Linked List edit box\")";
		llEdit.runCode(code);
		driver.navigate().back();

		//Link 7:
		delP = insP.deleteTest();
		title = delP.verifyDeletionLLPageTitle();
		Assert.assertEquals(title,"Deletion");
		System.out.println(title);

		llEdit = insP.llTryhereTest();
		title =llEdit.verifyLLTryEditorPageTitle(); 
		Assert.assertEquals(title,"Assessment");
		System.out.println(title);
		code = "print(\"Successfully reached Deletion Linked List edit box\")";
		llEdit.runCode(code);
		driver.navigate().back();

		//Link PracticeQuestions:
		pp = delP.QTest();
		title = pp.verifyPracticePageTitle();
		Assert.assertEquals(title,"Practice Questions");
		System.out.println(title);

		pp.signOut();

	}








	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}





}




















