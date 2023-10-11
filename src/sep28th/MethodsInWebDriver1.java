package sep28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebDriver1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		System.out.println( driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getWindowHandles());
		
		Thread.sleep(3000);
		
		//driver.close();
		
		driver.quit();

	}

}
