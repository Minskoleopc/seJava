package sectionOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");
        driver.findElement(By.partialLinkText("CONTACT"));
        
        
        
        // driver.findElement(By.linkText("CONTACT US"));
        
        driver.quit();
		
		
	}

}
