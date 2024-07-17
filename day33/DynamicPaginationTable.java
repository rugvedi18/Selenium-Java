package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		driver.findElement(By.xpath("//a[@href='#']//p[contains(text(),'Customers')]")).click();
		driver.findElement(By.xpath("//p[normalize-space()='Online customers']")).click();

		String s = driver.findElement(By.xpath("//div[contains(text(), 'items')]")).getText();
		System.out.println(s);
		// indexOf can be used for dynamic values
		int total_items = Integer.parseInt(s.substring(s.indexOf("f") + 2, s.indexOf("items") - 1));
		System.out.println("Total items: " + total_items);

		// clicking on all pages
		for (int pno = 1; pno <= 5; pno++) {
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()=" + pno + "]"));
			active_page.click();
			Thread.sleep(2000);
			
			// reading data from every page
			int rows = driver.findElements(By.xpath("//div[@class='dataTables_scrollBody']//tbody//tr")).size();

			System.out.println("\n Locations: ");
			for (int r = 1; r <= rows; r++) {
				String location = driver.findElement(By.xpath("//div[@class='dataTables_scrollBody']//tbody//tr[" + r + "]//td[3]")).getText();

				String ip_address = driver.findElement(By.xpath("//div[@class='dataTables_scrollBody']//tbody//tr[" + r + "]//td[2]")).getText();

				System.out.println("\t" + location + "\t" + ip_address);
			}
		}
		driver.quit();
	}

}
