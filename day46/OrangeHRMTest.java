package day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//if you don not have testng.xml file, you can run directly using integrating Listener class, but not recommended
//@Listeners(day46.MyListener.class)
public class OrangeHRMTest {

	WebDriver driver;

	@BeforeClass
	void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	// passed
	@Test(priority = 1)
	void testLogo() {
		boolean logoStatus = driver.findElement(By.cssSelector("img[alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logoStatus, true);
	}

	// failed
	@Test(priority = 2)
	void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com");
	}

	// skipped
	@Test(priority = 3, dependsOnMethods = { "testURL" })
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
