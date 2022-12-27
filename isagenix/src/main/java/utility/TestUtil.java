package utility;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil {
	public static JavascriptExecutor js;
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static String getPropertiesData (String key) {
		String value = null;
		try {
			String path = "./src/main/resources/data.properties";
			FileInputStream file = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(file);
			value = prop.get(key).toString();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return value;
	}
	
	public static void explicitWait(WebDriver driver,WebElement elements) {
		 wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.visibilityOf(elements));
	}
	
	public static void scrollElements(WebDriver driver,WebElement element ) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
}
