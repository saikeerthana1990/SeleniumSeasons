package oct6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebElement3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
	  System.out.println(driver.findElement(By.className("build_title")).getCssValue("font-weight"));
	 
	  System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Username')]")).getCssValue("font-weight"));
		 
	  driver.findElement(By.linkText("New User Register Here")).click();
	  
	  driver.findElement(By.id("register_form")).submit();
	  
	  Thread.sleep(3000);
	  
	  driver.quit();
		
		

	}

}
