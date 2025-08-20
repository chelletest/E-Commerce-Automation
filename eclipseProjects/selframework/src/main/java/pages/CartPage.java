package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	
	@FindBy(xpath = "(//button[@class='LcLcvv'])[2]")
	WebElement increaseQuantityButton;
	
	@FindBy(xpath = "//span[text() = 'Place Order']")
	WebElement placeOrderButton;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void increaseQuantity() {
		increaseQuantityButton.click();
	}

	public void clickPlaceOrder() {
		placeOrderButton.click();
	}
}
