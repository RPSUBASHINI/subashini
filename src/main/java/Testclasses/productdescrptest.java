package Testclasses;





import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import package1.Dresspageobject;
import package1.Homepageobject;
import package1.productdescription;

public class productdescrptest{
	
	Homepageobject homepage;
	Dresspageobject dresspage;
	//basepage bp;
	productdescription pd;
	public productdescrptest()
	{
		homepage=new Homepageobject();
		dresspage=new Dresspageobject();
		pd=new productdescription();
	}
	
	
	@Test
	public void verifyproddescrption()
	{
		System.out.println("This is test case 8: navigation product description page of first prod in homepage");
		//pd.homepopularbtn();
		//Assert.assertTrue(pd.getTitlte().contains("Popular"));
		pd.firstimagecheck();
		WebElement element=pd.getproddescription();
		Assert.assertTrue(pd.getTitle().contains("Faded Short Sleeve T-shirts"));
	}
	
	@Test
	public void verifytweetshare()
	{
		pd.firstimagecheck();
		System.out.println("This is test case 7: tweet and share display");
		pd.getdisplaytwitter();
		Assert.assertTrue(pd.getTitle().contains("twitter"));
		pd.getdisplayfacebook();
		Assert.assertTrue(pd.getTitle().contains("facebook"));
	}
	

}

