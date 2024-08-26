package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// frame - is a subset of webpage which contains elements
// iframe - embeds another webpage to the current page (a frame contains another frame)

public class HandleFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		// Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frameset[1]/frame[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.cssSelector("input[name='mytext1']")).sendKeys("Welcome");

		// Switch to main page
		driver.switchTo().defaultContent();

		// Frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.cssSelector("input[name='mytext2']")).sendKeys("Selenium");

		// Switch to main page
		driver.switchTo().defaultContent();

		// Frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("Automation");

		// Switch to inner frame (iframe)
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		driver.findElement(By.xpath("//div[@id='i19']//div[@class='uHMk6b fsHoPb']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Choose']")).click();

		// Switch to main page
		driver.switchTo().defaultContent();

		WebElement frame5 = driver.findElement(By.cssSelector("frame[src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.cssSelector("a[href='https://a9t9.com']")).click();
		System.out.println("Logo visibility: "
				+ driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']"))
						.isDisplayed());

		driver.quit();

	}
}
