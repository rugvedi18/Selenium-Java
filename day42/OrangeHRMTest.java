package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//1. open app
//2. test logo presence
//3. login
//4. close
public class OrangeHRMTest {

	WebDriver driver;

	@Test(priority = 1)
	void openApp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	void verifyLogo() throws InterruptedException {
		Thread.sleep(2000);
		boolean isLogoVisible = driver.findElement(By.cssSelector("img[alt='company-branding']")).isDisplayed();
		System.out.println("Logo visibility: " + isLogoVisible);

	}

	@Test(priority = 3)
	void login() {
		driver.findElement(By.cssSelector("input[placeholder='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Test(priority = 4)
	void closeApp() {
		driver.quit();
	}

}
