package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticBootstrapTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']//a[.='Admin']")).click();

		int rows = driver.findElements(By.xpath("//div[@class='oxd-table-card']")).size();
		System.out.println("Total no of rows:" + rows);

		System.out.println("Usernames and user roles: ");
		for (int i = 1; i <= rows; i++) {
			String username = driver.findElement(By.xpath("//div[@class='oxd-table-card'][" + i + "]//div[@role='cell'][2]")).getText();
			String user_role = driver.findElement(By.xpath("//div[@class='oxd-table-card'][" + i + "]//div[@role='cell'][3]")).getText();
			System.out.println(username + "\t" + user_role);	
		}
		driver.quit();
	}
}
