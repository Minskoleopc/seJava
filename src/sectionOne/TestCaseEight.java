package sectionOne;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com");
		
		driver.findElement(By.id("contact-us")).click();
		
		// {ele1 , ele2} ====> [ele1, ele2]====> ele2
		
		Set<String> windowHandles = driver.getWindowHandles();
		String [] windowArray  = windowHandles.toArray(new String[0]);
		String page = windowArray[1];
		driver.switchTo().window(page);
		Boolean val = driver.findElement(By.name("contactme")).isDisplayed();
		if(val) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		
		
		

	}

}
