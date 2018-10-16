package Testclasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import package1.Dresspageobject;
import package1.Homepageobject;
import package1.basepage;

public class Hometest {

	Homepageobject homepage;
	Dresspageobject dresspage;

	int value = new Random().nextInt(50000);
	String email = "subashini" + value + "@gmail.com";

	public Hometest() {
		homepage = new Homepageobject();
		dresspage = new Dresspageobject();

	}
	@Test
	public void verifyTabNavigation() {
		System.out.println("This is test case 1: Women,Dress and T-shirts Tabs");
		homepage.clicktabWomen();
		Assert.assertTrue(homepage.getTitle().contains("Women"));

		homepage.clicktabDresses();
		Assert.assertTrue(homepage.getTitle().contains("Dresses"));

		homepage.clicktabTshirt();
		Assert.assertTrue(homepage.getTitle().contains("shirts"));

	}

	@Test
	public void verifyProductsCount() {
		System.out.println("This is test case 2: product count of women,dress and t-shirts");
		homepage.clicktabWomen();
		Assert.assertEquals(homepage.getTotalProductsWomen(),
				homepage.getHeaderProductcountWomen(), "Failed: count mismatch");

		homepage.clicktabDresses();
		Assert.assertEquals(homepage.getTotalProductsWomen(),
				homepage.getHeaderProductcountDresses(),
				"Failed: count mismatch");

		homepage.clicktabTshirt();
		Assert.assertEquals(homepage.getTotalProductsTshirt(),
				homepage.getHeaderProductcountTshirt(),
				"Failed: count mismatch");

	}

	@Test
	public void verifyNewletterSubs() {
		System.out.println("This is test case 3: newsletter subscription");
		homepage.getEmail(email);
		homepage.clicksubscripbtn();
		WebElement element = homepage.getSubscriptionMessage();
		Assert.assertTrue(homepage.elementFound(element), "email invalid");
	}

}
