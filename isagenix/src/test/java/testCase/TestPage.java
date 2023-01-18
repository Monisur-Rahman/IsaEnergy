package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MenuLink;
import utility.Base_test;

public class TestPage extends Base_test {
	
	@Test
	public void menusLink() throws InterruptedException {
		
		MenuLink abc= new MenuLink(driver);
		
		boolean clickBuyLink = abc.buyLink();
		Assert.assertEquals(true, clickBuyLink, "Failed to clickBuyLink");
		
		boolean scroll = abc.scroll1();
		Assert.assertEquals(true, scroll,"Failed to scroll");
		
		boolean clickBuyNow = abc.buyNow();
		Assert.assertEquals(true, clickBuyNow, "Failed to clickBuyNow");
		
		boolean newTab = abc.newTab();
		Assert.assertEquals(true, newTab, "Failed to newTab");
		
		boolean closepopup = abc.closepupUp();
		Assert.assertEquals(true, closepopup, "Failed to closepopup");
		
		boolean clickBuyNow1 = abc.buyNow1();
		Assert.assertEquals(true, clickBuyNow1, "Failed to clickBuyNow1");
		
		boolean clickBuild4me = abc.BuildForMe();
		Assert.assertEquals(true, clickBuild4me, "Failed to clickBuild4me");
		
		boolean clickAddToCart = abc.addToCart();
		Assert.assertEquals(true, clickAddToCart, "Failed to clickAddToCart");
		
	}
	
}
