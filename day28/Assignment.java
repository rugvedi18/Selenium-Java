package day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// URL - https://testautomationpractice.blogspot.com
// 1. provide some string search for it
// 2. count number of links
// 3. click on each link using for loop
// 4. get window id's for every browser window
// 5. close specific browser window

public class Assignment {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Program started...");

		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com");

		driver.manage().window().maximize();

		// 1. Provide some string and search for it
		driver.findElement(By.cssSelector("#Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		// 2. Count number of links
		List<WebElement> links = driver.findElements(By.cssSelector("#wikipedia-search-result-link"));
		System.out.println("Search result total links: " + links.size());

		// 3. Click on each link using JavaScript

		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();

		// 4. Get window id's for every browser window

		Set<String> windowIds = driver.getWindowHandles();

		for (String winId : windowIds) {
			String title = driver.switchTo().window(winId).getTitle();
			System.out.println(title);

			// 5. Close specific browser window
			if (title.equals("Selenium in biology - Wikipedia") || title.equals("Selenium - Wikipedia")) {
				driver.close();
			}
			System.out.println("remaining: " + title);
		}

		driver.quit();
		System.out.println("Program terminated...");
	}
}
