package oct16th;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	WebDriver driver;

	private void switchToWindow(String expectedTitle) {
		
		Set<String> windowIds = driver.getWindowHandles();

		Iterator<String> it = windowIds.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());

			if (driver.getTitle().equals(expectedTitle)) {
				break;
			}

		}

	}

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.livetech.in/");

		driver.manage().window().maximize();
	}

	@Test
	public void multipleWindowsTest() throws InterruptedException {

		String homeWindowId = driver.getWindowHandle();

		try {
			driver.findElement(By.xpath("//i[@class='fa fa-close']")).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		driver.findElement(By.xpath("//ul[@class='topsocial']/descendant::a[contains(@href,'facebook')]")).click();

		switchToWindow("LiveTech | Facebook");
	

		driver.findElement(By.xpath("//span[text()='Email address or phone number']/following-sibling::input"))
				.sendKeys("Reyaz");

		Thread.sleep(3000);

		driver.switchTo().window(homeWindowId);

		Thread.sleep(3000);

		try {
			driver.findElement(By.xpath("//i[@class='fa fa-close']")).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		driver.findElement(By.xpath("//ul[@class='topsocial']/descendant::a[contains(@href,'instagram')]")).click();

		Thread.sleep(3000);
		
		switchToWindow("LiveTech Testingtools (@livetechqa) • Instagram photos and videos");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//h2[text()='livetechqa']")).click();

		Thread.sleep(3000);

		driver.switchTo().window(homeWindowId);

		Thread.sleep(3000);

	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
