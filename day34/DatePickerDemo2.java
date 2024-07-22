package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {

	static void futureMonth(WebDriver driver, String month) {
		while (true) {
			// find month
			String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			if (current_month.equals(month)) {
				System.out.println("Selected month is April");
				break;
			} else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Nxt btn
			}

		}
	}

	static void futureYear(WebDriver driver, String year) {
		WebElement years = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select expected_year = new Select(years);
		expected_year.selectByValue(year);
	}

	static void futuredate(WebDriver driver, String date) {
		driver.findElement(By.xpath("//a[@data-date=" + date + "]")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		driver.switchTo().frame("frame-one796456169");
		// click on calendar icon
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		Thread.sleep(2000);

		futureMonth(driver, "April");
		futureYear(driver, "2000");
		futuredate(driver, "18");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
