package sep29th;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch {
	
	public static void main(String[] args) {
		//method 1
		//System.setProperty("webdriver.chrome.driver", "D:\\006 LiveTech\\jars\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		
		
		//method 2 using WebDriver Manager jar
		
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
		
	}

}
