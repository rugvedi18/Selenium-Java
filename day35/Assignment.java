package day35;

// Action class methods

// 1. mouse hover - moveToElement(element).perform()
// 2. right click - contextClick(element).perform()
// 3. double click - doubleClick(element).perform()
// 4. drag and drop - dragAndDrop(source, target).perform()

// getText() vs getAttribute()
// getText - it checks for inner text value e.g <h2>Welcome</h2>
// getAttribute - it checks for attribute value e.g <h2 value="welcome">Welcome</h2>

// Actions Vs Action
// Actions - class, used to perform mouse actions
// Action - interface, used to store created actions

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) {
		// https://testautomationpractice.blogspot.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// double click action
		WebElement clickMe = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		Actions act1 = new Actions(driver);
		act1.doubleClick(clickMe).perform();

		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));

		if (box2.getAttribute("value").equals("Hello World!")) {
			System.out.println("Text matched!");
		} else {
			System.out.println("Text not matched");
		}
		
		// drag and drop action
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(drag, drop).perform();
		
		driver.quit();
		
		// https://demo.guru99.com/test/drag_drop.html
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.get("https://demo.guru99.com/test/drag_drop.html");
		driver1.manage().window().maximize();
		
		WebElement bank = driver1.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement debitAcc = driver1.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions actions1 = new Actions(driver1);
		actions1.dragAndDrop(bank, debitAcc).perform();
		
		WebElement amt = driver1.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement debitAmt = driver1.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		
		Actions actions2 = new Actions(driver1);
		actions2.dragAndDrop(amt, debitAmt).perform();
	}

}
