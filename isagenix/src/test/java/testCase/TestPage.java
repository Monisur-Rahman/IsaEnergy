package testCase;

import org.testng.annotations.Test;

import pages.MenuLink;
import utility.Base_test;

public class TestPage extends Base_test {
	
	@Test
	public void menusLink() throws InterruptedException {
		
		MenuLink ml= new MenuLink(driver);
		
		ml.buyLink();
		ml.scroll1();
		ml.buyNow();
		ml.newTab();
		ml.closepupUp();
		ml.buyNow1();
		ml.BuildForMe();
		ml.addToCart();
	}
	
}
