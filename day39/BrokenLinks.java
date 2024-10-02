package day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Steps to check if the link is broken or not -
// 1. send link to the server, get status code from the server
//2. if status code >= 400 - link is broken, otherwise not broken

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();

		// capture all the links from the website
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: " + links.size());

		int noOfBrokenLinks = 0;

		for (WebElement link : links) {
			String hrefAtr = link.getAttribute("href");

			if (hrefAtr == null || hrefAtr.isEmpty()) {
				System.out.println("href attribute value is null or empty.");
				continue;
			}

			// hit URL to the server
			try {
				URL linkUrl = new URL(hrefAtr); // converted href value from string to URL format
				HttpURLConnection conn = (HttpURLConnection) linkUrl.openConnection(); // open connection to the server
				conn.connect(); // connect to server and send request to the server

				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefAtr + " ===> Broken link");
					noOfBrokenLinks++;
				} else {
					System.out.println(hrefAtr + " ===> Not a broken link");
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("No of broken links: " + noOfBrokenLinks);

		driver.quit();
	}
}
