package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); // setting for headless mode of execution

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.opencart.com/ ");

		String actualTitle = driver.getTitle();

		if (actualTitle.equals("Your Store")) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not matched");
		}
		driver.quit();
	}
}
