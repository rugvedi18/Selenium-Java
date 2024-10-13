package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {

	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd) {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("#input-password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input[value='Login']")).click(); // login
//		Thread.sleep(2000);

		boolean status = driver.findElement(By.cssSelector("h2:nth-child(1)")).isDisplayed(); // My Account heading
		if (status == true) {
			driver.findElement(By.cssSelector("a:nth-child(13)")).click(); // logout
			driver.findElement(By.cssSelector("div[id='content'] h1")).isDisplayed(); // Account Logout heading
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

	// Data Provider Method - creation and returning the data
	// returns two dimentional object type of array

	@DataProvider(name = "dp", indices = { 0, 1 }) // indices - to select data index to pass
	Object[][] loginData() {

		Object[][] data = { { "abc@gmail.com", "test123" }, { "xyz@gmail.com", "test012" },
				{ "john@gmail.com", "test@123" }, { "abc@ga.com", "123pass" }, { "pavanol123@gmail.com", "test@12" } };

		return data;
	}

}
