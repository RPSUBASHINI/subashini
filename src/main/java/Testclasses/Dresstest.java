package Testclasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import package1.Dresspageobject;
import package1.Homepageobject;
import package1.basepage;

public class Dresstest extends basepage {
	
	Homepageobject homepage;
	Dresspageobject dresspage;
	basepage bp;
	private Dresspageobject Dp;
	
	
	public Dresstest()
	{
        homepage=new Homepageobject();
	    dresspage=new Dresspageobject();
	    bp=new basepage();
	}
	
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test from Dresstest class");
		homepage.clicktabDresses();
      
	}
	
	
	@Test
	public void verifysmalllargemedium()
	{
		System.out.println("This is test case 4: click on small,large and medium of dresspage");
		homepage.clicktabDresses();
		dresspage.getsizechecked();
		Assert.assertEquals(homepage.getTotalProductsDresses(), homepage.getHeaderProductcountDresses(),"Failed: count mismatch");		
	}
	
	@Test
	public void verifysizescount()
	{
		homepage.clicktabDresses();
		System.out.println("This is test case 5: product count of small,large,medium of dresspage");
		dresspage.getsizeheadercount();
		Assert.assertEquals(dresspage.getsizeheadercount(),dresspage.getsizeProductcount(),"Failed: size count mismatch");
		
	}

	@Test
	public void verifyaddtocart()
	{
		System.out.println("This is test case 6: adding first prod of dresspage to cart");
		homepage.clicktabDresses();
		dresspage.firstaddcartimage();
		dresspage.firstprodaddcart();
		//Assert.assertTrue(dresspage.getTitlte().contains("Add to cart"));
		//dresspage.closebutton();
	WebElement element=dresspage.addcartsuccessmsg();
		Assert.assertFalse(dresspage.elementFound(element), "Failed: Add to cart not successfull");
	}
	
	/*Test
	public void verifysortboxview()
	{
		homepage.clicktabDresses();
		Assert.assertTrue(dresspage.getTitle().contains("Add to cart"));
	    dresspage.clicksortdropdown(inputOptiontoSelect);
	   //boolean element= dresspage.getTitlte().contains("Sort by");
	    //dresspage.viewsortbox();
	    //dresspage.clicksortdropdown();*/
	    
	
@Test

public void checkascendingorder() {
	homepage.clicktabDresses();
	bp.selectoption(dresspage.getSortDropDown(), 1);
	ArrayList<Double> m = Dp.findoutprices(Dp.allproductswithpric());
	for (int i = 0; i < m.size() - 1; i++) {
		Assert.assertTrue(m.get(i) < m.get(i + 1), "Failed");
	}

}
}


