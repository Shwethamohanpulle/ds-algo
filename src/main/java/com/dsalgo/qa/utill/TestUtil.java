package com.dsalgo.qa.utill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;




import com.dsalgo.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	//created  static test data sheet path variable to access the excel sheet
	//workbook variable 
	//sheet variable
	public static String TESTDATA_SHEET_PATH ="/Users/shwethamohanpulle/Documents/Projects/DSportalApplication/src/main/java/com"
			+ "/dsalgo/qa/testdata/DsalgoregisterData.xlsx";
	
	
	
	
	//method to switch frames when u see frames on web page
	
	public void switchToFrame() {
		driver.switchTo().frame("give the frame name here");
	}
	
	
	
	
	
	
	}
	
	


