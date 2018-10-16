package package1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productdescription extends basepage {
	
	@FindBy(xpath="//*[@id='index']")
	private WebElement homepageview;
	
    @FindBy(xpath="//div[@class='columns-container']//ul[@id='homefeatured']/li[1]//*[@class='left-block']")
	private WebElement firstimage;
	
	@FindBy(xpath="//div[@class='pb-center-column col-xs-12 col-sm-4']/div[@id='short_description_block']")
	private WebElement prodescrptxt;
	
	/*@FindBy(xpath="//*[text()='Popular']")
	private WebElement tabpopular;*/
    
	@FindBy(xpath="//*[@class='socialsharing_product list-inline no-print']//*[@class='btn btn-default btn-twitter']")
	private WebElement twitter;
	
	@FindBy(xpath="//*[@class='socialsharing_product list-inline no-print']//*[@class='btn btn-default btn-facebook']")
	private WebElement share;
	
	 public productdescription()
	   	{
	       PageFactory.initElements(driver, this);
	   	}
	/*public void homepopularbtn()
	{
		tabpopular.click();
	}*/
	public void firstimagecheck()
	{
		firstimage.click();
	}

	public WebElement getproddescription()
	{
		return prodescrptxt;
	}
	
	public WebElement getdisplaytwitter()
	{
		
		return twitter;
	}
	public WebElement getdisplayfacebook()
	{
		
		return share;
	}
	

}
