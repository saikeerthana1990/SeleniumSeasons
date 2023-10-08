package oct7th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTesting2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//using Select class
		
		//WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		//Select s1=new Select(drop);
		
		//s1.selectByIndex(11);
		
		//new Select(driver.findElement(By.id("searchDropdownBox"))).selectByIndex(11);
		
		//new Select(driver.findElement(By.id("searchDropdownBox"))).selectByValue("search-alias=dvd");
		
		new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Movies & TV Shows");
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
