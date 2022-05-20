package com.dsalgo.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dsalgo.datastructure.pages.DataStructurePage;
import com.dsalgo.datastructure.pages.FirstLink;
import com.dsalgo.datastructure.pages.HomePage;
import com.dsalgo.datastructure.pages.LoginPage;
import com.dsalgo.datastructure.pages.PortalPage;
import com.dsalgo.datastructure.pages.PracticeQuestionPage;
import com.dsalgo.datastructure.pages.TryEditorPage;
import com.dsalgo.qa.base.TestBase;

public class DataStructurePageTest extends TestBase {
	PortalPage portalpage;
	HomePage homepage;
	LoginPage loginpage;
	DataStructurePage datastructurepage;
	FirstLink  firstlink;
	TryEditorPage editpage;
	PracticeQuestionPage questionpage;
	//create a constructor of class and call super keyword
	
	public DataStructurePageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		try {
			initialization();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 portalpage = new PortalPage ();
		 homepage=portalpage.getStartedBtn();
		 loginpage = homepage.signIn();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 
	}
	
	@Test
	public void loginTest() throws InterruptedException {
	/*String	 title = portalpage.validatePortalPageTitle();
	Assert.assertEquals(title, "Numpy Ninja");
	boolean	flag = portalpage.validateheadingText();
	Assert.assertTrue(flag);
	homepage=portalpage.getStartedBtn();
	String	title2  = homepage.validateTitle();
	Assert.assertEquals(title2, "NumpyNinja");
	loginpage = homepage.signIn();
	String title3 = loginpage.validateLoginPageTitle();
	Assert.assertEquals(title3, "Login");
	homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));*/
	String title =homepage.validateTitle(); 
	Assert.assertEquals(title, "NumpyNinja");
	}
	
	@Test
	public void moduleTest() {
    datastructurepage = homepage.clickondatastructureModule();
	String title =datastructurepage.validatepageTitle();
	Assert.assertEquals(title, "Data Structures-Introduction");
	firstlink =	datastructurepage.clickonlinkTest();
	String title2=firstlink.validatepageTitle();
	Assert.assertEquals(title2, "Time Complexity");
	}
	
	
	@Test
	public void firstlinkTest() {
		datastructurepage = homepage.clickondatastructureModule();
		firstlink =	datastructurepage.clickonlinkTest();
		editpage = firstlink.clickonTryhere();	
	String title =	editpage.verifyTryEditorPageTitle();
	Assert.assertEquals(title, "Assessment");
     String	code = "print(\"Successfully reached edit box\")";
     editpage.runCode(code);
     driver.navigate().back();
     questionpage =  firstlink.clickonquestion();
     homepage  = questionpage .clickonsignOut();
	}  
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

}
