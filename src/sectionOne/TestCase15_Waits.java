package sectionOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase15_Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3);
		
		// Example of implicit wait 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.id("contact-us"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.findElement(By.id("login-portal"));
		 
	
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("contact-us")));
		 
		 // Dynamic ---> polling time -- 30 seconds , 5second ---- exceptions
		 
		    Wait<WebDriver> fluentWait=   new FluentWait<>(driver)
		    		.withTimeout(Duration.ofSeconds(30))
		    		.pollingEvery(Duration.ofSeconds(5))
		    		.ignoring(Exception.class);
		    fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.id("contact-us")));
		 
		 
		 // cntrl + shitf + o
		// Fluent wait 
		// Explicit 
		// Implicit Wait 
		// Static Wait

	}

}
