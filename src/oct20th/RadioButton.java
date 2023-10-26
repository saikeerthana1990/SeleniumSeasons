package oct20th;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void waitsTest() throws InterruptedException
	{
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Water']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Beer']")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Wine']")).isSelected());
		
		driver.findElement(By.xpath("//input[@value='Beer']")).click();
		
		Thread.sleep(3000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Beer']")).isSelected());
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}


}
