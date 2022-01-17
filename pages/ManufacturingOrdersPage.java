package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass_Assignment;

public class ManufacturingOrdersPage extends BaseClass_Assignment {

	public ManufacturingOrdersPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public ManufacturingCreationPage clickCreateManufactureButton() {
		
		//click create button in Manufacture HomePage
		driver.findElement(By.xpath("//button[@accesskey='c']")).click();
		return new ManufacturingCreationPage(driver);
	}
	
	public ManufacturingOrdersPage removeFilter() throws InterruptedException {
		Thread.sleep(2000);
		
		//Remove the default filter present in search text-box
		driver.findElement(By.xpath("//i[@title='Remove']")).click();
		return this;
	}
	
	public ManufacturingOrdersPage searchCreatedOrder() throws InterruptedException {
		Thread.sleep(2000);
		
		//Enter the Created Product Order Name and Search 
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("TestAspireAppApplication");
		driver.findElement(By.xpath("(//strong[text()='TestAspireAppApplication'])[2]")).click();
		Thread.sleep(2000);
		return this;
	}
	
	public ManufacturingOrdersPage verifyOrderIsCreated() {
		
		//verify New Manufacturing Order is Created
		String actualState = driver.findElement(By.xpath("//span[@name='state']")).getText();
		String expectedState = "Done";
		if (actualState.contains(expectedState)) {
			System.out.println(" New Manufacturing Order is created");
		} else {
			System.out.println(" New Manufacturing Order is created not created");
		}
		return this;
	}
}