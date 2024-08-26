package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OnDblClickActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		// switch to iframe
		driver.switchTo().frame("iframeResult");
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement clickMe = driver.findElement(By.xpath("(//button[normalize-space()='Copy Text'])[1]"));
		
		box1.clear();
		box1.sendKeys("Welcome");
		
		Actions act = new Actions(driver);
		act.doubleClick(clickMe).perform();
		
		if(box2.getAttribute("value").equals("Welcome"))
		{
			System.out.println("Text copied successfully!");
		}
		else
		{
			System.out.println("text not matched");
		}
		
		driver.quit();
	}
}
