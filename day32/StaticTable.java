package day32;

// Types of web table
//1. Static web table
//2. Dynamic web table
//3. Table with pagination

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();

		// 1. Find total no of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows: " + rows);

		// 2. Find total no of columns in a table
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of columns: " + cols);
		System.out.println();

		// 3. Read data from specific row and column
		// table[@name='BookTable']//tr[5]//td[1]
		String bookName = driver.findElement(By.xpath("//td[normalize-space()='Master In Selenium']")).getText();
		System.out.println("Book name: " + bookName);
		System.out.println();

		// 4. Read data from all the rows and all columns
		System.out.println("Book Name" + "\t" + "Author" + "\t" + "Subject" + "\t" + "Price");
		for (int r = 2; r <= rows; r++) {
			for (int c = 1; c <= cols; c++) {
				// In xpath, we cannot directly pass string/parameters so syntax is "+r+"
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]"))
						.getText();
				System.out.print(data + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// 5. Print book names whose author is mukesh
		System.out.println("Book and author:");
		for (int r = 2; r <= rows; r++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]"))
					.getText();
			if (authorName.equals("Mukesh")) {
				String bookName1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]"))
						.getText();
				System.out.println(bookName1 + " -by " + authorName);
			}
		}
		System.out.println();

		// 6. Find total of prices
		System.out.print("Total price: ");
		int total = 0;
		for (int r = 2; r <= rows; r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
			total = total + Integer.parseInt(price);
		}
		System.out.println(total); // 7100
		driver.quit();
	}
}
