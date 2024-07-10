package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/"); // https://ui.vision/demo/webtest/frames/
		driver.manage().window().maximize();

		// Enter username and password
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		driver.findElement(By.xpath("(//div)[70]")).click();

		// Turn on debugger - selector hub feature

		// Count total number of options
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("Total no of options: " + options.size());
		
		// Select single option
		driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		
		driver.quit();

	}
}
