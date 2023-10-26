package oct20th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
	

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/worldclock/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void webTableTest() throws InterruptedException
	{
		
		
		String part1="//table/tbody/tr[";

		String part2="]/td[1]";

		
		for(int i=1;i<=36;i++)
		{
			System.out.println(driver.findElement(By.xpath(part1+i+part2)).getText());
		}
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}



}
