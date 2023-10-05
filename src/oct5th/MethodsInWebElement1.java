package oct5th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebElement1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("reyaz009");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("username_span")).getText());
		
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("src"));
		
		System.out.println(driver.findElement(By.id("username_span")).getCssValue("color"));
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		

	}

}
