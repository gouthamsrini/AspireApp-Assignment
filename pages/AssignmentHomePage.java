package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass_Assignment;

public class AssignmentHomePage extends BaseClass_Assignment {

	public AssignmentHomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public OdooPage clickInventory() {
		
		//Navigate to 'Inventory' feature
		driver.findElement(By.xpath("//div[text()='Inventory']")).click();
		return new OdooPage(driver);
	}

	public ManufacturingOrdersPage clickManufacturing() {
		
		//Navigate to 'Manufacturing' feature
		driver.findElement(By.xpath("//div[text()='Manufacturing']")).click();
		return new ManufacturingOrdersPage(driver);
	}
}