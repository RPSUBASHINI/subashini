package package1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dresspageobject extends basepage {

	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement headersmallsize;

	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement headermediumsize;

	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement headerlargesize;

	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']//*[@class='checker']")
	private WebElement sizesmallcheck;

	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']/li[2]//*[@class='checkbox']")
	private WebElement sizemediumcheck;

	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']/li[3]//*[@class='checkbox']")
	private WebElement sizelargecheck;

	@FindBys(@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']/li[*]"))
	private List<WebElement> lstsmallsizeProducts;

	@FindBys(@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_2']/li[*]"))
	private List<WebElement> lstmediumsizeProducts;

	@FindBys(@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_3']/li[*]"))
	private List<WebElement> lstlargesizeProducts;

	@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]//*[@class='product-image-container']")
	private WebElement firstaddcartimage;

	@FindBy(xpath = "//div[@class='box-cart-bottom']//span[text()='Add to cart']")
	private WebElement firstprodaddcartbtn;

	@FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']//h2")
	private WebElement addcartsuccessmsg;

	@FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']//*[@title='Close window']")
	private WebElement close;

	// @FindBy(xpath="//div[@class='select selector1']")
	// private WebElement sortby;

	/*
	 * @FindBy(id="selectProductSort") private WebElement sortbybox;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "//div[@class='select selector1']//div[@class='selector hover']") private
	 * WebElement sortbydropdown;
	 * 
	 * 
	 * @FindBy(xpath="/*[@id='selectProductSort']/*[@value='price:asc']")
	 * private WebElement lowestfirst;
	 */

	@FindBy(id = "selectProductSort")
	private WebElement selectdropdown;

	@FindBys(@FindBy(xpath = "//div[@class='right-block']/div/span[@class='price product-price']"))
	private List<WebElement> listofallproduts;

	private WebElement loadingicon;

	public Dresspageobject() {
		PageFactory.initElements(driver, this);
	}

	public void getsizechecked() {
		sizesmallcheck.click();
		sizemediumcheck.click();
		sizelargecheck.click();
	}

	public int getsizeheadercount() {
		String smallsize = headersmallsize.getText().split(" ")[2];
		String mediumsize = headermediumsize.getText().split(" ")[2];
		String largesize = headerlargesize.getText().split(" ")[2];
		Integer.parseInt(smallsize);
		Integer.parseInt(mediumsize);
		Integer.parseInt(largesize);
		return 0;
	}

	public int getsizeProductcount() {
		lstsmallsizeProducts.size();
		lstmediumsizeProducts.size();
		lstlargesizeProducts.size();
		return 0;
	}

	public void firstaddcartimage() {
		firstaddcartimage.click();

	}

	public void firstprodaddcart() {
		firstprodaddcartbtn.click();
	}

	public WebElement addcartsuccessmsg() {
		return addcartsuccessmsg;
	}

	/*
	 * public void closebutton() { close.click(); }
	 */

	public WebElement titlesortby() {
		return titlesortby();

	}

	/*
	 * public WebElement viewsortbox() { return sortbybox;
	 * 
	 * }
	 */
	/*
	 * public void clicksortdropdown(String inputOptiontoSelect) {
	 * 
	 * selectFromDropDown(selectdropdown, inputOptiontoSelect);
	 * 
	 * 
	 * }
	 */

	/*
	 * public void selectsortByDropDown(String optionTobeSelected) {
	 * selectFromDropDown(sortdropdown, optionTobeSelected);
	 * //isElementVisible(loadingIcon); // isElementInvisible(loadingIcon); }
	 */

	/*
	 * public List<Double> getProductPrices() { ArrayList<Double> list=new
	 * ArrayList<Double>(); for(WebElement :lstProductPrices) { String
	 * text=element.getText(); }
	 * 
	 * }
	 */

	public ArrayList<Double> findoutprices(List<WebElement> pass)

	{
		isElementVisible(loadingicon);

		ArrayList<Double> results = new ArrayList<Double>();
		for (WebElement p : pass) {
			String ele = p.getText();
			ele = ele.replace("$", "");
			Double price = Double.parseDouble(ele);
			System.out.println("Product price " + price);
			results.add(price);
		}
		return results;
	}

	public List<WebElement> allproductswithpric() {
		return listofallproduts;
	}

	public WebElement getSortDropDown() {
		return selectdropdown;
	}

}
