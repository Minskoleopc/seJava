package sectionOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class TestCaseSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		// get()
		driver.get("https://www.google.com");
		
		// driver.window.maximize()
		
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("python");
		driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);
	
		// getCurrentUrl()
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		// getTitle()
		
		String title = driver.getTitle();
		if(title.equals("python - Google Search")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		// browser back()
		
		driver.navigate().back();
		title = driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		// browser forward
		driver.navigate().forward();
		title = driver.getTitle();
		if(title.equals("python - Google Search")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		
		
		
		
		
		
		//driver.close();

	}

}
