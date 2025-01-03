package sectionOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_17_JS_exe {
	public static void main(String[] args) {
		
		// autosuggestive text and iframe 
		// TODO Auto-generated method stub
		
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	       // Create an instance of WebDriver
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.saucedemo.com/v1/");
	       
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	       
	       // selenium 
	       driver.findElement(By.id("user-name")).sendKeys("standard_user");
	       driver.findElement(By.id("password")).sendKeys("secret_sauce");
	       
	       JavascriptExecutor js =  (JavascriptExecutor)driver;
//	       js.executeScript("document.getElementById('user-name').value='standard_user';");
//	       js.executeScript("document.getElementById('password').value='secret_sauce';");
	       js.executeScript("document.getElementById('login-button').click();");
	       
	       if(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/inventory.html")) {
	    	   System.out.println("Testcase pass");
	       }
	       else {
	    	   System.out.println("testcase fail");
	       }
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	      
	}

}
