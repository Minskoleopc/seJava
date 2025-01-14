package sectionOne;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link:links) {
			System.out.println(link.getAttribute("href"));
			String url = link.getAttribute("href");
			if(url != null && url.startsWith("https")) {
				try {
					
					HttpURLConnection connetion =(HttpURLConnection) new URL(url).openConnection();
					connetion.setRequestMethod("HEAD");
					connetion.connect();
					int responseCode = connetion.getResponseCode();
					if(responseCode >= 400) {
						System.out.println("Broken link "+url);
					}
					else {
						System.out.println("Valid link "+url);
					}
					
					
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			driver.quit();
					
					
		}
		
		
		
		
		
		
		

	}

}
