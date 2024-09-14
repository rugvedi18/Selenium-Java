package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1) scroll down page by pixel number (vertical scroll)
		js.executeScript("window.scrollBy(0,1000)", "");
		System.out.println("Till 1000 px - " + js.executeScript("return window.pageYOffset;"));

		// 2) scroll the page till element is visible (vertical scroll)
		WebElement ele = driver.findElement(By.cssSelector("div[id='HTML1'] h2[class='title']")); // Web Table
		js.executeScript("arguments[0].scrollIntoView()", ele);
		System.out.println("Web Table title at: " + js.executeScript("return window.pageYOffset;")); // 1410.4000244140625

		// 3) scroll page till end of the page (vertical scroll)
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("End of the page at: " + js.executeScript("return window.pageYOffset;")); // 1595.199951171875

		// 4) scroll page to start of the page (vertical scroll)
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println("End of the page at: " + js.executeScript("return window.pageYOffset;")); // 0

		driver.quit();
	}

}
