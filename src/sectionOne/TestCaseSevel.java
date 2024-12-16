package sectionOne;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseSevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com");
		
		driver.findElement(By.id("contact-us")).click();
		driver.findElement(By.id("login-portal")).click();
		driver.findElement(By.id("button-clicks")).click();
		
		System.out.println(driver.getTitle());
		
		// handles
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handle:windowHandles) {
			System.out.println(handle);
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
		}

	}

}
// webdriver methods ---
// webelements methods

//[id1 , id2 , id3 , id4]