package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Assignment {
	public ChromeDriver driver;
	public String filename;
	public WebDriverWait wait;

	@Parameters({ "url", "username", "password" })
	@BeforeMethod(alwaysRun = true)

	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		//Initialize the browser
		driver = new ChromeDriver(options);
       
		//Launch the browser
		driver.get("https://aspireapp.odoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		//Enter User Name
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("user@aspireapp.com");
		
		//Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@sp1r3app");
		
		//click Login
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	
/*	@AfterMethod(alwaysRun = true)
	public void postCondition() throws InterruptedException {
		
		//Logout of application
		driver.findElement(By.xpath("//img[@alt='User']")).click();
		driver.findElement(By.xpath("//a[@data-menu='logout']")).click();
		Thread.sleep(3000);
		
		//close the browsers
		driver.quit();*/
	}