package tests;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.CartPage;
import pages.CategoryPage;
import pages.HomePage;
import pages.ProductDetailPage;
import pages.ProductListPage;



public class ItemPurchaseTest {
	public static void main(String [] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		// POM Instances
		
		HomePage homePage = new HomePage(driver);
		CategoryPage categoryPage = new CategoryPage(driver);
		ProductListPage productListPage = new ProductListPage(driver);
		ProductDetailPage productDetailPage = new ProductDetailPage(driver);
		CartPage cartPage = new CartPage(driver);
		
		homePage.goToMobilesAndTablets();
		WebElement heading = driver.findElement(By.tagName("h1"));
		Assert.assertTrue(heading.getText().contains("Mobile Phones"), "Failed to navigate to Mobiles & Tablets");
		categoryPage.selectSamsungBrand();
		categoryPage.applyLowToHighFilter();
		productListPage.clickFirstProduct();
		
		// Switch to new tab
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Assert.assertTrue(driver.getCurrentUrl().contains("samsung"), "New tab did not open expected product");
		
		productDetailPage.addItemToCart();
		cartPage.increaseQuantity();
		cartPage.clickPlaceOrder();
		

		// Cleanup
		
		driver.quit();
		
	
	}

}
