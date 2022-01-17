package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass_Assignment;

public class UpdateQuantityPage extends BaseClass_Assignment {

	public UpdateQuantityPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public UpdateQuantityPage clickCreate() throws InterruptedException {
		Thread.sleep(3000);
		
		//Click Create Button under Update Quantity Page
		driver.findElement(By.xpath("//button[text()[normalize-space()='Create']]")).click();
		Thread.sleep(3000);
		return this;
	}

	public UpdateQuantityPage choseLocation() {
		
		//Choose Required Location from drop-down
		driver.findElement(By.xpath("//input[@class='o_input ui-autocomplete-input']")).click();
		driver.findElement(By.cssSelector("html>body>ul>li>a")).click();
		return this;
	}

	public UpdateQuantityPage chosePackage() {
		
		//Choose Required Package from drop-down
		driver.findElement(By.xpath("(//input[@class='o_input ui-autocomplete-input'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='ui-menu-item-wrapper ui-state-active']")).click();
		return this;
	}

	public UpdateQuantityPage enterQuantity() throws InterruptedException {
		
		//Update the Quantity more than 10
		WebElement test = driver.findElement(By.xpath("//input[contains(@class,'o_field_float o_field_number')]"));
		test.sendKeys(Keys.CONTROL + "a");
		test.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@class,'o_field_float o_field_number')]")).sendKeys("12.00");
		return this;
	}
	
	public UpdateQuantityPage clickSave() {
		
		//Click Save Button after Updating Quantity
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		return this; 
	}
	
	public AssignmentHomePage clickApplocationIcon() {
		
		//Click Application Icon
		driver.findElement(By.xpath("//a[contains(@title,'Applications')]")).click();
		return new AssignmentHomePage(driver);
	}
}