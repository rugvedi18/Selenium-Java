package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// using page factory method
public class LoginPage2 {
	WebDriver driver;

	// Constructor
	LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(css = "input[placeholder='Username']")
	WebElement txtUsername;

	@FindBy(css = "input[placeholder='Password']")
	WebElement txtPassword;

	@FindBy(css = "button[type='submit']")
	WebElement btnLogin;

	// Action methods
	public void setUsername(String user) {
		txtUsername.sendKeys(user);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}
}
