package sectionOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		
		// multiple ways to find the iframe
		// id , name , index
		
		driver.switchTo().frame("frame");
		WebElement home =driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a"));
		if(home.isDisplayed()) {
			System.out.println("Testcase pass");
		}
		
		driver.findElement(By.cssSelector("body > nav")).isDisplayed();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("body > nav")).isDisplayed();
		
		
		
		
		
	}

}
