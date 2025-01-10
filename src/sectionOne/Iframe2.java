package sectionOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#id1 > div > input[type=text]")).sendKeys("hi");

		// id  -value
		// name - value
		// index
		
		//switching to main content
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		
		// frame 2
		driver.findElement(By.cssSelector("#id2 > div > input[type=text]")).sendKeys("Bye");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.findElement(By.cssSelector("#id3 > div > input[type=text]")).sendKeys("Hello again");
		
		driver.switchTo().frame(0);
		if(driver.findElement(By.id("i6")).isDisplayed()) {
			System.out.println("Test case pass");
		}
		
		driver.switchTo().defaultContent();
		
		List <WebElement> frames = driver.findElements(By.tagName("frame"));
		System.out.println(frames.size());
		
		
	}

}
