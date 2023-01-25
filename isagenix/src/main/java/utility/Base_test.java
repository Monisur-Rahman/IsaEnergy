package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utility.TestUtil;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_test extends TestUtil
{
	public static WebDriver driver = null;
	public static WebDriverWait wait;

	@BeforeClass
	public void display1() throws IOException
	{
		ExtentReport.setExtent();
	}
	
	@AfterClass
	public void display2()
	{
		ExtentReport.endReport();
	}
	
	@BeforeTest
	@Parameters("browserName")
	
	public void openBrowser(String browserName) throws InterruptedException {
		 if(browserName.equals("chrome")) {
//			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver(); 
			 System.out.println("Testing on Chrome");
		 }
//		 driver.get("https://isaenergy.com.au/");
		 driver.get(TestUtil.getPropertiesData("url"));
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
}
	@AfterTest
	public void close() {
		driver.quit();
	}
	
	
	
	
}