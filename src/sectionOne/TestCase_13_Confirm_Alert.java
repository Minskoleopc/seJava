package sectionOne;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_13_Confirm_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		WebElement changeAlert = driver.findElement(By.id("confirm-alert-text"));
		driver.findElement(By.id("button4")).click();
		Alert alert = driver.switchTo().alert();
		
		// verify the alert text
		String alertText = alert.getText();
		
		// ok
		System.out.println(alertText);
		alert.accept();
		if(changeAlert.getText().equals("You pressed OK!")) {
			System.out.println("Test case pass ...");
		}
		
		
		// cancel
		driver.findElement(By.id("button4")).click();
		alert = driver.switchTo().alert();
		alert.dismiss();
		if(changeAlert.getText().equals("You pressed Cancel!")) {
			System.out.println("Test case pass ...");
		}
		
		// alert() , confirm() , prompt()
	    // unable to inspect on DOM
		
		
	}

}
