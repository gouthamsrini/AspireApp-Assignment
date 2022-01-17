package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass_Assignment;

public class ManufacturingCreationPage extends BaseClass_Assignment {

	public ManufacturingCreationPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public ManufacturingCreationPage selectProductType() throws InterruptedException {
		
		//create a new Manufacturing Order item for the created Product on step #3
		driver.findElement(By.xpath("//input[@class='o_input ui-autocomplete-input']")).sendKeys("TestAspireAppApplication");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='ui-menu-item']//a")).click();
		return this;
	}

	public ManufacturingCreationPage enterProductQuantity() throws InterruptedException {
		
		//Correct the Quantity
		WebElement clearData = driver.findElement(By.xpath("//input[@name='product_qty']"));
		clearData.sendKeys(Keys.CONTROL + "a");
		clearData.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='product_qty']")).sendKeys("12.00");
		return this;
	}

	public ManufacturingCreationPage clickAddaLine() throws InterruptedException {
		
		//Add Manufacturing Order Details
		driver.findElement(By.xpath("//a[text()='Add a line']")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//tr[contains(@class,'o_data_row o_selected_row')]/td/div[@name='product_id']/div/input"))
				.sendKeys("TestAspireAppApplication");
		driver.findElement(By.xpath("//a[@class='ui-menu-item-wrapper ui-state-active']")).click();
		WebElement toClear = driver.findElement(By.xpath("//input[@name='product_uom_qty']"));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='product_uom_qty']")).sendKeys("12.00");
		return this;
	}

	public ManufacturingCreationPage clickConfirm() {
		
		//click Confirm
		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		return this;
	}

	public ManufacturingCreationPage clickMarkAsDone() throws InterruptedException {
		Thread.sleep(3000);
		
		//Click Mark As Done Button
		driver.findElement(By.xpath("//span[text()='Mark as Done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Apply']")).click();
		return this;
	}
	
	public ManufacturingOrdersPage clickSaveOnOrders() throws InterruptedException {
		
		//click Save on Manufacturing Order
		driver.findElement(By.xpath("//button[@accesskey='s']")).click();
		Thread.sleep(2000);
		
		//Click Manufacturing Text on top left page
		driver.findElement(By.xpath("//a[text()='Manufacturing']")).click();
		return new ManufacturingOrdersPage(driver);
	}
}