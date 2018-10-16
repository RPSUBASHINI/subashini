package package1;




import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Homepageobject extends basepage{

	@FindBy(xpath="//ul[contains(@class,'menu-content')]/li[1]/a")
	private WebElement tabWomen;
	
	@FindBy(xpath="//ul[contains(@class,'menu-content')]/li[2]/a")
	private WebElement tabDresses;
	
	@FindBy(xpath="//ul[contains(@class,'menu-content')]/li[3]/a")
	private WebElement tabTshirt;
	
	@FindBy(xpath="//div[@class='footer-container']")
	private WebElement newsletter;
	
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement headerwomen;
	
	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']/li"))
    private List<WebElement> lstProducts1;
	
	@FindBy(xpath="//*[@class='heading-counter']")
    private WebElement headerDresses;
	
	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']/li"))
    private List<WebElement> lstProducts2;
	
	@FindBy(xpath="//*[@class='heading-counter']")
    private WebElement headerTshirt;
	
    @FindBys(@FindBy(xpath="//*[@class='product_list grid row']/li"))
    private List<WebElement> lstProducts3;
   
    @FindBy(xpath="//*[@name='submitNewsletter']")
	private WebElement subscriptionsubmit;
	
	@FindBy(xpath="//div[@class='container']//p[@class='alert alert-success']")
    private WebElement subscriptionmessage;

    public Homepageobject()
   	{
       PageFactory.initElements(driver, this);
   	}
    
   	public void clicktabWomen()
   	{
   		tabWomen.click();
   	}
   	
   	public void clicktabDresses()
   	{
   		tabDresses.click();
   	}
   	
   	public void clicktabTshirt()
   	{
   		tabTshirt.click();
   	}
   	
	public int getHeaderProductcountWomen()
      {
       		String number = headerwomen.getText().split(" ")[2];
            return Integer.parseInt(number);
   	  }
   	
   	public int getTotalProductsWomen()
   	{	
       	return lstProducts1.size();
    }
   	
    public int getHeaderProductcountDresses()
    {
       	String number = headerDresses.getText().split(" ")[2];
       	return Integer.parseInt(number);
   	}
    
   public int getTotalProductsDresses()
    {
       	return lstProducts2.size();
    }
   
   public int getHeaderProductcountTshirt()
   {
       	String number = headerTshirt.getText().split(" ")[2];
       	return Integer.parseInt(number);
   }
   
   public int getTotalProductsTshirt()
   {
       return lstProducts3.size();
   }
   
   public void clicksubscripbtn()
	{
		subscriptionsubmit.click();		
	}
	
	public WebElement getSubscriptionMessage(){
		return subscriptionmessage;
	}
	
   
   public void getEmail(String email)
	{
   	WebElement emailinfo = driver.findElement(By.xpath("//*[@id='newsletter-input']"));
   	emailinfo.sendKeys(email);

   }
}

