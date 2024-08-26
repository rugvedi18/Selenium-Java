package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/* Test Case
 1) Open https://dummy-tickets.com/buyticket
 2) Click on Both
 3) Select round trip
 4) Under Flight,  select From, To, Departure, Return
 5) Under Hotel , select city, checkin, checkout
 6) Click on submit
 */

public class Assignment {

	static void travelDate(WebDriver driver, String expectedYear, String expectedMonth, String expectedDate) {
		// select year
		String currentYear;

		while (true) {
			currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (Integer.parseInt(currentYear) < Integer.parseInt(expectedYear)) {
				driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
			} else if (Integer.parseInt(currentYear) > Integer.parseInt(expectedYear)) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			} else {
				// Year matches expectedYear, break out of the loop
				break;
			}
		}

		// select month
		WebElement drpdown = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select month = new Select(drpdown);
		month.selectByValue(expectedMonth); // Assuming "8" represents September

		// select date
		List<WebElement> dates = driver.findElements(By.xpath("//tbody//tr//td"));
		for (WebElement dt : dates) {
			if (dt.getText().equals(expectedDate)) {
				System.out.println("Date: " + dt.getText() + "/" + expectedMonth + "/" + currentYear);
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Open https://dummy-tickets.com/buyticket
		driver.get("https://dummy-tickets.com/buyticket");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='Both']")).click(); // Click on Both
		driver.findElement(By.xpath("//input[@value='roundtripfh']")).click(); // Select round trip

		// from
		driver.findElement(By.xpath("(//input[@name='source[]'])[5]")).sendKeys("Bhubaneswar");
		Thread.sleep(2000);

		List<WebElement> from = driver.findElements(By.xpath("//div[@class='suggestion-block']//p"));
		for (WebElement fm : from) {
			if (fm.getText().contains("Bhubaneswar Airport,")) {
				fm.click();
				break;
			}
		}

		// to
		driver.findElement(By.xpath("(//input[@name='destination[]'])[5]")).sendKeys("Bangalore ");
		Thread.sleep(2000);

		List<WebElement> to = driver.findElements(By.xpath("(//ul[@class='suggestions-list'])//p"));
		for (WebElement t : to) {
			if (t.getText().contains("HAL Bangalore International Airport")) {
				t.click();
				break;
			}
		}

		// departure date
		driver.findElement(By.xpath("(//input[@name='departure[]'])[5]")).click(); // open departure date
		travelDate(driver, "2025", "8", "18");

		// return date
		driver.findElement(By.xpath("(//input[@name='return[]'])[2]")).click(); // open return date
		travelDate(driver, "2025", "9", "2");

		Thread.sleep(2000);
		// select city
		driver.findElement(By.xpath("(//input[@name='city[]'])[3]")).sendKeys("Pune ");
		Thread.sleep(2000);

		List<WebElement> city = driver.findElements(By.xpath("//p[contains(.,'Pune')]"));
		for (WebElement ct : city) {
			if (ct.getText().contains("Pune")) {
				ct.click();
				break;
			}
		}

		// check in
		driver.findElement(By.xpath("(//input[@name='checkin[]'])[3]")).click();
		travelDate(driver, "2025", "8", "19");

		// check out
		driver.findElement(By.xpath("(//input[@name='checkout[]'])[3]")).click();
		travelDate(driver, "2025", "9", "1");

		// submit
		driver.findElement(By.xpath("(//input[@type='submit'])[6]")).click();

		// validatation
		String bookingDetails = driver.findElement(By.xpath("//div[contains(text(),'Booking Details')]")).getText().trim();
		if (bookingDetails.equals("Booking Details")) {
			System.out.println(bookingDetails + " - Title validation complete");
		} else {
			System.out.println("Title does not match");
		}

		// select country code
		driver.findElement(By.xpath("//span[@id='select2-dialcodes-container']")).click();
//		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("India");
//		Thread.sleep(3000);

//		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
//		Thread.sleep(2000);
//		
//		for (WebElement op : options) {
//			System.out.println(op.getText());
//			if (op.getText().trim().equals("India - 91")) {
//				op.click();
//				break;
//			}
//			else
//			{
//				System.out.println("Country not selected");
//				break;
//			}
//		}

		// driver.quit();
	}
}