package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		int total_pages = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		System.out.println("Total no of pages: " + total_pages);

		System.out.println("Name and price: ");
		for (int pno = 1; pno <= total_pages; pno++) {
			driver.findElement(By.xpath("//ul[@id='pagination']//li[" + pno + "]")).click();
			Thread.sleep(2000);

			int rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();

			for (int r = 1; r <= rows; r++) {
				System.out.print(driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[2]")).getText() + "\t");
				System.out.print(driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[3]")).getText() + "\t");
				driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[4]//input")).click();
			}
			System.out.println();
		}
		driver.quit();
	}
}
