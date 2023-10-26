package oct20th;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {
	

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void waitsTest() throws InterruptedException
	{
		
	
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		
		FluentWait<WebDriver> myWait= new FluentWait<WebDriver>(driver)
				                                              .withTimeout(Duration.ofSeconds(30))
				                                              .pollingEvery(Duration.ofMillis(300))
				                                              .ignoring(NoSuchElementException.class);
		
		myWait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[@id='spinner']"))));
				                                              
		
		System.out.println(driver.findElement(By.xpath("//div[@class='top']/child::div")).getText());
		
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}


}
