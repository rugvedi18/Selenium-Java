package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();

		// Single file upload
		driver.findElement(By.cssSelector("#filesToUpload"))
				.sendKeys("C:\\Users\\Rugvedi\\Desktop\\RJ\\Prisms\\TestData\\Truck.jpg");

		if (driver.findElement(By.cssSelector("#fileList")).getText().equals("Truck.jpg")) {
			System.out.println("File uploaded successfully");
			System.out.println(driver.findElement(By.cssSelector("#fileList")).getText());
		} else {
			System.out.println("File upload error");
		}

		// Multiple file upload
//		String file1 = "C:\\Users\\Rugvedi\\Desktop\\RJ\\Prism\\TestData\\Truck.jpg";
//		String file2 = "C:\\Users\\Rugvedi\\Desktop\\RJ\\Prisms\\TestData\\Text1.txt";
//
//		driver.findElement(By.cssSelector("#filesToUpload")).sendKeys(file1 + "\n" + file2);

//		driver.quit();
	}

}
