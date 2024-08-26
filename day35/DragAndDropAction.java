package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//div[@id='box1']")); // oslo
		WebElement target = driver.findElement(By.xpath("//div[@id='box101']")); // norway
		
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(source, target).perform();
		
		WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2']")); // source
		WebElement sweden = driver.findElement(By.xpath("//div[@id='box102']")); // target
		
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(stockholm, sweden).perform();
		
	}

}
