package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
	
WebDriver driver;
	
	@FindBy (css = "a[href*='Samsung+Galaxy+S24+FE']")
			
	WebElement SamsungLink;
	
	@FindBy(xpath = "//*[contains(@class, 'zg-M3Z')and contains(text(), 'Price -- Low to High')]")
	WebElement lowToHighFilter;
	
	public CategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void selectSamsungBrand() {
		SamsungLink.click();
	}
	public void applyLowToHighFilter() {
		lowToHighFilter.click();
	
	}	
}
	
