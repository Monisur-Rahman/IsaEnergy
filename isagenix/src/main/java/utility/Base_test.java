package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import utility.TestUtil;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_test extends TestUtil
{
	public static WebDriver driver = null;
	public static WebDriverWait wait;

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
}