package com.dsalgo.qa.testcases;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.dsalgo.linkedlist.pages.LoginPage;
import com.dsalgo.qa.ExtentReportListener.AllureListeners;
import com.dsalgo.qa.ExtentReportListener.ExtentReporterNG;
import com.dsalgo.qa.base.TestBase;
import com.dsalgo.qa.utill.XLReadUtil;
import com.dsalgo.tree.pages.BinaryTress;
import com.dsalgo.tree.pages.HomePage2;
import com.dsalgo.tree.pages.IllustrationOfTress;
import com.dsalgo.tree.pages.Implementation;
import com.dsalgo.tree.pages.LoginPage2;
import com.dsalgo.tree.pages.OveriewOfTrees;
import com.dsalgo.tree.pages.PortalPage;
import com.dsalgo.tree.pages.Terminologies;
import com.dsalgo.tree.pages.TreePage;
import com.dsalgo.tree.pages.TreeTraversal;
import com.dsalgo.tree.pages.TryEditorTress;
import com.dsalgo.tree.pages.TypesOfTrees;
import com.dsalgo.tree.pages.TypesofBinary;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;



@Listeners({AllureListeners.class})
public class TreeTest extends TestBase {
	
	public TreeTest () {
		super();
	}
	
	@Parameters({"browserName"})
	@BeforeTest
	public void setUp(String browserName){
		System.out.println("Browser name is : "+browserName);	
		try {
			initializeDriver(browserName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//log.info("driver is initialized");
		//log.info("driver launched the desired url");
		
	}
	
	@Test(priority=1, description="verifying portal page title test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case  Description: verify portal page title test on portal page")
	@Story("Story Name: To check portal page title")
	public void portalTest() {
	
		
		PortalPage por = new PortalPage (driver);
		driver.navigate().to(prop.getProperty("url"));
		String title = por.validatePortalPageTitle();
		Assert.assertEquals(title,"Numpy Ninja");
		por.getStartedBtn().click();
		
		driver.navigate().to(prop.getProperty("home"));
		HomePage2 hom = new HomePage2 (driver);
		//String title2 = hom.validateHomePage2Title();
		//Assert.assertEquals(title2,"NumpyNinja");
		hom.signinOption().click();

	}
	
	
	
	@Test(priority=2,dataProvider="LoginData", description="verifying login test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case  Description: verify login into app with valid and inavlid credentials")
	@Story("Story Name: To check login functionality")
	public void loginTest(String user, String pwd) {
		driver.navigate().to(prop.getProperty("login"));
		LoginPage2 log = new LoginPage2 (driver);
		log.username().sendKeys(user);
		log.password().sendKeys(pwd);
		log.loginBtn().click();
		
		String flag=log.validateText();
		
		if(driver.getTitle().equals("Login")) {
			Assert.assertEquals(flag, "Invalid Username and Password");
		}
		else {
			Assert.assertEquals(flag, "You are logged in");
			//log.login(prop.getProperty("username"),prop.getProperty("password"));
			HomePage2 hom = new HomePage2 (driver);
			hom.TreeModule().click();
		}
	}
	
	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
	String path = "/Users/shwethamohanpulle/Documents/Projects/DSportalApplication/src/main/java/com/"
			+ "dsalgo/qa/testdata/DsalgoregisterData.xlsx";
	
	int rownum = XLReadUtil.getRowCount(path, "login");
	int colcount = XLReadUtil.getCellCount(path, "login", 1);
	
	String logindata [][] = new String [rownum ][colcount]; 
	
	for  (int i=1; i<=rownum; i++ ) {
		
		for  (int j=0; j<colcount; j++) {
			logindata [i-1][j]=XLReadUtil.getCellData(path, "login", i, j);
		}
	}
	return logindata ;
		}
	

	@Test(priority=3, description="verifying tree page")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case  Description: verifying tree page title and clicking on first link")
	@Story("Story Name: To check click on first link")
	public void treeTest() {
		
		driver.navigate().to(prop.getProperty("tree"));
		TreePage tp = new TreePage(driver);
		String title = tp.verifyTreePageTitle();
		Assert.assertEquals(title, "Tree12345");
		//log.info("verified the title of the page");
		tp.link1().click();
	}

	@Test(priority=4)
	
	public void treeLink1Test() {
		driver.navigate().to(prop.getProperty("overview"));	
		OveriewOfTrees ot= new OveriewOfTrees(driver);
		String title = ot.verifOveriewOfTreesPageTitle();
		AssertJUnit.assertEquals(title, "Overview of Trees");
		//log.info("verified the current page title");
		ot.Tryhere().click();

	}


	@Test(priority=5)
	public void link1EditorTest() {
		driver.navigate().to(prop.getProperty("tryeditor"));
		TryEditorTress edit = new TryEditorTress (driver);
		String title = edit.verifyTryEditorTressPageTitle();
		Assert.assertEquals(title, "Assessment");
		String code = "print(\"Successfully reached Overview Of Tress edit page\")";
		//log.info(code);
		//System.out.println(code);
		edit.runCode(code);
	}

	@Test(priority=6)
	public void  treelink2Test() {
		driver.navigate().to(prop.getProperty("overview"));
		
		OveriewOfTrees ot= new OveriewOfTrees(driver);
		ot.link2().click();
		Terminologies ter = new Terminologies(driver); 
		String title = ter.verifTerminologiesPageTitle();
		Assert.assertEquals(title, "Terminologies");
		ot.Tryhere().click();
	}

	@Test(priority=7)
	public void link2EditorTest() {
		driver.navigate().to(prop.getProperty("tryeditor"));
		TryEditorTress edit = new TryEditorTress (driver);
		String title = edit.verifyTryEditorTressPageTitle();
		Assert.assertEquals(title, "Assessment");
		String code = "print(\"Successfully reached Terminlogies Of Tress edit page\")";
		System.out.println(code);
		edit.runCode(code);
	}

	@Test(priority=8)
	public void  treelink3Test() {
		driver.navigate().back();
		TypesOfTrees tt = new  TypesOfTrees (driver);
		tt.link3().click();
		String title = tt.verifTTypesOfTreesPageTitle();
		Assert.assertEquals(title, "Types of Trees");
		tt.Tryhere().click();
	}

	@Test(priority=9)
	public void link3EditorTest() {
		driver.navigate().to(prop.getProperty("tryeditor"));
		TryEditorTress edit = new TryEditorTress (driver);
		String title = edit.verifyTryEditorTressPageTitle();
		Assert.assertEquals(title, "Assessment");
		String code = "print(\"Successfully reached Types Of Tress edit page\")";
		System.out.println(code);
		edit.runCode(code);
	}

	@Test(priority=10)
	public void  treelink4Test() {
		driver.navigate().back();
		TreeTraversal  ttra = new  TreeTraversal (driver);
		ttra.link4().click();
		String title = ttra.verifTreeTraversalPageTitle();
		Assert.assertEquals(title, "Tree Traversals");
		ttra.Tryhere().click();
	}

	@Test(priority=11)
	public void link4EditorTest() {
		driver.navigate().to(prop.getProperty("tryeditor"));
		TryEditorTress edit = new TryEditorTress (driver);
		String title = edit.verifyTryEditorTressPageTitle();
		Assert.assertEquals(title, "Assessment");
		String code = "print(\"Successfully reached Tree Traversals edit page\")";
		System.out.println(code);
		edit.runCode(code);
	}

	@Test(priority=12)
	public void  treelink5Test() {
		driver.navigate().back();
		IllustrationOfTress ill = new IllustrationOfTress(driver);
		ill.link5().click();
		String title = ill.verifIllustrationOfTressTitle();
		Assert.assertEquals(title, "Traversals-Illustration");
		ill.Tryhere().click();
	}



	@Test(priority=13)
	public void link5EditorTest() {
		driver.navigate().to(prop.getProperty("tryeditor"));
		TryEditorTress edit = new TryEditorTress (driver);
		String title = edit.verifyTryEditorTressPageTitle();
		Assert.assertEquals(title, "Assessment");
		String code = "print(\"Successfully reached Traversals-Illustration edit page\")";   
		System.out.println(code);
		edit.runCode(code);
	}

	@Test(priority=14)
	public void  treelink6Test() {
		driver.navigate().back();
		BinaryTress  bt = new BinaryTress(driver); 
		bt.link6().click();
		String title = bt.verifBinaryTressTressTitle();
		Assert.assertEquals(title, "Binary Trees");
		bt.Tryhere().click();
	}
	
	@Test(priority=15)
	public void link6EditorTest() {
		driver.navigate().to(prop.getProperty("tryeditor"));
		TryEditorTress edit = new TryEditorTress (driver);
		String title = edit.verifyTryEditorTressPageTitle();
		Assert.assertEquals(title, "Assessment");
		String code = "print(\"Successfully reached Binary Trees edit page\")";   
		System.out.println(code);
		edit.runCode(code);
	}
	
	@Test(priority=16)
	public void  treelink7Test() {
		driver.navigate().back();
		TypesofBinary tb = new TypesofBinary (driver);
		tb.link7().click();
		String title = tb.verifTypesofBinaryTressTitle();
		Assert.assertEquals(title, "Types of Binary Trees");
		tb.Tryhere().click();
	}
	
	@Test(priority=17)
	public void link7EditorTest() {
		driver.navigate().to(prop.getProperty("tryeditor"));
		TryEditorTress edit = new TryEditorTress (driver);
		String title = edit.verifyTryEditorTressPageTitle();
		Assert.assertEquals(title, "Assessment");
		String code = "print(\"Successfully reached Types of Binary Trees edit page\")";   
		System.out.println(code);
		edit.runCode(code);
	}
	
	@Test(priority=18)
	public void  treelink8Test() {
		driver.navigate().back();
		 Implementation ip = new  Implementation (driver);
		 ip.link8().click();
		 String title = ip.verifImplementationressTitle();
		Assert.assertEquals(title, "Implementation in Python");
		ip.Tryhere().click();
	}
	
	@Test(priority=19)
	public void link8EditorTest() {
		driver.navigate().to(prop.getProperty("tryeditor"));
		TryEditorTress edit = new TryEditorTress (driver);
		String title = edit.verifyTryEditorTressPageTitle();
		Assert.assertEquals(title, "Assessment");
		String code = "print(\"Successfully reached Implementation edit page\")";   
		System.out.println(code);
		edit.runCode(code);
	}
	
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

	

}