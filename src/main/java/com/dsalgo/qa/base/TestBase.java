package com.dsalgo.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	//create  static webDriver and properties variables globally 
	//so can use in child classes through entire project	
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();


	
	//public WebDriver initializeDriver(String browserName) throws IOException {
	//creating TestBase constructor
	public TestBase () {
		prop = new Properties();
	 //FileInputStream fis;
		try {
			fis = new FileInputStream ("/Users/shwethamohanpulle/Documents/Projects/DSportalApplication/src/main/java/com"
					+ "/dsalgo/qa/config/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//cross browsing testing
	public WebDriver initializeDriver(String browserName) throws IOException {
	 
		//String browserName = prop.getProperty("browser");
		

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/shwethamohanpulle/Documents/Projects/Chromedriver/chromedriver");
			
                //To run in Headless mode 
			/*ChromeOptions options = new ChromeOptions ();
			options.addArguments("headless");
			driver = new ChromeDriver (options);*/
			driver = new ChromeDriver();	 
		}
		else if(browserName.equals("fireFox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/shwethamohanpulle/Documents/Projects/FirefoxDriver/geckodriver");
			driver = new FirefoxDriver();
		}
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		tdriver.set(driver);
		driver.get(prop.getProperty("url")); 		
		return getDriver();

	}


	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}

	//screenshot capture
	public static String screenshotCapture(String testMethodName) 
	  {
		String dateName= new SimpleDateFormat("yyyyMMddhmmss").format(new Date());
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "/Users/shwethamohanpulle/Documents/Projects/DSportalApplication/"
				+ "Screenshots/" + testMethodName + dateName + ".png";
		File destination = new File(path);
		try {
			//			//FileUtils.copyFile(srcFile, new File("/Users/shwethamohanpulle/Documents/Projects/DSportalApplication/"
			//					+ "Screenshots/"+testMethodName+"_"+".png"));
			FileUtils.copyFile(srcFile, destination);
		} catch (IOException e) {

			System.out.println("Capture Failed " + e.getMessage());

			//e.printStackTrace();

		}
		return path;

	}
	
	
	
	

	public WebDriver initialization() throws IOException { 
		

		String browserName = prop.getProperty("browser");
		

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/shwethamohanpulle/Documents/Projects/Chromedriver/chromedriver");

			driver = new ChromeDriver();	 
		}
		else if(browserName.equals("fireFox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/shwethamohanpulle/Documents/Projects/FirefoxDriver/geckodriver");
			driver = new FirefoxDriver();
		}
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		tdriver.set(driver);
		driver.get(prop.getProperty("url")); 		
		return getDriver();

	}


}

