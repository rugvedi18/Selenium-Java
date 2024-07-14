package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> options = driver.findElements(By.xpath("//div[@id='Alh6id']//li[@role='presentation']"));
		System.out.println("No of total results: " + options.size());

		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().equals("selenium download")) {
				options.get(i).click();
				break;
			}
		}
		driver.quit();
	}
}
