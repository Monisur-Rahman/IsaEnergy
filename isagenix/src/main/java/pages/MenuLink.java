package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.TestUtil;

public class MenuLink extends TestUtil {
	
	public WebDriver driver = null;
	
	
	@FindBy(xpath="//li[@id='shopkeeper-menu-item-19']")
	private WebElement buy;
	
	@FindBy(xpath="//a[text()='Isagenix Packs']")
	private WebElement Isagenix_Packs;
	
	@FindBy(xpath="//a[text()='Weight Loss/Cleanse']")
	private WebElement Weight_Loss;
	
	@FindBy(xpath="//a[contains(text(),'30 Day')]")
	private WebElement _30Day;
	
	@FindBy(xpath="//p[contains(text(),'30-Day Weight Loss System')]")
	private WebElement scrl_to_buy_now;
	
	@FindBy(xpath="//p//a[contains(text(),'Buy Now')]")
	private WebElement buy_now;
	
	@FindBy(xpath="//div[@id=\"onetrust-close-btn-container\"]")
	private WebElement popUp;
	
	
	@FindBy(xpath="//span[contains(text(),'Subscription Rewards')]")
	private WebElement scrl_to_buy_now1;
	
	@FindBy(xpath="//div//a[contains(text(),'Buy Now')]")
	private WebElement buy_now1;
	
	@FindBy(xpath="//h3[(contains(text(),'30-Day'))]")
	private WebElement scrl_prod_details;
	
	@FindBy(xpath="//button[contains(@class,'hollow expanded button')]")
	private WebElement build4me;
	
	@FindBy(xpath="//button[@id='addToCart']")
	private WebElement addCart;
	
	@FindBy(xpath="//div[contains(text(),'Canister (+$12.59 each)')]")
	private WebElement canister;
	
	@FindBy(xpath="//div[text()='Strawberry Cream']")
	public WebElement strawberry;
	
//	@FindBy(xpath="//div[contains(text(),'Select Cleanse for Life (Quantity: 2)')]")
//	private WebElement select_cleanse;
	
	@FindBy(xpath="//div[text()='Plant-Based Snack Bites - Cinnamon Roll - 8ct (+$2.71 each)']")
	private WebElement Cinnamon_Roll;
	
	@FindBy(xpath="//div[text()='Natural Fruit Flavour']")
	private WebElement natural_fruit;
	
	@FindBy(xpath="//button[contains(text(),'Signup')]")
	//button[contains(text(),'Continue Signup')]
	private WebElement continueSignUp;
	
	
	
	
	
//	constructor
	
