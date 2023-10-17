package oct17th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.angelfire.com/super/badwebs/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void frameHandlingTest() throws InterruptedException
	{
		
		
		//switch to frame
		
		driver.switchTo().frame("main");
		
		driver.findElement(By.xpath("//a[contains(@href,'monkeyspaw')]")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("contents");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//font[contains(text(),'Hate Frames Page')]/parent::a")).click();
		
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
