package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass_Assignment;

public class ProductCreationPage extends BaseClass_Assignment {
	
	public ProductCreationPage(ChromeDriver driver) {
		this.driver = driver;
	} 
	
	public ProductCreationPage enterProductName() {
		
		//Enter Product Name
		driver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys("TestAspireAppApplication");
		return this;
	}
	
	public ProductCreationPage clickSave() throws InterruptedException {
		
		//Click Save Button
		driver.findElement(By.xpath("//button[text()[normalize-space()='Save']]")).click();
		Thread.sleep(2000);
		return this;
	}
	
	public UpdateQuantityPage clickUpdateQuantity() {
		
		//Click Update Quantity Button
		driver.findElement(By.xpath("//span[text()='Update Quantity']")).click();
		return new UpdateQuantityPage(driver);
	}
}