	public MenuLink(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver ,this); 
	}
	

	public boolean buyLink() throws InterruptedException {
		boolean status = false;
		try {
			Actions act = new Actions(driver);
			
			//Performing the mouse hover action on the target element.

			TestUtil.isElementVisible(driver, buy, "buy element is Visible");
			act.moveToElement(buy).perform();
			TestUtil.log().info("Hover on Buy IsaGenix");
			TestUtil.isElementVisible(driver, Isagenix_Packs, "Isagenix_Packs element is Visible");
			act.moveToElement(Isagenix_Packs).perform();
			TestUtil.log().info("Hover on IsaGenix Packs");
			TestUtil.isElementVisible(driver, Weight_Loss, "Weight_Loss element is Visible");
			act.moveToElement(Weight_Loss).perform();
			TestUtil.log().info("Hover on Wieght Loss/Cleanse");
			_30Day.click();
			TestUtil.log().info("Click on 30Days Weight Loss System");
			Thread.sleep(2000);
			status = true;
		}catch(Exception e){
//			System.out.println(e);
			TestUtil.log().info(e);
		}
		
		return status;
	}
	
	public boolean scroll1() {
		boolean status = false;
		try {
			TestUtil.scrollElements(driver, scrl_to_buy_now);
			TestUtil.log().info("scroll to buy now");
			status = true;
		}catch(Exception e) {
//			System.out.println(e);
			TestUtil.log().info(e);
		}
		return status;
	}
	
	public boolean buyNow() {
		boolean status = false;
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOf(buy_now));
		try {
//		TestUtil.explicitWait(driver, buy_now);
		TestUtil.isElementVisible(driver, buy_now, "buy_now element is visible");	
		buy_now.click();
		TestUtil.log().info("click on buy_now");
		status = true;
		}catch(Exception e) {
//			System.out.println(e);
			TestUtil.log().info(e);
		}
		return status;
	}
	 
	
	
	public boolean newTab()
	{
		boolean status = false;
		try {
			 Set<String> windowTabAddress = driver.getWindowHandles();
			 
				for(String x : windowTabAddress) {
					driver.switchTo().window(x);
					String newUrl = driver.getCurrentUrl();
					
					 System.out.println(newUrl);
					 
//					if(newUrl.contains("Isagenix 30 Day System ")) {
//						
//						System.out.println("hello");
////						TestUtil.scrollElements(driver, scrl_to_buy_now1);
//					}
					status = true;
				}
		}catch(Exception e) {
//			System.out.println(e);
			TestUtil.log().info(e);
		}
		return status;
		
	}
	
	public boolean closepupUp()
	{
		boolean status = false;
		try {
			
			popUp.click();
			TestUtil.log().info("click on popUp");
			status = true;
		}catch(Exception e) {
//			System.out.println(e);
			TestUtil.log().info(e);
		}
		return status;
	}
	
	public boolean buyNow1() {
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOf(buy_now1));
		boolean status = false;
		try {
//			TestUtil.explicitWait(driver, buy_now1);
			TestUtil.isElementVisible(driver, buy_now1, "buy_now1 is visible");
			buy_now1.click();
			
			Set<String> windowTabAddress = driver.getWindowHandles();
			 
			for(String x : windowTabAddress) {
				driver.switchTo().window(x);
				String prodTitle = driver.getTitle();
				
//				 System.out.println(newTitle);
				 
				if(prodTitle.contains("Product Details")) {
					TestUtil.scrollElements(driver, scrl_prod_details);
					TestUtil.log().info("scroll to product details");
				}
				
			}
			status = true;
		}catch(Exception e) {
//			System.out.println(e);
			TestUtil.log().info(e);
		}
		return status;
	}
	
	
	public boolean BuildForMe(){
		boolean status = false;
		try {
			build4me.click();
			TestUtil.log().info("click on buildforme");
			status = true;
		}catch(Exception e) {
//			System.out.println(e);
			TestUtil.log().info(e);
		}
		return status;
	}
 
	public boolean scrollAddToCart() {
		boolean status = false;
		try {
//			System.out.println("test-addToCart");
			TestUtil.scrollElements(driver, canister);
			TestUtil.log().info("scroll to canister");
//			Thread.sleep(3000);
			TestUtil.scrollElements(driver, strawberry);
			TestUtil.log().info("scroll to strawberry");
//			Thread.sleep(3000);
			TestUtil.scrollElements(driver, Cinnamon_Roll);
			TestUtil.log().info("scroll to cinnamon_Roll");
//			Thread.sleep(3000);
			TestUtil.scrollElements(driver, natural_fruit);
			TestUtil.log().info("scroll to natural_fruit");
			Thread.sleep(3000);
			status = true;
		}catch(Exception e) {
//			System.out.println(e);
			TestUtil.log().info(e);
		}
		return status;
	}
	
	public boolean addtocart() {
		boolean status = false;
		try {
			addCart.click();
			TestUtil.log().info("click on add to Cart");
			status = true;
		}catch(Exception e) {
//			System.out.println(e);
			TestUtil.log().info(e);
		}
		return status;
	}

	public boolean signUp() {
		boolean status = false;
		try {
			Thread.sleep(3000);
			continueSignUp.click();
			TestUtil.log().info("click on continueSignUp");
			status = true;
		}catch(Exception e) {
//			System.out.println(e);
			TestUtil.log().info(e);
		}
		return status;
	}

}
