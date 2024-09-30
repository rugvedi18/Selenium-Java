package day38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/computers");
		driver.manage().window().maximize();

		// 1) full page screenshot - TakesScreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile1 = ts.getScreenshotAs(OutputType.FILE); // File - predefined class in java
		// "C:\\Users\\Rugvedi\\eclipse-workspace\\seleniumwebdriverdemo\\screenshots\\fullpage.png"
		File targetfile1 = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png"); // dynamic way
		sourcefile1.renameTo(targetfile1); // copy source file to target file

		// 2) capture the screenshot of the specific section
		WebElement featurSection = driver.findElement(By.cssSelector(".page.category-page"));

		File sourcefile2 = featurSection.getScreenshotAs(OutputType.FILE);
		File targetfile2 = new File(System.getProperty("user.dir") + "\\screenshots\\specificsection.png");
		sourcefile2.renameTo(targetfile2);

		// 3) capture the screenshot of web element
		WebElement logo = driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']"));
		File sourcefile3 = logo.getScreenshotAs(OutputType.FILE);
		File targetfile3 = new File(System.getProperty("user.dir") + "\\screenshots\\logo.png");
		sourcefile3.renameTo(targetfile3);

		driver.quit();
	}

}
