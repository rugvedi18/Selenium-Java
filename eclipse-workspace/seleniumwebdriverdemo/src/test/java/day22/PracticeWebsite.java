package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeWebsite {

	public static void main(String[] args) {

		System.out.println("Testing started..");

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		// driver.findElement(By.linkText("Automation Testing Practice"));

		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("pizza");
		driver.findElement(By.className("wikipedia-search-button")).click();

		List<WebElement> pizzaLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total pizza searches: " + pizzaLinks.size());

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("Pizza Hut"))).click();

//		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait2.until(ExpectedConditions.elementToBeClickable(By.className("mw-page-title-main"))).click();

		driver.quit();
		System.out.println("Testing ended..");
	}

}
