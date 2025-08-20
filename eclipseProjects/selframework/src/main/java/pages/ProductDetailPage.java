package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
	WebDriver driver;
	
	@FindBy(xpath = "//button[contains(@class, 'QqFHMw')]/parent ::li")
	WebElement addToCart;
	
	public ProductDetailPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addItemToCart() {
		addToCart.click();
	}

}
