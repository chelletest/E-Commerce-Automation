package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "(//div[@class= '_75nlfW'])[1]")
	WebElement firstProduct;
	
	public ProductListPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}
	public void clickFirstProduct() {
		firstProduct.click();
	}

}
