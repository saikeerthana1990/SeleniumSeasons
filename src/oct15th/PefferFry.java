package oct15th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PefferFry {

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.pepperfry.com/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void dragAndDropTest() throws InterruptedException
	{
		
		WebElement block=driver.findElement(By.xpath("//p[text()='Partner With Us']/parent::div"));
		
		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		
		Thread.sleep(10000);
		
		
		
		try
		{
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@name,'notification-frame')]")));
			
			driver.findElement(By.xpath("//a[@class='close']")).click();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			driver.switchTo().defaultContent();
		}
		
		//to scroll to bottom
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,0);");
		
		Thread.sleep(3000);
		
		//js.executeScript("window.scrollBy(0,7000);");
		
		js.executeScript("arguments[0].click();", allLinks.get(0));
		
		//allLinks.get(0).click();
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.quit();
	}

}
