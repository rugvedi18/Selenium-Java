package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// without using page factory method
public class LoginPage {
	WebDriver driver;

	// Constructor
	LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	By txtUsernameLoc = By.cssSelector("input[placeholder='Username']");
	By txtPasswordLoc = By.cssSelector("input[placeholder='Password']");
	By btnLoginLoc = By.cssSelector("button[type='submit']");

	// Action methods
	public void setUsername(String user) {
		driver.findElement(txtUsernameLoc).sendKeys(user);
	}

	public void setPassword(String pwd) {
		driver.findElement(txtPasswordLoc).sendKeys(pwd);
	}

	public void clickLogin() {
		driver.findElement(btnLoginLoc).click();
	}
}
