package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// https://practice.expandtesting.com/radio-buttons
		// https://practice.expandtesting.com/checkboxes

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/radio-buttons");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='basketball']")).click();
	}

}
