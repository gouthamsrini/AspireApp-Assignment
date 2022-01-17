package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass_Assignment;

public class OdooPage extends BaseClass_Assignment {
	
	public OdooPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ProductsPage clickProducts() {
		
		//From the top-menu bar, click Products
		driver.findElement(By.xpath("//a[@data-menu-xmlid='stock.menu_stock_inventory_control']")).click();
		
		//select Products ->chose Products item
		driver.findElement(By.xpath("//span[text()='Products']")).click();
		
		return new ProductsPage(driver);
	}
}