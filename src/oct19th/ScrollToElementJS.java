package oct19th;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollToElementJS {
	
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
		
				
	 WebElement element=driver.findElement(By.xpath("//h2[text()='Value bazaar']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		js.executeScript("arguments[0].scrollIntoView();",element);
		
		
		Thread.sleep(3000);
		
		
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
