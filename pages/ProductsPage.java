package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass_Assignment;

public class ProductsPage extends BaseClass_Assignment {
	
	public ProductsPage(ChromeDriver driver) {
		this.driver = driver;
	} 
	
	public ProductCreationPage clickCreate() {
		
		//click Create button for product
		driver.findElement(By.xpath("//button[text()[normalize-space()='Create']]")).click();
		return new ProductCreationPage(driver);
	}
}