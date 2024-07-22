package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		// Switch to the frame
		driver.switchTo().frame(0);

		// Method 1 : using sendKeys method
		// driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/18/2024");
		// // mm//dd//yyyy

		// Method 2 : using date picker (if sendKeys is not working)
		String year = "2025";
		String month = "April";
		String date = "18";

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		// Select month and year
		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Next button
			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-w']")).click(); // Previous button
		}

		// Select the date
		try {
			driver.findElement(By.xpath("//td//a[@data-date=" + date + "]")).click();
			System.out.println("Date selection completed");
		} catch (NoSuchElementException e) {
			System.out.println("Please select correct date");
		}

		driver.quit();
	}

}
