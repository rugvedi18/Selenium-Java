package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager; // log4j
import org.apache.logging.log4j.Logger; // log4j
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	protected WebDriver driver;
	public Logger logger; // log4j

	@BeforeClass
	public void setup() {
		logger = LogManager.getLogger(this.getClass()); // log4j

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void verifyAccountRegistration() {
		driver.quit();
	}

	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

	public String randomAlphaNumeric() {
		String generatedAlphaNumeric = RandomStringUtils.randomAlphanumeric(8);
		return generatedAlphaNumeric;
	}
}
