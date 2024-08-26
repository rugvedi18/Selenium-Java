package day26;
// CTRL + shift + o for package imports

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//1. get methods - we can access these methods through web driver instance

//get(URL) - opens the URL on the browser
//getTitle() - return the title of page in string format
//getCurrentUrl() - returns URL of the page
//getPageSource() - returns source code of the page
//getWindowHandle() - returns web id of the single browser window
//getWindowHandles() - returns ID's of the multiple browser windows open

//2. conditional methods
//3. browser methods
//4. navigation methods
//5. wait methods

public class GetMethods {

	public static void main(String[] args) {
		System.out.println("Program started...");

		// get(URL)
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		// getTitle()
		String title = driver.getTitle();
		if (title.equals("OrangeHRM")) {
			System.out.println("Title is OrangeHRM");
		} else {
			System.out.println("Title not matched to " + driver.getTitle());
		}

		// Initialize WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// Wait for the user name input field to be visible, then send keys
		WebElement usernameField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Username']")));
		usernameField.sendKeys("Admin");

		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		// getCurrentUrl()
		System.out.println("Current URL: " + driver.getCurrentUrl());

		try {
			WebElement websiteLogo = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[alt='client brand banner']")));
			Boolean logoVisible = websiteLogo.isDisplayed();
			System.out.println("Logo visible: " + logoVisible);
			System.out.println("Logged in successfully!");
		}

		catch (Exception e) {
			System.out.println("Try again");
			driver.quit();
		}

		// getPageSource()
		// System.out.println(driver.getPageSource());

		// getWindowHandle() - window id gets keep changing on refresh, and at run time
		String windowId = driver.getWindowHandle();
		System.out.println("Window ID: " + windowId);

		// to reload page
		// driver.navigate().refresh();

		// logout
		driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		System.out.println("Logged out successfully!");

		// getWindowHandles()
		WebElement newLink = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='http://www.orangehrm.com']")));
		newLink.click();

		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("Window Ids: " + windowIds);

		// Close the browser
		driver.quit();
		System.out.println("Program terminated...");
	}

}
