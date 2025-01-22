package sectionOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List <WebElement> pages = driver.findElements(By.cssSelector("ul#pagination li"));
		for(int i = 0 ; i < pages.size(); i++) {
			pages.get(i).findElement(By.tagName("a")).click();
			
			List <WebElement> rows  = driver.findElements(By.cssSelector("#productTable tr "));
			for(int s = 1 ; s < rows.size();s++) {
				System.out.println(rows.get(s).getText());
				rows.get(s).findElement(By.cssSelector("td:nth-child(4) input")).click();
			}
			
			
		}

	}

}
