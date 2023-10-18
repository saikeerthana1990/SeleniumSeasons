package oct18th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDemo {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void alertHandlingTest() throws InterruptedException
	{
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		js.executeScript("window.scrollBy(0, 6000);");
		
		
		Thread.sleep(3000);
		
		
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
