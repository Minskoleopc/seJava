package sectionOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		String future_year = "2026";
		String future_month = "March";
		String future_date = "14";
		
		driver.findElement(By.id("datepicker")).click();		
		//String text = driver.findElement(By.cssSelector(".datepicker-switch")).getText();
		//System.out.println(text);
		
		
		while(true) {
			String text = driver.findElement(By.cssSelector(".datepicker-switch")).getText();
			if(text.contains(future_year) && text.contains(future_month)) {
				break;
			}
			
			driver.findElement(By.cssSelector("th.next")).click();
		}
		
		List<WebElement> days = driver.findElements(By.className("day"));
		//driver.findElement(By.xpath("//td[class='day' and text()='"+future_date+"']"));
		for(int i = 0 ; i < days.size() ; i++) {
			System.out.println(days.get(i).getText());
			if(days.get(i).getText().equals(future_date)) {
				days.get(i).click();
				break;
			}
		}
		
		
		 
		
		

	}

}
