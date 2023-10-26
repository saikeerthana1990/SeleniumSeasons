package oct20th;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable3 {
	
	

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
		
		
		WebElement table=driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']/tbody"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for(WebElement row:rows)
		{
			List<WebElement> cols=row.findElements(By.tagName("td"));
			
			for(WebElement col:cols)
			{
				System.out.print(col.getText()+"\t");
			}
			
			System.out.println();
			
		}
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}



}
